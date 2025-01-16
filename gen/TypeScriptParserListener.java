// Generated from C:/Users/USER/IdeaProjects/angularproject/src/antlr/TypeScriptParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeScriptParser}.
 */
public interface TypeScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(TypeScriptParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(TypeScriptParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TypeScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TypeScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#accessMoidifers}.
	 * @param ctx the parse tree
	 */
	void enterAccessMoidifers(TypeScriptParser.AccessMoidifersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#accessMoidifers}.
	 * @param ctx the parse tree
	 */
	void exitAccessMoidifers(TypeScriptParser.AccessMoidifersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#directiveElement}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveElement(TypeScriptParser.DirectiveElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#directiveElement}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveElement(TypeScriptParser.DirectiveElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(TypeScriptParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(TypeScriptParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(TypeScriptParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(TypeScriptParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(TypeScriptParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(TypeScriptParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#templateBinding}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBinding(TypeScriptParser.TemplateBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#templateBinding}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBinding(TypeScriptParser.TemplateBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumLiteral}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiteral(TypeScriptParser.EnumLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumLiteral}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiteral(TypeScriptParser.EnumLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumAccess}.
	 * @param ctx the parse tree
	 */
	void enterEnumAccess(TypeScriptParser.EnumAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumAccess}.
	 * @param ctx the parse tree
	 */
	void exitEnumAccess(TypeScriptParser.EnumAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#tupleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTupleLiteral(TypeScriptParser.TupleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#tupleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTupleLiteral(TypeScriptParser.TupleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#listVar}.
	 * @param ctx the parse tree
	 */
	void enterListVar(TypeScriptParser.ListVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#listVar}.
	 * @param ctx the parse tree
	 */
	void exitListVar(TypeScriptParser.ListVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#listBody}.
	 * @param ctx the parse tree
	 */
	void enterListBody(TypeScriptParser.ListBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#listBody}.
	 * @param ctx the parse tree
	 */
	void exitListBody(TypeScriptParser.ListBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#listBodyBody}.
	 * @param ctx the parse tree
	 */
	void enterListBodyBody(TypeScriptParser.ListBodyBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#listBodyBody}.
	 * @param ctx the parse tree
	 */
	void exitListBodyBody(TypeScriptParser.ListBodyBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(TypeScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(TypeScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(TypeScriptParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(TypeScriptParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#awaitDef}.
	 * @param ctx the parse tree
	 */
	void enterAwaitDef(TypeScriptParser.AwaitDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#awaitDef}.
	 * @param ctx the parse tree
	 */
	void exitAwaitDef(TypeScriptParser.AwaitDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameterFunction}.
	 * @param ctx the parse tree
	 */
	void enterParameterFunction(TypeScriptParser.ParameterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameterFunction}.
	 * @param ctx the parse tree
	 */
	void exitParameterFunction(TypeScriptParser.ParameterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(TypeScriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(TypeScriptParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classCall}.
	 * @param ctx the parse tree
	 */
	void enterClassCall(TypeScriptParser.ClassCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classCall}.
	 * @param ctx the parse tree
	 */
	void exitClassCall(TypeScriptParser.ClassCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#funclass}.
	 * @param ctx the parse tree
	 */
	void enterFunclass(TypeScriptParser.FunclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#funclass}.
	 * @param ctx the parse tree
	 */
	void exitFunclass(TypeScriptParser.FunclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(TypeScriptParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(TypeScriptParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#thisAssignment}.
	 * @param ctx the parse tree
	 */
	void enterThisAssignment(TypeScriptParser.ThisAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#thisAssignment}.
	 * @param ctx the parse tree
	 */
	void exitThisAssignment(TypeScriptParser.ThisAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(TypeScriptParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(TypeScriptParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorBody}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorBody(TypeScriptParser.DecoratorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorBody}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorBody(TypeScriptParser.DecoratorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorProperty}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorProperty(TypeScriptParser.DecoratorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorProperty}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorProperty(TypeScriptParser.DecoratorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(TypeScriptParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(TypeScriptParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(TypeScriptParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(TypeScriptParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#forBrack}.
	 * @param ctx the parse tree
	 */
	void enterForBrack(TypeScriptParser.ForBrackContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#forBrack}.
	 * @param ctx the parse tree
	 */
	void exitForBrack(TypeScriptParser.ForBrackContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(TypeScriptParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(TypeScriptParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterImportClause(TypeScriptParser.ImportClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitImportClause(TypeScriptParser.ImportClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(TypeScriptParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(TypeScriptParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(TypeScriptParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(TypeScriptParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#exportSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterExportSpecifier(TypeScriptParser.ExportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#exportSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitExportSpecifier(TypeScriptParser.ExportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#cssDec}.
	 * @param ctx the parse tree
	 */
	void enterCssDec(TypeScriptParser.CssDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#cssDec}.
	 * @param ctx the parse tree
	 */
	void exitCssDec(TypeScriptParser.CssDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void enterCssBody(TypeScriptParser.CssBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void exitCssBody(TypeScriptParser.CssBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(TypeScriptParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(TypeScriptParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(TypeScriptParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(TypeScriptParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(TypeScriptParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(TypeScriptParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(TypeScriptParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(TypeScriptParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDec}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(TypeScriptParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDec}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(TypeScriptParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFor(TypeScriptParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFor(TypeScriptParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callthefunction}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallthefunction(TypeScriptParser.CallthefunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callthefunction}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallthefunction(TypeScriptParser.CallthefunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interface}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInterface(TypeScriptParser.InterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interface}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInterface(TypeScriptParser.InterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(TypeScriptParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(TypeScriptParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumAc}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEnumAc(TypeScriptParser.EnumAcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumAc}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEnumAc(TypeScriptParser.EnumAcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anything}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnything(TypeScriptParser.AnythingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anything}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnything(TypeScriptParser.AnythingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compristion}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompristion(TypeScriptParser.CompristionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compristion}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompristion(TypeScriptParser.CompristionContext ctx);
}