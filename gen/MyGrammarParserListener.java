// Generated from C:/Users/Lenovo/Downloads/ANTLRExample/src/main/antlr/MyGrammarParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(MyGrammarParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(MyGrammarParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularElement}
	 * labeled alternative in {@link MyGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterRegularElement(MyGrammarParser.RegularElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularElement}
	 * labeled alternative in {@link MyGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitRegularElement(MyGrammarParser.RegularElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosing}
	 * labeled alternative in {@link MyGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosing(MyGrammarParser.SelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosing}
	 * labeled alternative in {@link MyGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosing(MyGrammarParser.SelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(MyGrammarParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(MyGrammarParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(MyGrammarParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(MyGrammarParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(MyGrammarParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(MyGrammarParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedElement}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterNestedElement(MyGrammarParser.NestedElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedElement}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitNestedElement(MyGrammarParser.NestedElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationContent}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationContent(MyGrammarParser.InterpolationContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationContent}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationContent(MyGrammarParser.InterpolationContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(MyGrammarParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link MyGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(MyGrammarParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(MyGrammarParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(MyGrammarParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#bindingAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBindingAttribute(MyGrammarParser.BindingAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#bindingAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBindingAttribute(MyGrammarParser.BindingAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#directiveAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveAttribute(MyGrammarParser.DirectiveAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#directiveAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveAttribute(MyGrammarParser.DirectiveAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#normalAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNormalAttribute(MyGrammarParser.NormalAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#normalAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNormalAttribute(MyGrammarParser.NormalAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(MyGrammarParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(MyGrammarParser.TagNameContext ctx);
}