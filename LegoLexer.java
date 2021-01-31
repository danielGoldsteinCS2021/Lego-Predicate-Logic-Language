// Generated from Lego.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LegoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, MUL=8, DIV=9, 
		ADD=10, SUB=11, MOD=12, GT=13, GTE=14, EQ=15, LT=16, LTE=17, NOT=18, AND=19, 
		OR=20, IMPL=21, EQUIV=22, FORALL=23, EXISTS=24, ID=25, INT=26, NEGINT=27, 
		NEWLINE=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "MUL", "DIV", 
			"ADD", "SUB", "MOD", "GT", "GTE", "EQ", "LT", "LTE", "NOT", "AND", "OR", 
			"IMPL", "EQUIV", "FORALL", "EXISTS", "ID", "INT", "NEGINT", "NEWLINE", 
			"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'.'", "'('", "')'", "'['", "'..'", "']'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'>'", "'>='", "'='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "MUL", "DIV", "ADD", 
			"SUB", "MOD", "GT", "GTE", "EQ", "LT", "LTE", "NOT", "AND", "OR", "IMPL", 
			"EQUIV", "FORALL", "EXISTS", "ID", "INT", "NEGINT", "NEWLINE", "WS"
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


	public LegoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lego.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0129\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u009c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00a4\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00ab\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b9\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00cb\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\7\32\u00dd\n\32\f\32\16\32\u00e0\13\32\3\33"+
		"\6\33\u00e3\n\33\r\33\16\33\u00e4\3\34\3\34\3\34\3\35\5\35\u00eb\n\35"+
		"\3\35\3\35\3\36\6\36\u00f0\n\36\r\36\16\36\u00f1\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\2\29\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2I\2"+
		"K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2\3\2 \4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u011a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3q\3\2\2\2\5"+
		"s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17~\3\2\2\2\21"+
		"\u0080\3\2\2\2\23\u0082\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u0088"+
		"\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008f\3\2\2\2!\u0091\3\2"+
		"\2\2#\u0093\3\2\2\2%\u009b\3\2\2\2\'\u00a3\3\2\2\2)\u00aa\3\2\2\2+\u00b8"+
		"\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00d3\3\2\2\2\63\u00da\3\2\2"+
		"\2\65\u00e2\3\2\2\2\67\u00e6\3\2\2\29\u00ea\3\2\2\2;\u00ef\3\2\2\2=\u00f5"+
		"\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G"+
		"\u00ff\3\2\2\2I\u0101\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2\2\2O\u0107\3\2"+
		"\2\2Q\u0109\3\2\2\2S\u010b\3\2\2\2U\u010d\3\2\2\2W\u010f\3\2\2\2Y\u0111"+
		"\3\2\2\2[\u0113\3\2\2\2]\u0115\3\2\2\2_\u0117\3\2\2\2a\u0119\3\2\2\2c"+
		"\u011b\3\2\2\2e\u011d\3\2\2\2g\u011f\3\2\2\2i\u0121\3\2\2\2k\u0123\3\2"+
		"\2\2m\u0125\3\2\2\2o\u0127\3\2\2\2qr\7<\2\2r\4\3\2\2\2st\7\60\2\2t\6\3"+
		"\2\2\2uv\7*\2\2v\b\3\2\2\2wx\7+\2\2x\n\3\2\2\2yz\7]\2\2z\f\3\2\2\2{|\7"+
		"\60\2\2|}\7\60\2\2}\16\3\2\2\2~\177\7_\2\2\177\20\3\2\2\2\u0080\u0081"+
		"\7,\2\2\u0081\22\3\2\2\2\u0082\u0083\7\61\2\2\u0083\24\3\2\2\2\u0084\u0085"+
		"\7-\2\2\u0085\26\3\2\2\2\u0086\u0087\7/\2\2\u0087\30\3\2\2\2\u0088\u0089"+
		"\7\'\2\2\u0089\32\3\2\2\2\u008a\u008b\7@\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\7@\2\2\u008d\u008e\7?\2\2\u008e\36\3\2\2\2\u008f\u0090\7?\2\2\u0090 "+
		"\3\2\2\2\u0091\u0092\7>\2\2\u0092\"\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095"+
		"\7?\2\2\u0095$\3\2\2\2\u0096\u009c\7#\2\2\u0097\u0098\5W,\2\u0098\u0099"+
		"\5Y-\2\u0099\u009a\5c\62\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009c&\3\2\2\2\u009d\u009e\7(\2\2\u009e\u00a4\7(\2\2\u009f"+
		"\u00a0\5=\37\2\u00a0\u00a1\5W,\2\u00a1\u00a2\5C\"\2\u00a2\u00a4\3\2\2"+
		"\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4(\3\2\2\2\u00a5\u00a6"+
		"\7~\2\2\u00a6\u00ab\7~\2\2\u00a7\u00a8\5Y-\2\u00a8\u00a9\5_\60\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab*\3\2\2\2"+
		"\u00ac\u00ad\7/\2\2\u00ad\u00b9\7@\2\2\u00ae\u00af\7?\2\2\u00af\u00b9"+
		"\7@\2\2\u00b0\u00b1\5M\'\2\u00b1\u00b2\5U+\2\u00b2\u00b3\5[.\2\u00b3\u00b4"+
		"\5S*\2\u00b4\u00b5\5M\'\2\u00b5\u00b6\5E#\2\u00b6\u00b7\5a\61\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b0\3\2"+
		"\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\7/\2\2\u00bc\u00cb"+
		"\7@\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7?\2\2\u00bf\u00cb\7@\2\2\u00c0"+
		"\u00c1\5E#\2\u00c1\u00c2\5]/\2\u00c2\u00c3\5e\63\2\u00c3\u00c4\5M\'\2"+
		"\u00c4\u00c5\5g\64\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\5M\'\2\u00c7\u00c8"+
		"\5G$\2\u00c8\u00c9\5G$\2\u00c9\u00cb\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca"+
		"\u00bd\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb.\3\2\2\2"+
		"\u00cc\u00cd\5G$\2\u00cd\u00ce\5Y-\2\u00ce\u00cf\5_\60\2\u00cf\u00d0\5"+
		"=\37\2\u00d0\u00d1\5S*\2\u00d1\u00d2\5S*\2\u00d2\60\3\2\2\2\u00d3\u00d4"+
		"\5E#\2\u00d4\u00d5\5k\66\2\u00d5\u00d6\5M\'\2\u00d6\u00d7\5a\61\2\u00d7"+
		"\u00d8\5c\62\2\u00d8\u00d9\5a\61\2\u00d9\62\3\2\2\2\u00da\u00de\t\2\2"+
		"\2\u00db\u00dd\t\3\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\64\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7\u00e8"+
		"\5\65\33\2\u00e88\3\2\2\2\u00e9\u00eb\7\17\2\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\f\2\2\u00ed:\3\2\2\2"+
		"\u00ee\u00f0\t\5\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\36\2\2"+
		"\u00f4<\3\2\2\2\u00f5\u00f6\t\6\2\2\u00f6>\3\2\2\2\u00f7\u00f8\t\7\2\2"+
		"\u00f8@\3\2\2\2\u00f9\u00fa\t\b\2\2\u00faB\3\2\2\2\u00fb\u00fc\t\t\2\2"+
		"\u00fcD\3\2\2\2\u00fd\u00fe\t\n\2\2\u00feF\3\2\2\2\u00ff\u0100\t\13\2"+
		"\2\u0100H\3\2\2\2\u0101\u0102\t\f\2\2\u0102J\3\2\2\2\u0103\u0104\t\r\2"+
		"\2\u0104L\3\2\2\2\u0105\u0106\t\16\2\2\u0106N\3\2\2\2\u0107\u0108\t\17"+
		"\2\2\u0108P\3\2\2\2\u0109\u010a\t\20\2\2\u010aR\3\2\2\2\u010b\u010c\t"+
		"\21\2\2\u010cT\3\2\2\2\u010d\u010e\t\22\2\2\u010eV\3\2\2\2\u010f\u0110"+
		"\t\23\2\2\u0110X\3\2\2\2\u0111\u0112\t\24\2\2\u0112Z\3\2\2\2\u0113\u0114"+
		"\t\25\2\2\u0114\\\3\2\2\2\u0115\u0116\t\26\2\2\u0116^\3\2\2\2\u0117\u0118"+
		"\t\27\2\2\u0118`\3\2\2\2\u0119\u011a\t\30\2\2\u011ab\3\2\2\2\u011b\u011c"+
		"\t\31\2\2\u011cd\3\2\2\2\u011d\u011e\t\32\2\2\u011ef\3\2\2\2\u011f\u0120"+
		"\t\33\2\2\u0120h\3\2\2\2\u0121\u0122\t\34\2\2\u0122j\3\2\2\2\u0123\u0124"+
		"\t\35\2\2\u0124l\3\2\2\2\u0125\u0126\t\36\2\2\u0126n\3\2\2\2\u0127\u0128"+
		"\t\37\2\2\u0128p\3\2\2\2\f\2\u009b\u00a3\u00aa\u00b8\u00ca\u00de\u00e4"+
		"\u00ea\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}