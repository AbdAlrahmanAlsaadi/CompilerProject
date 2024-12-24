// Generated from TypeScriptParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link TypeScriptParser#commentStatment}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatment(TypeScriptParser.CommentStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#commentStatment}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatment(TypeScriptParser.CommentStatmentContext ctx);
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
	 * Enter a parse tree produced by the {@code cpop}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCpop(TypeScriptParser.CpopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cpop}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCpop(TypeScriptParser.CpopContext ctx);
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
	 * Enter a parse tree produced by the {@code comment}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComment(TypeScriptParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comment}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComment(TypeScriptParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclar}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclar(TypeScriptParser.VariableDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclar}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclar(TypeScriptParser.VariableDeclarContext ctx);
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