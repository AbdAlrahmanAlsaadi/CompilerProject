package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parseranalysis}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parseranalysisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parseranalysis#componentFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentFile(parseranalysis.ComponentFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(parseranalysis.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(parseranalysis.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadata(parseranalysis.ComponentMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataEntry(parseranalysis.MetadataEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(parseranalysis.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#componentConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConstructor(parseranalysis.ComponentConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(parseranalysis.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(parseranalysis.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(parseranalysis.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(parseranalysis.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplate(parseranalysis.HtmlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#clickHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickHandler(parseranalysis.ClickHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#logStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogStatement(parseranalysis.LogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(parseranalysis.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(parseranalysis.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#entityDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDecl(parseranalysis.EntityDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(parseranalysis.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#storeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreDecl(parseranalysis.StoreDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#actionsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionsDecl(parseranalysis.ActionsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#actionSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionSig(parseranalysis.ActionSigContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(parseranalysis.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(parseranalysis.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#routeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDecl(parseranalysis.RouteDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#pageDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageDecl(parseranalysis.PageDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#pageBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageBody(parseranalysis.PageBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#formSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormSection(parseranalysis.FormSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#listSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSection(parseranalysis.ListSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#detailSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetailSection(parseranalysis.DetailSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#paramSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSection(parseranalysis.ParamSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#formArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormArg(parseranalysis.FormArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#onSubmitStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnSubmitStmt(parseranalysis.OnSubmitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#navStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavStmt(parseranalysis.NavStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#addButtonStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddButtonStmt(parseranalysis.AddButtonStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#itemSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemSection(parseranalysis.ItemSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#itemBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemBody(parseranalysis.ItemBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#actionButtonsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionButtonsSection(parseranalysis.ActionButtonsSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#actionBtn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionBtn(parseranalysis.ActionBtnContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(parseranalysis.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parseranalysis#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(parseranalysis.ExprContext ctx);
}