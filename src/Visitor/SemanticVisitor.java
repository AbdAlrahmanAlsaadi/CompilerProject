package Visitor;

import SymbolTableStructure.SymbolTable2;
import antlr.parseranalysis;
import antlr.parseranalysisBaseVisitor;
import expression.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantic.SemanticErrorLogger;

import java.util.ArrayList;
import java.util.List;


public class SemanticVisitor extends parseranalysisBaseVisitor<ASTNode> {

    private final SymbolTable2 symbolTable;
    private final SemanticErrorLogger semanticLogger;

    public SemanticVisitor(SymbolTable2 symbolTable) {
        this.symbolTable = symbolTable;
        this.semanticLogger = new SemanticErrorLogger(symbolTable);
    }


    @Override
    public ASTNode visitComponentFile(parseranalysis.ComponentFileContext ctx) {
        List<Imports> importsList = new ArrayList<>();

        // مرّ على كل import وخزّن البيانات في جدول الرموز
        for (parseranalysis.ImportsContext impCtx : ctx.imports()) {
            Imports imp = (Imports) visit(impCtx);
            importsList.add(imp);

            // تخزين معلومات الاستيراد في جدول الرموز
            String scope = "import";
            String type = "module";
            String name = imp.getImportedIdentifier();
            String value = "from " + imp.getFromPath();

            symbolTable.addVariable(name, type, scope, value);
        }

        // زيارة تعريف الكومبوننت
        ComponentDeclaration declaration = (ComponentDeclaration) visit(ctx.componentDeclaration());

        // تخزين معلومات الكومبوننت الرئيسي في جدول الرموز
        symbolTable.addVariable(
                declaration.getIdentifier(), // اسم الكلاس
                "component",                 // النوع
                "global",                    // السكوب
                "@" + declaration.getDecorator() // القيمة التوضيحية
        );

        // بناء العقدة النهائية
        ComponentFile componentFile = new ComponentFile(importsList, declaration);

        return componentFile;
    }
    @Override
    public ASTNode visitImports(parseranalysis.ImportsContext ctx) {
        String importedIdentifier = null;
        if (ctx.IDENTIFIER() != null) {
            importedIdentifier = ctx.IDENTIFIER().getText();
        }

        List<String> bindings = new ArrayList<>();
        if (ctx.INPUT_BINDING() != null) {
            bindings.add(ctx.INPUT_BINDING().getText());
        }
        if (ctx.OUTPUT_BINDING() != null) {
            bindings.add(ctx.OUTPUT_BINDING().getText());
        }

        // استخراج المسار من STRING
        String fromPath = ctx.STRING().getText().replaceAll("\"", "");

        // بناء العقدة AST
        Imports importsNode = new Imports(importedIdentifier, bindings, fromPath);

        // تخزين كل binding في جدول الرموز
        String scope = "import";
        String type = "binding";

        for (String binding : bindings) {
            symbolTable.addVariable(binding, type, scope, "from " + fromPath);
        }

        // أيضًا تخزين identifier الرئيسي إن وجد
        if (importedIdentifier != null) {
            symbolTable.addVariable(importedIdentifier, "module", scope, "from " + fromPath);
        }

        return importsNode;
    }
    @Override
    public ASTNode visitComponentDeclaration(parseranalysis.ComponentDeclarationContext ctx) {
        // قراءة النصوص مباشرة حسب الترتيب في القاعدة
        String decorator = ctx.DECORATOR().getText();
        ComponentMetadata metadata = (ComponentMetadata) visit(ctx.componentMetadata());
        String classAttr = ctx.CLASS_ATTR().getText();
        String identifier = ctx.IDENTIFIER().getText();
        ClassBody body = (ClassBody) visit(ctx.classBody());

        // تخزين تعريف الكومبوننت في جدول الرموز
        symbolTable.addVariable(
                identifier,        // اسم الكلاس
                "component",       // النوع
                "global",          // السكوب
                "@" + decorator    // القيمة التوضيحية
        );

        // بناء كائن AST
        return new ComponentDeclaration(decorator, metadata, classAttr, identifier, body);
    }
    @Override
    public ASTNode visitComponentMetadata(parseranalysis.ComponentMetadataContext ctx) {
        List<ComponentProperty> properties = new ArrayList<>();

        int pairCount = ctx.IDENTIFIER().size();
        for (int i = 0; i < pairCount; i++) {
            String key = ctx.IDENTIFIER(i).getText();
            ExpressionNode value = null;

            if (i < ctx.STRING().size()) {
                value = new StringLiteral(ctx.STRING(i).getText());
            } else if (i < ctx.arrayLiteral().size()) {
                value = (ExpressionNode) visit(ctx.arrayLiteral(i));
            } else if (i + 1 < ctx.IDENTIFIER().size()) {
                value = (ExpressionNode) new IdentifierLiteral(ctx.IDENTIFIER(i + 1).getText()); // تحتاج لإنشاء IdentifierLiteral
            }

            properties.add(new ComponentProperty(key, value));

            // أضفها لرموز المشروع
            symbolTable.addVariable(key, "metadataProperty", "component", value != null ? value.toString() : "null");
        }

        return new ComponentMetadata(properties);
    }
    @Override
    public ASTNode visitClassBody(parseranalysis.ClassBodyContext ctx) {
        List<ASTNode> members = new ArrayList<>();

        // نحدد سكوب جديد بناءً على سياق الكلاس الحالي (مثلاً ClassName)
        String scope = "classScope"; // يمكن تعديله لاحقاً بناء على اسم الكلاس

        for (ParseTree child : ctx.children) {
            ASTNode node = (ASTNode) visit(child);

            if (node != null) {
                members.add(node);

                // تخزين في جدول الرموز إذا كان Property
                if (node instanceof expression.Property) {
                    expression.Property prop = (expression.Property) node;
                    symbolTable.addVariable(
                            prop.getName(),              // اسم المتغير
                            prop.getType(),              // نوعه
                            scope,                       // السكوب
                            "undefined"                  // القيمة (لم تُسند بعد)
                    );
                }

                // تخزين اسم الدالة
                else if (node instanceof expression.Method) {
                    expression.Method method = (expression.Method) node;
                    symbolTable.addVariable(
                            method.getName(),            // اسم الدالة
                            "function",                  // نوعه
                            scope,                       // السكوب
                            "methodBody"                 // وصف افتراضي
                    );
                }

                // تخزين اسم المعالج (click handler)
                else if (node instanceof expression.ClickHandler) {
                    expression.ClickHandler click = (expression.ClickHandler) node;
                    symbolTable.addVariable(
                            click.getName(),             // اسم الحدث
                            "eventHandler",              // النوع
                            scope,                       // السكوب
                            click.getCallTarget()        // القيمة = اسم الدالة المستهدفة
                    );
                }
            }
        }

        return new ClassBody(members);
    }
    @Override
    public ASTNode visitComponentConstructor(parseranalysis.ComponentConstructorContext ctx) {
        List<Parameter> parameters = new ArrayList<>();

        if (ctx.IDENTIFIER().size() >= 2) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i += 2) {
                String name = ctx.IDENTIFIER(i).getText();
                String type = ctx.IDENTIFIER(i + 1).getText();

                Parameter param = new Parameter(name, type);
                parameters.add(param);

                // 🧠 تخزين في Symbol Table
                symbolTable.addVariable(name, type, "constructor", "injected");
            }
        }

        // زيارة جسم الكونستركتر
        MethodBody body = (MethodBody) visit(ctx.methodBody());

        return new ComponentConstructor(parameters, body);
    }
    @Override
    public ASTNode visitProperty(parseranalysis.PropertyContext ctx) {
        // ✅ تحقق من وجود المعرفات بشكل صحيح
        if (ctx.IDENTIFIER().size() < 2) {
            semanticLogger.logError("Malformed property declaration: missing name or type.");
            return null;
        }

        String varType = ctx.VAR().getText();
        String name = ctx.IDENTIFIER(0).getText();
        String type = ctx.IDENTIFIER(1).getText();
        String scope = "class";

        // 🔍 تحقق من التكرار والنوع
        boolean isDuplicate = symbolTable.contains(name, scope);
        semanticLogger.checkValidType(type, name);

        if (isDuplicate) {
            semanticLogger.logError("Duplicate variable '" + name + "' found in scope '" + scope + "'.");
        } else {
            symbolTable.addVariable(name, type, scope, null);
            semanticLogger.logSuccess("Variable '" + name + "' declared successfully in scope '" + scope + "'.");
        }

        return new Property(varType, name, type);
    }


    @Override
    public ASTNode visitMethod(parseranalysis.MethodContext ctx) {
        if (ctx == null || ctx.IDENTIFIER() == null || ctx.IDENTIFIER().size() == 0) {
            semanticLogger.logError("❌ خطأ في تعريف الدالة: المعرف مفقود.");
            return null;
        }

        String name = ctx.IDENTIFIER(0).getText();  // اسم الدالة
        String scope = "class";

        // تحقق من التكرار أولاً
        if (symbolTable.contains(name, scope)) {
            semanticLogger.logError("❌ Duplicate method '" + name + "' found in class scope.");
            return null;
        }

        List<Parameter> parameters = new ArrayList<>();

        // معالجة المعاملات إذا كانت موجودة
        if (ctx.IDENTIFIER().size() > 2) {
            try {
                String paramName = ctx.IDENTIFIER(1).getText();
                String paramType = ctx.IDENTIFIER(2).getText();
                Parameter param = new Parameter(paramName, paramType);
                parameters.add(param);

                // إضافة المعامل إلى السيمبول تيبل الخاص بالدالة
                symbolTable.addVariable(paramName, paramType, name, "param");

            } catch (Exception e) {
                semanticLogger.logError("❌ خطأ أثناء تحليل المعاملات في الدالة '" + name + "'.");
            }
        }

        // زيارة جسم الدالة بأمان
        MethodBody body = null;
        try {
            body = (MethodBody) visit(ctx.methodBody());
        } catch (Exception e) {
            semanticLogger.logError("❌ خطأ أثناء تحليل جسم الدالة '" + name + "'.");
        }

        // إضافة تعريف الدالة إلى السيمبول تيبل
        symbolTable.addVariable(name, "method", "class", "void");

        return new Method(name, parameters, body);
    }

    @Override
    public ASTNode visitMethodBody(parseranalysis.MethodBodyContext ctx) {
        List<ASTNode> statements = new ArrayList<>();

        if (ctx == null || ctx.children == null) {
            semanticLogger.logError("❌ خطأ أثناء تحليل جسم الدالة: لا يوجد محتوى.");
            return new MethodBody(statements);
        }

        for (ParseTree child : ctx.children) {
            ASTNode stmt = (ASTNode) visit(child);
            if (stmt != null) {
                statements.add(stmt);
            }
        }

        return new MethodBody(statements);
    }

    @Override
    public ASTNode visitAssignment(parseranalysis.AssignmentContext ctx) {
        String variableName = ctx.IDENTIFIER(0).getText();  // المتغير الذي يُسنَد إليه

        ExpressionNode value;

        // تحليل القيمة المسندة
        if (ctx.STRING() != null) {
            value = new StringLiteral(ctx.STRING().getText().replace("\"", ""));
        } else if (ctx.NUMBER() != null) {
            value = new NumberLiteral(ctx.NUMBER().getText());
        } else if (ctx.IDENTIFIER().size() > 1) {
            value = new VariableReference(ctx.IDENTIFIER(1).getText());
        } else {
            throw new RuntimeException("Unknown assignment value.");
        }

        // التحقق إذا المتغير مُعرف مسبقًا في السيمبول تيبل
        semanticLogger.checkVariableDefined(variableName, "class");

        // 📝 لا تضف المتغير إذا لم يكن معرفًا مسبقًا
        if (symbolTable.contains(variableName, "class")) {
            symbolTable.updateVariable(
                    variableName,
                    value instanceof StringLiteral ? ((StringLiteral) value).getValue() :
                            value instanceof NumberLiteral ? ((NumberLiteral) value).getValue() :
                                    value instanceof VariableReference ? ((VariableReference) value).getName() :
                                            "unknown"
            );
        }

        return new Assignment(variableName, value);
    }

    @Override
    public ASTNode visitHtmlTemplate(parseranalysis.HtmlTemplateContext ctx) {
        String tagName = ctx.HTML_TAG(0).getText();

        List<HtmlChildNode> children = new ArrayList<>();

        // مرّ على كل الـ IDENTIFIER (نصوص)
        for (TerminalNode id : ctx.IDENTIFIER()) {
            children.add(new TextNode(id.getText()));
        }

        // مرّ على العناصر المتداخلة htmlTemplate
        for (parseranalysis.HtmlTemplateContext childCtx : ctx.htmlTemplate()) {
            HtmlTemplate childTemplate = (HtmlTemplate) visitHtmlTemplate(childCtx);
            children.add(childTemplate);
        }

        HtmlTemplate template = new HtmlTemplate(tagName, children);

        // مثال على التخزين في Symbol Table
        symbolTable.addVariable(
                tagName,
                "htmlTag",
                "template",
                "HTML Element with " + children.size() + " children"
        );

        return template;
    }
    @Override
    public ASTNode visitClickHandler(parseranalysis.ClickHandlerContext ctx) {
        String handlerName = ctx.IDENTIFIER(0).getText();  // اسم المعالج
        String callTarget = ctx.IDENTIFIER(1).getText();   // الدالة المستهدفة

        String argument = null;
        int passedArgs = 0;

        if (ctx.IDENTIFIER().size() > 2) {
            argument = ctx.IDENTIFIER(2).getText();        // الوسيط
            passedArgs = 1;
        }

        // ✅ عدد الوسائط المتوقع
        int expectedArgs = 1;

        // تحقق من عدد الوسائط
        semanticLogger.checkArgumentCount(callTarget, expectedArgs, passedArgs);

        ClickHandler clickHandler = new ClickHandler(handlerName, callTarget, argument);

        // تخزين في SymbolTable
        symbolTable.addVariable(
                handlerName,
                "clickHandler",
                "component",
                callTarget + (argument != null ? "(" + argument + ")" : "()")
        );

        return clickHandler;
    }

    @Override
    public ASTNode visitLogStatement(parseranalysis.LogStatementContext ctx) {
        String variable = ctx.IDENTIFIER().getText();

        LogStatement log = new LogStatement(variable);

        // ✅ تسجيل العملية في Symbol Table
        symbolTable.addVariable(
                "console_log_" + variable,
                "logStatement",
                "method",
                "console.log(" + variable + ")"
        );

        return log;
    }
    @Override
    public ASTNode visitArrayLiteral(parseranalysis.ArrayLiteralContext ctx) {
        List<String> items = new ArrayList<>();

        for (TerminalNode id : ctx.IDENTIFIER()) {
            items.add(id.getText());
        }

        ArrayLiteral arrayLiteral = new ArrayLiteral(items);

        // ✅ تخزين في Symbol Table
        String name = "arrayLiteral_" + System.currentTimeMillis();

        String type = "array";
        String scope = "method"; // غيّرها إذا كنتَ تدير السكوبات
        String value = items.toString();

        symbolTable.addVariable(name, type, scope, value);

        return arrayLiteral;
    }
    @Override
    public ASTNode visitObjectLiteral(parseranalysis.ObjectLiteralContext ctx) {
        List<ObjectProperty> properties = new ArrayList<>();

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String key = ctx.IDENTIFIER(i).getText();
            ParseTree valueNode = ctx.getChild(2 + i * 4); // يعتمد على البنية الثابتة

            ExpressionNode value;

            if (valueNode instanceof TerminalNode) {
                String token = valueNode.getText();
                if (token.startsWith("\"")) {
                    value = new StringLiteral(token.replace("\"", ""));
                } else if (token.matches("\\d+")) {
                    value = new NumberLiteral(token);
                } else {
                    value = new VariableReference(token);
                }
            } else {
                // fallback
                value = new VariableReference("unknown");
            }

            ObjectProperty prop = new ObjectProperty(key, value);
            properties.add(prop);
        }

        ObjectLiteral objectLiteral = new ObjectLiteral(properties);

        // تخزين تمثيلي (رمزي) في جدول الرموز
        String name = "object_" + System.currentTimeMillis();
        symbolTable.addVariable(name, "object", "local", "[object literal]");

        return objectLiteral;
    }





}
