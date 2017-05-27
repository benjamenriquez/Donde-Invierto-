// Generated from Formulas.g4 by ANTLR 4.4
package dondeinvierto.AnalizadorFormulas;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CUENTA=1, INDICADOR=2, NUMERO=3, MAS=4, MENOS=5, POR=6, DIV=7, IGUAL=8, 
		MAYOR=9, MENOR=10, MAYOROIGUAL=11, MENOROIGUAL=12, PA=13, PC=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"CUENTA", "INDICADOR", "NUMERO", "MAS", "MENOS", "POR", "DIV", "IGUAL", 
		"MAYOR", "MENOR", "MAYOROIGUAL", "MENOROIGUAL", "PA", "PC", "WS"
	};


	public FormulasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Formulas.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2V\n\2\3\3\6\3"+
		"Y\n\3\r\3\16\3Z\3\4\6\4^\n\4\r\4\16\4_\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\6\20{\n\20\r\20\16\20|\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\3\2c|\3\2\62"+
		";\5\2\13\f\17\17\"\"\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7]\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2"+
		"\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31r\3"+
		"\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37z\3\2\2\2!\"\7g\2\2\"#\7d\2\2#$\7k\2"+
		"\2$%\7v\2\2%&\7f\2\2&V\7c\2\2\'(\7h\2\2()\7f\2\2)V\7u\2\2*+\7h\2\2+,\7"+
		"E\2\2,-\7c\2\2-.\7u\2\2./\7j\2\2/\60\7H\2\2\60\61\7n\2\2\61\62\7q\2\2"+
		"\62V\7y\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7i\2\2\66\67\7P\2\2\678\7"+
		"g\2\289\7v\2\29:\7q\2\2:;\7Q\2\2;<\7r\2\2<=\7E\2\2=>\7q\2\2>?\7p\2\2?"+
		"V\7v\2\2@A\7k\2\2AB\7p\2\2BC\7i\2\2CD\7P\2\2DE\7g\2\2EF\7v\2\2FG\7q\2"+
		"\2GH\7Q\2\2HI\7r\2\2IJ\7F\2\2JK\7k\2\2KL\7u\2\2LM\7e\2\2MN\7q\2\2NO\7"+
		"p\2\2OV\7v\2\2PQ\7f\2\2QR\7g\2\2RS\7w\2\2ST\7f\2\2TV\7c\2\2U!\3\2\2\2"+
		"U\'\3\2\2\2U*\3\2\2\2U\63\3\2\2\2U@\3\2\2\2UP\3\2\2\2V\4\3\2\2\2WY\t\2"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\6\3\2\2\2\\^\t\3\2\2]\\"+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\b\3\2\2\2ab\7-\2\2b\n\3\2\2\2"+
		"cd\7/\2\2d\f\3\2\2\2ef\7,\2\2f\16\3\2\2\2gh\7\61\2\2h\20\3\2\2\2ij\7?"+
		"\2\2j\22\3\2\2\2kl\7@\2\2l\24\3\2\2\2mn\7>\2\2n\26\3\2\2\2op\7@\2\2pq"+
		"\7?\2\2q\30\3\2\2\2rs\7>\2\2st\7?\2\2t\32\3\2\2\2uv\7*\2\2v\34\3\2\2\2"+
		"wx\7+\2\2x\36\3\2\2\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}~\3\2\2\2~\177\b\20\2\2\177 \3\2\2\2\7\2UZ_|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}