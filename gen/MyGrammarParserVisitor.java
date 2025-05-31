// Generated from C:/Users/Lenovo/Downloads/ANTLRExample/src/main/antlr/MyGrammarParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(MyGrammarParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularElement}
	 * labeled alternative in {@link MyGrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularElement(MyGrammarParser.RegularElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosing}
	 * labeled alternative in {@link MyGrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosing(MyGrammarParser.SelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(MyGrammarParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(MyGrammarParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(MyGrammarParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedElement}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedElement(MyGrammarParser.NestedElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationContent}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationContent(MyGrammarParser.InterpolationContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(MyGrammarParser.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(MyGrammarParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#bindingAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAttribute(MyGrammarParser.BindingAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#directiveAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveAttribute(MyGrammarParser.DirectiveAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#normalAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAttribute(MyGrammarParser.NormalAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(MyGrammarParser.TagNameContext ctx);
}