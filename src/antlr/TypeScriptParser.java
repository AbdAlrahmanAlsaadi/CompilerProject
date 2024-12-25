// Generated from TypeScriptParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TypeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPES=1, KEYWORDS=2, IDENTIFIER=3, NUMBER=4, ARABIC=5, STRING=6, BOOLEAN=7, 
		BINDING_START=8, BINDING_END=9, DIRECTIVE=10, OF=11, NGFOR=12, NGIF=13, 
		TAG_OPEN=14, TAG_CLOSE=15, PLUS=16, SUB=17, UNDERSCORE=18, MULTI=19, DIVID=20, 
		ASSIGN=21, LESS=22, BIGGER=23, SEMICOLON=24, COMMA=25, COLON=26, DOT=27, 
		OPENB=28, CLOSEB=29, LBRACE=30, RBRACE=31, LSQUARE=32, RSQUARE=33, OR=34, 
		AND=35, SHEE=36, Double_Comment=37, Single_Comment=38, WS=39;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_operator = 2, RULE_type = 3, 
		RULE_accessMoidifers = 4, RULE_directiveElement = 5, RULE_directive = 6, 
		RULE_htmlContent = 7, RULE_templateBinding = 8, RULE_tupleLiteral = 9, 
		RULE_enumLiteral = 10, RULE_enumAccess = 11, RULE_variableDeclaration = 12, 
		RULE_arrayLiteral = 13, RULE_objectLiteral = 14, RULE_propertyAssignment = 15, 
		RULE_functionDeclaration = 16, RULE_returnStatment = 17, RULE_parameter = 18, 
		RULE_block = 19, RULE_ifStatement = 20, RULE_constructorDeclaration = 21, 
		RULE_parameterList = 22, RULE_thisAssignment = 23, RULE_interfaceDeclaration = 24, 
		RULE_interfaceBody = 25, RULE_forloop = 26, RULE_forBrack = 27, RULE_whileloop = 28, 
		RULE_importStatement = 29, RULE_importClause = 30, RULE_importSpecifier = 31, 
		RULE_exportStatement = 32, RULE_exportSpecifier = 33, RULE_decorator = 34, 
		RULE_decoratorBody = 35, RULE_decoratorProperty = 36, RULE_classDeclaration = 37, 
		RULE_classBody = 38, RULE_expression = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "operator", "type", "accessMoidifers", "directiveElement", 
			"directive", "htmlContent", "templateBinding", "tupleLiteral", "enumLiteral", 
			"enumAccess", "variableDeclaration", "arrayLiteral", "objectLiteral", 
			"propertyAssignment", "functionDeclaration", "returnStatment", "parameter", 
			"block", "ifStatement", "constructorDeclaration", "parameterList", "thisAssignment", 
			"interfaceDeclaration", "interfaceBody", "forloop", "forBrack", "whileloop", 
			"importStatement", "importClause", "importSpecifier", "exportStatement", 
			"exportSpecifier", "decorator", "decoratorBody", "decoratorProperty", 
			"classDeclaration", "classBody", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'{{'", "'}}'", null, 
			"'of'", "'ngFor'", "'ngIf'", null, null, "'+'", "'-'", "'_'", "'*'", 
			"'/'", "'='", "'<'", "'>'", "';'", "','", "':'", "'.'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'||'", "'&&'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPES", "KEYWORDS", "IDENTIFIER", "NUMBER", "ARABIC", "STRING", 
			"BOOLEAN", "BINDING_START", "BINDING_END", "DIRECTIVE", "OF", "NGFOR", 
			"NGIF", "TAG_OPEN", "TAG_CLOSE", "PLUS", "SUB", "UNDERSCORE", "MULTI", 
			"DIVID", "ASSIGN", "LESS", "BIGGER", "SEMICOLON", "COMMA", "COLON", "DOT", 
			"OPENB", "CLOSEB", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "OR", "AND", 
			"SHEE", "Double_Comment", "Single_Comment", "WS"
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
	public String getGrammarFileName() { return "TypeScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294984156L) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
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
	public static class StatementContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumLiteralContext enumLiteral() {
			return getRuleContext(EnumLiteralContext.class,0);
		}
		public TemplateBindingContext templateBinding() {
			return getRuleContext(TemplateBindingContext.class,0);
		}
		public DirectiveElementContext directiveElement() {
			return getRuleContext(DirectiveElementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				decorator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				enumLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				templateBinding();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				directiveElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				importStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				functionDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TypeScriptParser.PLUS, 0); }
		public TerminalNode MULTI() { return getToken(TypeScriptParser.MULTI, 0); }
		public TerminalNode SUB() { return getToken(TypeScriptParser.SUB, 0); }
		public TerminalNode LESS() { return getToken(TypeScriptParser.LESS, 0); }
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode BIGGER() { return getToken(TypeScriptParser.BIGGER, 0); }
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(TypeScriptParser.UNDERSCORE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operator);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(PLUS);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(MULTI);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(SUB);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(LESS);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(102);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(BIGGER);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(106);
					match(ASSIGN);
					}
				}

				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(ASSIGN);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(TypeScriptParser.TYPES, 0); }
		public TerminalNode LESS() { return getToken(TypeScriptParser.LESS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode BIGGER() { return getToken(TypeScriptParser.BIGGER, 0); }
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(115);
				match(TYPES);
				}
				break;
			case 2:
				{
				setState(116);
				match(TYPES);
				setState(117);
				match(LESS);
				setState(118);
				type(0);
				setState(119);
				match(BIGGER);
				}
				break;
			case 3:
				{
				setState(121);
				match(LSQUARE);
				setState(122);
				type(0);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					type(0);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(RSQUARE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(134);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(135);
					match(LSQUARE);
					setState(136);
					match(RSQUARE);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessMoidifersContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public AccessMoidifersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessMoidifers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterAccessMoidifers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitAccessMoidifers(this);
		}
	}

	public final AccessMoidifersContext accessMoidifers() throws RecognitionException {
		AccessMoidifersContext _localctx = new AccessMoidifersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accessMoidifers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(KEYWORDS);
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
	public static class DirectiveElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(TypeScriptParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(TypeScriptParser.TAG_OPEN, i);
		}
		public List<TerminalNode> BIGGER() { return getTokens(TypeScriptParser.BIGGER); }
		public TerminalNode BIGGER(int i) {
			return getToken(TypeScriptParser.BIGGER, i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(TypeScriptParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(TypeScriptParser.TAG_CLOSE, i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public List<TemplateBindingContext> templateBinding() {
			return getRuleContexts(TemplateBindingContext.class);
		}
		public TemplateBindingContext templateBinding(int i) {
			return getRuleContext(TemplateBindingContext.class,i);
		}
		public List<DirectiveElementContext> directiveElement() {
			return getRuleContexts(DirectiveElementContext.class);
		}
		public DirectiveElementContext directiveElement(int i) {
			return getRuleContext(DirectiveElementContext.class,i);
		}
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
		public DirectiveElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterDirectiveElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitDirectiveElement(this);
		}
	}

	public final DirectiveElementContext directiveElement() throws RecognitionException {
		DirectiveElementContext _localctx = new DirectiveElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directiveElement);
		int _la;
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(TAG_OPEN);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4563403784L) != 0)) {
					{
					{
					setState(145);
					directive();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(BIGGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(TAG_OPEN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4563403784L) != 0)) {
					{
					{
					setState(153);
					directive();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(BIGGER);
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						match(TAG_OPEN);
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4563403784L) != 0)) {
							{
							{
							setState(161);
							directive();
							}
							}
							setState(166);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(167);
						match(BIGGER);
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16648L) != 0)) {
					{
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(173);
						htmlContent();
						}
						break;
					case BINDING_START:
						{
						setState(174);
						templateBinding();
						}
						break;
					case TAG_OPEN:
						{
						setState(175);
						directiveElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(181);
					match(DOT);
					}
				}

				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(184);
						match(TAG_CLOSE);
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(190);
				match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TerminalNode DIRECTIVE() { return getToken(TypeScriptParser.DIRECTIVE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_directive);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==DIRECTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				match(ASSIGN);
				setState(195);
				match(STRING);
				}
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(196);
				match(LSQUARE);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENB) {
					{
					setState(197);
					match(OPENB);
					}
				}

				setState(200);
				match(IDENTIFIER);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSEB) {
					{
					setState(201);
					match(CLOSEB);
					}
				}

				setState(204);
				match(RSQUARE);
				setState(205);
				match(ASSIGN);
				setState(206);
				match(STRING);
				}
				}
				break;
			case OPENB:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(207);
				match(OPENB);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(208);
					match(LSQUARE);
					}
				}

				setState(211);
				match(IDENTIFIER);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RSQUARE) {
					{
					setState(212);
					match(RSQUARE);
					}
				}

				setState(215);
				match(CLOSEB);
				setState(216);
				match(ASSIGN);
				setState(217);
				match(STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlContent(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			match(IDENTIFIER);
			}
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					match(IDENTIFIER);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(227);
				match(COLON);
				}
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
	public static class TemplateBindingContext extends ParserRuleContext {
		public TerminalNode BINDING_START() { return getToken(TypeScriptParser.BINDING_START, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BINDING_END() { return getToken(TypeScriptParser.BINDING_END, 0); }
		public TemplateBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTemplateBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTemplateBinding(this);
		}
	}

	public final TemplateBindingContext templateBinding() throws RecognitionException {
		TemplateBindingContext _localctx = new TemplateBindingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_templateBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(BINDING_START);
			setState(231);
			expression(0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967516L) != 0)) {
				{
				{
				setState(232);
				expression(0);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(BINDING_END);
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
	public static class TupleLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public TupleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTupleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTupleLiteral(this);
		}
	}

	public final TupleLiteralContext tupleLiteral() throws RecognitionException {
		TupleLiteralContext _localctx = new TupleLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tupleLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(LSQUARE);
			setState(241);
			expression(0);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				expression(0);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(RSQUARE);
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
	public static class EnumLiteralContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(TypeScriptParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(TypeScriptParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitEnumLiteral(this);
		}
	}

	public final EnumLiteralContext enumLiteral() throws RecognitionException {
		EnumLiteralContext _localctx = new EnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(KEYWORDS);
			setState(252);
			match(IDENTIFIER);
			setState(253);
			match(LBRACE);
			setState(254);
			match(IDENTIFIER);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				match(IDENTIFIER);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(257);
					match(ASSIGN);
					setState(258);
					expression(0);
					}
				}

				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(RBRACE);
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
	public static class EnumAccessContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
		public EnumAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterEnumAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitEnumAccess(this);
		}
	}

	public final EnumAccessContext enumAccess() throws RecognitionException {
		EnumAccessContext _localctx = new EnumAccessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(KEYWORDS);
			setState(269);
			match(IDENTIFIER);
			setState(270);
			match(COLON);
			setState(271);
			match(IDENTIFIER);
			setState(272);
			match(ASSIGN);
			setState(273);
			match(IDENTIFIER);
			setState(274);
			match(DOT);
			setState(275);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public AccessMoidifersContext accessMoidifers() {
			return getRuleContext(AccessMoidifersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TupleLiteralContext tupleLiteral() {
			return getRuleContext(TupleLiteralContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(277);
					accessMoidifers();
					}
					break;
				}
				{
				setState(280);
				match(KEYWORDS);
				}
				setState(281);
				match(IDENTIFIER);
				setState(282);
				match(COLON);
				setState(283);
				type(0);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(284);
					match(ASSIGN);
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(285);
						expression(0);
						}
						break;
					case 2:
						{
						setState(286);
						tupleLiteral();
						}
						break;
					}
					}
				}

				setState(291);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORDS) {
					{
					setState(293);
					accessMoidifers();
					}
				}

				setState(296);
				match(IDENTIFIER);
				setState(297);
				match(COLON);
				setState(298);
				type(0);
				setState(299);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORDS) {
					{
					setState(301);
					accessMoidifers();
					}
				}

				setState(304);
				match(IDENTIFIER);
				setState(305);
				match(COLON);
				setState(306);
				type(0);
				setState(307);
				match(ASSIGN);
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(308);
					expression(0);
					}
					break;
				case 2:
					{
					setState(309);
					tupleLiteral();
					}
					break;
				}
				setState(312);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(KEYWORDS);
				setState(315);
				match(IDENTIFIER);
				setState(316);
				match(COLON);
				setState(317);
				match(ASSIGN);
				setState(318);
				expression(0);
				setState(319);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public List<ObjectLiteralContext> objectLiteral() {
			return getRuleContexts(ObjectLiteralContext.class);
		}
		public ObjectLiteralContext objectLiteral(int i) {
			return getRuleContext(ObjectLiteralContext.class,i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(LSQUARE);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967516L) != 0)) {
					{
					setState(324);
					expression(0);
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(325);
						match(COMMA);
						setState(326);
						expression(0);
						}
						}
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(334);
				match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(LSQUARE);
				setState(336);
				objectLiteral();
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(COMMA);
						setState(338);
						objectLiteral();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(344);
					match(COMMA);
					}
				}

				setState(347);
				match(RSQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LBRACE);
			setState(352);
			propertyAssignment();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				setState(354);
				propertyAssignment();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(RBRACE);
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
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitPropertyAssignment(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(IDENTIFIER);
			setState(363);
			match(COLON);
			setState(364);
			expression(0);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AccessMoidifersContext accessMoidifers() {
			return getRuleContext(AccessMoidifersContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDeclaration);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(366);
					accessMoidifers();
					}
					break;
				}
				setState(369);
				match(KEYWORDS);
				setState(370);
				match(IDENTIFIER);
				setState(371);
				match(OPENB);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(372);
					parameter();
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(373);
						match(COMMA);
						setState(374);
						parameter();
						}
						}
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(382);
				match(CLOSEB);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(383);
					match(COLON);
					}
				}

				setState(388);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPES:
				case LSQUARE:
					{
					setState(386);
					type(0);
					}
					break;
				case KEYWORDS:
					{
					setState(387);
					match(KEYWORDS);
					}
					break;
				case LBRACE:
					break;
				default:
					break;
				}
				setState(390);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(391);
					accessMoidifers();
					}
					break;
				}
				setState(394);
				match(KEYWORDS);
				setState(395);
				match(IDENTIFIER);
				setState(396);
				match(ASSIGN);
				setState(397);
				match(KEYWORDS);
				setState(398);
				match(OPENB);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(399);
					match(IDENTIFIER);
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(400);
						match(COMMA);
						setState(401);
						match(IDENTIFIER);
						}
						}
						setState(406);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(409);
				match(CLOSEB);
				setState(410);
				match(COLON);
				setState(413);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPES:
				case LSQUARE:
					{
					setState(411);
					type(0);
					}
					break;
				case KEYWORDS:
					{
					setState(412);
					match(KEYWORDS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415);
				match(LBRACE);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294984156L) != 0)) {
					{
					{
					setState(416);
					statement();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422);
				match(RBRACE);
				setState(423);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatmentContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public ReturnStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterReturnStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitReturnStatment(this);
		}
	}

	public final ReturnStatmentContext returnStatment() throws RecognitionException {
		ReturnStatmentContext _localctx = new ReturnStatmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(KEYWORDS);
			setState(427);
			expression(0);
			setState(428);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(IDENTIFIER);
			setState(431);
			match(COLON);
			setState(432);
			type(0);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(LBRACE);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294984156L) != 0)) {
				{
				{
				setState(435);
				statement();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(RBRACE);
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
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(KEYWORDS);
			setState(444);
			match(OPENB);
			setState(445);
			expression(0);
			setState(446);
			match(CLOSEB);
			setState(447);
			block();
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(448);
				match(KEYWORDS);
				setState(449);
				block();
				}
				break;
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public List<ThisAssignmentContext> thisAssignment() {
			return getRuleContexts(ThisAssignmentContext.class);
		}
		public ThisAssignmentContext thisAssignment(int i) {
			return getRuleContext(ThisAssignmentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(453);
			match(OPENB);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS || _la==IDENTIFIER) {
				{
				setState(454);
				parameterList();
				}
			}

			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457);
				match(COMMA);
				setState(458);
				parameterList();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(CLOSEB);
			setState(465);
			match(LBRACE);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294984156L) != 0)) {
				{
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(466);
					thisAssignment();
					}
					break;
				case 2:
					{
					setState(467);
					statement();
					}
					break;
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
			match(RBRACE);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AccessMoidifersContext accessMoidifers() {
			return getRuleContext(AccessMoidifersContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(475);
				accessMoidifers();
				}
			}

			setState(478);
			match(IDENTIFIER);
			setState(479);
			match(COLON);
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPES:
			case LSQUARE:
				{
				setState(480);
				type(0);
				}
				break;
			case IDENTIFIER:
				{
				setState(481);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ThisAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TypeScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScriptParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public ThisAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterThisAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitThisAssignment(this);
		}
	}

	public final ThisAssignmentContext thisAssignment() throws RecognitionException {
		ThisAssignmentContext _localctx = new ThisAssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_thisAssignment);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(KEYWORDS);
				setState(485);
				match(DOT);
				setState(486);
				match(IDENTIFIER);
				setState(487);
				match(ASSIGN);
				setState(488);
				match(IDENTIFIER);
				setState(489);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(491);
				operator();
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				match(ASSIGN);
				setState(494);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(495);
				operator();
				setState(496);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(497);
					match(DOT);
					setState(498);
					_la = _input.LA(1);
					if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENB) {
					{
					setState(504);
					match(OPENB);
					}
				}

				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSEB) {
					{
					setState(507);
					match(CLOSEB);
					}
				}

				setState(510);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(KEYWORDS);
			setState(515);
			match(KEYWORDS);
			setState(516);
			match(IDENTIFIER);
			setState(517);
			match(LBRACE);
			setState(518);
			interfaceBody();
			setState(519);
			match(RBRACE);
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
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(TypeScriptParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TypeScriptParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TypeScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TypeScriptParser.SEMICOLON, i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(521);
				match(IDENTIFIER);
				setState(522);
				match(COLON);
				setState(523);
				type(0);
				setState(524);
				match(SEMICOLON);
				}
				}
				setState(530);
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
	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public ForBrackContext forBrack() {
			return getRuleContext(ForBrackContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(KEYWORDS);
			setState(532);
			match(OPENB);
			setState(533);
			forBrack();
			setState(534);
			match(CLOSEB);
			setState(535);
			block();
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
	public static class ForBrackContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(TypeScriptParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(TypeScriptParser.ASSIGN, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(TypeScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(TypeScriptParser.NUMBER, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TypeScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TypeScriptParser.SEMICOLON, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LESS() { return getToken(TypeScriptParser.LESS, 0); }
		public TerminalNode BIGGER() { return getToken(TypeScriptParser.BIGGER, 0); }
		public ForBrackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBrack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterForBrack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitForBrack(this);
		}
	}

	public final ForBrackContext forBrack() throws RecognitionException {
		ForBrackContext _localctx = new ForBrackContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forBrack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(537);
			match(KEYWORDS);
			setState(538);
			match(IDENTIFIER);
			setState(539);
			match(ASSIGN);
			setState(540);
			match(NUMBER);
			setState(541);
			match(SEMICOLON);
			setState(542);
			match(IDENTIFIER);
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				{
				setState(543);
				match(LESS);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(544);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				{
				setState(547);
				match(BIGGER);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(548);
					match(ASSIGN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(553);
			match(NUMBER);
			setState(554);
			match(SEMICOLON);
			setState(555);
			statement();
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
	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(KEYWORDS);
			setState(558);
			match(OPENB);
			setState(559);
			expression(0);
			setState(560);
			match(CLOSEB);
			setState(561);
			block();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(KEYWORDS);
			setState(564);
			importClause();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(565);
				match(KEYWORDS);
				setState(566);
				match(STRING);
				}
			}

			setState(569);
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
	public static class ImportClauseContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportClause(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_importClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(571);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				{
				setState(572);
				match(LBRACE);
				setState(573);
				importSpecifier();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(574);
					match(COMMA);
					setState(575);
					importSpecifier();
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportSpecifier(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_importSpecifier);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(IDENTIFIER);
				}
				break;
			case KEYWORDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(KEYWORDS);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORDS) {
					{
					setState(587);
					match(KEYWORDS);
					setState(588);
					_la = _input.LA(1);
					if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExportStatementContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public List<ExportSpecifierContext> exportSpecifier() {
			return getRuleContexts(ExportSpecifierContext.class);
		}
		public ExportSpecifierContext exportSpecifier(int i) {
			return getRuleContext(ExportSpecifierContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitExportStatement(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(KEYWORDS);
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case LSQUARE:
				{
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(594);
					match(KEYWORDS);
					}
					break;
				}
				setState(597);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(598);
				match(LBRACE);
				setState(599);
				exportSpecifier();
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(600);
					match(COMMA);
					setState(601);
					exportSpecifier();
					}
					}
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(607);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(611);
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
	public static class ExportSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public ExportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterExportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitExportSpecifier(this);
		}
	}

	public final ExportSpecifierContext exportSpecifier() throws RecognitionException {
		ExportSpecifierContext _localctx = new ExportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exportSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(IDENTIFIER);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(614);
				match(KEYWORDS);
				setState(615);
				match(IDENTIFIER);
				}
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
	public static class DecoratorContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public DecoratorBodyContext decoratorBody() {
			return getRuleContext(DecoratorBodyContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitDecorator(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(KEYWORDS);
			setState(619);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(620);
			match(OPENB);
			setState(621);
			decoratorBody();
			setState(622);
			match(CLOSEB);
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
	public static class DecoratorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public List<DecoratorPropertyContext> decoratorProperty() {
			return getRuleContexts(DecoratorPropertyContext.class);
		}
		public DecoratorPropertyContext decoratorProperty(int i) {
			return getRuleContext(DecoratorPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public DecoratorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterDecoratorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitDecoratorBody(this);
		}
	}

	public final DecoratorBodyContext decoratorBody() throws RecognitionException {
		DecoratorBodyContext _localctx = new DecoratorBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_decoratorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(LBRACE);
			setState(625);
			decoratorProperty();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(626);
				match(COMMA);
				setState(627);
				decoratorProperty();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
			match(RBRACE);
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
	public static class DecoratorPropertyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(TypeScriptParser.NUMBER, 0); }
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public DecoratorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterDecoratorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitDecoratorProperty(this);
		}
	}

	public final DecoratorPropertyContext decoratorProperty() throws RecognitionException {
		DecoratorPropertyContext _localctx = new DecoratorPropertyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_decoratorProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(IDENTIFIER);
			setState(636);
			match(COLON);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(637);
				match(LSQUARE);
				}
			}

			setState(640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 88L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(641);
					match(COMMA);
					setState(642);
					match(IDENTIFIER);
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RSQUARE) {
				{
				setState(648);
				match(RSQUARE);
				}
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(651);
					decorator();
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(657);
				match(KEYWORDS);
				}
				break;
			}
			setState(660);
			match(KEYWORDS);
			setState(661);
			match(IDENTIFIER);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(663);
				match(IDENTIFIER);
				}
			}

			setState(666);
			match(LBRACE);
			setState(667);
			classBody();
			setState(668);
			match(RBRACE);
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
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORDS || _la==IDENTIFIER) {
				{
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(670);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(671);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(672);
					constructorDeclaration();
					}
					break;
				}
				}
				setState(677);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CpopContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TypeScriptParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TypeScriptParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(TypeScriptParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TypeScriptParser.AND, i);
		}
		public List<TerminalNode> SHEE() { return getTokens(TypeScriptParser.SHEE); }
		public TerminalNode SHEE(int i) {
			return getToken(TypeScriptParser.SHEE, i);
		}
		public CpopContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterCpop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitCpop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStringExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(TypeScriptParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitNumberExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDecContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayDecContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrayDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrayDec(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ExpressionContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ForContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitFor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarContext extends ExpressionContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterVariableDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitVariableDeclar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceContext extends ExpressionContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitInterface(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(TypeScriptParser.BOOLEAN, 0); }
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBooleanExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumAcContext extends ExpressionContext {
		public EnumAccessContext enumAccess() {
			return getRuleContext(EnumAccessContext.class,0);
		}
		public EnumAcContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterEnumAc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitEnumAc(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompristionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TypeScriptParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TypeScriptParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(TypeScriptParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TypeScriptParser.AND, i);
		}
		public List<TerminalNode> SHEE() { return getTokens(TypeScriptParser.SHEE); }
		public TerminalNode SHEE(int i) {
			return getToken(TypeScriptParser.SHEE, i);
		}
		public CompristionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterCompristion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitCompristion(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(679);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(680);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(681);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new VariableDeclarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(682);
				variableDeclaration();
				}
				break;
			case 5:
				{
				_localctx = new ArrayDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(683);
				arrayLiteral();
				}
				break;
			case 6:
				{
				_localctx = new EnumAcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(684);
				enumAccess();
				}
				break;
			case 7:
				{
				_localctx = new InterfaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(685);
				interfaceDeclaration();
				}
				break;
			case 8:
				{
				_localctx = new ForContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(686);
					forloop();
					}
					break;
				case 2:
					{
					setState(687);
					whileloop();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(732);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new CompristionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(692);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(693);
						operator();
						setState(694);
						expression(0);
						setState(707);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(698);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
									{
									{
									setState(695);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									}
									}
									setState(700);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(701);
								expression(0);
								setState(702);
								operator();
								setState(703);
								expression(0);
								}
								} 
							}
							setState(709);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						}
						}
						break;
					case 2:
						{
						_localctx = new CpopContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(714);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
							{
							{
							setState(711);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(716);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(717);
						expression(0);
						setState(729);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(718);
								expression(0);
								setState(722);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
									{
									{
									setState(719);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									}
									}
									setState(724);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(725);
								expression(0);
								}
								} 
							}
							setState(731);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 39:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u02e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003~\b\u0003\n\u0003\f\u0003\u0081\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0085\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u008a\b\u0003\n\u0003\f\u0003\u008d\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u0093\b\u0005\n"+
		"\u0005\f\u0005\u0096\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u009b\b\u0005\n\u0005\f\u0005\u009e\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00a3\b\u0005\n\u0005\f\u0005\u00a6\t\u0005\u0001"+
		"\u0005\u0005\u0005\u00a9\b\u0005\n\u0005\f\u0005\u00ac\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00b1\b\u0005\n\u0005\f\u0005\u00b4"+
		"\t\u0005\u0001\u0005\u0003\u0005\u00b7\b\u0005\u0001\u0005\u0005\u0005"+
		"\u00ba\b\u0005\n\u0005\f\u0005\u00bd\t\u0005\u0001\u0005\u0003\u0005\u00c0"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00c7\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cb\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00d2\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d6\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00db\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00df\b\u0007\n\u0007\f\u0007\u00e2\t\u0007\u0001\u0007"+
		"\u0003\u0007\u00e5\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00ea\b\b\n"+
		"\b\f\b\u00ed\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00f5\b\t\n\t\f\t\u00f8\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0104\b\n\u0005\n\u0106"+
		"\b\n\n\n\f\n\u0109\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0003\f\u0117\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0120\b\f\u0003\f\u0122\b\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0127\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u012f\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0137"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0142\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0148\b\r"+
		"\n\r\f\r\u014b\t\r\u0003\r\u014d\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0154\b\r\n\r\f\r\u0157\t\r\u0001\r\u0003\r\u015a\b\r\u0001"+
		"\r\u0001\r\u0003\r\u015e\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0164\b\u000e\n\u000e\f\u000e\u0167\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0003\u0010\u0170\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0178\b\u0010\n\u0010\f\u0010\u017b"+
		"\t\u0010\u0003\u0010\u017d\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0181\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0185\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0189\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0193\b\u0010\n\u0010\f\u0010\u0196\t\u0010\u0003\u0010\u0198\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u019e"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01a2\b\u0010\n\u0010\f\u0010"+
		"\u01a5\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01a9\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u01b5\b\u0013\n"+
		"\u0013\f\u0013\u01b8\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u01c3\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01c8"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01cc\b\u0015\n\u0015\f\u0015"+
		"\u01cf\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u01d5\b\u0015\n\u0015\f\u0015\u01d8\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0003\u0016\u01dd\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01e3\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u01f4\b\u0017\n\u0017\f\u0017\u01f7\t\u0017\u0001\u0017\u0003\u0017"+
		"\u01fa\b\u0017\u0001\u0017\u0003\u0017\u01fd\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0201\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u020f\b\u0019\n\u0019\f\u0019"+
		"\u0212\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0222\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0226\b\u001b\u0003\u001b\u0228\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0238\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0241"+
		"\b\u001e\n\u001e\f\u001e\u0244\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0248\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u024e\b\u001f\u0003\u001f\u0250\b\u001f\u0001 \u0001 \u0003 \u0254\b"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u025b\b \n \f \u025e\t \u0001"+
		" \u0001 \u0003 \u0262\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0269"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0005#\u0275\b#\n#\f#\u0278\t#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0003$\u027f\b$\u0001$\u0001$\u0001$\u0005$\u0284\b$\n$\f$\u0287\t$"+
		"\u0001$\u0003$\u028a\b$\u0001%\u0005%\u028d\b%\n%\f%\u0290\t%\u0001%\u0003"+
		"%\u0293\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u0299\b%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0005&\u02a2\b&\n&\f&\u02a5\t&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u02b1\b\'\u0003\'\u02b3\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'"+
		"\u02b9\b\'\n\'\f\'\u02bc\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u02c2"+
		"\b\'\n\'\f\'\u02c5\t\'\u0001\'\u0001\'\u0005\'\u02c9\b\'\n\'\f\'\u02cc"+
		"\t\'\u0001\'\u0001\'\u0001\'\u0005\'\u02d1\b\'\n\'\f\'\u02d4\t\'\u0001"+
		"\'\u0001\'\u0005\'\u02d8\b\'\n\'\f\'\u02db\t\'\u0005\'\u02dd\b\'\n\'\f"+
		"\'\u02e0\t\'\u0001\'\u0000\u0002\u0006N(\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLN\u0000\u0005\u0002\u0000\u0003\u0003\n\n\u0001\u0000\u0002\u0003"+
		"\u0002\u0000\u0003\u0004\u0006\u0006\u0001\u0000\u0002\u0002\u0001\u0000"+
		"\"$\u0333\u0000S\u0001\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000"+
		"\u0004p\u0001\u0000\u0000\u0000\u0006\u0084\u0001\u0000\u0000\u0000\b"+
		"\u008e\u0001\u0000\u0000\u0000\n\u00bf\u0001\u0000\u0000\u0000\f\u00da"+
		"\u0001\u0000\u0000\u0000\u000e\u00dc\u0001\u0000\u0000\u0000\u0010\u00e6"+
		"\u0001\u0000\u0000\u0000\u0012\u00f0\u0001\u0000\u0000\u0000\u0014\u00fb"+
		"\u0001\u0000\u0000\u0000\u0016\u010c\u0001\u0000\u0000\u0000\u0018\u0141"+
		"\u0001\u0000\u0000\u0000\u001a\u015d\u0001\u0000\u0000\u0000\u001c\u015f"+
		"\u0001\u0000\u0000\u0000\u001e\u016a\u0001\u0000\u0000\u0000 \u01a8\u0001"+
		"\u0000\u0000\u0000\"\u01aa\u0001\u0000\u0000\u0000$\u01ae\u0001\u0000"+
		"\u0000\u0000&\u01b2\u0001\u0000\u0000\u0000(\u01bb\u0001\u0000\u0000\u0000"+
		"*\u01c4\u0001\u0000\u0000\u0000,\u01dc\u0001\u0000\u0000\u0000.\u0200"+
		"\u0001\u0000\u0000\u00000\u0202\u0001\u0000\u0000\u00002\u0210\u0001\u0000"+
		"\u0000\u00004\u0213\u0001\u0000\u0000\u00006\u0219\u0001\u0000\u0000\u0000"+
		"8\u022d\u0001\u0000\u0000\u0000:\u0233\u0001\u0000\u0000\u0000<\u0247"+
		"\u0001\u0000\u0000\u0000>\u024f\u0001\u0000\u0000\u0000@\u0251\u0001\u0000"+
		"\u0000\u0000B\u0265\u0001\u0000\u0000\u0000D\u026a\u0001\u0000\u0000\u0000"+
		"F\u0270\u0001\u0000\u0000\u0000H\u027b\u0001\u0000\u0000\u0000J\u028e"+
		"\u0001\u0000\u0000\u0000L\u02a3\u0001\u0000\u0000\u0000N\u02b2\u0001\u0000"+
		"\u0000\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T\u0001\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000Va\u0003D\"\u0000"+
		"Wa\u0003(\u0014\u0000Xa\u0003N\'\u0000Ya\u0003\u0014\n\u0000Za\u0003\u0010"+
		"\b\u0000[a\u0003\n\u0005\u0000\\a\u0003:\u001d\u0000]a\u0003@ \u0000^"+
		"a\u0003 \u0010\u0000_a\u0003J%\u0000`V\u0001\u0000\u0000\u0000`W\u0001"+
		"\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`Y\u0001\u0000\u0000\u0000"+
		"`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000a\u0003\u0001\u0000\u0000\u0000bq\u0005\u0010\u0000\u0000"+
		"cq\u0005\u0013\u0000\u0000dq\u0005\u0011\u0000\u0000eg\u0005\u0016\u0000"+
		"\u0000fh\u0005\u0015\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hq\u0001\u0000\u0000\u0000ik\u0005\u0017\u0000\u0000jl\u0005"+
		"\u0015\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lq\u0001\u0000\u0000\u0000mq\u0005\u0015\u0000\u0000nq\u0005\u001b\u0000"+
		"\u0000oq\u0005\u0012\u0000\u0000pb\u0001\u0000\u0000\u0000pc\u0001\u0000"+
		"\u0000\u0000pd\u0001\u0000\u0000\u0000pe\u0001\u0000\u0000\u0000pi\u0001"+
		"\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000q\u0005\u0001\u0000\u0000\u0000rs\u0006\u0003"+
		"\uffff\uffff\u0000s\u0085\u0005\u0001\u0000\u0000tu\u0005\u0001\u0000"+
		"\u0000uv\u0005\u0016\u0000\u0000vw\u0003\u0006\u0003\u0000wx\u0005\u0017"+
		"\u0000\u0000x\u0085\u0001\u0000\u0000\u0000yz\u0005 \u0000\u0000z\u007f"+
		"\u0003\u0006\u0003\u0000{|\u0005\u0019\u0000\u0000|~\u0003\u0006\u0003"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005!\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084r\u0001\u0000"+
		"\u0000\u0000\u0084t\u0001\u0000\u0000\u0000\u0084y\u0001\u0000\u0000\u0000"+
		"\u0085\u008b\u0001\u0000\u0000\u0000\u0086\u0087\n\u0003\u0000\u0000\u0087"+
		"\u0088\u0005 \u0000\u0000\u0088\u008a\u0005!\u0000\u0000\u0089\u0086\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0007\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u0002\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090\u0094\u0005\u000e"+
		"\u0000\u0000\u0091\u0093\u0003\f\u0006\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u00c0\u0005\u0017\u0000"+
		"\u0000\u0098\u009c\u0005\u000e\u0000\u0000\u0099\u009b\u0003\f\u0006\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00aa\u0005\u0017\u0000\u0000\u00a0\u00a4\u0005\u000e\u0000\u0000"+
		"\u00a1\u00a3\u0003\f\u0006\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\u0017\u0000\u0000\u00a8"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00b2\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b1\u0003\u000e\u0007\u0000\u00ae\u00b1\u0003\u0010\b\u0000\u00af\u00b1"+
		"\u0003\n\u0005\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b7\u0005\u001b\u0000\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b8\u00ba\u0005\u000f\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c0\u0005"+
		"\u000f\u0000\u0000\u00bf\u0090\u0001\u0000\u0000\u0000\u00bf\u0098\u0001"+
		"\u0000\u0000\u0000\u00c0\u000b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0007"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005\u0015\u0000\u0000\u00c3\u00db\u0005"+
		"\u0006\u0000\u0000\u00c4\u00c6\u0005 \u0000\u0000\u00c5\u00c7\u0005\u001c"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u0003"+
		"\u0000\u0000\u00c9\u00cb\u0005\u001d\u0000\u0000\u00ca\u00c9\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005!\u0000\u0000\u00cd\u00ce\u0005\u0015\u0000"+
		"\u0000\u00ce\u00db\u0005\u0006\u0000\u0000\u00cf\u00d1\u0005\u001c\u0000"+
		"\u0000\u00d0\u00d2\u0005 \u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0005\u0003\u0000\u0000\u00d4\u00d6\u0005!\u0000\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u001d\u0000\u0000\u00d8"+
		"\u00d9\u0005\u0015\u0000\u0000\u00d9\u00db\u0005\u0006\u0000\u0000\u00da"+
		"\u00c1\u0001\u0000\u0000\u0000\u00da\u00c4\u0001\u0000\u0000\u0000\u00da"+
		"\u00cf\u0001\u0000\u0000\u0000\u00db\r\u0001\u0000\u0000\u0000\u00dc\u00e0"+
		"\u0005\u0003\u0000\u0000\u00dd\u00df\u0005\u0003\u0000\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0005\u001a\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u000f\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005\b\u0000\u0000\u00e7\u00eb\u0003N\'\u0000\u00e8\u00ea\u0003N\'\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0005\t\u0000\u0000\u00ef\u0011\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005 \u0000\u0000\u00f1\u00f6\u0003N\'\u0000\u00f2\u00f3\u0005"+
		"\u0019\u0000\u0000\u00f3\u00f5\u0003N\'\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005!\u0000"+
		"\u0000\u00fa\u0013\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0002\u0000"+
		"\u0000\u00fc\u00fd\u0005\u0003\u0000\u0000\u00fd\u00fe\u0005\u001e\u0000"+
		"\u0000\u00fe\u0107\u0005\u0003\u0000\u0000\u00ff\u0100\u0005\u0019\u0000"+
		"\u0000\u0100\u0103\u0005\u0003\u0000\u0000\u0101\u0102\u0005\u0015\u0000"+
		"\u0000\u0102\u0104\u0003N\'\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000"+
		"\u0105\u00ff\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005\u001f\u0000\u0000\u010b\u0015\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005\u0002\u0000\u0000\u010d\u010e\u0005\u0003\u0000\u0000"+
		"\u010e\u010f\u0005\u001a\u0000\u0000\u010f\u0110\u0005\u0003\u0000\u0000"+
		"\u0110\u0111\u0005\u0015\u0000\u0000\u0111\u0112\u0005\u0003\u0000\u0000"+
		"\u0112\u0113\u0005\u001b\u0000\u0000\u0113\u0114\u0005\u0003\u0000\u0000"+
		"\u0114\u0017\u0001\u0000\u0000\u0000\u0115\u0117\u0003\b\u0004\u0000\u0116"+
		"\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0002\u0000\u0000\u0119"+
		"\u011a\u0005\u0003\u0000\u0000\u011a\u011b\u0005\u001a\u0000\u0000\u011b"+
		"\u0121\u0003\u0006\u0003\u0000\u011c\u011f\u0005\u0015\u0000\u0000\u011d"+
		"\u0120\u0003N\'\u0000\u011e\u0120\u0003\u0012\t\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0005"+
		"\u0018\u0000\u0000\u0124\u0142\u0001\u0000\u0000\u0000\u0125\u0127\u0003"+
		"\b\u0004\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0003"+
		"\u0000\u0000\u0129\u012a\u0005\u001a\u0000\u0000\u012a\u012b\u0003\u0006"+
		"\u0003\u0000\u012b\u012c\u0005\u0018\u0000\u0000\u012c\u0142\u0001\u0000"+
		"\u0000\u0000\u012d\u012f\u0003\b\u0004\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005\u0003\u0000\u0000\u0131\u0132\u0005\u001a\u0000"+
		"\u0000\u0132\u0133\u0003\u0006\u0003\u0000\u0133\u0136\u0005\u0015\u0000"+
		"\u0000\u0134\u0137\u0003N\'\u0000\u0135\u0137\u0003\u0012\t\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0018\u0000\u0000\u0139"+
		"\u0142\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0002\u0000\u0000\u013b"+
		"\u013c\u0005\u0003\u0000\u0000\u013c\u013d\u0005\u001a\u0000\u0000\u013d"+
		"\u013e\u0005\u0015\u0000\u0000\u013e\u013f\u0003N\'\u0000\u013f\u0140"+
		"\u0005\u0018\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0116"+
		"\u0001\u0000\u0000\u0000\u0141\u0126\u0001\u0000\u0000\u0000\u0141\u012e"+
		"\u0001\u0000\u0000\u0000\u0141\u013a\u0001\u0000\u0000\u0000\u0142\u0019"+
		"\u0001\u0000\u0000\u0000\u0143\u014c\u0005 \u0000\u0000\u0144\u0149\u0003"+
		"N\'\u0000\u0145\u0146\u0005\u0019\u0000\u0000\u0146\u0148\u0003N\'\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014c\u0144\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u015e\u0005!\u0000\u0000\u014f"+
		"\u0150\u0005 \u0000\u0000\u0150\u0155\u0003\u001c\u000e\u0000\u0151\u0152"+
		"\u0005\u0019\u0000\u0000\u0152\u0154\u0003\u001c\u000e\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0159"+
		"\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015a"+
		"\u0005\u0019\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005!\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u0143\u0001"+
		"\u0000\u0000\u0000\u015d\u014f\u0001\u0000\u0000\u0000\u015e\u001b\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005\u001e\u0000\u0000\u0160\u0165\u0003"+
		"\u001e\u000f\u0000\u0161\u0162\u0005\u0019\u0000\u0000\u0162\u0164\u0003"+
		"\u001e\u000f\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0167\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0005\u001f\u0000\u0000\u0169\u001d\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005\u0003\u0000\u0000\u016b\u016c\u0005"+
		"\u001a\u0000\u0000\u016c\u016d\u0003N\'\u0000\u016d\u001f\u0001\u0000"+
		"\u0000\u0000\u016e\u0170\u0003\b\u0004\u0000\u016f\u016e\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0005\u0002\u0000\u0000\u0172\u0173\u0005\u0003\u0000"+
		"\u0000\u0173\u017c\u0005\u001c\u0000\u0000\u0174\u0179\u0003$\u0012\u0000"+
		"\u0175\u0176\u0005\u0019\u0000\u0000\u0176\u0178\u0003$\u0012\u0000\u0177"+
		"\u0175\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"+
		"\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c"+
		"\u0174\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0005\u001d\u0000\u0000\u017f"+
		"\u0181\u0005\u001a\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182"+
		"\u0185\u0003\u0006\u0003\u0000\u0183\u0185\u0005\u0002\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u01a9\u0003&\u0013\u0000\u0187\u0189\u0003\b\u0004\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u0002\u0000\u0000\u018b\u018c"+
		"\u0005\u0003\u0000\u0000\u018c\u018d\u0005\u0015\u0000\u0000\u018d\u018e"+
		"\u0005\u0002\u0000\u0000\u018e\u0197\u0005\u001c\u0000\u0000\u018f\u0194"+
		"\u0005\u0003\u0000\u0000\u0190\u0191\u0005\u0019\u0000\u0000\u0191\u0193"+
		"\u0005\u0003\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0196"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u018f\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0005\u001d\u0000\u0000\u019a\u019d\u0005\u001a\u0000\u0000\u019b\u019e"+
		"\u0003\u0006\u0003\u0000\u019c\u019e\u0005\u0002\u0000\u0000\u019d\u019b"+
		"\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a3\u0005\u001e\u0000\u0000\u01a0\u01a2"+
		"\u0003\u0002\u0001\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u001f\u0000\u0000\u01a7\u01a9"+
		"\u0005\u0018\u0000\u0000\u01a8\u016f\u0001\u0000\u0000\u0000\u01a8\u0188"+
		"\u0001\u0000\u0000\u0000\u01a9!\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005"+
		"\u0002\u0000\u0000\u01ab\u01ac\u0003N\'\u0000\u01ac\u01ad\u0005\u0018"+
		"\u0000\u0000\u01ad#\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u0003\u0000"+
		"\u0000\u01af\u01b0\u0005\u001a\u0000\u0000\u01b0\u01b1\u0003\u0006\u0003"+
		"\u0000\u01b1%\u0001\u0000\u0000\u0000\u01b2\u01b6\u0005\u001e\u0000\u0000"+
		"\u01b3\u01b5\u0003\u0002\u0001\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\u001f\u0000\u0000"+
		"\u01ba\'\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u0002\u0000\u0000\u01bc"+
		"\u01bd\u0005\u001c\u0000\u0000\u01bd\u01be\u0003N\'\u0000\u01be\u01bf"+
		"\u0005\u001d\u0000\u0000\u01bf\u01c2\u0003&\u0013\u0000\u01c0\u01c1\u0005"+
		"\u0002\u0000\u0000\u01c1\u01c3\u0003&\u0013\u0000\u01c2\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3)\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0007\u0001\u0000\u0000\u01c5\u01c7\u0005\u001c\u0000"+
		"\u0000\u01c6\u01c8\u0003,\u0016\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01cd\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0005\u0019\u0000\u0000\u01ca\u01cc\u0003,\u0016\u0000\u01cb"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0005\u001d\u0000\u0000\u01d1\u01d6\u0005\u001e\u0000\u0000\u01d2"+
		"\u01d5\u0003.\u0017\u0000\u01d3\u01d5\u0003\u0002\u0001\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u001f\u0000\u0000\u01da+\u0001"+
		"\u0000\u0000\u0000\u01db\u01dd\u0003\b\u0004\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005\u0003\u0000\u0000\u01df\u01e2\u0005\u001a"+
		"\u0000\u0000\u01e0\u01e3\u0003\u0006\u0003\u0000\u01e1\u01e3\u0005\u0003"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e3-\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0002\u0000"+
		"\u0000\u01e5\u01e6\u0005\u001b\u0000\u0000\u01e6\u01e7\u0005\u0003\u0000"+
		"\u0000\u01e7\u01e8\u0005\u0015\u0000\u0000\u01e8\u01e9\u0005\u0003\u0000"+
		"\u0000\u01e9\u0201\u0005\u0018\u0000\u0000\u01ea\u01eb\u0007\u0001\u0000"+
		"\u0000\u01eb\u01ec\u0003\u0004\u0002\u0000\u01ec\u01ed\u0007\u0001\u0000"+
		"\u0000\u01ed\u01ee\u0005\u0015\u0000\u0000\u01ee\u01ef\u0007\u0001\u0000"+
		"\u0000\u01ef\u01f0\u0003\u0004\u0002\u0000\u01f0\u01f5\u0007\u0001\u0000"+
		"\u0000\u01f1\u01f2\u0005\u001b\u0000\u0000\u01f2\u01f4\u0007\u0001\u0000"+
		"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fa\u0005\u001c\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fd\u0005\u001d\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0005\u0018\u0000\u0000\u01ff\u0201\u0001\u0000\u0000"+
		"\u0000\u0200\u01e4\u0001\u0000\u0000\u0000\u0200\u01ea\u0001\u0000\u0000"+
		"\u0000\u0201/\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u0002\u0000\u0000"+
		"\u0203\u0204\u0005\u0002\u0000\u0000\u0204\u0205\u0005\u0003\u0000\u0000"+
		"\u0205\u0206\u0005\u001e\u0000\u0000\u0206\u0207\u00032\u0019\u0000\u0207"+
		"\u0208\u0005\u001f\u0000\u0000\u02081\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u0005\u0003\u0000\u0000\u020a\u020b\u0005\u001a\u0000\u0000\u020b\u020c"+
		"\u0003\u0006\u0003\u0000\u020c\u020d\u0005\u0018\u0000\u0000\u020d\u020f"+
		"\u0001\u0000\u0000\u0000\u020e\u0209\u0001\u0000\u0000\u0000\u020f\u0212"+
		"\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u02113\u0001\u0000\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0213\u0214\u0005\u0002\u0000\u0000\u0214\u0215\u0005"+
		"\u001c\u0000\u0000\u0215\u0216\u00036\u001b\u0000\u0216\u0217\u0005\u001d"+
		"\u0000\u0000\u0217\u0218\u0003&\u0013\u0000\u02185\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0005\u0002\u0000\u0000\u021a\u021b\u0005\u0003\u0000\u0000"+
		"\u021b\u021c\u0005\u0015\u0000\u0000\u021c\u021d\u0005\u0004\u0000\u0000"+
		"\u021d\u021e\u0005\u0018\u0000\u0000\u021e\u0227\u0005\u0003\u0000\u0000"+
		"\u021f\u0221\u0005\u0016\u0000\u0000\u0220\u0222\u0005\u0015\u0000\u0000"+
		"\u0221\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0228\u0001\u0000\u0000\u0000\u0223\u0225\u0005\u0017\u0000\u0000"+
		"\u0224\u0226\u0005\u0015\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0228\u0001\u0000\u0000\u0000"+
		"\u0227\u021f\u0001\u0000\u0000\u0000\u0227\u0223\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u0004\u0000\u0000"+
		"\u022a\u022b\u0005\u0018\u0000\u0000\u022b\u022c\u0003\u0002\u0001\u0000"+
		"\u022c7\u0001\u0000\u0000\u0000\u022d\u022e\u0005\u0002\u0000\u0000\u022e"+
		"\u022f\u0005\u001c\u0000\u0000\u022f\u0230\u0003N\'\u0000\u0230\u0231"+
		"\u0005\u001d\u0000\u0000\u0231\u0232\u0003&\u0013\u0000\u02329\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0005\u0002\u0000\u0000\u0234\u0237\u0003<\u001e"+
		"\u0000\u0235\u0236\u0005\u0002\u0000\u0000\u0236\u0238\u0005\u0006\u0000"+
		"\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0005\u0018\u0000"+
		"\u0000\u023a;\u0001\u0000\u0000\u0000\u023b\u0248\u0005\u0003\u0000\u0000"+
		"\u023c\u023d\u0005\u001e\u0000\u0000\u023d\u0242\u0003>\u001f\u0000\u023e"+
		"\u023f\u0005\u0019\u0000\u0000\u023f\u0241\u0003>\u001f\u0000\u0240\u023e"+
		"\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245"+
		"\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0005\u001f\u0000\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u023b"+
		"\u0001\u0000\u0000\u0000\u0247\u023c\u0001\u0000\u0000\u0000\u0248=\u0001"+
		"\u0000\u0000\u0000\u0249\u0250\u0005\u0003\u0000\u0000\u024a\u024d\u0005"+
		"\u0002\u0000\u0000\u024b\u024c\u0005\u0002\u0000\u0000\u024c\u024e\u0007"+
		"\u0001\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u0249\u0001"+
		"\u0000\u0000\u0000\u024f\u024a\u0001\u0000\u0000\u0000\u0250?\u0001\u0000"+
		"\u0000\u0000\u0251\u0261\u0005\u0002\u0000\u0000\u0252\u0254\u0005\u0002"+
		"\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000"+
		"\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0262\u0003N\'"+
		"\u0000\u0256\u0257\u0005\u001e\u0000\u0000\u0257\u025c\u0003B!\u0000\u0258"+
		"\u0259\u0005\u0019\u0000\u0000\u0259\u025b\u0003B!\u0000\u025a\u0258\u0001"+
		"\u0000\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001"+
		"\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025f\u0001"+
		"\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0260\u0005"+
		"\u001f\u0000\u0000\u0260\u0262\u0001\u0000\u0000\u0000\u0261\u0253\u0001"+
		"\u0000\u0000\u0000\u0261\u0256\u0001\u0000\u0000\u0000\u0262\u0263\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0005\u0018\u0000\u0000\u0264A\u0001\u0000"+
		"\u0000\u0000\u0265\u0268\u0005\u0003\u0000\u0000\u0266\u0267\u0005\u0002"+
		"\u0000\u0000\u0267\u0269\u0005\u0003\u0000\u0000\u0268\u0266\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269C\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0005\u0002\u0000\u0000\u026b\u026c\u0007\u0001\u0000"+
		"\u0000\u026c\u026d\u0005\u001c\u0000\u0000\u026d\u026e\u0003F#\u0000\u026e"+
		"\u026f\u0005\u001d\u0000\u0000\u026fE\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0005\u001e\u0000\u0000\u0271\u0276\u0003H$\u0000\u0272\u0273\u0005\u0019"+
		"\u0000\u0000\u0273\u0275\u0003H$\u0000\u0274\u0272\u0001\u0000\u0000\u0000"+
		"\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0001\u0000\u0000\u0000"+
		"\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027a\u0005\u001f\u0000\u0000"+
		"\u027aG\u0001\u0000\u0000\u0000\u027b\u027c\u0005\u0003\u0000\u0000\u027c"+
		"\u027e\u0005\u001a\u0000\u0000\u027d\u027f\u0005 \u0000\u0000\u027e\u027d"+
		"\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280"+
		"\u0001\u0000\u0000\u0000\u0280\u0285\u0007\u0002\u0000\u0000\u0281\u0282"+
		"\u0005\u0019\u0000\u0000\u0282\u0284\u0005\u0003\u0000\u0000\u0283\u0281"+
		"\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0283"+
		"\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0289"+
		"\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u028a"+
		"\u0005!\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u0289\u028a\u0001"+
		"\u0000\u0000\u0000\u028aI\u0001\u0000\u0000\u0000\u028b\u028d\u0003D\""+
		"\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000"+
		"\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000"+
		"\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000"+
		"\u0000\u0291\u0293\u0005\u0002\u0000\u0000\u0292\u0291\u0001\u0000\u0000"+
		"\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0005\u0002\u0000\u0000\u0295\u0298\u0005\u0003\u0000"+
		"\u0000\u0296\u0297\u0007\u0003\u0000\u0000\u0297\u0299\u0005\u0003\u0000"+
		"\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0005\u001e\u0000"+
		"\u0000\u029b\u029c\u0003L&\u0000\u029c\u029d\u0005\u001f\u0000\u0000\u029d"+
		"K\u0001\u0000\u0000\u0000\u029e\u02a2\u0003\u0018\f\u0000\u029f\u02a2"+
		"\u0003 \u0010\u0000\u02a0\u02a2\u0003*\u0015\u0000\u02a1\u029e\u0001\u0000"+
		"\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4M\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a7\u0006\'\uffff\uffff"+
		"\u0000\u02a7\u02b3\u0005\u0004\u0000\u0000\u02a8\u02b3\u0005\u0006\u0000"+
		"\u0000\u02a9\u02b3\u0005\u0007\u0000\u0000\u02aa\u02b3\u0003\u0018\f\u0000"+
		"\u02ab\u02b3\u0003\u001a\r\u0000\u02ac\u02b3\u0003\u0016\u000b\u0000\u02ad"+
		"\u02b3\u00030\u0018\u0000\u02ae\u02b1\u00034\u001a\u0000\u02af\u02b1\u0003"+
		"8\u001c\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02a6\u0001\u0000"+
		"\u0000\u0000\u02b2\u02a8\u0001\u0000\u0000\u0000\u02b2\u02a9\u0001\u0000"+
		"\u0000\u0000\u02b2\u02aa\u0001\u0000\u0000\u0000\u02b2\u02ab\u0001\u0000"+
		"\u0000\u0000\u02b2\u02ac\u0001\u0000\u0000\u0000\u02b2\u02ad\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b3\u02de\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\n\u0005\u0000\u0000\u02b5\u02b6\u0003\u0004\u0002"+
		"\u0000\u02b6\u02c3\u0003N\'\u0000\u02b7\u02b9\u0007\u0004\u0000\u0000"+
		"\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000"+
		"\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bd\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u0003N\'\u0000\u02be\u02bf\u0003\u0004\u0002\u0000\u02bf"+
		"\u02c0\u0003N\'\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02ba"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02dd"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02ca"+
		"\n\u0004\u0000\u0000\u02c7\u02c9\u0007\u0004\u0000\u0000\u02c8\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02d9\u0003"+
		"N\'\u0000\u02ce\u02d2\u0003N\'\u0000\u02cf\u02d1\u0007\u0004\u0000\u0000"+
		"\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d6\u0003N\'\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7"+
		"\u02ce\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da"+
		"\u02dd\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02dc"+
		"\u02b4\u0001\u0000\u0000\u0000\u02dc\u02c6\u0001\u0000\u0000\u0000\u02dd"+
		"\u02e0\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de"+
		"\u02df\u0001\u0000\u0000\u0000\u02dfO\u0001\u0000\u0000\u0000\u02e0\u02de"+
		"\u0001\u0000\u0000\u0000_S`gkp\u007f\u0084\u008b\u0094\u009c\u00a4\u00aa"+
		"\u00b0\u00b2\u00b6\u00bb\u00bf\u00c6\u00ca\u00d1\u00d5\u00da\u00e0\u00e4"+
		"\u00eb\u00f6\u0103\u0107\u0116\u011f\u0121\u0126\u012e\u0136\u0141\u0149"+
		"\u014c\u0155\u0159\u015d\u0165\u016f\u0179\u017c\u0180\u0184\u0188\u0194"+
		"\u0197\u019d\u01a3\u01a8\u01b6\u01c2\u01c7\u01cd\u01d4\u01d6\u01dc\u01e2"+
		"\u01f5\u01f9\u01fc\u0200\u0210\u0221\u0225\u0227\u0237\u0242\u0247\u024d"+
		"\u024f\u0253\u025c\u0261\u0268\u0276\u027e\u0285\u0289\u028e\u0292\u0298"+
		"\u02a1\u02a3\u02b0\u02b2\u02ba\u02c3\u02ca\u02d2\u02d9\u02dc\u02de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}