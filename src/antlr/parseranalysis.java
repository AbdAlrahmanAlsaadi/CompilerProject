// Generated from C:/Users/DELL/Desktop/AngularCompilerProject/src/parseranalysis.g4 by ANTLR 4.13.2
package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class parseranalysis extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, FUNCTION=2, RETURN=3, DIV=4, VAR=5, EXPORT=6, EXPORT_DEFAULT=7, 
		STYLE_TAG=8, IMAGE_TAG=9, IMAGE_SRC=10, IMPORT=11, FROM=12, TEMPLATE=13, 
		CONSTRUCTOR=14, INPUT_BINDING=15, OUTPUT_BINDING=16, DECORATOR=17, ANGULAR_MODULE=18, 
		CLICK_EVENT=19, CLASS_ATTR=20, ID_ATTR=21, TABINDEX_ATTR=22, KEY_ATTR=23, 
		REF_ATTR=24, CONSOLE=25, HTML_TAG=26, STYLE_ATTR=27, NUMBER=28, IDENTIFIER=29, 
		QUOTE=30, EQUALS=31, ARROW=32, OPEN_PAREN=33, CLOSE_PAREN=34, SEMICOLON=35, 
		OPEN_BRACE=36, CLOSE_BRACE=37, OPEN_BRACKET=38, CLOSE_BRACKET=39, COMMA=40, 
		COLON=41, STRING=42, TEMPLATE_OPEN=43, TEMPLATE_CLOSE=44, TEMPLATE_SLASH=45, 
		WS=46;
	public static final int
		RULE_componentFile = 0, RULE_imports = 1, RULE_componentDeclaration = 2, 
		RULE_componentMetadata = 3, RULE_classBody = 4, RULE_componentConstructor = 5, 
		RULE_property = 6, RULE_method = 7, RULE_methodBody = 8, RULE_assignment = 9, 
		RULE_htmlTemplate = 10, RULE_clickHandler = 11, RULE_logStatement = 12, 
		RULE_arrayLiteral = 13, RULE_objectLiteral = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"componentFile", "imports", "componentDeclaration", "componentMetadata", 
			"classBody", "componentConstructor", "property", "method", "methodBody", 
			"assignment", "htmlTemplate", "clickHandler", "logStatement", "arrayLiteral", 
			"objectLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'function'", "'return'", "'div'", "'let'", "'export'", 
			"'export default'", "'style'", "'img'", "'src'", "'import'", "'from'", 
			"'template'", "'constructor'", "'@Input'", "'@Output'", "'@Component'", 
			"'@NgModule'", "'(click)'", "'class'", "'id'", "'tabindex'", "'key'", 
			"'#'", "'console.log'", null, null, null, null, "'\"'", "'='", "'=>'", 
			"'('", "')'", "';'", "'{'", "'}'", "'['", "']'", "','", "':'", null, 
			"'<'", "'>'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "FUNCTION", "RETURN", "DIV", "VAR", "EXPORT", "EXPORT_DEFAULT", 
			"STYLE_TAG", "IMAGE_TAG", "IMAGE_SRC", "IMPORT", "FROM", "TEMPLATE", 
			"CONSTRUCTOR", "INPUT_BINDING", "OUTPUT_BINDING", "DECORATOR", "ANGULAR_MODULE", 
			"CLICK_EVENT", "CLASS_ATTR", "ID_ATTR", "TABINDEX_ATTR", "KEY_ATTR", 
			"REF_ATTR", "CONSOLE", "HTML_TAG", "STYLE_ATTR", "NUMBER", "IDENTIFIER", 
			"QUOTE", "EQUALS", "ARROW", "OPEN_PAREN", "CLOSE_PAREN", "SEMICOLON", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", 
			"COLON", "STRING", "TEMPLATE_OPEN", "TEMPLATE_CLOSE", "TEMPLATE_SLASH", 
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

	@Override
	public String getGrammarFileName() { return "parseranalysis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parseranalysis(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentFileContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public ComponentFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitComponentFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentFileContext componentFile() throws RecognitionException {
		ComponentFileContext _localctx = new ComponentFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_componentFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(30);
				imports();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			componentDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(parseranalysis.IMPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(parseranalysis.FROM, 0); }
		public TerminalNode STRING() { return getToken(parseranalysis.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(parseranalysis.COMMA, 0); }
		public TerminalNode INPUT_BINDING() { return getToken(parseranalysis.INPUT_BINDING, 0); }
		public TerminalNode OUTPUT_BINDING() { return getToken(parseranalysis.OUTPUT_BINDING, 0); }
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(IMPORT);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(39);
				match(IDENTIFIER);
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(42);
				match(COMMA);
				}
			}

			setState(45);
			match(OPEN_BRACE);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_BINDING || _la==OUTPUT_BINDING) {
				{
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==INPUT_BINDING || _la==OUTPUT_BINDING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(49);
			match(CLOSE_BRACE);
			setState(50);
			match(FROM);
			setState(51);
			match(STRING);
			setState(52);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(parseranalysis.DECORATOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode CLASS_ATTR() { return getToken(parseranalysis.CLASS_ATTR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(DECORATOR);
			setState(55);
			match(OPEN_PAREN);
			setState(56);
			componentMetadata();
			setState(57);
			match(CLOSE_PAREN);
			setState(58);
			match(CLASS_ATTR);
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(OPEN_BRACE);
			setState(61);
			classBody();
			setState(62);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(parseranalysis.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parseranalysis.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(parseranalysis.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(parseranalysis.STRING, i);
		}
		public List<ArrayLiteralContext> arrayLiteral() {
			return getRuleContexts(ArrayLiteralContext.class);
		}
		public ArrayLiteralContext arrayLiteral(int i) {
			return getRuleContext(ArrayLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitComponentMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(OPEN_BRACE);
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(IDENTIFIER);
				setState(66);
				match(COLON);
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(67);
					match(STRING);
					}
					break;
				case IDENTIFIER:
					{
					setState(68);
					match(IDENTIFIER);
					}
					break;
				case OPEN_BRACKET:
					{
					setState(69);
					arrayLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(72);
					match(COMMA);
					}
				}

				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(79);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<ComponentConstructorContext> componentConstructor() {
			return getRuleContexts(ComponentConstructorContext.class);
		}
		public ComponentConstructorContext componentConstructor(int i) {
			return getRuleContext(ComponentConstructorContext.class,i);
		}
		public List<ClickHandlerContext> clickHandler() {
			return getRuleContexts(ClickHandlerContext.class);
		}
		public ClickHandlerContext clickHandler(int i) {
			return getRuleContext(ClickHandlerContext.class,i);
		}
		public List<LogStatementContext> logStatement() {
			return getRuleContexts(LogStatementContext.class);
		}
		public LogStatementContext logStatement(int i) {
			return getRuleContext(LogStatementContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 570441760L) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(81);
					property();
					}
					break;
				case 2:
					{
					setState(82);
					method();
					}
					break;
				case 3:
					{
					setState(83);
					componentConstructor();
					}
					break;
				case 4:
					{
					setState(84);
					clickHandler();
					}
					break;
				case 5:
					{
					setState(85);
					logStatement();
					}
					break;
				}
				}
				setState(90);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(parseranalysis.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(parseranalysis.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parseranalysis.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public ComponentConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitComponentConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConstructorContext componentConstructor() throws RecognitionException {
		ComponentConstructorContext _localctx = new ComponentConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CONSTRUCTOR);
			setState(92);
			match(OPEN_PAREN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(COLON);
				setState(95);
				match(IDENTIFIER);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					match(IDENTIFIER);
					setState(98);
					match(COLON);
					setState(99);
					match(IDENTIFIER);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(107);
			match(CLOSE_PAREN);
			setState(108);
			match(OPEN_BRACE);
			setState(109);
			methodBody();
			setState(110);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(parseranalysis.VAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(VAR);
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(COLON);
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENTIFIER);
			setState(119);
			match(OPEN_PAREN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(120);
				match(IDENTIFIER);
				setState(121);
				match(COLON);
				setState(122);
				match(IDENTIFIER);
				}
			}

			setState(125);
			match(CLOSE_PAREN);
			setState(126);
			match(OPEN_BRACE);
			setState(127);
			methodBody();
			setState(128);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<LogStatementContext> logStatement() {
			return getRuleContexts(LogStatementContext.class);
		}
		public LogStatementContext logStatement(int i) {
			return getRuleContext(LogStatementContext.class,i);
		}
		public List<HtmlTemplateContext> htmlTemplate() {
			return getRuleContexts(HtmlTemplateContext.class);
		}
		public HtmlTemplateContext htmlTemplate(int i) {
			return getRuleContext(HtmlTemplateContext.class,i);
		}
		public List<ArrayLiteralContext> arrayLiteral() {
			return getRuleContexts(ArrayLiteralContext.class);
		}
		public ArrayLiteralContext arrayLiteral(int i) {
			return getRuleContext(ArrayLiteralContext.class,i);
		}
		public List<ObjectLiteralContext> objectLiteral() {
			return getRuleContexts(ObjectLiteralContext.class);
		}
		public ObjectLiteralContext objectLiteral(int i) {
			return getRuleContext(ObjectLiteralContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9140260831232L) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSOLE:
					{
					setState(130);
					logStatement();
					}
					break;
				case TEMPLATE_OPEN:
					{
					setState(131);
					htmlTemplate();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(132);
					arrayLiteral();
					}
					break;
				case OPEN_BRACE:
					{
					setState(133);
					objectLiteral();
					}
					break;
				case IDENTIFIER:
					{
					setState(134);
					assignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(parseranalysis.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(parseranalysis.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(parseranalysis.NUMBER, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IDENTIFIER);
			setState(141);
			match(EQUALS);
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398851817472L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateContext extends ParserRuleContext {
		public List<TerminalNode> TEMPLATE_OPEN() { return getTokens(parseranalysis.TEMPLATE_OPEN); }
		public TerminalNode TEMPLATE_OPEN(int i) {
			return getToken(parseranalysis.TEMPLATE_OPEN, i);
		}
		public List<TerminalNode> HTML_TAG() { return getTokens(parseranalysis.HTML_TAG); }
		public TerminalNode HTML_TAG(int i) {
			return getToken(parseranalysis.HTML_TAG, i);
		}
		public List<TerminalNode> TEMPLATE_CLOSE() { return getTokens(parseranalysis.TEMPLATE_CLOSE); }
		public TerminalNode TEMPLATE_CLOSE(int i) {
			return getToken(parseranalysis.TEMPLATE_CLOSE, i);
		}
		public TerminalNode TEMPLATE_SLASH() { return getToken(parseranalysis.TEMPLATE_SLASH, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<HtmlTemplateContext> htmlTemplate() {
			return getRuleContexts(HtmlTemplateContext.class);
		}
		public HtmlTemplateContext htmlTemplate(int i) {
			return getRuleContext(HtmlTemplateContext.class,i);
		}
		public HtmlTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitHtmlTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplateContext htmlTemplate() throws RecognitionException {
		HtmlTemplateContext _localctx = new HtmlTemplateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlTemplate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(TEMPLATE_OPEN);
			setState(146);
			match(HTML_TAG);
			setState(147);
			match(TEMPLATE_CLOSE);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(150);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(148);
						match(IDENTIFIER);
						}
						break;
					case TEMPLATE_OPEN:
						{
						setState(149);
						htmlTemplate();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(155);
			match(TEMPLATE_OPEN);
			setState(156);
			match(TEMPLATE_SLASH);
			setState(157);
			match(HTML_TAG);
			setState(158);
			match(TEMPLATE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClickHandlerContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(parseranalysis.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(parseranalysis.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(parseranalysis.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(parseranalysis.CLOSE_PAREN, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public ClickHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clickHandler; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitClickHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClickHandlerContext clickHandler() throws RecognitionException {
		ClickHandlerContext _localctx = new ClickHandlerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clickHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(OPEN_PAREN);
			setState(162);
			match(CLOSE_PAREN);
			setState(163);
			match(OPEN_BRACE);
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(OPEN_PAREN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(166);
				match(IDENTIFIER);
				}
			}

			setState(169);
			match(CLOSE_PAREN);
			setState(170);
			match(SEMICOLON);
			setState(171);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(parseranalysis.CONSOLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public LogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitLogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogStatementContext logStatement() throws RecognitionException {
		LogStatementContext _localctx = new LogStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(CONSOLE);
			setState(174);
			match(OPEN_PAREN);
			setState(175);
			match(IDENTIFIER);
			setState(176);
			match(CLOSE_PAREN);
			setState(177);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(parseranalysis.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(parseranalysis.CLOSE_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(OPEN_BRACKET);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(180);
				match(IDENTIFIER);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(181);
					match(COMMA);
					}
				}

				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(parseranalysis.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parseranalysis.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(parseranalysis.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(parseranalysis.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(parseranalysis.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(parseranalysis.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(OPEN_BRACE);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(192);
				match(IDENTIFIER);
				setState(193);
				match(COLON);
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398851817472L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(195);
					match(COMMA);
					}
				}

				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(CLOSE_BRACE);
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
		"\u0004\u0001.\u00ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0001\u0003\u0001,\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0004\u0003"+
		"L\b\u0003\u000b\u0003\f\u0003M\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004"+
		"\f\u0004Z\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005e\b"+
		"\u0005\n\u0005\f\u0005h\t\u0005\u0003\u0005j\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0088\b\b\n\b\f\b\u008b\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0097"+
		"\b\n\n\n\f\n\u009a\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00a8\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00b7\b\r\u0005\r\u00b9\b\r\n\r\f\r\u00bc\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00c5\b\u000e\u0005\u000e\u00c7\b\u000e\n\u000e\f\u000e\u00ca\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002"+
		"\u0001\u0000\u000f\u0010\u0002\u0000\u001c\u001d**\u00da\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000"+
		"\u0000\u0006@\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n[\u0001"+
		"\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000"+
		"\u0000\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000"+
		"\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000"+
		"\u0000\u0018\u00ad\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000"+
		"\u0000\u001c\u00bf\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000"+
		"\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000$%\u0003\u0004\u0002\u0000%\u0001\u0001"+
		"\u0000\u0000\u0000&(\u0005\u000b\u0000\u0000\')\u0005\u001d\u0000\u0000"+
		"(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000"+
		"\u0000*,\u0005(\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0005$\u0000\u0000.0\u0007\u0000\u0000"+
		"\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0005%\u0000\u000023\u0005\f\u0000\u000034\u0005*\u0000"+
		"\u000045\u0005#\u0000\u00005\u0003\u0001\u0000\u0000\u000067\u0005\u0011"+
		"\u0000\u000078\u0005!\u0000\u000089\u0003\u0006\u0003\u00009:\u0005\""+
		"\u0000\u0000:;\u0005\u0014\u0000\u0000;<\u0005\u001d\u0000\u0000<=\u0005"+
		"$\u0000\u0000=>\u0003\b\u0004\u0000>?\u0005%\u0000\u0000?\u0005\u0001"+
		"\u0000\u0000\u0000@K\u0005$\u0000\u0000AB\u0005\u001d\u0000\u0000BF\u0005"+
		")\u0000\u0000CG\u0005*\u0000\u0000DG\u0005\u001d\u0000\u0000EG\u0003\u001a"+
		"\r\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0005(\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KA\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005%\u0000\u0000"+
		"P\u0007\u0001\u0000\u0000\u0000QW\u0003\f\u0006\u0000RW\u0003\u000e\u0007"+
		"\u0000SW\u0003\n\u0005\u0000TW\u0003\u0016\u000b\u0000UW\u0003\u0018\f"+
		"\u0000VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\t\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u000e\u0000"+
		"\u0000\\i\u0005!\u0000\u0000]^\u0005\u001d\u0000\u0000^_\u0005)\u0000"+
		"\u0000_f\u0005\u001d\u0000\u0000`a\u0005(\u0000\u0000ab\u0005\u001d\u0000"+
		"\u0000bc\u0005)\u0000\u0000ce\u0005\u001d\u0000\u0000d`\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000i]\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0005\"\u0000\u0000lm\u0005$\u0000\u0000mn\u0003\u0010\b\u0000no\u0005"+
		"%\u0000\u0000o\u000b\u0001\u0000\u0000\u0000pq\u0005\u0005\u0000\u0000"+
		"qr\u0005\u001d\u0000\u0000rs\u0005)\u0000\u0000st\u0005\u001d\u0000\u0000"+
		"tu\u0005#\u0000\u0000u\r\u0001\u0000\u0000\u0000vw\u0005\u001d\u0000\u0000"+
		"w{\u0005!\u0000\u0000xy\u0005\u001d\u0000\u0000yz\u0005)\u0000\u0000z"+
		"|\u0005\u001d\u0000\u0000{x\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}~\u0005\"\u0000\u0000~\u007f\u0005$\u0000"+
		"\u0000\u007f\u0080\u0003\u0010\b\u0000\u0080\u0081\u0005%\u0000\u0000"+
		"\u0081\u000f\u0001\u0000\u0000\u0000\u0082\u0088\u0003\u0018\f\u0000\u0083"+
		"\u0088\u0003\u0014\n\u0000\u0084\u0088\u0003\u001a\r\u0000\u0085\u0088"+
		"\u0003\u001c\u000e\u0000\u0086\u0088\u0003\u0012\t\u0000\u0087\u0082\u0001"+
		"\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0011\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u001d\u0000\u0000\u008d\u008e\u0005\u001f\u0000\u0000\u008e\u008f\u0007"+
		"\u0001\u0000\u0000\u008f\u0090\u0005#\u0000\u0000\u0090\u0013\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005+\u0000\u0000\u0092\u0093\u0005\u001a\u0000"+
		"\u0000\u0093\u0098\u0005,\u0000\u0000\u0094\u0097\u0005\u001d\u0000\u0000"+
		"\u0095\u0097\u0003\u0014\n\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005+\u0000\u0000\u009c\u009d\u0005-\u0000\u0000\u009d\u009e\u0005"+
		"\u001a\u0000\u0000\u009e\u009f\u0005,\u0000\u0000\u009f\u0015\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u001d\u0000\u0000\u00a1\u00a2\u0005!\u0000"+
		"\u0000\u00a2\u00a3\u0005\"\u0000\u0000\u00a3\u00a4\u0005$\u0000\u0000"+
		"\u00a4\u00a5\u0005\u001d\u0000\u0000\u00a5\u00a7\u0005!\u0000\u0000\u00a6"+
		"\u00a8\u0005\u001d\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\"\u0000\u0000\u00aa\u00ab\u0005#\u0000\u0000\u00ab\u00ac"+
		"\u0005%\u0000\u0000\u00ac\u0017\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0019\u0000\u0000\u00ae\u00af\u0005!\u0000\u0000\u00af\u00b0\u0005\u001d"+
		"\u0000\u0000\u00b0\u00b1\u0005\"\u0000\u0000\u00b1\u00b2\u0005#\u0000"+
		"\u0000\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3\u00ba\u0005&\u0000\u0000"+
		"\u00b4\u00b6\u0005\u001d\u0000\u0000\u00b5\u00b7\u0005(\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\'\u0000\u0000\u00be\u001b"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c8\u0005$\u0000\u0000\u00c0\u00c1\u0005"+
		"\u001d\u0000\u0000\u00c1\u00c2\u0005)\u0000\u0000\u00c2\u00c4\u0007\u0001"+
		"\u0000\u0000\u00c3\u00c5\u0005(\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005%\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000"+
		"\u0015!(+/FIMVXfi{\u0087\u0089\u0096\u0098\u00a7\u00b6\u00ba\u00c4\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}