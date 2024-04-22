// Generated from br/ufscar/compiladores/la/lex/lalex.g4 by ANTLR 4.12.0
package br.ufscar.compiladores.la.lex;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lalex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, CADEIA=4, WS=5, IDENT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "CADEIA", "WS", "IDENT", "LETRA", 
			"DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "CADEIA", "WS", "IDENT"
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


	public lalex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lalex.g4"; }

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
		"\u0004\u0000\u0006z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000H\b\u0000\u0001\u0001\u0003\u0001K\b\u0001\u0001"+
		"\u0001\u0004\u0001N\b\u0001\u000b\u0001\f\u0001O\u0001\u0002\u0003\u0002"+
		"S\b\u0002\u0001\u0002\u0004\u0002V\b\u0002\u000b\u0002\f\u0002W\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\\\b\u0002\u000b\u0002\f\u0002]\u0001\u0003"+
		"\u0001\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005q\b\u0005\n\u0005\f\u0005"+
		"t\t\u0005\u0001\u0006\u0003\u0006w\b\u0006\u0001\u0007\u0001\u0007\u0000"+
		"\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0000\u000f\u0000\u0001\u0000\u0004\u0002\u0000++--\u0002\u0000"+
		"\n\n\"\"\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0086\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0001G\u0001\u0000\u0000"+
		"\u0000\u0003J\u0001\u0000\u0000\u0000\u0005R\u0001\u0000\u0000\u0000\u0007"+
		"_\u0001\u0000\u0000\u0000\th\u0001\u0000\u0000\u0000\u000bl\u0001\u0000"+
		"\u0000\u0000\rv\u0001\u0000\u0000\u0000\u000fx\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0005a\u0000\u0000\u0012\u0013\u0005l\u0000\u0000\u0013\u0014"+
		"\u0005g\u0000\u0000\u0014\u0015\u0005o\u0000\u0000\u0015\u0016\u0005r"+
		"\u0000\u0000\u0016\u0017\u0005i\u0000\u0000\u0017\u0018\u0005t\u0000\u0000"+
		"\u0018\u0019\u0005m\u0000\u0000\u0019H\u0005o\u0000\u0000\u001a\u001b"+
		"\u0005d\u0000\u0000\u001b\u001c\u0005e\u0000\u0000\u001c\u001d\u0005c"+
		"\u0000\u0000\u001d\u001e\u0005l\u0000\u0000\u001e\u001f\u0005a\u0000\u0000"+
		"\u001f \u0005r\u0000\u0000 H\u0005e\u0000\u0000!\"\u0005l\u0000\u0000"+
		"\"#\u0005i\u0000\u0000#$\u0005t\u0000\u0000$%\u0005e\u0000\u0000%&\u0005"+
		"r\u0000\u0000&\'\u0005a\u0000\u0000\'H\u0005l\u0000\u0000()\u0005i\u0000"+
		"\u0000)*\u0005n\u0000\u0000*+\u0005t\u0000\u0000+,\u0005e\u0000\u0000"+
		",-\u0005i\u0000\u0000-.\u0005r\u0000\u0000.H\u0005o\u0000\u0000/0\u0005"+
		"l\u0000\u000001\u0005e\u0000\u000012\u0005i\u0000\u00002H\u0005a\u0000"+
		"\u000034\u0005e\u0000\u000045\u0005s\u0000\u000056\u0005c\u0000\u0000"+
		"67\u0005r\u0000\u000078\u0005e\u0000\u000089\u0005v\u0000\u00009H\u0005"+
		"a\u0000\u0000:;\u0005f\u0000\u0000;<\u0005i\u0000\u0000<=\u0005m\u0000"+
		"\u0000=>\u0005_\u0000\u0000>?\u0005a\u0000\u0000?@\u0005l\u0000\u0000"+
		"@A\u0005g\u0000\u0000AB\u0005o\u0000\u0000BC\u0005r\u0000\u0000CD\u0005"+
		"i\u0000\u0000DE\u0005t\u0000\u0000EF\u0005m\u0000\u0000FH\u0005o\u0000"+
		"\u0000G\u0011\u0001\u0000\u0000\u0000G\u001a\u0001\u0000\u0000\u0000G"+
		"!\u0001\u0000\u0000\u0000G(\u0001\u0000\u0000\u0000G/\u0001\u0000\u0000"+
		"\u0000G3\u0001\u0000\u0000\u0000G:\u0001\u0000\u0000\u0000H\u0002\u0001"+
		"\u0000\u0000\u0000IK\u0007\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LN\u000209\u0000M"+
		"L\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u0004\u0001\u0000\u0000\u0000QS\u0007"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000TV\u000209\u0000UT\u0001\u0000\u0000\u0000V"+
		"W\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0005.\u0000\u0000Z\\\u000209\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\u0006\u0001\u0000\u0000\u0000_c\u0005"+
		"\"\u0000\u0000`b\b\u0001\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\"\u0000\u0000"+
		"g\b\u0001\u0000\u0000\u0000hi\u0007\u0002\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0006\u0004\u0000\u0000k\n\u0001\u0000\u0000\u0000lr\u0003\r"+
		"\u0006\u0000mq\u0003\r\u0006\u0000nq\u0003\u000f\u0007\u0000oq\u0005_"+
		"\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000s\f\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uw\u0007\u0003\u0000\u0000vu\u0001\u0000\u0000\u0000w\u000e\u0001"+
		"\u0000\u0000\u0000xy\u000209\u0000y\u0010\u0001\u0000\u0000\u0000\u000b"+
		"\u0000GJORW]cprv\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}