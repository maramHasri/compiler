// Generated from src/main/antlr/MyGrammarParser.g4 by ANTLR 4.7.2
package my.grammar;
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
	 * Visit a parse tree produced by {@link MyGrammarParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(MyGrammarParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContent(MyGrammarParser.TemplateContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(MyGrammarParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#attributeOnlyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOnlyElement(MyGrammarParser.AttributeOnlyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(MyGrammarParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(MyGrammarParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardAttribute(MyGrammarParser.StandardAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(MyGrammarParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(MyGrammarParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#twoWayBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBinding(MyGrammarParser.TwoWayBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#structuralDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirective(MyGrammarParser.StructuralDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#bindingValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingValue(MyGrammarParser.BindingValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#exprToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprToken(MyGrammarParser.ExprTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(MyGrammarParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(MyGrammarParser.TextContext ctx);
}