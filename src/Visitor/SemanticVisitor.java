package Visitor;
import CodeGeneration.CodeGenerator;
import SymbolTableStructure.SymbolTable2;
import antlr.parseranalysis;
import antlr.parseranalysisBaseVisitor;
import expression.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantic.SemanticErrorLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SemanticVisitor extends parseranalysisBaseVisitor<ASTNode> {

    private final SymbolTable2 symbolTable;
    private final SemanticErrorLogger semanticLogger;
    private CodeGenerator codeGen;

    private String currentPage = null;
    private String currentEntity = null;

    public SemanticVisitor(SymbolTable2 symbolTable) {
        this.symbolTable = symbolTable;
        this.semanticLogger = new SemanticErrorLogger(symbolTable);
        this.codeGen = new CodeGenerator();
    }

    public SemanticVisitor(SymbolTable2 symbolTable, CodeGenerator codeGen) {
        this.symbolTable = symbolTable;
        this.semanticLogger = new SemanticErrorLogger(symbolTable);
        this.codeGen = codeGen;
    }



@Override
    public ASTNode visitComponentFile(parseranalysis.ComponentFileContext ctx) {
        List<Imports> importsList = new ArrayList<>();
        List<EntityDecl> entities = new ArrayList<>();
        List<StoreDecl> stores = new ArrayList<>();
        List<RouteDecl> routes = new ArrayList<>();
        List<PageDecl> pages = new ArrayList<>();
        for (parseranalysis.ImportsContext impCtx : ctx.imports()) {
            Imports imp = (Imports) visit(impCtx);
            if (imp != null) importsList.add(imp);
        }
        ComponentDeclaration declaration = null;
        if (!ctx.componentDeclaration().isEmpty()) {
            declaration = (ComponentDeclaration) visit(ctx.componentDeclaration(0));
        }
        for (parseranalysis.EntityDeclContext ectx : ctx.entityDecl()) {
            EntityDecl e = (EntityDecl) visit(ectx);
            if (e != null) entities.add(e);
        }
        for (parseranalysis.StoreDeclContext sctx : ctx.storeDecl()) {
            StoreDecl s = (StoreDecl) visit(sctx);
            if (s != null) stores.add(s);
        }
        for (parseranalysis.RouteDeclContext rctx : ctx.routeDecl()) {
            RouteDecl r = (RouteDecl) visit(rctx);
            if (r != null) routes.add(r);
        }
        for (parseranalysis.PageDeclContext pctx : ctx.pageDecl()) {
            PageDecl p = (PageDecl) visit(pctx);
            if (p != null) pages.add(p);
        }

        codeGen.writeHTML(codeGen.generateHead("MyApp"));

        codeGen.writeJS(codeGen.generateStore());
        codeGen.writeJS(codeGen.generateAddProductPage());
        codeGen.writeJS(codeGen.generateListPage());
        codeGen.writeJS(codeGen.generateDetailPage());
        codeGen.writeJS(codeGen.generateRouter());

        codeGen.writeHTML(codeGen.generateFooter());

        codeGen.writeCSS(codeGen.generateCSS());

        return new ComponentFile(importsList, declaration, entities, stores, routes, pages);
    }

    @Override
    public ASTNode visitImports(parseranalysis.ImportsContext ctx) {
        String importedIdentifier = null;
        if (ctx.importedName != null) {
            importedIdentifier = ctx.importedName.getText();
        }

        List<String> bindings = new ArrayList<>();
        if (ctx.identList != null && !ctx.identList.isEmpty()) {
            for (Token id : ctx.identList) {
                bindings.add(id.getText());
            }
        }
        if (ctx.decoratorType != null && !ctx.decoratorType.isEmpty()) {
            for (Token t : ctx.decoratorType) {
                bindings.add(t.getText());
            }
        }

        String fromPath = ctx.fromPath.getText();
        return new Imports(importedIdentifier, bindings, fromPath);
    }


    @Override
    public ASTNode visitComponentDeclaration(parseranalysis.ComponentDeclarationContext ctx) {
        String decorator = ctx.DECORATOR().getText();
        ComponentMetadata metadata = (ComponentMetadata) visit(ctx.componentMetadata());
        String classAttr = ctx.CLASS_ATTR().getText();
        String identifier = ctx.IDENTIFIER().getText();
        ClassBody body = (ClassBody) visit(ctx.classBody());

        symbolTable.addVariable(identifier, "component", "global", "@" + decorator);

        if (metadata != null) {
            String selector = metadata.getPropertyValue("selector");
            String template = metadata.getPropertyValue("template");
            String style = metadata.getPropertyValue("styleUrls");

            if (selector != null && template != null) {
                codeGen.writeJS(
                        "function render" + identifier + "() {\n" +
                                "  const app = document.getElementById('app');\n" +
                                "  app.innerHTML = `" + template.replace("\"", "") + "`;\n" +
                                "}\n"
                );
            }

            if (style != null) {
                codeGen.writeCSS("/* Style for " + identifier + " */\n" + style.replace("\"", ""));
            }
        }

        return new ComponentDeclaration(decorator, metadata, classAttr, identifier, body);
    }

    @Override
    public ASTNode visitComponentMetadata(parseranalysis.ComponentMetadataContext ctx) {
        List<ComponentProperty> properties = new ArrayList<>();

        int i = 0;
        while (i < ctx.getChildCount()) {
            ParseTree keyNode = ctx.getChild(i++);
            if (!(keyNode instanceof TerminalNode)) break;
            String key = ((TerminalNode) keyNode).getText();

            if (i < ctx.getChildCount()) i++;

            ExpressionNode value = null;
            if (i < ctx.getChildCount()) {
                ParseTree valNode = ctx.getChild(i++);
                if (valNode instanceof parseranalysis.ArrayLiteralContext) {
                    value = (ExpressionNode) visit((parseranalysis.ArrayLiteralContext) valNode);
                } else if (valNode instanceof TerminalNode) {
                    String txt = ((TerminalNode) valNode).getText();
                    if (txt.startsWith("\"")) value = new StringLiteral(txt.replace("\"", ""));
                    else value = new IdentifierLiteral(txt);
                }
            }

            properties.add(new ComponentProperty(key, value));
            symbolTable.addVariable(key, "metadataProperty", "component",
                    value != null ? value.toString() : "null");

            if (i < ctx.getChildCount() && ",".equals(ctx.getChild(i).getText())) i++;
        }

        return new ComponentMetadata(properties);
    }

    @Override
    public ASTNode visitClassBody(parseranalysis.ClassBodyContext ctx) {
        List<ASTNode> members = new ArrayList<>();
        String scope = "class";

        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                ASTNode node = (ASTNode) visit(child);
                if (node != null) {
                    members.add(node);

                    if (node instanceof expression.Property) {
                        expression.Property prop = (expression.Property) node;
                        if (!symbolTable.contains(prop.getName(), scope)) {
                            symbolTable.addVariable(prop.getName(), prop.getType(), scope, "undefined");

                            // ✅ بدال let غير مهيأ, نولّد متغير واضح
                            codeGen.writeJS(
                                    "// Property: " + prop.getName() + "\n" +
                                            "let " + prop.getName() + " = null;\n"
                            );
                        } else {
                            semanticLogger.logError(
                                    "Duplicate variable '" + prop.getName() + "' in scope '" + scope + "'.",
                                    ctx.start.getLine()
                            );
                        }
                    } else if (node instanceof expression.Method) {
                        expression.Method method = (expression.Method) node;
                        if (!symbolTable.contains(method.getName(), scope)) {
                            symbolTable.addVariable(method.getName(), "function", scope, "methodBody");

                            codeGen.writeJS(
                                    "// Method: " + method.getName() + "\n" +
                                            "function " + method.getName() + "() {\n" +
                                            "  // TODO: implement logic\n" +
                                            "}\n"
                            );
                        } else {
                            semanticLogger.logError(
                                    "Duplicate method '" + method.getName() + "' in class scope.",
                                    ctx.start.getLine()
                            );
                        }
                    }
                }
            }
        }
        return new ClassBody(members);
    }


    @Override
    public ASTNode visitProperty(parseranalysis.PropertyContext ctx) {
        int line = ctx.start.getLine();
        if (ctx.IDENTIFIER().size() < 2) {
            semanticLogger.logError("Malformed property declaration: missing name or type.", line);
            return null;
        }
        String varType = ctx.VAR().getText();
        String name = ctx.IDENTIFIER(0).getText();
        String type = ctx.IDENTIFIER(1).getText();
        String scope = "class";

        boolean isDuplicate = symbolTable.contains(name, scope);
        semanticLogger.checkValidType(type, name, line);

        if (isDuplicate) {
            semanticLogger.logError("Duplicate variable '" + name + "' found in scope '" + scope + "'.", line);
        } else {
            symbolTable.addVariable(name, type, scope, null);
            semanticLogger.logSuccess("Variable '" + name + "' declared successfully in scope '" + scope + "'.", line);

            // 🔹 CodeGeneration لمتغير جديد
            codeGen.writeJS("// Property: " + name + "\nlet " + name + " = null;\n");
        }
        return new Property(varType, name, type);
    }

    @Override
    public ASTNode visitMethod(parseranalysis.MethodContext ctx) {
        int line = (ctx != null) ? ctx.start.getLine() : -1;

        if (ctx == null || ctx.IDENTIFIER() == null || ctx.IDENTIFIER().isEmpty()) {
            semanticLogger.logError("❌ خطأ في تعريف الدالة: المعرف مفقود.", line);
            return null;
        }

        String name = ctx.IDENTIFIER(0).getText();
        String scope = "class";

        if (symbolTable.contains(name, scope)) {
            semanticLogger.logError("❌ Duplicate method '" + name + "' found in class scope.", line);
            return null;
        }

        List<Parameter> parameters = new ArrayList<>();
        if (ctx.IDENTIFIER().size() > 2) {
            try {
                String paramName = ctx.IDENTIFIER(1).getText();
                String paramType = ctx.IDENTIFIER(2).getText();
                parameters.add(new Parameter(paramName, paramType));
                symbolTable.addVariable(paramName, paramType, name, "param");
            } catch (Exception e) {
                semanticLogger.logError("❌ خطأ أثناء تحليل المعاملات في الدالة '" + name + "'.", line);
            }
        }

        MethodBody body = null;
        try {
            if (ctx.methodBody() != null) {
                body = (MethodBody) visit(ctx.methodBody());
            }
            if (body == null) {
                body = new MethodBody(new ArrayList<>()); // ✅ جسم فارغ بدل null
            }
        } catch (Exception e) {
            semanticLogger.logError("❌ خطأ أثناء تحليل جسم الدالة '" + name + "'.", line);
            body = new MethodBody(new ArrayList<>()); // ✅ fallback
        }

        symbolTable.addVariable(name, "method", "class", "void");

        // 🔹 CodeGeneration: توليد function
        codeGen.writeJS("function " + name + "() {\n // TODO: method body \n}\n");

        return new Method(name, parameters, body);
    }

    @Override
    public ASTNode visitAssignment(parseranalysis.AssignmentContext ctx) {
        String variableName = ctx.IDENTIFIER(0).getText();
        int line = ctx.start.getLine();

        ExpressionNode value;
        String generatedValue = "null";
        if (ctx.STRING() != null) {
            value = new StringLiteral(ctx.STRING().getText().replace("\"", ""));
            generatedValue = "\"" + ((StringLiteral) value).getValue() + "\"";
        } else if (ctx.NUMBER() != null) {
            value = new NumberLiteral(ctx.NUMBER().getText());
            generatedValue = ((NumberLiteral) value).getValue();
        } else if (ctx.IDENTIFIER().size() > 1) {
            value = new VariableReference(ctx.IDENTIFIER(1).getText());
            generatedValue = ((VariableReference) value).getName();
        } else {
            throw new RuntimeException("Unknown assignment value.");
        }

        semanticLogger.checkVariableDefined(variableName, "class", line);

        if (symbolTable.contains(variableName, "class")) {
            symbolTable.updateVariable(variableName, generatedValue);
        }

        // 🔹 CodeGeneration: توليد assignment
        codeGen.writeJS(variableName + " = " + generatedValue + ";");

        return new Assignment(variableName, value);
    }

    @Override
    public ASTNode visitHtmlTemplate(parseranalysis.HtmlTemplateContext ctx) {
        String tagName = ctx.HTML_TAG(0).getText();
        List<HtmlChildNode> children = new ArrayList<>();

        for (TerminalNode id : ctx.IDENTIFIER()) {
            children.add(new TextNode(id.getText()));
        }
        for (parseranalysis.HtmlTemplateContext childCtx : ctx.htmlTemplate()) {
            HtmlTemplate childTemplate = (HtmlTemplate) visitHtmlTemplate(childCtx);
            children.add(childTemplate);
        }

        HtmlTemplate template = new HtmlTemplate(tagName, children);
        symbolTable.addVariable(tagName, "htmlTag", "template", "HTML Element with " + children.size() + " children");

        // 🔹 CodeGeneration: HTML توليد
        codeGen.writeHTML("<" + tagName + ">");
        for (HtmlChildNode child : children) {
            codeGen.writeHTML(child.toString());
        }
        codeGen.writeHTML("</" + tagName + ">\n");

        return template;
    }

    @Override
    public ASTNode visitClickHandler(parseranalysis.ClickHandlerContext ctx) {
        String handlerName = ctx.IDENTIFIER(0).getText();
        String callTarget = ctx.IDENTIFIER(1).getText();
        int line = ctx.start.getLine();

        String argument = null;
        int passedArgs = 0;
        if (ctx.IDENTIFIER().size() > 2) {
            argument = ctx.IDENTIFIER(2).getText();
            passedArgs = 1;
        }

        int expectedArgs = 1;
        semanticLogger.checkArgumentCount(callTarget, expectedArgs, passedArgs, line);

        ClickHandler clickHandler = new ClickHandler(handlerName, callTarget, argument);
        symbolTable.addVariable(handlerName, "clickHandler", "component",
                callTarget + (argument != null ? "(" + argument + ")" : "()"));

        // ✅ JavaScript event binding
        codeGen.writeJS("// Click handler for " + handlerName + "\n");
        codeGen.writeJS("document.getElementById('" + handlerName + "').onclick = function() {\n");
        codeGen.writeJS("    " + callTarget + "(" + (argument != null ? argument : "") + ");\n");
        codeGen.writeJS("};\n");

        return clickHandler;
    }

    @Override
    public ASTNode visitLogStatement(parseranalysis.LogStatementContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        LogStatement log = new LogStatement(variable);
        symbolTable.addVariable("console_log_" + variable, "logStatement", "method", "console.log(" + variable + ")");

        // ✅ JavaScript console log
        codeGen.writeJS("console.log(" + variable + ");\n");

        return log;
    }

    @Override
    public ASTNode visitArrayLiteral(parseranalysis.ArrayLiteralContext ctx) {
        List<String> items = new ArrayList<>();
        for (TerminalNode id : ctx.IDENTIFIER()) items.add(id.getText());

        ArrayLiteral arrayLiteral = new ArrayLiteral(items);
        symbolTable.addVariable("arrayLiteral_" + System.currentTimeMillis(), "array", "method", items.toString());

        // ✅ JavaScript array literal
        codeGen.writeJS("[" + String.join(", ", items) + "];\n");

        return arrayLiteral;
    }

    @Override
    public ASTNode visitObjectLiteral(parseranalysis.ObjectLiteralContext ctx) {
        List<ObjectProperty> properties = new ArrayList<>();
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String key = ctx.IDENTIFIER(i).getText();
            ParseTree valueNode = ctx.getChild(2 + i * 4);
            ExpressionNode value;
            if (valueNode instanceof TerminalNode) {
                String token = valueNode.getText();
                if (token.startsWith("\"")) value = new StringLiteral(token.replace("\"", ""));
                else if (token.matches("\\d+")) value = new NumberLiteral(token);
                else value = new VariableReference(token);
            } else value = new VariableReference("unknown");
            properties.add(new ObjectProperty(key, value));
        }
        ObjectLiteral objectLiteral = new ObjectLiteral(properties);
        symbolTable.addVariable("object_" + System.currentTimeMillis(), "object", "local", "[object literal]");

        // ✅ JavaScript object literal
        StringBuilder sb = new StringBuilder("{ ");
        for (ObjectProperty prop : properties) {
            sb.append(prop.getKey()).append(": ").append(prop.getValue().toString()).append(", ");
        }
        if (!properties.isEmpty()) sb.setLength(sb.length() - 2);
        sb.append(" }");
        codeGen.writeJS(sb.toString() + ";\n");

        return objectLiteral;
    }

    @Override
    public ASTNode visitEntityDecl(parseranalysis.EntityDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<FieldDecl> fields = new ArrayList<>();

        String prevEntity = currentEntity;
        currentEntity = name;
        for (parseranalysis.FieldDeclContext fctx : ctx.fieldDecl()) {
            FieldDecl f = (FieldDecl) visit(fctx);
            if (f != null) fields.add(f);
        }
        if (!symbolTable.contains(name, "global")) {
            symbolTable.addVariable(name, "entity", "global", "entityDecl");
            semanticLogger.logSuccess("Entity '" + name + "' declared.", ctx.start.getLine());
        }
        currentEntity = prevEntity;
        codeGen.writeJS("// Entity: " + name + "\n");
        codeGen.writeJS("class " + name + " {\n");
        for (FieldDecl f : fields) {
            codeGen.writeJS("  " + f.getName() + ";\n");
        }
        codeGen.writeJS("  constructor(init) {\n    Object.assign(this, init);\n  }\n");
        codeGen.writeJS("}\n");

        return new EntityDecl(name, fields);
    }
    @Override
    public ASTNode visitFieldDecl(parseranalysis.FieldDeclContext ctx) {
        String fieldName = ctx.fieldName.getText();
        String type;
        if (ctx.NUMBER_T() != null) type = "number";
        else if (ctx.STRING_T() != null) type = "string";
        else if (ctx.URL_T() != null) type = "url";
        else if (ctx.fieldType != null) type = ctx.fieldType.getText();
        else type = "unknown";

        semanticLogger.checkValidType(type, fieldName, ctx.start.getLine());
        return new FieldDecl(fieldName, type);
    }

    @Override
    public ASTNode visitStoreDecl(parseranalysis.StoreDeclContext ctx) {
        String name = ctx.IDENTIFIER(0).getText();
        String entityName = ctx.IDENTIFIER(1).getText();
        boolean isArray = ctx.OPEN_BRACKET() != null;

        if (!symbolTable.contains(entityName, "global")) {
            semanticLogger.logError("Entity '" + entityName + "' used in store '" + name + "' is not defined.", ctx.start.getLine());
        }

        if (!symbolTable.contains(name, "global")) {
            symbolTable.addVariable(name, "store", "global", entityName + (isArray ? "[]" : ""));
            semanticLogger.logSuccess("Store '" + name + "' declared.", ctx.start.getLine());
        }

        // ✅ JavaScript (بدون React)
        if (isArray) {
            codeGen.writeJS("let " + name + " = [];\n");
        } else {
            codeGen.writeJS("let " + name + " = new " + entityName + "();\n");
        }

        return new StoreDecl(name, entityName, isArray);
    }

    @Override
    public ASTNode visitActionsDecl(parseranalysis.ActionsDeclContext ctx) {
        List<ActionSig> list = new ArrayList<>();
        for (parseranalysis.ActionSigContext a : ctx.actionSig()) {
            ActionSig sig = (ActionSig) visit(a);
            if (sig != null) {
                list.add(sig);
                if (!symbolTable.contains(sig.getName(), "actions")) {
                    symbolTable.addVariable(sig.getName(), "action", "actions", "signature");
                }
            }
        }

        for (ActionSig sig : list) {
            codeGen.writeJS("function " + sig.getName() + "() {\n  // TODO: implement action\n}\n\n");
        }

        return new ActionsDecl(list);
    }

    @Override
    public ASTNode visitActionSig(parseranalysis.ActionSigContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<Param> params = new ArrayList<>();
        parseranalysis.ParamListContext plc = ctx.paramList();
        if (plc != null) {
            for (parseranalysis.ParamContext pc : plc.param()) {
                Param p = (Param) visit(pc);
                params.add(p);
            }
        }

        StringBuilder sb = new StringBuilder("function " + name + "(");
        for (int i = 0; i < params.size(); i++) {
            sb.append(params.get(i).getName());
            if (i < params.size() - 1) sb.append(", ");
        }
        sb.append(") {\n  // TODO: implement action\n}\n\n");
        codeGen.writeJS(sb.toString());

        return new ActionSig(name, params);
    }

    @Override
    public ASTNode visitParam(parseranalysis.ParamContext ctx) {
        String paramName = ctx.IDENTIFIER(0).getText();
        String type;
        if (ctx.NUMBER_T() != null) type = "number";
        else if (ctx.STRING_T() != null) type = "string";
        else if (ctx.URL_T() != null) type = "url";
        else if (ctx.IDENTIFIER().size() > 1) type = ctx.IDENTIFIER(1).getText();
        else type = "unknown";

        semanticLogger.checkValidType(type, paramName, ctx.start.getLine());
        return new Param(paramName, type);
    }

    @Override
    public ASTNode visitRouteDecl(parseranalysis.RouteDeclContext ctx) {
        String path = ctx.STRING().getText().replace("\"", "");
        String pageName = ctx.IDENTIFIER().getText();

        List<Param> params = new ArrayList<>();
        if (ctx.paramList() != null) {
            for (parseranalysis.ParamContext pc : ctx.paramList().param()) {
                params.add((Param) visit(pc));
            }
        }

        if (!symbolTable.contains(pageName, "page")) {
            semanticLogger.logError("Page '" + pageName + "' not defined (used in route).", ctx.start.getLine());
        }
        symbolTable.addVariable(path, "route", "global", pageName);

        codeGen.writeJS("// Route: " + path + " -> " + pageName + "\n");

        return new RouteDecl(path, pageName, params);
    }


    @Override
    public ASTNode visitPageDecl(parseranalysis.PageDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<ASTNode> parts = new ArrayList<>();

        String prevPage = currentPage;
        currentPage = name;

        for (parseranalysis.PageBodyContext body : ctx.pageBody()) {
            ASTNode n = (ASTNode) visit(body);
            if (n != null) parts.add(n);
        }

        symbolTable.addVariable(name, "page", "page", "pageDecl");
        currentPage = prevPage;

        // ✅ HTML بسيط بدل React
        codeGen.writeHTML("<!-- Page: " + name + " -->\n");
        codeGen.writeHTML("<div id=\"" + name + "Page\">\n");

        for (ASTNode part : parts) {
            if (part instanceof FormSection) {
                codeGen.writeHTML("  <!-- Form for " + ((FormSection) part).getEntityRef() + " -->\n");
            }
        }

        codeGen.writeHTML("</div>\n\n");

        return new PageDecl(name, parts);
    }

    @Override
    public ASTNode visitFormSection(parseranalysis.FormSectionContext ctx) {
        String entityRef = ctx.IDENTIFIER().getText();
        if (!symbolTable.contains(entityRef, "global")) {
            semanticLogger.logError("Entity '" + entityRef + "' used in form is not defined.", ctx.start.getLine());
        }
        symbolTable.addVariable("form@" + entityRef, "form", "page:" + currentPage, entityRef);

        codeGen.writeHTML("<form id=\"" + currentPage + "Form\">\n");
        codeGen.writeHTML("  <!-- TODO: generate inputs for " + entityRef + " -->\n");
        codeGen.writeHTML("</form>\n");

        return new FormSection(entityRef);
    }

    @Override
    public ASTNode visitListSection(parseranalysis.ListSectionContext ctx) {
        String storeRef = ctx.IDENTIFIER().getText();
        if (!symbolTable.contains(storeRef, "global")) {
            semanticLogger.logError("Store '" + storeRef + "' used in list is not defined.", ctx.start.getLine());
        }
        symbolTable.addVariable("list@" + storeRef, "list", "page:" + currentPage, storeRef);

        codeGen.writeHTML("<!-- List Section for " + storeRef + " -->\n");
        codeGen.writeHTML("<ul id=\"" + storeRef + "List\">\n");
        codeGen.writeHTML("  <!-- TODO: loop items -->\n");
        codeGen.writeHTML("</ul>\n");

        return new ListSection(storeRef);
    }


    @Override
    public ASTNode visitDetailSection(parseranalysis.DetailSectionContext ctx) {
        String storeRef = ctx.IDENTIFIER(0).getText();
        String byParam = ctx.IDENTIFIER(1).getText();

        if (!symbolTable.contains(storeRef, "global")) {
            semanticLogger.logError("Store '" + storeRef + "' used in detail is not defined.", ctx.start.getLine());
        }
        if (!symbolTable.contains(byParam, "page:" + currentPage)) {
            semanticLogger.logError("Param '" + byParam + "' not found in page '" + currentPage + "'.", ctx.start.getLine());
        }

        symbolTable.addVariable("detail@" + storeRef, "detail", "page:" + currentPage, "by:" + byParam);

        codeGen.writeHTML("<!-- Detail Section for " + storeRef + " by " + byParam + " -->\n");
        codeGen.writeHTML("<div id=\"" + storeRef + "Detail\">\n");
        codeGen.writeHTML("  <!-- TODO: show details -->\n");
        codeGen.writeHTML("</div>\n");

        return new DetailSection(storeRef, byParam);
    }

    @Override
    public ASTNode visitParamSection(parseranalysis.ParamSectionContext ctx) {
        String name = ctx.pName.getText();

        String type;
        if (ctx.NUMBER_T() != null) type = "number";
        else if (ctx.STRING_T() != null) type = "string";
        else if (ctx.URL_T() != null) type = "url";
        else if (ctx.pType != null) type = ctx.pType.getText();
        else type = "unknown";

        semanticLogger.checkValidType(type, name, ctx.start.getLine());

        String pageScope = "page:" + currentPage;
        if (symbolTable.contains(name, pageScope)) {
            semanticLogger.logError("Duplicate param '" + name + "' in page '" + currentPage + "'.", ctx.start.getLine());
        } else {
            symbolTable.addVariable(name, type, pageScope, "param");
        }

        codeGen.writeHTML("<!-- Param Section: " + name + " -->\n");
        codeGen.writeHTML("<span id=\"" + name + "\"></span>\n");

        return new ParamSection(name, type);
    }
    @Override
    public ASTNode visitOnSubmitStmt(parseranalysis.OnSubmitStmtContext ctx) {
        String actionName = ctx.IDENTIFIER(0).getText();
        boolean useForm = ctx.formArg() != null;

        String thenPage = null;
        if (ctx.GO() != null && ctx.IDENTIFIER().size() >= 2) {
            thenPage = ctx.IDENTIFIER(ctx.IDENTIFIER().size() - 1).getText();
        }

        if (!symbolTable.contains(actionName, "actions")) {
            semanticLogger.logError("Action '" + actionName + "' is not defined.", ctx.start.getLine());
        }
        if (thenPage != null && !symbolTable.contains(thenPage, "page")) {
            semanticLogger.logError("Page '" + thenPage + "' (then go) is not defined.", ctx.start.getLine());
        }

        symbolTable.addVariable("onSubmit@" + actionName, "onSubmit", "page:" + currentPage,
                (useForm ? "$form" : "") + (thenPage != null ? " -> " + thenPage : ""));

        // ✅ HTML + JS
        String btnId = "submit_" + actionName;
        codeGen.writeHTML("<button id=\"" + btnId + "\">Submit</button>\n");
        codeGen.writeJS("document.getElementById('" + btnId + "').onclick = function() {\n");
        codeGen.writeJS("  " + actionName + "(" + (useForm ? "formData" : "") + ");\n");
        if (thenPage != null) {
            codeGen.writeJS("  window.location.href = '" + thenPage + ".html';\n");
        }
        codeGen.writeJS("};\n");

        return new OnSubmitStmt(actionName, useForm, thenPage);
    }

    @Override
    public ASTNode visitNavStmt(parseranalysis.NavStmtContext ctx) {
        String target = ctx.IDENTIFIER().getText();
        if (!symbolTable.contains(target, "page")) {
            semanticLogger.logError("Target page '" + target + "' not defined.", ctx.start.getLine());
        }
        symbolTable.addVariable("go@" + target, "nav", "page:" + currentPage, target);

        String btnId = "go_" + target;
        codeGen.writeHTML("<button id=\"" + btnId + "\">Go to " + target + "</button>\n");
        codeGen.writeJS("document.getElementById('" + btnId + "').onclick = function() { window.location.href = '" + target + ".html'; };\n");

        return new NavStmt(target);
    }
    @Override
    public ASTNode visitAddButtonStmt(parseranalysis.AddButtonStmtContext ctx) {
        String targetPage = ctx.targetPage.getText();

        if (!symbolTable.contains(targetPage, "page")) {
            semanticLogger.logError("AddButton target page '" + targetPage + "' not defined.", ctx.start.getLine());
        }
        symbolTable.addVariable("addButton@" + targetPage, "addButton", "page:" + currentPage, targetPage);

        String btnId = "addBtn_" + targetPage;
        codeGen.writeHTML("<button id=\"" + btnId + "\">Add</button>\n");
        codeGen.writeJS("document.getElementById('" + btnId + "').onclick = function() { window.location.href = '" + targetPage + ".html'; };\n");

        return new AddButtonStmt(targetPage);
    }

    @Override
    public ASTNode visitItemSection(parseranalysis.ItemSectionContext ctx) {
        String img = null, title = null, subtitle = null, onClickPage = null;

        for (parseranalysis.ItemBodyContext b : ctx.itemBody()) {
            if (b.IMG() != null) img = b.getToken(parseranalysis.IDENTIFIER, 0).getText();
            else if (b.TITLE() != null) title = b.getToken(parseranalysis.IDENTIFIER, 0).getText();
            else if (b.SUBTITLE() != null) subtitle = b.getToken(parseranalysis.IDENTIFIER, 0).getText();
            else if (b.ONCLICK() != null) {
                onClickPage = b.getToken(parseranalysis.IDENTIFIER, 0).getText();
                if (!symbolTable.contains(onClickPage, "page")) {
                    semanticLogger.logError("onClick target page '" + onClickPage + "' not defined.", b.start.getLine());
                }
            }
        }

        symbolTable.addVariable("item", "item", "page:" + currentPage,
                "img=" + img + ", title=" + title + ", subtitle=" + subtitle + ", onClick=" + onClickPage);

        String itemId = "item_" + System.currentTimeMillis();
        codeGen.writeHTML("<div class=\"item\" id=\"" + itemId + "\">\n");
        if (img != null) codeGen.writeHTML("  <img src=\"" + img + "\" alt=\"\" />\n");
        if (title != null) codeGen.writeHTML("  <h3>" + title + "</h3>\n");
        if (subtitle != null) codeGen.writeHTML("  <p>" + subtitle + "</p>\n");
        codeGen.writeHTML("</div>\n");

        if (onClickPage != null) {
            codeGen.writeJS("document.getElementById('" + itemId + "').onclick = function() { window.location.href = '" + onClickPage + ".html'; };\n");
        }

        return new ItemSection(img, title, subtitle, onClickPage);
    }


    @Override
    public ASTNode visitActionButtonsSection(parseranalysis.ActionButtonsSectionContext ctx) {
        String editPage = null;
        String deleteAction = null;

        for (parseranalysis.ActionBtnContext ab : ctx.actionBtn()) {
            if (ab.EDIT() != null) {
                editPage = ab.getToken(parseranalysis.IDENTIFIER, 0).getText();
                if (!symbolTable.contains(editPage, "page")) {
                    semanticLogger.logError("Edit target page '" + editPage + "' not defined.", ab.start.getLine());
                }
            } else if (ab.DELETE() != null) {
                deleteAction = ab.getToken(parseranalysis.IDENTIFIER, 0).getText();
                if (!symbolTable.contains(deleteAction, "actions")) {
                    semanticLogger.logError("Delete action '" + deleteAction + "' not defined.", ab.start.getLine());
                }
            }
        }

        symbolTable.addVariable("actions", "buttons", "page:" + currentPage,
                "edit=" + editPage + ", delete=" + deleteAction);

        if (editPage != null) {
            String btnId = "editBtn_" + editPage;
            codeGen.writeHTML("<button id=\"" + btnId + "\">Edit</button>\n");
            codeGen.writeJS("document.getElementById('" + btnId + "').onclick = function() { window.location.href = '" + editPage + ".html'; };\n");
        }
        if (deleteAction != null) {
            String btnId = "deleteBtn_" + deleteAction;
            codeGen.writeHTML("<button id=\"" + btnId + "\">Delete</button>\n");
            codeGen.writeJS("document.getElementById('" + btnId + "').onclick = function() { " + deleteAction + "(); };\n");
        }

        return new ActionButtons(editPage, deleteAction);
    }

}