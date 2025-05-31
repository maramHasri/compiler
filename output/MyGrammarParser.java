// Generated from src/main/antlr/MyGrammarParser.g4 by ANTLR 4.7.2
package my.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_END_OPEN=1, TAG_OPEN=2, TAG_CLOSE=3, INTERPOLATION_START=4, INTERPOLATION_END=5, 
		LSQUARE=6, RSQUARE=7, LPAREN=8, RPAREN=9, STAR=10, DOT=11, PLUS=12, MINUS=13, 
		DIV=14, EQEQ=15, NOTEQ=16, ANDAND=17, OROR=18, COMMA=19, COLON=20, QUESTION=21, 
		EQUAL=22, STRING=23, NUMBER=24, IDENTIFIER=25, WS=26, TEXT=27;
	public static final int
		RULE_template = 0, RULE_templateContent = 1, RULE_element = 2, RULE_attributeOnlyElement = 3, 
		RULE_tagName = 4, RULE_attribute = 5, RULE_standardAttribute = 6, RULE_propertyBinding = 7, 
		RULE_eventBinding = 8, RULE_twoWayBinding = 9, RULE_structuralDirective = 10, 
		RULE_bindingValue = 11, RULE_expr = 12, RULE_exprToken = 13, RULE_interpolation = 14, 
		RULE_text = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "templateContent", "element", "attributeOnlyElement", "tagName", 
			"attribute", "standardAttribute", "propertyBinding", "eventBinding", 
			"twoWayBinding", "structuralDirective", "bindingValue", "expr", "exprToken", 
			"interpolation", "text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'</'", "'<'", "'>'", "'{{'", "'}}'", "'['", "']'", "'('", "')'", 
			"'*'", "'.'", "'+'", "'-'", "'/'", "'=='", "'!='", "'&&'", "'||'", "','", 
			"':'", "'?'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_END_OPEN", "TAG_OPEN", "TAG_CLOSE", "INTERPOLATION_START", 
			"INTERPOLATION_END", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "STAR", 
			"DOT", "PLUS", "MINUS", "DIV", "EQEQ", "NOTEQ", "ANDAND", "OROR", "COMMA", 
			"COLON", "QUESTION", "EQUAL", "STRING", "NUMBER", "IDENTIFIER", "WS", 
			"TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TemplateContext extends ParserRuleContext {
		public TemplateContentContext templateContent() {
			return getRuleContext(TemplateContentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			templateContent();
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContentContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<AttributeOnlyElementContext> attributeOnlyElement() {
			return getRuleContexts(AttributeOnlyElementContext.class);
		}
		public AttributeOnlyElementContext attributeOnlyElement(int i) {
			return getRuleContext(AttributeOnlyElementContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitTemplateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_templateContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_OPEN) | (1L << INTERPOLATION_START) | (1L << TEXT))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(35);
					element();
					}
					break;
				case 2:
					{
					setState(36);
					interpolation();
					}
					break;
				case 3:
					{
					setState(37);
					attributeOnlyElement();
					}
					break;
				case 4:
					{
					setState(38);
					text();
					}
					break;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(MyGrammarParser.TAG_OPEN, 0); }
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(MyGrammarParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(MyGrammarParser.TAG_CLOSE, i);
		}
		public TemplateContentContext templateContent() {
			return getRuleContext(TemplateContentContext.class,0);
		}
		public TerminalNode TAG_END_OPEN() { return getToken(MyGrammarParser.TAG_END_OPEN, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(TAG_OPEN);
			setState(45);
			tagName();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LPAREN) | (1L << STAR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(46);
				attribute();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(TAG_CLOSE);
			setState(53);
			templateContent();
			setState(54);
			match(TAG_END_OPEN);
			setState(55);
			tagName();
			setState(56);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeOnlyElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(MyGrammarParser.TAG_OPEN, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(MyGrammarParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributeOnlyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOnlyElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitAttributeOnlyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOnlyElementContext attributeOnlyElement() throws RecognitionException {
		AttributeOnlyElementContext _localctx = new AttributeOnlyElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributeOnlyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(TAG_OPEN);
			setState(59);
			tagName();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LPAREN) | (1L << STAR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(60);
				attribute();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public StructuralDirectiveContext structuralDirective() {
			return getRuleContext(StructuralDirectiveContext.class,0);
		}
		public TwoWayBindingContext twoWayBinding() {
			return getRuleContext(TwoWayBindingContext.class,0);
		}
		public PropertyBindingContext propertyBinding() {
			return getRuleContext(PropertyBindingContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public StandardAttributeContext standardAttribute() {
			return getRuleContext(StandardAttributeContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				structuralDirective();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				twoWayBinding();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				propertyBinding();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				eventBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				standardAttribute();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public StandardAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitStandardAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardAttributeContext standardAttribute() throws RecognitionException {
		StandardAttributeContext _localctx = new StandardAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_standardAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(EQUAL);
			setState(79);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(MyGrammarParser.LSQUARE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode RSQUARE() { return getToken(MyGrammarParser.RSQUARE, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public BindingValueContext bindingValue() {
			return getRuleContext(BindingValueContext.class,0);
		}
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LSQUARE);
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(RSQUARE);
			setState(84);
			match(EQUAL);
			setState(85);
			bindingValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyGrammarParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(MyGrammarParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public BindingValueContext bindingValue() {
			return getRuleContext(BindingValueContext.class,0);
		}
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LPAREN);
			setState(88);
			match(IDENTIFIER);
			setState(89);
			match(RPAREN);
			setState(90);
			match(EQUAL);
			setState(91);
			bindingValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TwoWayBindingContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(MyGrammarParser.LSQUARE, 0); }
		public TerminalNode LPAREN() { return getToken(MyGrammarParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(MyGrammarParser.RPAREN, 0); }
		public TerminalNode RSQUARE() { return getToken(MyGrammarParser.RSQUARE, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public BindingValueContext bindingValue() {
			return getRuleContext(BindingValueContext.class,0);
		}
		public TwoWayBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayBinding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitTwoWayBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayBindingContext twoWayBinding() throws RecognitionException {
		TwoWayBindingContext _localctx = new TwoWayBindingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_twoWayBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LSQUARE);
			setState(94);
			match(LPAREN);
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(RPAREN);
			setState(97);
			match(RSQUARE);
			setState(98);
			match(EQUAL);
			setState(99);
			bindingValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuralDirectiveContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(MyGrammarParser.STAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public BindingValueContext bindingValue() {
			return getRuleContext(BindingValueContext.class,0);
		}
		public StructuralDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuralDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitStructuralDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuralDirectiveContext structuralDirective() throws RecognitionException {
		StructuralDirectiveContext _localctx = new StructuralDirectiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structuralDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(STAR);
			setState(102);
			match(IDENTIFIER);
			setState(103);
			match(EQUAL);
			setState(104);
			bindingValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BindingValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitBindingValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingValueContext bindingValue() throws RecognitionException {
		BindingValueContext _localctx = new BindingValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bindingValue);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				interpolation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ExprTokenContext> exprToken() {
			return getRuleContexts(ExprTokenContext.class);
		}
		public ExprTokenContext exprToken(int i) {
			return getRuleContext(ExprTokenContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111);
					exprToken();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprTokenContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public TerminalNode DOT() { return getToken(MyGrammarParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(MyGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyGrammarParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(MyGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyGrammarParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(MyGrammarParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(MyGrammarParser.DIV, 0); }
		public TerminalNode EQEQ() { return getToken(MyGrammarParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(MyGrammarParser.NOTEQ, 0); }
		public TerminalNode ANDAND() { return getToken(MyGrammarParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(MyGrammarParser.OROR, 0); }
		public TerminalNode LSQUARE() { return getToken(MyGrammarParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MyGrammarParser.RSQUARE, 0); }
		public TerminalNode COMMA() { return getToken(MyGrammarParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(MyGrammarParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(MyGrammarParser.QUESTION, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public ExprTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprToken; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitExprToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprTokenContext exprToken() throws RecognitionException {
		ExprTokenContext _localctx = new ExprTokenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << RSQUARE) | (1L << LPAREN) | (1L << RPAREN) | (1L << STAR) | (1L << DOT) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << EQEQ) | (1L << NOTEQ) | (1L << ANDAND) | (1L << OROR) | (1L << COMMA) | (1L << COLON) | (1L << QUESTION) | (1L << EQUAL) | (1L << STRING) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START() { return getToken(MyGrammarParser.INTERPOLATION_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTERPOLATION_END() { return getToken(MyGrammarParser.INTERPOLATION_END, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(INTERPOLATION_START);
			setState(119);
			expr();
			setState(120);
			match(INTERPOLATION_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MyGrammarParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarParserVisitor ) return ((MyGrammarParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\7\4\62\n\4\f\4"+
		"\16\4\65\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rp\n\r\3\16\6\16s\n\16"+
		"\r\16\16\16t\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\b\33\2{\2\"\3\2\2\2\4+\3\2"+
		"\2\2\6.\3\2\2\2\b<\3\2\2\2\nF\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20S\3\2\2"+
		"\2\22Y\3\2\2\2\24_\3\2\2\2\26g\3\2\2\2\30o\3\2\2\2\32r\3\2\2\2\34v\3\2"+
		"\2\2\36x\3\2\2\2 |\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%*\5\6\4\2&"+
		"*\5\36\20\2\'*\5\b\5\2(*\5 \21\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2"+
		"\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-+\3\2\2\2./\7\4\2\2/\63"+
		"\5\n\6\2\60\62\5\f\7\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\5\2\2\678\5\4\3\289\7\3\2"+
		"\29:\5\n\6\2:;\7\5\2\2;\7\3\2\2\2<=\7\4\2\2=A\5\n\6\2>@\5\f\7\2?>\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\5\2\2E\t\3"+
		"\2\2\2FG\7\33\2\2G\13\3\2\2\2HN\5\26\f\2IN\5\24\13\2JN\5\20\t\2KN\5\22"+
		"\n\2LN\5\16\b\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\r\3"+
		"\2\2\2OP\7\33\2\2PQ\7\30\2\2QR\7\31\2\2R\17\3\2\2\2ST\7\b\2\2TU\7\33\2"+
		"\2UV\7\t\2\2VW\7\30\2\2WX\5\30\r\2X\21\3\2\2\2YZ\7\n\2\2Z[\7\33\2\2[\\"+
		"\7\13\2\2\\]\7\30\2\2]^\5\30\r\2^\23\3\2\2\2_`\7\b\2\2`a\7\n\2\2ab\7\33"+
		"\2\2bc\7\13\2\2cd\7\t\2\2de\7\30\2\2ef\5\30\r\2f\25\3\2\2\2gh\7\f\2\2"+
		"hi\7\33\2\2ij\7\30\2\2jk\5\30\r\2k\27\3\2\2\2lp\7\31\2\2mp\5\36\20\2n"+
		"p\5\32\16\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\31\3\2\2\2qs\5\34\17\2rq\3"+
		"\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\33\3\2\2\2vw\t\2\2\2w\35\3\2\2\2"+
		"xy\7\6\2\2yz\5\32\16\2z{\7\7\2\2{\37\3\2\2\2|}\7\35\2\2}!\3\2\2\2\t)+"+
		"\63AMot";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}