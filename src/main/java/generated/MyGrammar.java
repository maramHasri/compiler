// Generated from src/main/antlr/MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, AS=3, CLASS=4, EXPORT=5, COMPONENT=6, SELECTOR=7, TEMPLATE=8, 
		STYLES=9, LBRACE=10, RBRACE=11, LPAREN=12, RPAREN=13, LBRACK=14, RBRACK=15, 
		COLON=16, COMMA=17, DOT=18, EQUALS=19, SEMI=20, BACKTICK_STRING=21, STRING=22, 
		DOUBLE_QUOTE_STRING=23, NUMBER=24, IDENT=25, LINE_COMMENT=26, BLOCK_COMMENT=27, 
		WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "FROM", "AS", "CLASS", "EXPORT", "COMPONENT", "SELECTOR", "TEMPLATE", 
			"STYLES", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"COLON", "COMMA", "DOT", "EQUALS", "SEMI", "BACKTICK_STRING", "STRING", 
			"DOUBLE_QUOTE_STRING", "NUMBER", "IDENT", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'as'", "'class'", "'export'", "'@Component'", 
			"'selector'", "'template'", "'styles'", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "':'", "','", "'.'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "AS", "CLASS", "EXPORT", "COMPONENT", "SELECTOR", 
			"TEMPLATE", "STYLES", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "COLON", "COMMA", "DOT", "EQUALS", "SEMI", "BACKTICK_STRING", 
			"STRING", "DOUBLE_QUOTE_STRING", "NUMBER", "IDENT", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
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


	public MyGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00d8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7"+
		"\26\u0094\n\26\f\26\16\26\u0097\13\26\3\26\3\26\3\27\3\27\7\27\u009d\n"+
		"\27\f\27\16\27\u00a0\13\27\3\27\3\27\3\30\3\30\7\30\u00a6\n\30\f\30\16"+
		"\30\u00a9\13\30\3\30\3\30\3\31\6\31\u00ae\n\31\r\31\16\31\u00af\3\32\3"+
		"\32\7\32\u00b4\n\32\f\32\16\32\u00b7\13\32\3\33\3\33\3\33\3\33\7\33\u00bd"+
		"\n\33\f\33\16\33\u00c0\13\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00c8"+
		"\n\34\f\34\16\34\u00cb\13\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u00d3"+
		"\n\35\r\35\16\35\u00d4\3\35\3\35\6\u0095\u009e\u00a7\u00c9\2\36\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\7\3"+
		"\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\2\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\3;\3\2\2\2\5B\3\2\2\2\7G\3\2\2\2\tJ\3\2\2\2\13P\3\2\2\2\rW\3\2\2"+
		"\2\17b\3\2\2\2\21k\3\2\2\2\23t\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2\31\177"+
		"\3\2\2\2\33\u0081\3\2\2\2\35\u0083\3\2\2\2\37\u0085\3\2\2\2!\u0087\3\2"+
		"\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+\u0091"+
		"\3\2\2\2-\u009a\3\2\2\2/\u00a3\3\2\2\2\61\u00ad\3\2\2\2\63\u00b1\3\2\2"+
		"\2\65\u00b8\3\2\2\2\67\u00c3\3\2\2\29\u00d2\3\2\2\2;<\7k\2\2<=\7o\2\2"+
		"=>\7r\2\2>?\7q\2\2?@\7t\2\2@A\7v\2\2A\4\3\2\2\2BC\7h\2\2CD\7t\2\2DE\7"+
		"q\2\2EF\7o\2\2F\6\3\2\2\2GH\7c\2\2HI\7u\2\2I\b\3\2\2\2JK\7e\2\2KL\7n\2"+
		"\2LM\7c\2\2MN\7u\2\2NO\7u\2\2O\n\3\2\2\2PQ\7g\2\2QR\7z\2\2RS\7r\2\2ST"+
		"\7q\2\2TU\7t\2\2UV\7v\2\2V\f\3\2\2\2WX\7B\2\2XY\7E\2\2YZ\7q\2\2Z[\7o\2"+
		"\2[\\\7r\2\2\\]\7q\2\2]^\7p\2\2^_\7g\2\2_`\7p\2\2`a\7v\2\2a\16\3\2\2\2"+
		"bc\7u\2\2cd\7g\2\2de\7n\2\2ef\7g\2\2fg\7e\2\2gh\7v\2\2hi\7q\2\2ij\7t\2"+
		"\2j\20\3\2\2\2kl\7v\2\2lm\7g\2\2mn\7o\2\2no\7r\2\2op\7n\2\2pq\7c\2\2q"+
		"r\7v\2\2rs\7g\2\2s\22\3\2\2\2tu\7u\2\2uv\7v\2\2vw\7{\2\2wx\7n\2\2xy\7"+
		"g\2\2yz\7u\2\2z\24\3\2\2\2{|\7}\2\2|\26\3\2\2\2}~\7\177\2\2~\30\3\2\2"+
		"\2\177\u0080\7*\2\2\u0080\32\3\2\2\2\u0081\u0082\7+\2\2\u0082\34\3\2\2"+
		"\2\u0083\u0084\7]\2\2\u0084\36\3\2\2\2\u0085\u0086\7_\2\2\u0086 \3\2\2"+
		"\2\u0087\u0088\7<\2\2\u0088\"\3\2\2\2\u0089\u008a\7.\2\2\u008a$\3\2\2"+
		"\2\u008b\u008c\7\60\2\2\u008c&\3\2\2\2\u008d\u008e\7?\2\2\u008e(\3\2\2"+
		"\2\u008f\u0090\7=\2\2\u0090*\3\2\2\2\u0091\u0095\7b\2\2\u0092\u0094\13"+
		"\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7b"+
		"\2\2\u0099,\3\2\2\2\u009a\u009e\7)\2\2\u009b\u009d\13\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7)\2\2\u00a2.\3\2\2\2\u00a3"+
		"\u00a7\7$\2\2\u00a4\u00a6\13\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\60\3\2\2\2\u00ac\u00ae\t\2\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\62\3\2\2\2\u00b1\u00b5\t\3\2\2\u00b2\u00b4\t\4\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\64\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\n\5\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\33\2\2\u00c2\66\3\2\2\2\u00c3"+
		"\u00c4\7\61\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\13"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7,"+
		"\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\34\2\2\u00d0"+
		"8\3\2\2\2\u00d1\u00d3\t\6\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\b\35\2\2\u00d7:\3\2\2\2\13\2\u0095\u009e\u00a7\u00af\u00b5\u00be\u00c9"+
		"\u00d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}