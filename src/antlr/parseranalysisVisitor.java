// Generated from C:/Users/DELL/Desktop/AngularCompilerProject/src/parseranalysis.g4 by ANTLR 4.13.2
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
}