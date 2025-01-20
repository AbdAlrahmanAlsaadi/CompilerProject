package expression;

import antlr.TypeScriptParser;
import antlr.TypeScriptParserBaseVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilderVisitor extends TypeScriptParserBaseVisitor<ASTNode> {


    // زيارة قاعدة operator
    @Override
    public ASTNode visitOperator(TypeScriptParser.OperatorContext ctx) {
        // Retrieve the operator text (e.g., "+", "-", ">", etc.)
        String operator = ctx.getText();
        return new OperatorNode(operator);
    }


    @Override
    public ASTNode visitTypeItem(TypeScriptParser.TypeItemContext ctx) {
        // Check which terminal is present and create a corresponding TypeItemNode
        if (ctx.TYPES() != null) {
            return new TypeItemNode(ctx.TYPES().getText(), TypeItemNode.TypeItemType.TYPES);
        } else if (ctx.IDENTIFIER() != null) {
            return new TypeItemNode(ctx.IDENTIFIER().getText(), TypeItemNode.TypeItemType.IDENTIFIER);
        } else if (ctx.STRING() != null) {
            return new TypeItemNode(ctx.STRING().getText(), TypeItemNode.TypeItemType.STRING);
        }
        // Default case: this shouldn't happen if the grammar is correct
        throw new IllegalStateException("Invalid type item");
    }



    @Override
    public ASTNode visitDirectiveElement(TypeScriptParser.DirectiveElementContext ctx) {
        String tagOpen = ctx.TAG_OPEN().getText();
        String tagClose = ctx.TAG_CLOSE() != null ? ctx.TAG_CLOSE().getText() : null;

        // زيارة directives
        List<DirectiveNode> directives = new ArrayList<>();
        for (TypeScriptParser.DirectiveContext directiveCtx : ctx.directive()) {
            directives.add((DirectiveNode) visit(directiveCtx));
        }

        // زيارة content أو directiveElement
        List<ASTNode> contentOrDirectiveElements = new ArrayList<>();
        for (TypeScriptParser.ContentContext contentCtx : ctx.content()) {
            contentOrDirectiveElements.add(visit(contentCtx));
        }
        for (TypeScriptParser.DirectiveElementContext directiveElementCtx : ctx.directiveElement()) {
            contentOrDirectiveElements.add(visit(directiveElementCtx));
        }

        return new DirectiveElementNode(tagOpen, directives, contentOrDirectiveElements, tagClose);
    }

    @Override
    public ASTNode visitContent(TypeScriptParser.ContentContext ctx) {
        if (ctx.htmlContent() != null) {
            return new ContentNode(visit(ctx.htmlContent()));
        } else if (ctx.templateBinding() != null) {
            return new ContentNode(visit(ctx.templateBinding()));
        }
        return null;
    }

    @Override
    public ASTNode visitDirective(TypeScriptParser.DirectiveContext ctx) {
        String directiveType = null;
        String identifier = null;
        String value = ctx.STRING().getText();

        if (ctx.DIRECTIVE() != null) {
            directiveType = ctx.DIRECTIVE().getText();
        } else if (ctx.IDENTIFIER() != null) {
            directiveType = ctx.IDENTIFIER().getText();
        } else if (ctx.KEYWORDS() != null) {
            directiveType = ctx.KEYWORDS().getText();
        }

        if (ctx.IDENTIFIER() != null) {
            identifier = ctx.IDENTIFIER().getText();
        }

        return new DirectiveNode(directiveType, identifier, value);
    }
    // زيارة قاعدة type


    @Override
    public ASTNode visitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx) {
        // Parse decorators
        List<DecoratorNode> decorators = new ArrayList<>();
        if (ctx.decorator() != null) {
            for (var decoratorCtx : ctx.decorator()) {
                decorators.add((DecoratorNode) visit(decoratorCtx));
            }
        }

        // Parse access modifiers
        AccessModifiersNode accessModifiers = null;
        if (ctx.accessMoidifers() != null) {
            accessModifiers = (AccessModifiersNode) visit(ctx.accessMoidifers());
        }

        // Parse keyword
        String keyword = ctx.KEYWORDS(0) != null ? ctx.KEYWORDS(0).getText() : null;

        // Parse identifier
        String identifier = ctx.IDENTIFIER(0) != null ? ctx.IDENTIFIER(0).getText() : null;

        // Parse assigned keyword
        String assignedKeyword = ctx.ASSIGN() != null && ctx.KEYWORDS(1) != null ? ctx.KEYWORDS(1).getText() : null;

        // Parse parameters
        List<ParameterNode> parameters = new ArrayList<>();
        if (ctx.parameterFunction() != null) {
            parameters = (List<ParameterNode>) visit(ctx.parameterFunction());
        }

        // Parse return type
        TypeNode returnType = null;
        if (ctx.type() != null) {
            returnType = (TypeNode) visit(ctx.type());
        }

        // Parse block
        BlockNode block = null;
        if (ctx.block() != null) {
            block = (BlockNode) visit(ctx.block());
        }

        // Return the constructed FunctionDeclarationNode
        return new FunctionDeclarationNode(decorators, accessModifiers, keyword, identifier, assignedKeyword, parameters, returnType, block);
    }



    @Override
    public ASTNode visitArrowFunction(TypeScriptParser.ArrowFunctionContext ctx) {
        List<ASTNode> parameters = new ArrayList<>();
        if (ctx.parameterFunction() != null) {
            parameters = ((ParameterFunctionNode) visit(ctx.parameterFunction())).getParameters();
        }
        ASTNode block = visit(ctx.block());
        return new ArrowFunctionNode(parameters, block);
    }

    @Override
    public ASTNode visitAwaitDef(TypeScriptParser.AwaitDefContext ctx) {
        String keyword = ctx.KEYWORDS().getText();
        String identifier = ctx.IDENTIFIER(0).getText();
        List<String> dotIdentifiers = new ArrayList<>();
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            dotIdentifiers.add(ctx.IDENTIFIER(i).getText());
        }
        ASTNode block = visit(ctx.block());
        String optionalIdentifier = ctx.IDENTIFIER().size() > 1 ? ctx.IDENTIFIER(ctx.IDENTIFIER().size() - 1).getText() : null;
        String optionalMethodCall = ctx.IDENTIFIER().size() > 1 ? ctx.IDENTIFIER(ctx.IDENTIFIER().size() - 1).getText() : null;
        return new AwaitDefNode(keyword, identifier, dotIdentifiers, block, optionalIdentifier, optionalMethodCall);
    }

    @Override
    public ASTNode visitParameterFunction(TypeScriptParser.ParameterFunctionContext ctx) {
        List<ASTNode> parameters = new ArrayList<>();
        for (var paramCtx : ctx.parameter()) {
            parameters.add(visit(paramCtx));
        }
        return new ParameterFunctionNode(parameters);
    }

    @Override
    public ASTNode visitParameter(TypeScriptParser.ParameterContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        TypeNode type = (TypeNode) visit(ctx.type()); // تحويل ASTNode إلى TypeNode
        boolean isGeneric = ctx.BIGGER() != null; // التحقق من وجود علامة generic
        return new ParameterNode(identifier, type, isGeneric);
    }
    @Override
    public ASTNode visitPropertyAssignment(TypeScriptParser.PropertyAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        ASTNode expression = visit(ctx.expression());
        return new PropertyAssignmentNode(identifier, expression);
    }
    @Override
    public ASTNode visitHtmlContent(TypeScriptParser.HtmlContentContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (var idCtx : ctx.IDENTIFIER()) {
            identifiers.add(idCtx.getText());
        }
        boolean hasDot = ctx.DOT() != null;
        return new HtmlContentNode(identifiers, hasDot);
    }

    @Override
    public ASTNode visitTemplateBinding(TypeScriptParser.TemplateBindingContext ctx) {
        return new TemplateBindingNode(visit(ctx.expression()));
    }

    @Override
    public ASTNode visitEnumLiteral(TypeScriptParser.EnumLiteralContext ctx) {
        String keyword = ctx.KEYWORDS().getText();
        String identifier = ctx.IDENTIFIER(0).getText();
        Map<String, ASTNode> enumValues = new HashMap<>();
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            String key = ctx.IDENTIFIER(i).getText();
            ASTNode value = ctx.expression(i - 1) != null ? visit(ctx.expression(i - 1)) : null;
            enumValues.put(key, value);
        }
        return new EnumLiteralNode(keyword, identifier, enumValues);
    }

    @Override
    public ASTNode visitEnumAccess(TypeScriptParser.EnumAccessContext ctx) {
        String keyword = ctx.KEYWORDS().getText();
        String enumIdentifier = ctx.IDENTIFIER(0).getText();
        String valueIdentifier = ctx.IDENTIFIER(1).getText();
        return new EnumAccessNode(keyword, enumIdentifier, valueIdentifier);
    }

    @Override
    public ASTNode visitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx) {
        // Case 1: Decorators, parameter, and optional initial value
        if (ctx.parameter() != null) {
            List<ASTNode> decorators = new ArrayList<>();
            for (var decoratorCtx : ctx.decorator()) {
                decorators.add(visit(decoratorCtx));
            }

            String accessModifier = ctx.accessMoidifers() != null ? ctx.accessMoidifers().getText() : null;
            String keyword = ctx.KEYWORDS() != null ? ctx.KEYWORDS().getText() : null;
            ASTNode parameter = visit(ctx.parameter());

            ASTNode initialValue = null;
            if (ctx.expression() != null && !ctx.expression().isEmpty()) {
                initialValue = visit(ctx.expression(0)); // Handle the first expression
            }

            return new VariableDeclarationNode(decorators, accessModifier, keyword, parameter, initialValue);
        }

        // Case 2: Expression with operators
        List<ASTNode> expressions = new ArrayList<>();
        List<OperatorNode> operators = new ArrayList<>();

        for (var exprCtx : ctx.expression()) {
            expressions.add(visit(exprCtx)); // Visit each expression
        }

        if (ctx.operator() != null) {
            // Handle a single operator context (if applicable in the grammar)
            operators.add(new OperatorNode(ctx.operator().getText()));
        }

        return new VariableDeclarationNode(expressions, operators);
    }




    @Override
    public ASTNode visitTupleLiteral(TypeScriptParser.TupleLiteralContext ctx) {
        List<ASTNode> elements = new ArrayList<>();
        for (var exprCtx : ctx.expression()) {
            elements.add(visit(exprCtx));
        }
        return new TupleLiteralNode(elements);
    }

    @Override
    public ASTNode visitListVar(TypeScriptParser.ListVarContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        ASTNode listBody = visit(ctx.listBody());
        return new ListVarNode(identifier, listBody);
    }

    @Override
    public ASTNode visitListBody(TypeScriptParser.ListBodyContext ctx) {
        List<ASTNode> parameterLists = new ArrayList<>();
        for (var paramListCtx : ctx.listBodyBody().parameterList()) { // زيارة parameterList
            parameterLists.add(visit(paramListCtx));
        }
        return new ListBodyNode(parameterLists);
    }
    @Override
    public ASTNode visitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx) {
        List<ASTNode> elements = new ArrayList<>();
        for (var elementCtx : ctx.arrayElement()) {
            elements.add(visit(elementCtx));
        }
        return new ArrayLiteralNode(elements);
    }

    @Override
    public ASTNode visitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx) {
        List<PropertyAssignmentNode> properties = new ArrayList<>();
        for (var propCtx : ctx.propertyAssignment()) {
            properties.add((PropertyAssignmentNode) visit(propCtx));
        }
        return new ObjectLiteralNode(properties);
    }


    @Override
    public ASTNode visitType(TypeScriptParser.TypeContext ctx) {
        // Case 1: SIMPLE type
        if (ctx.typeItem().size() == 1 && ctx.LSQUARE() == null && ctx.LESS() == null) {
            TypeItemNode simpleType = (TypeItemNode) visit(ctx.typeItem(0));
            return new TypeNode(simpleType);
        }

        // Case 2: ARRAY type
        if (ctx.typeItem().size() == 1 && ctx.LSQUARE() != null && ctx.RSQUARE() != null) {
            TypeItemNode simpleType = (TypeItemNode) visit(ctx.typeItem(0));
            return new TypeNode(simpleType, true);
        }

        // Case 3: GENERIC type
        if (ctx.TYPES() != null && ctx.LESS() != null && ctx.BIGGER() != null) {
            String genericType = ctx.TYPES().getText();
            TypeItemNode simpleType = (TypeItemNode) visit(ctx.typeItem(0));
            return new TypeNode(genericType, simpleType);
        }

        // Case 4: TUPLE type
        if (ctx.LSQUARE() != null && ctx.RSQUARE() != null && ctx.typeItem().size() > 1) {
            List<TypeItemNode> tupleElements = new ArrayList<>();
            for (TypeScriptParser.TypeItemContext typeItemCtx : ctx.typeItem()) {
                tupleElements.add((TypeItemNode) visit(typeItemCtx));
            }
            return new TypeNode(tupleElements);
        }

        // Default case: should not occur if grammar is correct
        throw new IllegalStateException("Invalid type rule encountered");
    }


    // زيارة قاعدة accessModifiers
    @Override
    public ASTNode visitAccessMoidifers(TypeScriptParser.AccessMoidifersContext ctx) {
        // استخراج النص الخاص بالـ modifier
        String modifier = ctx.KEYWORDS().getText();
        return new AccessModifiersNode(modifier);
    }


    @Override
    public ASTNode visitFunctionCall(TypeScriptParser.FunctionCallContext ctx) {
        // الكائن الذي يتم استدعاء الدالة منه (مثل object في object.method())
        String caller = null;
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().size() > 0) {
            caller = ctx.IDENTIFIER(0).getText();
        } else if (ctx.KEYWORDS() != null) {
            caller = ctx.KEYWORDS().getText();
        }

        // اسم الدالة أو الأسلوب
        String method = null;
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().size() > 1) {
            method = ctx.IDENTIFIER(ctx.IDENTIFIER().size() - 1).getText();
        }

        // قائمة الوسائط
        List<ASTNode> arguments = new ArrayList<>();
        if (ctx.argumentList() != null) {
            arguments = ((ArgumentListNode) visit(ctx.argumentList())).getArguments();
        }

        // العبارة التالية (إن وجدت)
        ASTNode statement = null;
        if (ctx.statement() != null) {
            statement = visit(ctx.statement());
        }

        return new FunctionCallNode(caller, method, arguments, statement);
    }
    @Override
    public ASTNode visitArgumentList(TypeScriptParser.ArgumentListContext ctx) {
        List<ASTNode> arguments = new ArrayList<>();

        // Handle statements
        if (ctx.statement() != null) {
            for (TypeScriptParser.StatementContext statementCtx : ctx.statement()) {
                arguments.add(visit(statementCtx));
            }
        }

        // Handle parameter lists
        if (ctx.parameterList() != null) {
            for (TypeScriptParser.ParameterListContext paramCtx : ctx.parameterList()) {
                arguments.add(visit(paramCtx));
            }
        }

        return new ArgumentListNode(arguments);
    }


    @Override
    public ASTNode visitThisAssignment(TypeScriptParser.ThisAssignmentContext ctx) {
        String target = null;
        String value = null;
        String operator = null;
        String methodCall = null;

        // الحالة الأولى: this.property = value;
        if (ctx.KEYWORDS() != null && ctx.KEYWORDS(0).getText().equals("this")) {
            target = "this." + ctx.IDENTIFIER(0).getText();
            value = ctx.IDENTIFIER(1).getText();
            operator = ctx.ASSIGN().getText();
        }
        // الحالة الثانية: variable operator value;
        else {
            target = ctx.IDENTIFIER(0).getText();
            operator = ctx.operator(0).getText();
            value = ctx.IDENTIFIER(1).getText();

            // إذا كان هناك استدعاء دالة
            if (ctx.DOT() != null && ctx.IDENTIFIER().size() > 2) {
                methodCall = ctx.IDENTIFIER(2).getText();
            }
        }

        return new ThisAssignmentNode(target, value, operator, methodCall);
    }

    @Override
    public ASTNode visitArrow(TypeScriptParser.ArrowContext ctx) {
        // زيارة التعبير الذي يتبع السهم
        ASTNode expression = visit(ctx.expression());
        return new ArrowNode(expression);
    }

    @Override
    public ASTNode visitBlock(TypeScriptParser.BlockContext ctx) {
        List<ASTNode> statements = new ArrayList<>();

        // زيارة جميع العبارات أو الأوامر داخل الكتلة
        for (var statementCtx : ctx.statement()) {
            statements.add(visit(statementCtx));
        }
        for (var functionCallCtx : ctx.functionCall()) {
            statements.add(visit(functionCallCtx));
        }
        for (var thisAssignmentCtx : ctx.thisAssignment()) {
            statements.add(visit(thisAssignmentCtx));
        }
        for (var arrowFunctionCtx : ctx.arrowFunction()) {
            statements.add(visit(arrowFunctionCtx));
        }
        for (var parameterListCtx : ctx.parameterList()) {
            statements.add(visit(parameterListCtx));
        }

        return new BlockNode(statements);
    }
    @Override
    public ASTNode visitIfStatement(TypeScriptParser.IfStatementContext ctx) {
        // زيارة التعبير الشرطي
        ASTNode condition = visit(ctx.expression());

        // زيارة كتلة if
        ASTNode ifBlock = visit(ctx.block(0));

        // زيارة كتلة else (إن وجدت)
        ASTNode elseBlock = null;
        if (ctx.block().size() > 1) {
            elseBlock = visit(ctx.block(1));
        }

        return new IfStatementNode(condition, ifBlock, elseBlock);
    }

    @Override
    public ASTNode visitDecoratorProperty(TypeScriptParser.DecoratorPropertyContext ctx) {
        // استخراج المعرف
        String identifier = ctx.IDENTIFIER(0).getText();

        // جمع القيم
        List<String> values = new ArrayList<>();
        if (ctx.STRING() != null) {
            values.add(ctx.STRING().getText());
        }
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().size() > 1) {
            for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
                values.add(ctx.IDENTIFIER(i).getText());
            }
        }
        if (ctx.NUMBER() != null) {
            values.add(ctx.NUMBER().getText());
        }

        return new DecoratorPropertyNode(identifier, values);
    }

    @Override
    public ASTNode visitDecoratorBody(TypeScriptParser.DecoratorBodyContext ctx) {
        List<ASTNode> properties = new ArrayList<>();

        // زيارة جميع الخصائص (decoratorProperty)
        for (var propertyCtx : ctx.decoratorProperty()) {
            properties.add(visit(propertyCtx));
        }

        return new DecoratorBodyNode(properties);
    }

    @Override
    public ASTNode visitDecorator(TypeScriptParser.DecoratorContext ctx) {
        // استخراج نوع الديكوراتور (الكلمة المفتاحية الأولى)
        String decoratorType = ctx.KEYWORDS(0).getText();

        // استخراج اسم الديكوراتور (الكلمة المفتاحية الثانية أو المعرف)
        String decoratorName;
        if (ctx.KEYWORDS().size() > 1) {
            decoratorName = ctx.KEYWORDS(1).getText();
        } else {
            decoratorName = ctx.IDENTIFIER().getText();
        }

        // زيارة جسم الديكوراتور
        ASTNode body = visit(ctx.decoratorBody());

        return new DecoratorNode(decoratorType, decoratorName, body);
    }
    @Override
    public ASTNode visitClassCall(TypeScriptParser.ClassCallContext ctx) {
        // استخراج اسم الفئة
        String className = ctx.IDENTIFIER(0).getText();

        // استخراج اسم المثيل
        String instanceName = ctx.IDENTIFIER(1).getText();

        // استخراج الكلمة المفتاحية
        String keyword = ctx.KEYWORDS(0).getText();

        // استخراج النوع العام
        String genericType = ctx.IDENTIFIER(2).getText();

        return new ClassCallNode(className, instanceName, keyword, genericType);
    }

    @Override
    public ASTNode visitFunclass(TypeScriptParser.FunclassContext ctx) {
        // استخراج المعرف
        String identifier = ctx.IDENTIFIER().getText();

        // زيارة قائمة الوسائط (إن وجدت)
        List<ASTNode> arguments = new ArrayList<>();
        if (ctx.argumentList() != null) {
            arguments = ((ArgumentListNode) visit(ctx.argumentList())).getArguments();
        }

        // استخراج نوع الإرجاع
        String returnType = ctx.KEYWORDS().getText();

        // زيارة الكتلة
        ASTNode block = visit(ctx.block());

        return new FunClassNode(identifier, arguments, returnType, block);
    }

    @Override
    public ASTNode visitPropertyDeclaration(TypeScriptParser.PropertyDeclarationContext ctx) {
        // جمع الكلمات المفتاحية
        List<String> keywords = new ArrayList<>();
        for (var keywordCtx : ctx.KEYWORDS()) {
            keywords.add(keywordCtx.getText());
        }

        // استخراج المعرف (العنصر الأول في قائمة IDENTIFIER)
        String identifier = ctx.IDENTIFIER(0).getText();

        // زيارة النوع
        ASTNode type = visit(ctx.type());

        // زيارة التعبير (إن وجد)
        ASTNode expression = null;
        if (ctx.expression() != null) {
            expression = visit(ctx.expression());
        }

        return new PropertyDeclarationNode(keywords, identifier, type, expression);
    }

    @Override
    public ASTNode visitParameterList(TypeScriptParser.ParameterListContext ctx) {
        // Parse the access modifier (if any)
        String accessModifier = null;
        if (ctx.accessMoidifers() != null) {
            accessModifier = ctx.accessMoidifers().getText();
        }

        // Parse the identifier
        String identifier = ctx.IDENTIFIER().getText();

        // Parse the type (either arrayLiteral or type)
        ASTNode type = null;
        if (ctx.arrayLiteral() != null) {
            type = visit(ctx.arrayLiteral());
        } else if (ctx.type() != null) {
            type = visit(ctx.type());
        }

        // Return the new ParameterListNode
        return new ParameterListNode(identifier, type, accessModifier);
    }







    @Override
    public ASTNode visitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) {
        // استخراج اسم المُنشئ (KEYWORDS أو IDENTIFIER)
        String name;
        if (ctx.KEYWORDS() != null) {
            name = ctx.KEYWORDS().getText();
        } else {
            name = ctx.IDENTIFIER().getText();
        }

        // زيارة قائمة المعاملات (إن وجدت)
        List<ASTNode> parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (var paramCtx : ctx.parameterList()) {
                parameters.add(visit(paramCtx));
            }
        }

        // زيارة الجسم (thisAssignment أو statement)
        List<ASTNode> body = new ArrayList<>();
        for (var thisAssignmentCtx : ctx.thisAssignment()) {
            body.add(visit(thisAssignmentCtx));
        }
        for (var statementCtx : ctx.statement()) {
            body.add(visit(statementCtx));
        }

        return new ConstructorDeclarationNode(name, parameters, body);
    }


    @Override
    public ASTNode visitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
        // زيارة الديكورات
        List<ASTNode> decorators = new ArrayList<>();
        for (var decoratorCtx : ctx.decorator()) {
            decorators.add(visit(decoratorCtx));
        }

        // جمع الكلمات المفتاحية
        List<String> keywords = new ArrayList<>();
        for (var keywordCtx : ctx.KEYWORDS()) {
            keywords.add(keywordCtx.getText());
        }

        // استخراج اسم الفئة
        String className = ctx.IDENTIFIER(0).getText();

        // استخراج الوراثة (إن وجدت)
        String inheritance = null;
        if (ctx.IDENTIFIER().size() > 1) {
            inheritance = ctx.IDENTIFIER(1).getText();
        }

        // زيارة جسم الفئة
        ASTNode body = visit(ctx.classBody());

        return new ClassDeclarationNode(decorators, keywords, className, inheritance, body);
    }



    @Override
    public ASTNode visitClassBody(TypeScriptParser.ClassBodyContext ctx) {
        List<ASTNode> elements = new ArrayList<>();

        // زيارة classCall (إن وجد)
        for (var classCallCtx : ctx.classCall()) {
            elements.add(visit(classCallCtx));
        }

        // زيارة funclass (إن وجد)
        for (var funclassCtx : ctx.funclass()) {
            elements.add(visit(funclassCtx));
        }

        // زيارة propertyDeclaration (إن وجد)
        for (var propertyDeclarationCtx : ctx.propertyDeclaration()) {
            elements.add(visit(propertyDeclarationCtx));
        }

        // زيارة constructorDeclaration (إن وجد)
        for (var constructorDeclarationCtx : ctx.constructorDeclaration()) {
            elements.add(visit(constructorDeclarationCtx));
        }

        // زيارة variableDeclaration (إن وجد)
        for (var variableDeclarationCtx : ctx.variableDeclaration()) {
            elements.add(visit(variableDeclarationCtx));
        }

        return new ClassBodyNode(elements);
    }

    @Override
    public ASTNode visitInterfaceBody(TypeScriptParser.InterfaceBodyContext ctx) {
        List<ASTNode> parameters = new ArrayList<>();

        // زيارة جميع المعاملات (parameter)
        for (var paramCtx : ctx.parameter()) {
            parameters.add(visit(paramCtx));
        }

        return new InterfaceBodyNode(parameters);
    }


    @Override
    public ASTNode visitInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx) {
        // جمع الكلمات المفتاحية
        List<String> keywords = new ArrayList<>();
        for (var keywordCtx : ctx.KEYWORDS()) {
            keywords.add(keywordCtx.getText());
        }

        // استخراج اسم الواجهة
        String interfaceName = ctx.IDENTIFIER().getText();

        // زيارة جسم الواجهة
        ASTNode body = visit(ctx.interfaceBody());

        return new InterfaceDeclarationNode(keywords, interfaceName, body);
    }

    @Override
    public ASTNode visitForBrack(TypeScriptParser.ForBrackContext ctx) {
        // استخراج المُهيئ
        String initializer = ctx.IDENTIFIER(0).getText() + " = " + ctx.NUMBER(0).getText();

        // استخراج الشرط
        String operator = ctx.LESS() != null ? "<" : ">";
        boolean hasEqual = ctx.ASSIGN().size() > 1; // إذا كان هناك علامة = في الشرط
        String condition = ctx.IDENTIFIER(1).getText() + " " + operator + (hasEqual ? "= " : " ") + ctx.NUMBER(1).getText();

        // زيارة العبارة
        ASTNode statement = visit(ctx.statement());

        return new ForBrackNode(initializer, condition, statement);
    }

    @Override
    public ASTNode visitForloop(TypeScriptParser.ForloopContext ctx) {
        // زيارة الجزء الخاص بـ forBrack
        ASTNode forBrack = visit(ctx.forBrack());

        // زيارة الكتلة
        ASTNode block = visit(ctx.block());

        return new ForLoopNode(forBrack, block);
    }


    @Override
    public ASTNode visitWhileloop(TypeScriptParser.WhileloopContext ctx) {
        // زيارة التعبير الشرطي
        ASTNode condition = visit(ctx.expression());

        // زيارة الكتلة
        ASTNode block = visit(ctx.block());

        return new WhileLoopNode(condition, block);
    }


    @Override
    public ASTNode visitExportSpecifier(TypeScriptParser.ExportSpecifierContext ctx) {
        String exportedName = ctx.IDENTIFIER(0).getText();
        String alias = null;

        // Check if an alias exists
        if (ctx.IDENTIFIER().size() > 1) {
            alias = ctx.IDENTIFIER(1).getText();
        }

        return new ExportSpecifierNode(exportedName, alias);
    }


    @Override
    public ASTNode visitExportStatement(TypeScriptParser.ExportStatementContext ctx) {
        String exportType = ctx.KEYWORDS(0).getText();
        ASTNode exportValue = null;
        List<ExportSpecifierNode> exportSpecifiers = new ArrayList<>();


        if (ctx.expression() != null) {
            exportValue = visit(ctx.expression());
        }

        // Check if there are export specifiers (named exports)
        if (ctx.LBRACE() != null) {
            for (TypeScriptParser.ExportSpecifierContext specifierCtx : ctx.exportSpecifier()) {
                exportSpecifiers.add((ExportSpecifierNode) visit(specifierCtx));
            }
        }

        return new ExportStatementNode(exportType, exportValue, exportSpecifiers);
    }


    @Override
    public ASTNode visitImportSpecifier(TypeScriptParser.ImportSpecifierContext ctx) {
        String mainSpecifier = null;
        String alias = null;

        // Check if the main specifier is IDENTIFIER or KEYWORDS
        if (ctx.IDENTIFIER() != null) {
            mainSpecifier = ctx.IDENTIFIER().getText();
        } else if (ctx.KEYWORDS(0) != null) {
            mainSpecifier = ctx.KEYWORDS(0).getText();
        }

        // Check if there's an alias provided
        if (ctx.KEYWORDS(1) != null) {
            alias = ctx.KEYWORDS(1).getText();
        }

        return new ImportSpecifierNode(mainSpecifier, alias);
    }

    @Override
    public ASTNode visitImportClause(TypeScriptParser.ImportClauseContext ctx) {
        // Check if the import clause is a single identifier
        if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            return new ImportClauseNode(identifier);
        }

        // Otherwise, process the destructured imports
        List<ImportSpecifierNode> importSpecifiers = new ArrayList<>();
        for (TypeScriptParser.ImportSpecifierContext specifierCtx : ctx.importSpecifier()) {
            importSpecifiers.add((ImportSpecifierNode) visit(specifierCtx));
        }
        return new ImportClauseNode(importSpecifiers);
    }


    @Override
    public ASTNode visitImportStatement(TypeScriptParser.ImportStatementContext ctx) {
        // Retrieve the keyword
        String keyword = ctx.KEYWORDS(0).getText();

        // Visit the import clause
        ASTNode importClause = visit(ctx.importClause());

        // Check if there's an optional string literal
        String stringLiteral = ctx.STRING() != null ? ctx.STRING().getText() : null;

        // Create and return the ImportStatementNode
        return new ImportStatementNode(keyword, importClause, stringLiteral);
    }



    @Override
    public ASTNode visitSimpleSelector(TypeScriptParser.SimpleSelectorContext ctx) {
        String type = null;
        String identifier = null;

        if (ctx.IDENTIFIER() != null) {
            type = "IDENTIFIER";
            identifier = ctx.IDENTIFIER().getText();
        } else if (ctx.DOT() != null) {
            type = "DOT";
            identifier = ctx.IDENTIFIER().getText();
        } else if (ctx.HS() != null) {
            type = "HS";
            identifier = ctx.IDENTIFIER().getText();
        } else if (ctx.COLON() != null) {
            type = "COLON";
            identifier = ctx.IDENTIFIER().getText();
        }

        return new SimpleSelectorNode(type, identifier);
    }

    @Override
    public ASTNode visitCssBody(TypeScriptParser.CssBodyContext ctx) {
        // Extract the property (first IDENTIFIER)
        String property = ctx.IDENTIFIER(0).getText();

        // Extract the values (remaining NUMBER, IDENTIFIER, HS, or STRING tokens)
        List<String> values = new ArrayList<>();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.NUMBER(i - 1) != null) {
                values.add(ctx.NUMBER(i - 1).getText());
            } else if (ctx.IDENTIFIER(i - 1) != null) {
                values.add(ctx.IDENTIFIER(i - 1).getText());
            } else if (ctx.HS(i - 1) != null) {
                values.add(ctx.HS(i - 1).getText());
            } else if (ctx.STRING(i - 1) != null) {
                values.add(ctx.STRING(i - 1).getText());
            }
        }

        return new CssBodyNode(property, values);
    }


    @Override
    public ASTNode visitSelector(TypeScriptParser.SelectorContext ctx) {
        List<SimpleSelectorNode> simpleSelectors = new ArrayList<>();

        for (TypeScriptParser.SimpleSelectorContext simpleSelectorCtx : ctx.simpleSelector()) {
            simpleSelectors.add((SimpleSelectorNode) visit(simpleSelectorCtx));
        }

        return new SelectorNode(simpleSelectors);
    }

    @Override
    public ASTNode visitCssDec(TypeScriptParser.CssDecContext ctx) {
        // Parse the selector
        SelectorNode selector = (SelectorNode) visit(ctx.selector());

        // Parse the optional identifier
        String identifier = null;
        if (ctx.IDENTIFIER() != null) {
            identifier = ctx.IDENTIFIER().getText();
        }

        // Parse the CSS bodies
        List<CssBodyNode> cssBodies = new ArrayList<>();
        for (TypeScriptParser.CssBodyContext bodyCtx : ctx.cssBody()) {
            cssBodies.add((CssBodyNode) visit(bodyCtx));
        }

        // Return a new CssDeclarationNode
        return new CssDeclarationNode(selector, identifier, cssBodies);
    }


    @Override
    public ASTNode visitExpressionItem(TypeScriptParser.ExpressionItemContext ctx) {
        // Check if the context matches the IDENTIFIER rule
        if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            boolean hasOpenB = ctx.OPENB() != null;
            boolean hasCloseB = ctx.CLOSEB() != null;

            // Return an ExpressionItemNode for IDENTIFIER
            return new ExpressionItemNode("IDENTIFIER", identifier +
                    (hasOpenB ? "(" : "") +
                    (hasCloseB ? ")" : ""));
        }

        // Check if the context matches the NUMBER rule
        if (ctx.NUMBER() != null) {
            String numberValue = ctx.NUMBER().getText();
            return new ExpressionItemNode("NUMBER", numberValue);
        }

        // Check if the context matches the STRING rule
        if (ctx.STRING() != null) {
            String stringValue = ctx.STRING().getText();
            return new ExpressionItemNode("STRING", stringValue);
        }

        // Check if the context matches the BOOLEAN rule
        if (ctx.BOOLEAN() != null) {
            String booleanValue = ctx.BOOLEAN().getText();
            return new ExpressionItemNode("BOOLEAN", booleanValue);
        }

        // Check if the context matches the functionCall rule
        if (ctx.functionCall() != null) {
            ASTNode functionCallNode = visit(ctx.functionCall());
            return new ExpressionItemNode("FUNCTION_CALL", functionCallNode);
        }

        // Check if the context matches the arrayLiteral rule
        if (ctx.arrayLiteral() != null) {
            ASTNode arrayLiteralNode = visit(ctx.arrayLiteral());
            return new ExpressionItemNode("ARRAY_LITERAL", arrayLiteralNode);
        }

        // Check if the context matches the enumAccess rule
        if (ctx.enumAccess() != null) {
            ASTNode enumAccessNode = visit(ctx.enumAccess());
            return new ExpressionItemNode("ENUM_ACCESS", enumAccessNode);
        }

        // Check if the context matches the interfaceDeclaration rule
        if (ctx.interfaceDeclaration() != null) {
            ASTNode interfaceDeclarationNode = visit(ctx.interfaceDeclaration());
            return new ExpressionItemNode("INTERFACE_DECLARATION", interfaceDeclarationNode);
        }

        // Check if the context matches the forloop rule
        if (ctx.forloop() != null) {
            ASTNode forLoopNode = visit(ctx.forloop());
            return new ExpressionItemNode("FOR_LOOP", forLoopNode);
        }

        // Check if the context matches the whileloop rule
        if (ctx.whileloop() != null) {
            ASTNode whileLoopNode = visit(ctx.whileloop());
            return new ExpressionItemNode("WHILE_LOOP", whileLoopNode);
        }

        // Check if the context matches the arrow rule
        if (ctx.arrow() != null) {
            ASTNode arrowNode = visit(ctx.arrow());
            return new ExpressionItemNode("ARROW_FUNCTION", arrowNode);
        }

        // Return null if no rules match
        return null;
    }

    @Override
    public ASTNode visitExpression(TypeScriptParser.ExpressionContext ctx) {
        // Handle simple expression
        if (ctx.expressionItem().size() == 1) {
            ASTNode simpleExpression = visit(ctx.expressionItem(0));
            return new ExpressionNode("SIMPLE", simpleExpression, null, null);
        }

        // Handle complex expressions with operators
        ASTNode leftOperand = visit(ctx.expressionItem(0));
        List<ASTNode> operators = new ArrayList<>();
        List<ASTNode> rightOperands = new ArrayList<>();

        // Process operators and their corresponding right operands
        for (int i = 0; i < ctx.operator().size(); i++) {
            operators.add(visit(ctx.operator(i)));
            rightOperands.add(visit(ctx.expressionItem(i + 1)));
        }

        // Handle logical operators (OR, AND, SHEE)
        if (!ctx.OR().isEmpty() || !ctx.AND().isEmpty() || !ctx.SHEE().isEmpty()) {
            for (int i = 0; i < ctx.OR().size(); i++) {
                operators.add(new OperatorNode(ctx.OR(i).getText()));
                rightOperands.add(visit(ctx.expressionItem(i + 1)));
            }
            for (int i = 0; i < ctx.AND().size(); i++) {
                operators.add(new OperatorNode(ctx.AND(i).getText()));
                rightOperands.add(visit(ctx.expressionItem(i + 1)));
            }
            for (int i = 0; i < ctx.SHEE().size(); i++) {
                operators.add(new OperatorNode(ctx.SHEE(i).getText()));
                rightOperands.add(visit(ctx.expressionItem(i + 1)));
            }
        }

        return new ExpressionNode("COMPLEX_OPERATOR", leftOperand, operators, rightOperands);
    }

    @Override
    public ASTNode visitStatement(TypeScriptParser.StatementContext ctx) {
        // Check each possible rule and return the corresponding ASTNode
        if (ctx.decorator() != null) {
            return new StatementNode("Decorator", visit(ctx.decorator()));
        } else if (ctx.ifStatement() != null) {
            return new StatementNode("IfStatement", visit(ctx.ifStatement()));
        } else if (ctx.expression() != null) {
            return new StatementNode("Expression", visit(ctx.expression()));
        } else if (ctx.enumLiteral() != null) {
            return new StatementNode("EnumLiteral", visit(ctx.enumLiteral()));
        } else if (ctx.templateBinding() != null) {
            return new StatementNode("TemplateBinding", visit(ctx.templateBinding()));
        } else if (ctx.directiveElement() != null) {
            return new StatementNode("DirectiveElement", visit(ctx.directiveElement()));
        } else if (ctx.importStatement() != null) {
            return new StatementNode("ImportStatement", visit(ctx.importStatement()));
        } else if (ctx.exportStatement() != null) {
            return new StatementNode("ExportStatement", visit(ctx.exportStatement()));
        } else if (ctx.functionDeclaration() != null) {
            return new StatementNode("FunctionDeclaration", visit(ctx.functionDeclaration()));
        } else if (ctx.classDeclaration() != null) {
            return new StatementNode("ClassDeclaration", visit(ctx.classDeclaration()));
        } else if (ctx.variableDeclaration() != null) {
            return new StatementNode("VariableDeclaration", visit(ctx.variableDeclaration()));
        } else if (ctx.listVar() != null) {
            return new StatementNode("ListVar", visit(ctx.listVar()));
        } else if (ctx.cssDec() != null) {
            return new StatementNode("CssDec", visit(ctx.cssDec()));
        } else if (ctx.awaitDef() != null) {
            return new StatementNode("AwaitDef", visit(ctx.awaitDef()));
        }

        // If no rules matched, return null
        return null;
    }


    @Override
    public ASTNode visitArrayElement(TypeScriptParser.ArrayElementContext ctx) {
        // If the array element is an expression
        if (ctx.expression() != null) {
            ASTNode expressionNode = visit(ctx.expression());
            return new ArrayElementNode("Expression", expressionNode);
        }

        // If the array element is an object literal
        if (ctx.objectLiteral() != null) {
            ASTNode objectLiteralNode = visit(ctx.objectLiteral());
            return new ArrayElementNode("ObjectLiteral", objectLiteralNode);
        }

        // Return null if no match (shouldn't happen if grammar is correct)
        return null;
    }


    @Override
    public ASTNode visitListBodyBody(TypeScriptParser.ListBodyBodyContext ctx) {
        List<ParameterListNode> parameterLists = new ArrayList<>();

        // Traverse all parameter lists in the context
        for (TypeScriptParser.ParameterListContext paramCtx : ctx.parameterList()) {
            ParameterListNode parameterListNode = (ParameterListNode) visit(paramCtx);
            parameterLists.add(parameterListNode);
        }

        return new ListBodyBodyNode(parameterLists);
    }

    @Override
    public ASTNode visitProgram(TypeScriptParser.ProgramContext ctx) {
        List<ASTNode> statements = new ArrayList<>();

        // Traverse all statements in the program
        for (TypeScriptParser.StatementContext statementCtx : ctx.statement()) {
            ASTNode statementNode = visit(statementCtx);
            statements.add(statementNode);
        }

        return new ProgramNode(statements);
    }



}
