// Generated from C:/Users/USER/IdeaProjects/angularproject/src/antlr/TypeScriptParser.g4 by ANTLR 4.13.2
package gen;
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
	 * Visit a parse tree produced by {@link TypeScriptParser#commentStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStatment(TypeScriptParser.CommentStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#directiveElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveElement(TypeScriptParser.DirectiveElementContext ctx);
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
	 * Visit a parse tree produced by {@link TypeScriptParser#tupleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleLiteral(TypeScriptParser.TupleLiteralContext ctx);
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
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TypeScriptParser.IfStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code cpop}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpop(TypeScriptParser.CpopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(TypeScriptParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(TypeScriptParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDec}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDec(TypeScriptParser.ArrayDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(TypeScriptParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comment}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(TypeScriptParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclar}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclar(TypeScriptParser.VariableDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interface}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(TypeScriptParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(TypeScriptParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumAc}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumAc(TypeScriptParser.EnumAcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anything}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnything(TypeScriptParser.AnythingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compristion}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompristion(TypeScriptParser.CompristionContext ctx);
}