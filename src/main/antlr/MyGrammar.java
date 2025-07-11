// Generated from MyGrammar.g4 by ANTLR 4.7.2
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
		IMPORT=1, FROM=2, AS=3, CLASS=4, EXPORT=5, COMPONENT=6, NGMODULE=7, DECLARATIONS=8, 
		IMPORTS=9, PROVIDERS=10, BOOTSTRAP=11, SELECTOR=12, TEMPLATE=13, STYLES=14, 
		LBRACE=15, RBRACE=16, LPAREN=17, RPAREN=18, LBRACK=19, RBRACK=20, COLON=21, 
		COMMA=22, DOT=23, EQUALS=24, SEMI=25, BACKTICK_STRING=26, STRING=27, DOUBLE_QUOTE_STRING=28, 
		NUMBER=29, IDENT=30, LINE_COMMENT=31, BLOCK_COMMENT=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "FROM", "AS", "CLASS", "EXPORT", "COMPONENT", "NGMODULE", "DECLARATIONS", 
			"IMPORTS", "PROVIDERS", "BOOTSTRAP", "SELECTOR", "TEMPLATE", "STYLES", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COLON", 
			"COMMA", "DOT", "EQUALS", "SEMI", "BACKTICK_STRING", "STRING", "DOUBLE_QUOTE_STRING", 
			"NUMBER", "IDENT", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'as'", "'class'", "'export'", "'@Component'", 
			"'@NgModule'", "'declarations'", "'imports'", "'providers'", "'bootstrap'", 
			"'selector'", "'template'", "'styles'", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "':'", "','", "'.'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "AS", "CLASS", "EXPORT", "COMPONENT", "NGMODULE", 
			"DECLARATIONS", "IMPORTS", "PROVIDERS", "BOOTSTRAP", "SELECTOR", "TEMPLATE", 
			"STYLES", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"COLON", "COMMA", "DOT", "EQUALS", "SEMI", "BACKTICK_STRING", "STRING", 
			"DOUBLE_QUOTE_STRING", "NUMBER", "IDENT", "LINE_COMMENT", "BLOCK_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u00d1"+
		"\n\33\f\33\16\33\u00d4\13\33\3\33\3\33\3\34\3\34\7\34\u00da\n\34\f\34"+
		"\16\34\u00dd\13\34\3\34\3\34\3\35\3\35\7\35\u00e3\n\35\f\35\16\35\u00e6"+
		"\13\35\3\35\3\35\3\36\6\36\u00eb\n\36\r\36\16\36\u00ec\3\37\3\37\7\37"+
		"\u00f1\n\37\f\37\16\37\u00f4\13\37\3 \3 \3 \3 \7 \u00fa\n \f \16 \u00fd"+
		"\13 \3 \3 \3!\3!\3!\3!\7!\u0105\n!\f!\16!\u0108\13!\3!\3!\3!\3!\3!\3\""+
		"\6\"\u0110\n\"\r\"\16\"\u0111\3\"\3\"\3\u0106\2#\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\n\3\2bb"+
		"\5\2\f\f\17\17))\5\2\f\f\17\17$$\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac"+
		"|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5L\3\2\2\2\7Q\3\2\2\2\tT\3\2\2\2\13"+
		"Z\3\2\2\2\ra\3\2\2\2\17l\3\2\2\2\21v\3\2\2\2\23\u0083\3\2\2\2\25\u008b"+
		"\3\2\2\2\27\u0095\3\2\2\2\31\u009f\3\2\2\2\33\u00a8\3\2\2\2\35\u00b1\3"+
		"\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2\2%\u00be\3\2\2\2\'"+
		"\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c4\3\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2"+
		"\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce\3\2\2\2\67\u00d7\3\2\2"+
		"\29\u00e0\3\2\2\2;\u00ea\3\2\2\2=\u00ee\3\2\2\2?\u00f5\3\2\2\2A\u0100"+
		"\3\2\2\2C\u010f\3\2\2\2EF\7k\2\2FG\7o\2\2GH\7r\2\2HI\7q\2\2IJ\7t\2\2J"+
		"K\7v\2\2K\4\3\2\2\2LM\7h\2\2MN\7t\2\2NO\7q\2\2OP\7o\2\2P\6\3\2\2\2QR\7"+
		"c\2\2RS\7u\2\2S\b\3\2\2\2TU\7e\2\2UV\7n\2\2VW\7c\2\2WX\7u\2\2XY\7u\2\2"+
		"Y\n\3\2\2\2Z[\7g\2\2[\\\7z\2\2\\]\7r\2\2]^\7q\2\2^_\7t\2\2_`\7v\2\2`\f"+
		"\3\2\2\2ab\7B\2\2bc\7E\2\2cd\7q\2\2de\7o\2\2ef\7r\2\2fg\7q\2\2gh\7p\2"+
		"\2hi\7g\2\2ij\7p\2\2jk\7v\2\2k\16\3\2\2\2lm\7B\2\2mn\7P\2\2no\7i\2\2o"+
		"p\7O\2\2pq\7q\2\2qr\7f\2\2rs\7w\2\2st\7n\2\2tu\7g\2\2u\20\3\2\2\2vw\7"+
		"f\2\2wx\7g\2\2xy\7e\2\2yz\7n\2\2z{\7c\2\2{|\7t\2\2|}\7c\2\2}~\7v\2\2~"+
		"\177\7k\2\2\177\u0080\7q\2\2\u0080\u0081\7p\2\2\u0081\u0082\7u\2\2\u0082"+
		"\22\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7o\2\2\u0085\u0086\7r\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088\u0089\7v\2\2\u0089\u008a\7u\2\2"+
		"\u008a\24\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7"+
		"q\2\2\u008e\u008f\7x\2\2\u008f\u0090\7k\2\2\u0090\u0091\7f\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7t\2\2\u0093\u0094\7u\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\7d\2\2\u0096\u0097\7q\2\2\u0097\u0098\7q\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d\7c\2\2"+
		"\u009d\u009e\7r\2\2\u009e\30\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7"+
		"g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7r\2\2\u00ac"+
		"\u00ad\7n\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\34\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7"+
		"{\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7u\2\2\u00b7\36"+
		"\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb"+
		"\"\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd$\3\2\2\2\u00be\u00bf\7+\2\2\u00bf"+
		"&\3\2\2\2\u00c0\u00c1\7]\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7_\2\2\u00c3*"+
		"\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7.\3"+
		"\2\2\2\u00c8\u00c9\7\60\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb"+
		"\62\3\2\2\2\u00cc\u00cd\7=\2\2\u00cd\64\3\2\2\2\u00ce\u00d2\7b\2\2\u00cf"+
		"\u00d1\n\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7b\2\2\u00d6\66\3\2\2\2\u00d7\u00db\7)\2\2\u00d8\u00da\n\3\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7)\2\2\u00df"+
		"8\3\2\2\2\u00e0\u00e4\7$\2\2\u00e1\u00e3\n\4\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8:\3\2\2\2\u00e9\u00eb"+
		"\t\5\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed<\3\2\2\2\u00ee\u00f2\t\6\2\2\u00ef\u00f1\t\7\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3>\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6"+
		"\u00f7\7\61\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fa\n\b\2\2\u00f9\u00f8\3"+
		"\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\b \2\2\u00ff@\3\2\2\2\u0100"+
		"\u0101\7\61\2\2\u0101\u0102\7,\2\2\u0102\u0106\3\2\2\2\u0103\u0105\13"+
		"\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7,"+
		"\2\2\u010a\u010b\7\61\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b!\2\2\u010d"+
		"B\3\2\2\2\u010e\u0110\t\t\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\b\"\2\2\u0114D\3\2\2\2\13\2\u00d2\u00db\u00e4\u00ec\u00f2\u00fb\u0106"+
		"\u0111\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}