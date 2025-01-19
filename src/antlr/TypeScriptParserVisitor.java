// Generated from C:/Users/USER/IdeaProjects/angularproject/src/TypeScriptParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeScriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(TypeScriptParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeItem(TypeScriptParser.TypeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TypeScriptParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#accessMoidifers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMoidifers(TypeScriptParser.AccessMoidifersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#directiveElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveElement(TypeScriptParser.DirectiveElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(TypeScriptParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(TypeScriptParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(TypeScriptParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#templateBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBinding(TypeScriptParser.TemplateBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#enumLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumLiteral(TypeScriptParser.EnumLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#enumAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumAccess(TypeScriptParser.EnumAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#tupleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleLiteral(TypeScriptParser.TupleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#listVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListVar(TypeScriptParser.ListVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#listBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBody(TypeScriptParser.ListBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#listBodyBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBodyBody(TypeScriptParser.ListBodyBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(TypeScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(TypeScriptParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#awaitDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitDef(TypeScriptParser.AwaitDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterFunction(TypeScriptParser.ParameterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow(TypeScriptParser.ArrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(TypeScriptParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCall(TypeScriptParser.ClassCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#funclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunclass(TypeScriptParser.FunclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(TypeScriptParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#thisAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignment(TypeScriptParser.ThisAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(TypeScriptParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#decoratorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorBody(TypeScriptParser.DecoratorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#decoratorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorProperty(TypeScriptParser.DecoratorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(TypeScriptParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(TypeScriptParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#forBrack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBrack(TypeScriptParser.ForBrackContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(TypeScriptParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClause(TypeScriptParser.ImportClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(TypeScriptParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(TypeScriptParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#exportSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportSpecifier(TypeScriptParser.ExportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#cssDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDec(TypeScriptParser.CssDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#cssBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBody(TypeScriptParser.CssBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(TypeScriptParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(TypeScriptParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#expressionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionItem(TypeScriptParser.ExpressionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TypeScriptParser.ExpressionContext ctx);
}