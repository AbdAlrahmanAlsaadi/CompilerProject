// Generated from C:/Users/USER/IdeaProjects/angularproject/src/antlr/TypeScriptParser.g4 by ANTLR 4.13.2
package gen;
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
		TYPES=1, KEYWORDS=2, IDENTIFIER=3, NUMBER=4, STRING=5, BOOLEAN=6, BINDING_START=7, 
		BINDING_END=8, DIRECTIVE=9, OF=10, NGFOR=11, NGIF=12, TAG_OPEN=13, TAG_CLOSE=14, 
		PLUS=15, SUB=16, UNDERSCORE=17, MULTI=18, DIVID=19, ASSIGN=20, LESS=21, 
		BIGGER=22, SEMICOLON=23, COMMA=24, COLON=25, DOT=26, OPENB=27, CLOSEB=28, 
		LBRACE=29, RBRACE=30, LSQUARE=31, RSQUARE=32, OR=33, AND=34, SHEE=35, 
		PERCIENT=36, HS=37, ARROW=38, AWAIT=39, Double_Comment=40, Single_Comment=41, 
		WS=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_operator = 2, RULE_type = 3, 
		RULE_accessMoidifers = 4, RULE_directiveElement = 5, RULE_content = 6, 
		RULE_directive = 7, RULE_htmlContent = 8, RULE_templateBinding = 9, RULE_enumLiteral = 10, 
		RULE_enumAccess = 11, RULE_variableDeclaration = 12, RULE_tupleLiteral = 13, 
		RULE_listVar = 14, RULE_listBody = 15, RULE_listBodyBody = 16, RULE_arrayLiteral = 17, 
		RULE_arrayElement = 18, RULE_objectLiteral = 19, RULE_propertyAssignment = 20, 
		RULE_functionDeclaration = 21, RULE_arrowFunction = 22, RULE_awaitDef = 23, 
		RULE_parameterFunction = 24, RULE_parameter = 25, RULE_functionCall = 26, 
		RULE_block = 27, RULE_argumentList = 28, RULE_ifStatement = 29, RULE_classDeclaration = 30, 
		RULE_classBody = 31, RULE_classCall = 32, RULE_funclass = 33, RULE_propertyDeclaration = 34, 
		RULE_constructorDeclaration = 35, RULE_parameterList = 36, RULE_thisAssignment = 37, 
		RULE_decorator = 38, RULE_decoratorBody = 39, RULE_decoratorProperty = 40, 
		RULE_interfaceDeclaration = 41, RULE_interfaceBody = 42, RULE_forloop = 43, 
		RULE_forBrack = 44, RULE_whileloop = 45, RULE_importStatement = 46, RULE_importClause = 47, 
		RULE_importSpecifier = 48, RULE_exportStatement = 49, RULE_exportSpecifier = 50, 
		RULE_cssDec = 51, RULE_cssBody = 52, RULE_selector = 53, RULE_simpleSelector = 54, 
		RULE_expression = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "operator", "type", "accessMoidifers", "directiveElement", 
			"content", "directive", "htmlContent", "templateBinding", "enumLiteral", 
			"enumAccess", "variableDeclaration", "tupleLiteral", "listVar", "listBody", 
			"listBodyBody", "arrayLiteral", "arrayElement", "objectLiteral", "propertyAssignment", 
			"functionDeclaration", "arrowFunction", "awaitDef", "parameterFunction", 
			"parameter", "functionCall", "block", "argumentList", "ifStatement", 
			"classDeclaration", "classBody", "classCall", "funclass", "propertyDeclaration", 
			"constructorDeclaration", "parameterList", "thisAssignment", "decorator", 
			"decoratorBody", "decoratorProperty", "interfaceDeclaration", "interfaceBody", 
			"forloop", "forBrack", "whileloop", "importStatement", "importClause", 
			"importSpecifier", "exportStatement", "exportSpecifier", "cssDec", "cssBody", 
			"selector", "simpleSelector", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'{{'", "'}}'", null, "'of'", 
			"'ngFor'", "'ngIf'", null, null, "'+'", "'-'", "'_'", "'*'", "'/'", "'='", 
			"'<'", "'>'", "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'||'", "'&&'", "'|'", "'%'", "'#'", "'=>'", "'await'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPES", "KEYWORDS", "IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", 
			"BINDING_START", "BINDING_END", "DIRECTIVE", "OF", "NGFOR", "NGIF", "TAG_OPEN", 
			"TAG_CLOSE", "PLUS", "SUB", "UNDERSCORE", "MULTI", "DIVID", "ASSIGN", 
			"LESS", "BIGGER", "SEMICOLON", "COMMA", "COLON", "DOT", "OPENB", "CLOSEB", 
			"LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "OR", "AND", "SHEE", "PERCIENT", 
			"HS", "ARROW", "AWAIT", "Double_Comment", "Single_Comment", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 689442922748L) != 0)) {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(117);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ListVarContext listVar() {
			return getRuleContext(ListVarContext.class,0);
		}
		public CssDecContext cssDec() {
			return getRuleContext(CssDecContext.class,0);
		}
		public AwaitDefContext awaitDef() {
			return getRuleContext(AwaitDefContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				decorator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				enumLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				templateBinding();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				directiveElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				importStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				functionDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(127);
				classDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(128);
				variableDeclaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(129);
				listVar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(130);
				cssDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(131);
				awaitDef();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operator);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(PLUS);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(MULTI);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(SUB);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(LESS);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(138);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(BIGGER);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(142);
					match(ASSIGN);
					}
				}

				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(ASSIGN);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
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
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(151);
				match(TYPES);
				}
				break;
			case 2:
				{
				setState(152);
				match(TYPES);
				setState(153);
				match(LESS);
				setState(154);
				type(0);
				setState(155);
				match(BIGGER);
				}
				break;
			case 3:
				{
				setState(157);
				match(LSQUARE);
				setState(158);
				type(0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(159);
					match(COMMA);
					setState(160);
					type(0);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(RSQUARE);
				}
				break;
			case 4:
				{
				setState(168);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
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
					setState(171);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(172);
					match(LSQUARE);
					setState(173);
					match(RSQUARE);
					}
					} 
				}
				setState(178);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitAccessMoidifers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessMoidifersContext accessMoidifers() throws RecognitionException {
		AccessMoidifersContext _localctx = new AccessMoidifersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accessMoidifers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		public TerminalNode TAG_OPEN() { return getToken(TypeScriptParser.TAG_OPEN, 0); }
		public TerminalNode BIGGER() { return getToken(TypeScriptParser.BIGGER, 0); }
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public TerminalNode DIVID() { return getToken(TypeScriptParser.DIVID, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public List<DirectiveElementContext> directiveElement() {
			return getRuleContexts(DirectiveElementContext.class);
		}
		public DirectiveElementContext directiveElement(int i) {
			return getRuleContext(DirectiveElementContext.class,i);
		}
		public TerminalNode TAG_CLOSE() { return getToken(TypeScriptParser.TAG_CLOSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitDirectiveElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveElementContext directiveElement() throws RecognitionException {
		DirectiveElementContext _localctx = new DirectiveElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directiveElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TAG_OPEN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2281701900L) != 0)) {
				{
				{
				setState(182);
				directive();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIVID) {
				{
				setState(188);
				match(DIVID);
				}
			}

			setState(191);
			match(BIGGER);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
					case BINDING_START:
						{
						setState(192);
						content();
						}
						break;
					case TAG_OPEN:
						{
						setState(193);
						directiveElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(199);
				match(TAG_CLOSE);
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
	public static class ContentContext extends ParserRuleContext {
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TemplateBindingContext templateBinding() {
			return getRuleContext(TemplateBindingContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_content);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				htmlContent();
				}
				break;
			case BINDING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				templateBinding();
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
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TerminalNode DIRECTIVE() { return getToken(TypeScriptParser.DIRECTIVE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_directive);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
			case IDENTIFIER:
			case DIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				match(ASSIGN);
				setState(208);
				match(STRING);
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(LSQUARE);
				setState(210);
				match(IDENTIFIER);
				setState(211);
				match(RSQUARE);
				setState(212);
				match(ASSIGN);
				setState(213);
				match(STRING);
				}
				break;
			case OPENB:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(OPENB);
				setState(215);
				match(IDENTIFIER);
				setState(216);
				match(CLOSEB);
				setState(217);
				match(ASSIGN);
				setState(218);
				match(STRING);
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
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IDENTIFIER);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					match(IDENTIFIER);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(228);
				match(DOT);
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
	public static class TemplateBindingContext extends ParserRuleContext {
		public TerminalNode BINDING_START() { return getToken(TypeScriptParser.BINDING_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTemplateBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBindingContext templateBinding() throws RecognitionException {
		TemplateBindingContext _localctx = new TemplateBindingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_templateBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(BINDING_START);
			setState(232);
			expression(0);
			setState(233);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitEnumLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumLiteralContext enumLiteral() throws RecognitionException {
		EnumLiteralContext _localctx = new EnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(KEYWORDS);
			setState(236);
			match(IDENTIFIER);
			setState(237);
			match(LBRACE);
			setState(238);
			match(IDENTIFIER);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				match(IDENTIFIER);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(241);
					match(ASSIGN);
					setState(242);
					expression(0);
					}
				}

				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitEnumAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumAccessContext enumAccess() throws RecognitionException {
		EnumAccessContext _localctx = new EnumAccessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(KEYWORDS);
			setState(253);
			match(IDENTIFIER);
			setState(254);
			match(COLON);
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(ASSIGN);
			setState(257);
			match(IDENTIFIER);
			setState(258);
			match(DOT);
			setState(259);
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public AccessMoidifersContext accessMoidifers() {
			return getRuleContext(AccessMoidifersContext.class,0);
		}
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleLiteralContext tupleLiteral() {
			return getRuleContext(TupleLiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			int _alt;
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(261);
						decorator();
						}
						} 
					}
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(267);
					accessMoidifers();
					}
					break;
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORDS) {
					{
					setState(270);
					match(KEYWORDS);
					}
				}

				setState(273);
				parameter();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(274);
					match(ASSIGN);
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(275);
						expression(0);
						}
						break;
					case 2:
						{
						setState(276);
						tupleLiteral();
						}
						break;
					}
					}
				}

				setState(281);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				expression(0);
				setState(284);
				operator();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147483772L) != 0)) {
					{
					{
					setState(285);
					expression(0);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTupleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleLiteralContext tupleLiteral() throws RecognitionException {
		TupleLiteralContext _localctx = new TupleLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tupleLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LSQUARE);
			setState(296);
			expression(0);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				expression(0);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
	public static class ListVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public ListBodyContext listBody() {
			return getRuleContext(ListBodyContext.class,0);
		}
		public ListVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterListVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitListVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitListVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListVarContext listVar() throws RecognitionException {
		ListVarContext _localctx = new ListVarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IDENTIFIER);
			setState(307);
			match(ASSIGN);
			setState(308);
			listBody();
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
	public static class ListBodyContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public ListBodyBodyContext listBodyBody() {
			return getRuleContext(ListBodyBodyContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public ListBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterListBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitListBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitListBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBodyContext listBody() throws RecognitionException {
		ListBodyContext _localctx = new ListBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(LSQUARE);
			setState(311);
			listBodyBody();
			setState(312);
			match(RSQUARE);
			setState(313);
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
	public static class ListBodyBodyContext extends ParserRuleContext {
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(TypeScriptParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TypeScriptParser.LBRACE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TypeScriptParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TypeScriptParser.RBRACE, i);
		}
		public ListBodyBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBodyBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterListBodyBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitListBodyBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitListBodyBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBodyBodyContext listBodyBody() throws RecognitionException {
		ListBodyBodyContext _localctx = new ListBodyBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listBodyBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(315);
				match(LBRACE);
				}
			}

			setState(318);
			parameterList();
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					match(COMMA);
					setState(320);
					parameterList();
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACE) {
				{
				setState(326);
				match(RBRACE);
				}
			}

			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(330);
					match(LBRACE);
					}
				}

				setState(333);
				parameterList();
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						match(COMMA);
						setState(335);
						parameterList();
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RBRACE) {
					{
					setState(341);
					match(RBRACE);
					}
				}

				}
				}
				setState(348);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LSQUARE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2684354684L) != 0)) {
				{
				setState(350);
				arrayElement();
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(351);
						match(COMMA);
						setState(352);
						arrayElement();
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(360);
				match(COMMA);
				}
			}

			setState(363);
			match(RSQUARE);
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(364);
				match(SEMICOLON);
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
	public static class ArrayElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayElement);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				objectLiteral();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(LBRACE);
			setState(372);
			propertyAssignment();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(373);
				match(COMMA);
				setState(374);
				propertyAssignment();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENTIFIER);
			setState(383);
			match(COLON);
			setState(384);
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
		public List<TerminalNode> OPENB() { return getTokens(TypeScriptParser.OPENB); }
		public TerminalNode OPENB(int i) {
			return getToken(TypeScriptParser.OPENB, i);
		}
		public List<TerminalNode> CLOSEB() { return getTokens(TypeScriptParser.CLOSEB); }
		public TerminalNode CLOSEB(int i) {
			return getToken(TypeScriptParser.CLOSEB, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public AccessMoidifersContext accessMoidifers() {
			return getRuleContext(AccessMoidifersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public ParameterFunctionContext parameterFunction() {
			return getRuleContext(ParameterFunctionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(TypeScriptParser.COMMA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(386);
						decorator();
						}
						} 
					}
					setState(391);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(392);
					accessMoidifers();
					}
					break;
				}
				setState(395);
				match(KEYWORDS);
				setState(396);
				match(IDENTIFIER);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(397);
					match(ASSIGN);
					setState(398);
					match(KEYWORDS);
					}
				}

				setState(401);
				match(OPENB);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(402);
					parameterFunction();
					}
				}

				setState(405);
				match(CLOSEB);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(406);
					match(COLON);
					}
				}

				setState(411);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPES:
				case IDENTIFIER:
				case LSQUARE:
					{
					setState(409);
					type(0);
					}
					break;
				case KEYWORDS:
					{
					setState(410);
					match(KEYWORDS);
					}
					break;
				case LBRACE:
					break;
				default:
					break;
				}
				setState(413);
				block();
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(414);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(418);
				match(OPENB);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(419);
					match(STRING);
					setState(420);
					match(COMMA);
					}
				}

				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(423);
					match(IDENTIFIER);
					}
				}

				setState(426);
				match(OPENB);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(427);
					parameterFunction();
					}
				}

				setState(430);
				match(CLOSEB);
				setState(431);
				match(ARROW);
				setState(432);
				block();
				setState(433);
				match(CLOSEB);
				setState(434);
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public ParameterFunctionContext parameterFunction() {
			return getRuleContext(ParameterFunctionContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENB) {
				{
				setState(438);
				match(OPENB);
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(441);
				parameterFunction();
				}
			}

			setState(444);
			match(CLOSEB);
			setState(445);
			match(ARROW);
			setState(446);
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
	public static class AwaitDefContext extends ParserRuleContext {
		public TerminalNode AWAIT() { return getToken(TypeScriptParser.AWAIT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPENB() { return getTokens(TypeScriptParser.OPENB); }
		public TerminalNode OPENB(int i) {
			return getToken(TypeScriptParser.OPENB, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> CLOSEB() { return getTokens(TypeScriptParser.CLOSEB); }
		public TerminalNode CLOSEB(int i) {
			return getToken(TypeScriptParser.CLOSEB, i);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(TypeScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScriptParser.DOT, i);
		}
		public AwaitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterAwaitDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitAwaitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitAwaitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitDefContext awaitDef() throws RecognitionException {
		AwaitDefContext _localctx = new AwaitDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_awaitDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(AWAIT);
			setState(449);
			match(IDENTIFIER);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(450);
				match(DOT);
				setState(451);
				match(IDENTIFIER);
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			match(OPENB);
			setState(458);
			block();
			setState(459);
			match(CLOSEB);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(460);
				match(DOT);
				setState(461);
				match(IDENTIFIER);
				setState(462);
				match(OPENB);
				setState(463);
				match(CLOSEB);
				}
			}

			setState(466);
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
	public static class ParameterFunctionContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public ParameterFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterParameterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitParameterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParameterFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterFunctionContext parameterFunction() throws RecognitionException {
		ParameterFunctionContext _localctx = new ParameterFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			parameter();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(469);
				match(COMMA);
				setState(470);
				parameter();
				}
				}
				setState(475);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TAG_OPEN() { return getToken(TypeScriptParser.TAG_OPEN, 0); }
		public TerminalNode BIGGER() { return getToken(TypeScriptParser.BIGGER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(IDENTIFIER);
			setState(477);
			match(COLON);
			setState(478);
			type(0);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_OPEN) {
				{
				setState(479);
				match(TAG_OPEN);
				}
			}

			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIGGER) {
				{
				setState(482);
				match(BIGGER);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public List<TerminalNode> DOT() { return getTokens(TypeScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScriptParser.DOT, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(486);
				match(DOT);
				setState(487);
				match(IDENTIFIER);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(OPENB);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147483772L) != 0)) {
				{
				setState(494);
				argumentList();
				}
			}

			setState(497);
			match(CLOSEB);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(498);
				statement();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<ThisAssignmentContext> thisAssignment() {
			return getRuleContexts(ThisAssignmentContext.class);
		}
		public ThisAssignmentContext thisAssignment(int i) {
			return getRuleContext(ThisAssignmentContext.class,i);
		}
		public List<ArrowFunctionContext> arrowFunction() {
			return getRuleContexts(ArrowFunctionContext.class);
		}
		public ArrowFunctionContext arrowFunction(int i) {
			return getRuleContext(ArrowFunctionContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LBRACE);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 689845575932L) != 0)) {
				{
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(502);
					statement();
					}
					break;
				case 2:
					{
					setState(503);
					functionCall();
					}
					break;
				case 3:
					{
					setState(504);
					thisAssignment();
					}
					break;
				case 4:
					{
					setState(505);
					arrowFunction();
					}
					break;
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
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
	public static class ArgumentListContext extends ParserRuleContext {
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
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentList);
		int _la;
		try {
			int _alt;
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				expression(0);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(514);
					match(COMMA);
					setState(515);
					expression(0);
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				parameterList();
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(522);
						match(COMMA);
						setState(523);
						parameterList();
						}
						} 
					}
					setState(528);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(529);
					match(COMMA);
					}
				}

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(KEYWORDS);
			setState(535);
			match(OPENB);
			setState(536);
			expression(0);
			setState(537);
			match(CLOSEB);
			setState(538);
			block();
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(539);
				match(KEYWORDS);
				setState(540);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					decorator();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(549);
				match(KEYWORDS);
				}
				break;
			}
			setState(552);
			match(KEYWORDS);
			setState(553);
			match(IDENTIFIER);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(554);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(555);
				match(IDENTIFIER);
				}
			}

			setState(558);
			match(LBRACE);
			setState(559);
			classBody();
			setState(560);
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
		public List<ClassCallContext> classCall() {
			return getRuleContexts(ClassCallContext.class);
		}
		public ClassCallContext classCall(int i) {
			return getRuleContext(ClassCallContext.class,i);
		}
		public List<FunclassContext> funclass() {
			return getRuleContexts(FunclassContext.class);
		}
		public FunclassContext funclass(int i) {
			return getRuleContext(FunclassContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 689442922748L) != 0)) {
				{
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(562);
					classCall();
					}
					break;
				case 2:
					{
					setState(563);
					funclass();
					}
					break;
				case 3:
					{
					setState(564);
					propertyDeclaration();
					}
					break;
				case 4:
					{
					setState(565);
					constructorDeclaration();
					}
					break;
				case 5:
					{
					setState(566);
					statement();
					}
					break;
				}
				}
				setState(571);
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
	public static class ClassCallContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPENB() { return getTokens(TypeScriptParser.OPENB); }
		public TerminalNode OPENB(int i) {
			return getToken(TypeScriptParser.OPENB, i);
		}
		public List<TerminalNode> CLOSEB() { return getTokens(TypeScriptParser.CLOSEB); }
		public TerminalNode CLOSEB(int i) {
			return getToken(TypeScriptParser.CLOSEB, i);
		}
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode TAG_OPEN() { return getToken(TypeScriptParser.TAG_OPEN, 0); }
		public TerminalNode BIGGER() { return getToken(TypeScriptParser.BIGGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public ClassCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCallContext classCall() throws RecognitionException {
		ClassCallContext _localctx = new ClassCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(KEYWORDS);
			setState(573);
			match(IDENTIFIER);
			setState(574);
			match(OPENB);
			setState(575);
			match(CLOSEB);
			setState(576);
			match(IDENTIFIER);
			setState(577);
			match(ASSIGN);
			setState(578);
			match(KEYWORDS);
			setState(579);
			match(IDENTIFIER);
			setState(580);
			match(TAG_OPEN);
			setState(581);
			match(BIGGER);
			setState(582);
			match(OPENB);
			setState(583);
			match(CLOSEB);
			setState(584);
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
	public static class FunclassContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterFunclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitFunclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitFunclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunclassContext funclass() throws RecognitionException {
		FunclassContext _localctx = new FunclassContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(IDENTIFIER);
			setState(587);
			match(OPENB);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147483772L) != 0)) {
				{
				setState(588);
				argumentList();
				}
			}

			setState(591);
			match(CLOSEB);
			setState(592);
			match(COLON);
			setState(593);
			match(KEYWORDS);
			setState(594);
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
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public List<TerminalNode> KEYWORDS() { return getTokens(TypeScriptParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(TypeScriptParser.KEYWORDS, i);
		}
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORDS) {
				{
				{
				setState(596);
				match(KEYWORDS);
				setState(597);
				match(IDENTIFIER);
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			match(IDENTIFIER);
			setState(604);
			match(COLON);
			setState(605);
			type(0);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(606);
				match(ASSIGN);
				setState(607);
				expression(0);
				}
			}

			setState(610);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(613);
			match(OPENB);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS || _la==IDENTIFIER) {
				{
				setState(614);
				parameterList();
				}
			}

			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(617);
				match(COMMA);
				setState(618);
				parameterList();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			match(CLOSEB);
			setState(625);
			match(LBRACE);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 689442922748L) != 0)) {
				{
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(626);
					thisAssignment();
					}
					break;
				case 2:
					{
					setState(627);
					statement();
					}
					break;
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
	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(635);
				accessMoidifers();
				}
			}

			setState(638);
			match(IDENTIFIER);
			setState(639);
			match(COLON);
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPES:
			case IDENTIFIER:
			case LSQUARE:
				{
				setState(640);
				type(0);
				}
				break;
			case STRING:
				{
				setState(641);
				match(STRING);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitThisAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisAssignmentContext thisAssignment() throws RecognitionException {
		ThisAssignmentContext _localctx = new ThisAssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_thisAssignment);
		int _la;
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				match(KEYWORDS);
				setState(645);
				match(DOT);
				setState(646);
				match(IDENTIFIER);
				setState(647);
				match(ASSIGN);
				setState(648);
				match(IDENTIFIER);
				setState(649);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(651);
				operator();
				setState(652);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(653);
				match(ASSIGN);
				setState(654);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(655);
				operator();
				setState(656);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(657);
					match(DOT);
					setState(658);
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
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENB) {
					{
					setState(664);
					match(OPENB);
					}
				}

				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSEB) {
					{
					setState(667);
					match(CLOSEB);
					}
				}

				setState(670);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(KEYWORDS);
			setState(675);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(676);
			match(OPENB);
			setState(677);
			decoratorBody();
			setState(678);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitDecoratorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorBodyContext decoratorBody() throws RecognitionException {
		DecoratorBodyContext _localctx = new DecoratorBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_decoratorBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(LBRACE);
			setState(681);
			decoratorProperty();
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					match(COMMA);
					setState(683);
					decoratorProperty();
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(689);
				match(COMMA);
				}
			}

			setState(692);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitDecoratorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorPropertyContext decoratorProperty() throws RecognitionException {
		DecoratorPropertyContext _localctx = new DecoratorPropertyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_decoratorProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(IDENTIFIER);
			setState(695);
			match(COLON);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(696);
				match(LSQUARE);
				}
			}

			setState(699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					match(COMMA);
					setState(701);
					match(IDENTIFIER);
					}
					} 
				}
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RSQUARE) {
				{
				setState(707);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(KEYWORDS);
			setState(711);
			match(KEYWORDS);
			setState(712);
			match(IDENTIFIER);
			setState(713);
			match(LBRACE);
			setState(714);
			interfaceBody();
			setState(715);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(717);
				parameter();
				setState(718);
				match(SEMICOLON);
				}
				}
				setState(724);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(KEYWORDS);
			setState(726);
			match(OPENB);
			setState(727);
			forBrack();
			setState(728);
			match(CLOSEB);
			setState(729);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitForBrack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBrackContext forBrack() throws RecognitionException {
		ForBrackContext _localctx = new ForBrackContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forBrack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			match(KEYWORDS);
			setState(732);
			match(IDENTIFIER);
			setState(733);
			match(ASSIGN);
			setState(734);
			match(NUMBER);
			setState(735);
			match(SEMICOLON);
			setState(736);
			match(IDENTIFIER);
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				{
				setState(737);
				match(LESS);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(738);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				{
				setState(741);
				match(BIGGER);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(742);
					match(ASSIGN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(747);
			match(NUMBER);
			setState(748);
			match(SEMICOLON);
			setState(749);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(KEYWORDS);
			setState(752);
			match(OPENB);
			setState(753);
			expression(0);
			setState(754);
			match(CLOSEB);
			setState(755);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(KEYWORDS);
			setState(758);
			importClause();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(759);
				match(KEYWORDS);
				setState(760);
				match(STRING);
				}
			}

			setState(763);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_importClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(765);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				{
				setState(766);
				match(LBRACE);
				setState(767);
				importSpecifier();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(768);
					match(COMMA);
					setState(769);
					importSpecifier();
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_importSpecifier);
		int _la;
		try {
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(IDENTIFIER);
				}
				break;
			case KEYWORDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(KEYWORDS);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORDS) {
					{
					setState(781);
					match(KEYWORDS);
					setState(782);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(KEYWORDS);
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case LSQUARE:
				{
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(788);
					match(KEYWORDS);
					}
					break;
				}
				setState(791);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(792);
				match(LBRACE);
				setState(793);
				exportSpecifier();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(794);
					match(COMMA);
					setState(795);
					exportSpecifier();
					}
					}
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(801);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(805);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitExportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportSpecifierContext exportSpecifier() throws RecognitionException {
		ExportSpecifierContext _localctx = new ExportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exportSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(IDENTIFIER);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(808);
				match(KEYWORDS);
				setState(809);
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
	public static class CssDecContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public List<CssBodyContext> cssBody() {
			return getRuleContexts(CssBodyContext.class);
		}
		public CssBodyContext cssBody(int i) {
			return getRuleContext(CssBodyContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TypeScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TypeScriptParser.SEMICOLON, i);
		}
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public CssDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterCssDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitCssDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitCssDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDecContext cssDec() throws RecognitionException {
		CssDecContext _localctx = new CssDecContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cssDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			selector();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(813);
				match(IDENTIFIER);
				}
			}

			setState(816);
			match(LBRACE);
			setState(817);
			cssBody();
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					match(SEMICOLON);
					setState(819);
					cssBody();
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			setState(825);
			match(SEMICOLON);
			setState(826);
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
	public static class CssBodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(TypeScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(TypeScriptParser.NUMBER, i);
		}
		public List<TerminalNode> HS() { return getTokens(TypeScriptParser.HS); }
		public TerminalNode HS(int i) {
			return getToken(TypeScriptParser.HS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TypeScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TypeScriptParser.STRING, i);
		}
		public CssBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterCssBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitCssBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitCssBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBodyContext cssBody() throws RecognitionException {
		CssBodyContext _localctx = new CssBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cssBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(IDENTIFIER);
			setState(829);
			match(COLON);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953528L) != 0)) {
				{
				{
				setState(830);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953528L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(835);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScriptParser.COMMA, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			simpleSelector();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(837);
				match(COMMA);
				setState(838);
				simpleSelector();
				}
				}
				setState(843);
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
		public TerminalNode HS() { return getToken(TypeScriptParser.HS, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpleSelector);
		try {
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(IDENTIFIER);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(DOT);
				setState(846);
				match(IDENTIFIER);
				}
				break;
			case HS:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				match(HS);
				setState(848);
				match(IDENTIFIER);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				match(COLON);
				setState(850);
				match(IDENTIFIER);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrayDec(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallthefunctionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CallthefunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterCallthefunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitCallthefunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitCallthefunction(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitEnumAc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnythingContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public AnythingContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitAnything(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitAnything(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitCompristion(this);
			else return visitor.visitChildren(this);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				_localctx = new AnythingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(854);
				match(IDENTIFIER);
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(855);
					match(OPENB);
					}
					break;
				}
				setState(859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(858);
					match(CLOSEB);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(861);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(862);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(863);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				_localctx = new CallthefunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(864);
				functionCall();
				}
				break;
			case 6:
				{
				_localctx = new ArrayDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(865);
				arrayLiteral();
				}
				break;
			case 7:
				{
				_localctx = new EnumAcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(866);
				enumAccess();
				}
				break;
			case 8:
				{
				_localctx = new InterfaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(867);
				interfaceDeclaration();
				}
				break;
			case 9:
				{
				_localctx = new ForContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(868);
					forloop();
					}
					break;
				case 2:
					{
					setState(869);
					whileloop();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompristionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(874);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(875);
					operator();
					setState(876);
					expression(0);
					setState(889);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(880);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
								{
								{
								setState(877);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(882);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(883);
							expression(0);
							setState(884);
							operator();
							setState(885);
							expression(0);
							}
							} 
						}
						setState(891);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
					}
					}
					} 
				}
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		case 55:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u0382\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0005\u0000r\b\u0000\n\u0000\f\u0000u\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0085\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008c\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0090\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0095\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00a2\b\u0003\n\u0003\f\u0003\u00a5\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00aa\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00af\b\u0003\n\u0003\f\u0003\u00b2\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u00b8\b\u0005\n"+
		"\u0005\f\u0005\u00bb\t\u0005\u0001\u0005\u0003\u0005\u00be\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c3\b\u0005\n\u0005\f\u0005"+
		"\u00c6\t\u0005\u0001\u0005\u0003\u0005\u00c9\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00cd\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00dc\b\u0007\u0001"+
		"\b\u0001\b\u0005\b\u00e0\b\b\n\b\f\b\u00e3\t\b\u0001\b\u0003\b\u00e6\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f4\b\n\u0005\n\u00f6\b\n\n\n\f\n"+
		"\u00f9\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005"+
		"\f\u0107\b\f\n\f\f\f\u010a\t\f\u0001\f\u0003\f\u010d\b\f\u0001\f\u0003"+
		"\f\u0110\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0116\b\f\u0003\f"+
		"\u0118\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u011f\b\f\n"+
		"\f\f\f\u0122\t\f\u0001\f\u0001\f\u0003\f\u0126\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u012c\b\r\n\r\f\r\u012f\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u013d\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0142\b\u0010\n\u0010\f\u0010\u0145"+
		"\t\u0010\u0001\u0010\u0003\u0010\u0148\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u014c\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0151\b\u0010\n\u0010\f\u0010\u0154\t\u0010\u0001\u0010\u0003\u0010\u0157"+
		"\b\u0010\u0005\u0010\u0159\b\u0010\n\u0010\f\u0010\u015c\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0162\b\u0011\n"+
		"\u0011\f\u0011\u0165\t\u0011\u0003\u0011\u0167\b\u0011\u0001\u0011\u0003"+
		"\u0011\u016a\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u016e\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0172\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0178\b\u0013\n\u0013\f\u0013\u017b"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0005\u0015\u0184\b\u0015\n\u0015\f\u0015\u0187\t\u0015"+
		"\u0001\u0015\u0003\u0015\u018a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0190\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0194\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0198\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u019c\b\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01a0\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01a6\b\u0015\u0001\u0015\u0003\u0015\u01a9\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01ad\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b5\b\u0015\u0001\u0016"+
		"\u0003\u0016\u01b8\b\u0016\u0001\u0016\u0003\u0016\u01bb\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u01c5\b\u0017\n\u0017\f\u0017\u01c8\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01d1\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u01d8\b\u0018\n\u0018\f\u0018\u01db"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e1"+
		"\b\u0019\u0001\u0019\u0003\u0019\u01e4\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u01e9\b\u001a\n\u001a\f\u001a\u01ec\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01f0\b\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01f4\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u01fb\b\u001b\n\u001b\f\u001b\u01fe\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0205\b\u001c"+
		"\n\u001c\f\u001c\u0208\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u020d\b\u001c\n\u001c\f\u001c\u0210\t\u001c\u0001\u001c\u0003\u001c"+
		"\u0213\b\u001c\u0003\u001c\u0215\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u021e"+
		"\b\u001d\u0001\u001e\u0005\u001e\u0221\b\u001e\n\u001e\f\u001e\u0224\t"+
		"\u001e\u0001\u001e\u0003\u001e\u0227\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u022d\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u0238\b\u001f\n\u001f\f\u001f\u023b\t\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u024e\b!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0005\"\u0257\b\"\n\"\f\"\u025a"+
		"\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0261\b\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0003#\u0268\b#\u0001#\u0001#\u0005#\u026c"+
		"\b#\n#\f#\u026f\t#\u0001#\u0001#\u0001#\u0001#\u0005#\u0275\b#\n#\f#\u0278"+
		"\t#\u0001#\u0001#\u0001$\u0003$\u027d\b$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0283\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0294\b%\n%\f%\u0297"+
		"\t%\u0001%\u0003%\u029a\b%\u0001%\u0003%\u029d\b%\u0001%\u0001%\u0003"+
		"%\u02a1\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u02ad\b\'\n\'\f\'\u02b0\t\'\u0001\'\u0003\'\u02b3\b"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0003(\u02ba\b(\u0001(\u0001("+
		"\u0001(\u0005(\u02bf\b(\n(\f(\u02c2\t(\u0001(\u0003(\u02c5\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u02d1"+
		"\b*\n*\f*\u02d4\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02e4\b,\u0001,\u0001"+
		",\u0003,\u02e8\b,\u0003,\u02ea\b,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0003.\u02fa"+
		"\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0303\b/\n"+
		"/\f/\u0306\t/\u0001/\u0001/\u0003/\u030a\b/\u00010\u00010\u00010\u0001"+
		"0\u00030\u0310\b0\u00030\u0312\b0\u00011\u00011\u00031\u0316\b1\u0001"+
		"1\u00011\u00011\u00011\u00011\u00051\u031d\b1\n1\f1\u0320\t1\u00011\u0001"+
		"1\u00031\u0324\b1\u00011\u00011\u00012\u00012\u00012\u00032\u032b\b2\u0001"+
		"3\u00013\u00033\u032f\b3\u00013\u00013\u00013\u00013\u00053\u0335\b3\n"+
		"3\f3\u0338\t3\u00013\u00013\u00013\u00014\u00014\u00014\u00054\u0340\b"+
		"4\n4\f4\u0343\t4\u00015\u00015\u00015\u00055\u0348\b5\n5\f5\u034b\t5\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u0354\b6\u00017\u0001"+
		"7\u00017\u00037\u0359\b7\u00017\u00037\u035c\b7\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00037\u0367\b7\u00037\u0369\b7\u0001"+
		"7\u00017\u00017\u00017\u00057\u036f\b7\n7\f7\u0372\t7\u00017\u00017\u0001"+
		"7\u00017\u00057\u0378\b7\n7\f7\u037b\t7\u00057\u037d\b7\n7\f7\u0380\t"+
		"7\u00017\u0000\u0002\u0006n8\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjln\u0000\u0006\u0002\u0000\u0002\u0003\t\t\u0001\u0000\u0002"+
		"\u0003\u0001\u0000\u0002\u0002\u0001\u0000\u0003\u0005\u0002\u0000\u0003"+
		"\u0005%%\u0001\u0000!#\u03e1\u0000s\u0001\u0000\u0000\u0000\u0002\u0084"+
		"\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000\u0000\u0006\u00a9"+
		"\u0001\u0000\u0000\u0000\b\u00b3\u0001\u0000\u0000\u0000\n\u00b5\u0001"+
		"\u0000\u0000\u0000\f\u00cc\u0001\u0000\u0000\u0000\u000e\u00db\u0001\u0000"+
		"\u0000\u0000\u0010\u00dd\u0001\u0000\u0000\u0000\u0012\u00e7\u0001\u0000"+
		"\u0000\u0000\u0014\u00eb\u0001\u0000\u0000\u0000\u0016\u00fc\u0001\u0000"+
		"\u0000\u0000\u0018\u0125\u0001\u0000\u0000\u0000\u001a\u0127\u0001\u0000"+
		"\u0000\u0000\u001c\u0132\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000"+
		"\u0000\u0000 \u013c\u0001\u0000\u0000\u0000\"\u015d\u0001\u0000\u0000"+
		"\u0000$\u0171\u0001\u0000\u0000\u0000&\u0173\u0001\u0000\u0000\u0000("+
		"\u017e\u0001\u0000\u0000\u0000*\u01b4\u0001\u0000\u0000\u0000,\u01b7\u0001"+
		"\u0000\u0000\u0000.\u01c0\u0001\u0000\u0000\u00000\u01d4\u0001\u0000\u0000"+
		"\u00002\u01dc\u0001\u0000\u0000\u00004\u01e5\u0001\u0000\u0000\u00006"+
		"\u01f5\u0001\u0000\u0000\u00008\u0214\u0001\u0000\u0000\u0000:\u0216\u0001"+
		"\u0000\u0000\u0000<\u0222\u0001\u0000\u0000\u0000>\u0239\u0001\u0000\u0000"+
		"\u0000@\u023c\u0001\u0000\u0000\u0000B\u024a\u0001\u0000\u0000\u0000D"+
		"\u0258\u0001\u0000\u0000\u0000F\u0264\u0001\u0000\u0000\u0000H\u027c\u0001"+
		"\u0000\u0000\u0000J\u02a0\u0001\u0000\u0000\u0000L\u02a2\u0001\u0000\u0000"+
		"\u0000N\u02a8\u0001\u0000\u0000\u0000P\u02b6\u0001\u0000\u0000\u0000R"+
		"\u02c6\u0001\u0000\u0000\u0000T\u02d2\u0001\u0000\u0000\u0000V\u02d5\u0001"+
		"\u0000\u0000\u0000X\u02db\u0001\u0000\u0000\u0000Z\u02ef\u0001\u0000\u0000"+
		"\u0000\\\u02f5\u0001\u0000\u0000\u0000^\u0309\u0001\u0000\u0000\u0000"+
		"`\u0311\u0001\u0000\u0000\u0000b\u0313\u0001\u0000\u0000\u0000d\u0327"+
		"\u0001\u0000\u0000\u0000f\u032c\u0001\u0000\u0000\u0000h\u033c\u0001\u0000"+
		"\u0000\u0000j\u0344\u0001\u0000\u0000\u0000l\u0353\u0001\u0000\u0000\u0000"+
		"n\u0368\u0001\u0000\u0000\u0000pr\u0003\u0002\u0001\u0000qp\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000t\u0001\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000v\u0085\u0003L&\u0000w\u0085\u0003:\u001d\u0000x\u0085\u0003n7\u0000"+
		"y\u0085\u0003\u0014\n\u0000z\u0085\u0003\u0012\t\u0000{\u0085\u0003\n"+
		"\u0005\u0000|\u0085\u0003\\.\u0000}\u0085\u0003b1\u0000~\u0085\u0003*"+
		"\u0015\u0000\u007f\u0085\u0003<\u001e\u0000\u0080\u0085\u0003\u0018\f"+
		"\u0000\u0081\u0085\u0003\u001c\u000e\u0000\u0082\u0085\u0003f3\u0000\u0083"+
		"\u0085\u0003.\u0017\u0000\u0084v\u0001\u0000\u0000\u0000\u0084w\u0001"+
		"\u0000\u0000\u0000\u0084x\u0001\u0000\u0000\u0000\u0084y\u0001\u0000\u0000"+
		"\u0000\u0084z\u0001\u0000\u0000\u0000\u0084{\u0001\u0000\u0000\u0000\u0084"+
		"|\u0001\u0000\u0000\u0000\u0084}\u0001\u0000\u0000\u0000\u0084~\u0001"+
		"\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0080\u0001"+
		"\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0003\u0001"+
		"\u0000\u0000\u0000\u0086\u0095\u0005\u000f\u0000\u0000\u0087\u0095\u0005"+
		"\u0012\u0000\u0000\u0088\u0095\u0005\u0010\u0000\u0000\u0089\u008b\u0005"+
		"\u0015\u0000\u0000\u008a\u008c\u0005\u0014\u0000\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0095\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0005\u0016\u0000\u0000\u008e\u0090\u0005"+
		"\u0014\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0095\u0001\u0000\u0000\u0000\u0091\u0095\u0005"+
		"\u0014\u0000\u0000\u0092\u0095\u0005\u001a\u0000\u0000\u0093\u0095\u0005"+
		"\u0011\u0000\u0000\u0094\u0086\u0001\u0000\u0000\u0000\u0094\u0087\u0001"+
		"\u0000\u0000\u0000\u0094\u0088\u0001\u0000\u0000\u0000\u0094\u0089\u0001"+
		"\u0000\u0000\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0005\u0001\u0000\u0000\u0000\u0096\u0097\u0006"+
		"\u0003\uffff\uffff\u0000\u0097\u00aa\u0005\u0001\u0000\u0000\u0098\u0099"+
		"\u0005\u0001\u0000\u0000\u0099\u009a\u0005\u0015\u0000\u0000\u009a\u009b"+
		"\u0003\u0006\u0003\u0000\u009b\u009c\u0005\u0016\u0000\u0000\u009c\u00aa"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001f\u0000\u0000\u009e\u00a3"+
		"\u0003\u0006\u0003\u0000\u009f\u00a0\u0005\u0018\u0000\u0000\u00a0\u00a2"+
		"\u0003\u0006\u0003\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005 \u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0005\u0003\u0000\u0000\u00a9\u0096\u0001"+
		"\u0000\u0000\u0000\u00a9\u0098\u0001\u0000\u0000\u0000\u00a9\u009d\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\n\u0004\u0000\u0000\u00ac\u00ad\u0005\u001f"+
		"\u0000\u0000\u00ad\u00af\u0005 \u0000\u0000\u00ae\u00ab\u0001\u0000\u0000"+
		"\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0007\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0002\u0000"+
		"\u0000\u00b4\t\u0001\u0000\u0000\u0000\u00b5\u00b9\u0005\r\u0000\u0000"+
		"\u00b6\u00b8\u0003\u000e\u0007\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00be\u0005\u0013\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c4\u0005\u0016\u0000\u0000"+
		"\u00c0\u00c3\u0003\f\u0006\u0000\u00c1\u00c3\u0003\n\u0005\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\u000e\u0000\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u000b\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003\u0010\b\u0000\u00cb\u00cd"+
		"\u0003\u0012\t\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\r\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0014\u0000\u0000\u00d0\u00dc\u0005\u0005"+
		"\u0000\u0000\u00d1\u00d2\u0005\u001f\u0000\u0000\u00d2\u00d3\u0005\u0003"+
		"\u0000\u0000\u00d3\u00d4\u0005 \u0000\u0000\u00d4\u00d5\u0005\u0014\u0000"+
		"\u0000\u00d5\u00dc\u0005\u0005\u0000\u0000\u00d6\u00d7\u0005\u001b\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000"+
		"\u0000\u00d9\u00da\u0005\u0014\u0000\u0000\u00da\u00dc\u0005\u0005\u0000"+
		"\u0000\u00db\u00ce\u0001\u0000\u0000\u0000\u00db\u00d1\u0001\u0000\u0000"+
		"\u0000\u00db\u00d6\u0001\u0000\u0000\u0000\u00dc\u000f\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e1\u0005\u0003\u0000\u0000\u00de\u00e0\u0005\u0003\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0005\u001a\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u0011\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0007\u0000\u0000\u00e8\u00e9\u0003n7\u0000\u00e9"+
		"\u00ea\u0005\b\u0000\u0000\u00ea\u0013\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005\u0002\u0000\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000\u00ed\u00ee"+
		"\u0005\u001d\u0000\u0000\u00ee\u00f7\u0005\u0003\u0000\u0000\u00ef\u00f0"+
		"\u0005\u0018\u0000\u0000\u00f0\u00f3\u0005\u0003\u0000\u0000\u00f1\u00f2"+
		"\u0005\u0014\u0000\u0000\u00f2\u00f4\u0003n7\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005\u001e\u0000\u0000\u00fb\u0015\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0002\u0000\u0000\u00fd\u00fe\u0005\u0003"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0019\u0000\u0000\u00ff\u0100\u0005\u0003"+
		"\u0000\u0000\u0100\u0101\u0005\u0014\u0000\u0000\u0101\u0102\u0005\u0003"+
		"\u0000\u0000\u0102\u0103\u0005\u001a\u0000\u0000\u0103\u0104\u0005\u0003"+
		"\u0000\u0000\u0104\u0017\u0001\u0000\u0000\u0000\u0105\u0107\u0003L&\u0000"+
		"\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010b\u010d\u0003\b\u0004\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0005\u0002\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0117\u00032\u0019\u0000\u0112\u0115\u0005\u0014\u0000\u0000\u0113\u0116"+
		"\u0003n7\u0000\u0114\u0116\u0003\u001a\r\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000"+
		"\u0000\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0017"+
		"\u0000\u0000\u011a\u0126\u0001\u0000\u0000\u0000\u011b\u011c\u0003n7\u0000"+
		"\u011c\u0120\u0003\u0004\u0002\u0000\u011d\u011f\u0003n7\u0000\u011e\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005\u0017\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0108"+
		"\u0001\u0000\u0000\u0000\u0125\u011b\u0001\u0000\u0000\u0000\u0126\u0019"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u001f\u0000\u0000\u0128\u012d"+
		"\u0003n7\u0000\u0129\u012a\u0005\u0018\u0000\u0000\u012a\u012c\u0003n"+
		"7\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005 \u0000\u0000\u0131\u001b\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005\u0003\u0000\u0000\u0133\u0134\u0005\u0014\u0000\u0000"+
		"\u0134\u0135\u0003\u001e\u000f\u0000\u0135\u001d\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005\u001f\u0000\u0000\u0137\u0138\u0003 \u0010\u0000\u0138"+
		"\u0139\u0005 \u0000\u0000\u0139\u013a\u0005\u0017\u0000\u0000\u013a\u001f"+
		"\u0001\u0000\u0000\u0000\u013b\u013d\u0005\u001d\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u0143\u0003H$\u0000\u013f\u0140\u0005\u0018"+
		"\u0000\u0000\u0140\u0142\u0003H$\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0005\u001e\u0000\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u015a\u0001\u0000\u0000\u0000\u0149\u014b\u0005\u0018\u0000\u0000"+
		"\u014a\u014c\u0005\u001d\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u0152\u0003H$\u0000\u014e\u014f\u0005\u0018\u0000\u0000\u014f\u0151"+
		"\u0003H$\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0155\u0157\u0005\u001e\u0000\u0000\u0156\u0155\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000"+
		"\u0000\u0000\u0158\u0149\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000"+
		"\u0000\u0000\u015b!\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015d\u0166\u0005\u001f\u0000\u0000\u015e\u0163\u0003$\u0012\u0000"+
		"\u015f\u0160\u0005\u0018\u0000\u0000\u0160\u0162\u0003$\u0012\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166"+
		"\u015e\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u016a\u0005\u0018\u0000\u0000\u0169"+
		"\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0005 \u0000\u0000\u016c\u016e"+
		"\u0005\u0017\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e#\u0001\u0000\u0000\u0000\u016f\u0172\u0003"+
		"n7\u0000\u0170\u0172\u0003&\u0013\u0000\u0171\u016f\u0001\u0000\u0000"+
		"\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172%\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0005\u001d\u0000\u0000\u0174\u0179\u0003(\u0014\u0000\u0175"+
		"\u0176\u0005\u0018\u0000\u0000\u0176\u0178\u0003(\u0014\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0005\u001e\u0000\u0000\u017d\'\u0001\u0000\u0000\u0000\u017e\u017f\u0005"+
		"\u0003\u0000\u0000\u017f\u0180\u0005\u0019\u0000\u0000\u0180\u0181\u0003"+
		"n7\u0000\u0181)\u0001\u0000\u0000\u0000\u0182\u0184\u0003L&\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188"+
		"\u018a\u0003\b\u0004\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005\u0002\u0000\u0000\u018c\u018f\u0005\u0003\u0000\u0000\u018d\u018e"+
		"\u0005\u0014\u0000\u0000\u018e\u0190\u0005\u0002\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0193\u0005\u001b\u0000\u0000\u0192\u0194"+
		"\u00030\u0018\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0005"+
		"\u001c\u0000\u0000\u0196\u0198\u0005\u0019\u0000\u0000\u0197\u0196\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019b\u0001"+
		"\u0000\u0000\u0000\u0199\u019c\u0003\u0006\u0003\u0000\u019a\u019c\u0005"+
		"\u0002\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019a\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u019f\u00036\u001b\u0000\u019e\u01a0\u0005\u0017"+
		"\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0\u01b5\u0001\u0000\u0000\u0000\u01a1\u01a2\u0007\u0001"+
		"\u0000\u0000\u01a2\u01a5\u0005\u001b\u0000\u0000\u01a3\u01a4\u0005\u0005"+
		"\u0000\u0000\u01a4\u01a6\u0005\u0018\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a9\u0005\u0003\u0000\u0000\u01a8\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ac\u0005\u001b\u0000\u0000\u01ab\u01ad\u00030\u0018"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u001c\u0000"+
		"\u0000\u01af\u01b0\u0005&\u0000\u0000\u01b0\u01b1\u00036\u001b\u0000\u01b1"+
		"\u01b2\u0005\u001c\u0000\u0000\u01b2\u01b3\u0005\u0017\u0000\u0000\u01b3"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b4\u0185\u0001\u0000\u0000\u0000\u01b4"+
		"\u01a1\u0001\u0000\u0000\u0000\u01b5+\u0001\u0000\u0000\u0000\u01b6\u01b8"+
		"\u0005\u001b\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\u00030\u0018\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005"+
		"\u001c\u0000\u0000\u01bd\u01be\u0005&\u0000\u0000\u01be\u01bf\u00036\u001b"+
		"\u0000\u01bf-\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\'\u0000\u0000"+
		"\u01c1\u01c6\u0005\u0003\u0000\u0000\u01c2\u01c3\u0005\u001a\u0000\u0000"+
		"\u01c3\u01c5\u0005\u0003\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u001b\u0000\u0000"+
		"\u01ca\u01cb\u00036\u001b\u0000\u01cb\u01d0\u0005\u001c\u0000\u0000\u01cc"+
		"\u01cd\u0005\u001a\u0000\u0000\u01cd\u01ce\u0005\u0003\u0000\u0000\u01ce"+
		"\u01cf\u0005\u001b\u0000\u0000\u01cf\u01d1\u0005\u001c\u0000\u0000\u01d0"+
		"\u01cc\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\u0017\u0000\u0000\u01d3"+
		"/\u0001\u0000\u0000\u0000\u01d4\u01d9\u00032\u0019\u0000\u01d5\u01d6\u0005"+
		"\u0018\u0000\u0000\u01d6\u01d8\u00032\u0019\u0000\u01d7\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da1\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u0003\u0000"+
		"\u0000\u01dd\u01de\u0005\u0019\u0000\u0000\u01de\u01e0\u0003\u0006\u0003"+
		"\u0000\u01df\u01e1\u0005\r\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e4\u0005\u0016\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e43\u0001\u0000\u0000\u0000\u01e5"+
		"\u01ea\u0007\u0001\u0000\u0000\u01e6\u01e7\u0005\u001a\u0000\u0000\u01e7"+
		"\u01e9\u0005\u0003\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ef\u0005\u001b\u0000\u0000\u01ee"+
		"\u01f0\u00038\u001c\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3"+
		"\u0005\u001c\u0000\u0000\u01f2\u01f4\u0003\u0002\u0001\u0000\u01f3\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f45\u0001"+
		"\u0000\u0000\u0000\u01f5\u01fc\u0005\u001d\u0000\u0000\u01f6\u01fb\u0003"+
		"\u0002\u0001\u0000\u01f7\u01fb\u00034\u001a\u0000\u01f8\u01fb\u0003J%"+
		"\u0000\u01f9\u01fb\u0003,\u0016\u0000\u01fa\u01f6\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f7\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0005\u001e\u0000\u0000\u02007\u0001\u0000\u0000\u0000\u0201"+
		"\u0206\u0003n7\u0000\u0202\u0203\u0005\u0018\u0000\u0000\u0203\u0205\u0003"+
		"n7\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000"+
		"\u0000\u0207\u0215\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000"+
		"\u0000\u0209\u020e\u0003H$\u0000\u020a\u020b\u0005\u0018\u0000\u0000\u020b"+
		"\u020d\u0003H$\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u0210\u0001"+
		"\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001"+
		"\u0000\u0000\u0000\u0211\u0213\u0005\u0018\u0000\u0000\u0212\u0211\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0215\u0001"+
		"\u0000\u0000\u0000\u0214\u0201\u0001\u0000\u0000\u0000\u0214\u0209\u0001"+
		"\u0000\u0000\u0000\u02159\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0002"+
		"\u0000\u0000\u0217\u0218\u0005\u001b\u0000\u0000\u0218\u0219\u0003n7\u0000"+
		"\u0219\u021a\u0005\u001c\u0000\u0000\u021a\u021d\u00036\u001b\u0000\u021b"+
		"\u021c\u0005\u0002\u0000\u0000\u021c\u021e\u00036\u001b\u0000\u021d\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e;\u0001"+
		"\u0000\u0000\u0000\u021f\u0221\u0003L&\u0000\u0220\u021f\u0001\u0000\u0000"+
		"\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000"+
		"\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225\u0227\u0005\u0002\u0000"+
		"\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u0002\u0000"+
		"\u0000\u0229\u022c\u0005\u0003\u0000\u0000\u022a\u022b\u0007\u0002\u0000"+
		"\u0000\u022b\u022d\u0005\u0003\u0000\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0005\u001d\u0000\u0000\u022f\u0230\u0003>\u001f\u0000"+
		"\u0230\u0231\u0005\u001e\u0000\u0000\u0231=\u0001\u0000\u0000\u0000\u0232"+
		"\u0238\u0003@ \u0000\u0233\u0238\u0003B!\u0000\u0234\u0238\u0003D\"\u0000"+
		"\u0235\u0238\u0003F#\u0000\u0236\u0238\u0003\u0002\u0001\u0000\u0237\u0232"+
		"\u0001\u0000\u0000\u0000\u0237\u0233\u0001\u0000\u0000\u0000\u0237\u0234"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0236"+
		"\u0001\u0000\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u0237"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a?\u0001"+
		"\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023c\u023d\u0005"+
		"\u0002\u0000\u0000\u023d\u023e\u0005\u0003\u0000\u0000\u023e\u023f\u0005"+
		"\u001b\u0000\u0000\u023f\u0240\u0005\u001c\u0000\u0000\u0240\u0241\u0005"+
		"\u0003\u0000\u0000\u0241\u0242\u0005\u0014\u0000\u0000\u0242\u0243\u0005"+
		"\u0002\u0000\u0000\u0243\u0244\u0005\u0003\u0000\u0000\u0244\u0245\u0005"+
		"\r\u0000\u0000\u0245\u0246\u0005\u0016\u0000\u0000\u0246\u0247\u0005\u001b"+
		"\u0000\u0000\u0247\u0248\u0005\u001c\u0000\u0000\u0248\u0249\u0005\u0017"+
		"\u0000\u0000\u0249A\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u0003\u0000"+
		"\u0000\u024b\u024d\u0005\u001b\u0000\u0000\u024c\u024e\u00038\u001c\u0000"+
		"\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000"+
		"\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0005\u001c\u0000\u0000"+
		"\u0250\u0251\u0005\u0019\u0000\u0000\u0251\u0252\u0005\u0002\u0000\u0000"+
		"\u0252\u0253\u00036\u001b\u0000\u0253C\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0005\u0002\u0000\u0000\u0255\u0257\u0005\u0003\u0000\u0000\u0256\u0254"+
		"\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025b"+
		"\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025c"+
		"\u0005\u0003\u0000\u0000\u025c\u025d\u0005\u0019\u0000\u0000\u025d\u0260"+
		"\u0003\u0006\u0003\u0000\u025e\u025f\u0005\u0014\u0000\u0000\u025f\u0261"+
		"\u0003n7\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0263\u0005\u0017"+
		"\u0000\u0000\u0263E\u0001\u0000\u0000\u0000\u0264\u0265\u0007\u0001\u0000"+
		"\u0000\u0265\u0267\u0005\u001b\u0000\u0000\u0266\u0268\u0003H$\u0000\u0267"+
		"\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"+
		"\u026d\u0001\u0000\u0000\u0000\u0269\u026a\u0005\u0018\u0000\u0000\u026a"+
		"\u026c\u0003H$\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026f\u0001"+
		"\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u026d\u0001"+
		"\u0000\u0000\u0000\u0270\u0271\u0005\u001c\u0000\u0000\u0271\u0276\u0005"+
		"\u001d\u0000\u0000\u0272\u0275\u0003J%\u0000\u0273\u0275\u0003\u0002\u0001"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0273\u0001\u0000\u0000"+
		"\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0001\u0000\u0000"+
		"\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027a\u0005\u001e\u0000"+
		"\u0000\u027aG\u0001\u0000\u0000\u0000\u027b\u027d\u0003\b\u0004\u0000"+
		"\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000"+
		"\u027f\u0282\u0005\u0019\u0000\u0000\u0280\u0283\u0003\u0006\u0003\u0000"+
		"\u0281\u0283\u0005\u0005\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0282\u0281\u0001\u0000\u0000\u0000\u0283I\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0005\u0002\u0000\u0000\u0285\u0286\u0005\u001a\u0000\u0000\u0286"+
		"\u0287\u0005\u0003\u0000\u0000\u0287\u0288\u0005\u0014\u0000\u0000\u0288"+
		"\u0289\u0005\u0003\u0000\u0000\u0289\u02a1\u0005\u0017\u0000\u0000\u028a"+
		"\u028b\u0007\u0001\u0000\u0000\u028b\u028c\u0003\u0004\u0002\u0000\u028c"+
		"\u028d\u0007\u0001\u0000\u0000\u028d\u028e\u0005\u0014\u0000\u0000\u028e"+
		"\u028f\u0007\u0001\u0000\u0000\u028f\u0290\u0003\u0004\u0002\u0000\u0290"+
		"\u0295\u0007\u0001\u0000\u0000\u0291\u0292\u0005\u001a\u0000\u0000\u0292"+
		"\u0294\u0007\u0001\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294"+
		"\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000\u0000\u0000\u0297"+
		"\u0295\u0001\u0000\u0000\u0000\u0298\u029a\u0005\u001b\u0000\u0000\u0299"+
		"\u0298\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a"+
		"\u029c\u0001\u0000\u0000\u0000\u029b\u029d\u0005\u001c\u0000\u0000\u029c"+
		"\u029b\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d"+
		"\u029e\u0001\u0000\u0000\u0000\u029e\u029f\u0005\u0017\u0000\u0000\u029f"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a0\u0284\u0001\u0000\u0000\u0000\u02a0"+
		"\u028a\u0001\u0000\u0000\u0000\u02a1K\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0005\u0002\u0000\u0000\u02a3\u02a4\u0007\u0001\u0000\u0000\u02a4\u02a5"+
		"\u0005\u001b\u0000\u0000\u02a5\u02a6\u0003N\'\u0000\u02a6\u02a7\u0005"+
		"\u001c\u0000\u0000\u02a7M\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005\u001d"+
		"\u0000\u0000\u02a9\u02ae\u0003P(\u0000\u02aa\u02ab\u0005\u0018\u0000\u0000"+
		"\u02ab\u02ad\u0003P(\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ad\u02b0"+
		"\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b3\u0005\u0018\u0000\u0000\u02b2\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005\u001e\u0000\u0000\u02b5O\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b7\u0005\u0003\u0000\u0000\u02b7\u02b9\u0005"+
		"\u0019\u0000\u0000\u02b8\u02ba\u0005\u001f\u0000\u0000\u02b9\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001"+
		"\u0000\u0000\u0000\u02bb\u02c0\u0007\u0003\u0000\u0000\u02bc\u02bd\u0005"+
		"\u0018\u0000\u0000\u02bd\u02bf\u0005\u0003\u0000\u0000\u02be\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c5\u0005"+
		" \u0000\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c5Q\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005\u0002\u0000"+
		"\u0000\u02c7\u02c8\u0005\u0002\u0000\u0000\u02c8\u02c9\u0005\u0003\u0000"+
		"\u0000\u02c9\u02ca\u0005\u001d\u0000\u0000\u02ca\u02cb\u0003T*\u0000\u02cb"+
		"\u02cc\u0005\u001e\u0000\u0000\u02ccS\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u00032\u0019\u0000\u02ce\u02cf\u0005\u0017\u0000\u0000\u02cf\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d0\u02cd\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d3U\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d6\u0005\u0002\u0000\u0000\u02d6\u02d7\u0005\u001b"+
		"\u0000\u0000\u02d7\u02d8\u0003X,\u0000\u02d8\u02d9\u0005\u001c\u0000\u0000"+
		"\u02d9\u02da\u00036\u001b\u0000\u02daW\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0005\u0002\u0000\u0000\u02dc\u02dd\u0005\u0003\u0000\u0000\u02dd\u02de"+
		"\u0005\u0014\u0000\u0000\u02de\u02df\u0005\u0004\u0000\u0000\u02df\u02e0"+
		"\u0005\u0017\u0000\u0000\u02e0\u02e9\u0005\u0003\u0000\u0000\u02e1\u02e3"+
		"\u0005\u0015\u0000\u0000\u02e2\u02e4\u0005\u0014\u0000\u0000\u02e3\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02ea"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e7\u0005\u0016\u0000\u0000\u02e6\u02e8"+
		"\u0005\u0014\u0000\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u0001\u0000\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e5\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005\u0004\u0000\u0000\u02ec\u02ed"+
		"\u0005\u0017\u0000\u0000\u02ed\u02ee\u0003\u0002\u0001\u0000\u02eeY\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0005\u0002\u0000\u0000\u02f0\u02f1\u0005"+
		"\u001b\u0000\u0000\u02f1\u02f2\u0003n7\u0000\u02f2\u02f3\u0005\u001c\u0000"+
		"\u0000\u02f3\u02f4\u00036\u001b\u0000\u02f4[\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f6\u0005\u0002\u0000\u0000\u02f6\u02f9\u0003^/\u0000\u02f7\u02f8\u0005"+
		"\u0002\u0000\u0000\u02f8\u02fa\u0005\u0005\u0000\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0005\u0017\u0000\u0000\u02fc]\u0001\u0000"+
		"\u0000\u0000\u02fd\u030a\u0005\u0003\u0000\u0000\u02fe\u02ff\u0005\u001d"+
		"\u0000\u0000\u02ff\u0304\u0003`0\u0000\u0300\u0301\u0005\u0018\u0000\u0000"+
		"\u0301\u0303\u0003`0\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303\u0306"+
		"\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u0001\u0000\u0000\u0000\u0305\u0307\u0001\u0000\u0000\u0000\u0306\u0304"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0005\u001e\u0000\u0000\u0308\u030a"+
		"\u0001\u0000\u0000\u0000\u0309\u02fd\u0001\u0000\u0000\u0000\u0309\u02fe"+
		"\u0001\u0000\u0000\u0000\u030a_\u0001\u0000\u0000\u0000\u030b\u0312\u0005"+
		"\u0003\u0000\u0000\u030c\u030f\u0005\u0002\u0000\u0000\u030d\u030e\u0005"+
		"\u0002\u0000\u0000\u030e\u0310\u0007\u0001\u0000\u0000\u030f\u030d\u0001"+
		"\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0312\u0001"+
		"\u0000\u0000\u0000\u0311\u030b\u0001\u0000\u0000\u0000\u0311\u030c\u0001"+
		"\u0000\u0000\u0000\u0312a\u0001\u0000\u0000\u0000\u0313\u0323\u0005\u0002"+
		"\u0000\u0000\u0314\u0316\u0005\u0002\u0000\u0000\u0315\u0314\u0001\u0000"+
		"\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000"+
		"\u0000\u0000\u0317\u0324\u0003n7\u0000\u0318\u0319\u0005\u001d\u0000\u0000"+
		"\u0319\u031e\u0003d2\u0000\u031a\u031b\u0005\u0018\u0000\u0000\u031b\u031d"+
		"\u0003d2\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u0320\u0001\u0000"+
		"\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000"+
		"\u0000\u0000\u031f\u0321\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000"+
		"\u0000\u0000\u0321\u0322\u0005\u001e\u0000\u0000\u0322\u0324\u0001\u0000"+
		"\u0000\u0000\u0323\u0315\u0001\u0000\u0000\u0000\u0323\u0318\u0001\u0000"+
		"\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0005\u0017"+
		"\u0000\u0000\u0326c\u0001\u0000\u0000\u0000\u0327\u032a\u0005\u0003\u0000"+
		"\u0000\u0328\u0329\u0005\u0002\u0000\u0000\u0329\u032b\u0005\u0003\u0000"+
		"\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000"+
		"\u0000\u032be\u0001\u0000\u0000\u0000\u032c\u032e\u0003j5\u0000\u032d"+
		"\u032f\u0005\u0003\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330"+
		"\u0331\u0005\u001d\u0000\u0000\u0331\u0336\u0003h4\u0000\u0332\u0333\u0005"+
		"\u0017\u0000\u0000\u0333\u0335\u0003h4\u0000\u0334\u0332\u0001\u0000\u0000"+
		"\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000"+
		"\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0339\u0001\u0000\u0000"+
		"\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0339\u033a\u0005\u0017\u0000"+
		"\u0000\u033a\u033b\u0005\u001e\u0000\u0000\u033bg\u0001\u0000\u0000\u0000"+
		"\u033c\u033d\u0005\u0003\u0000\u0000\u033d\u0341\u0005\u0019\u0000\u0000"+
		"\u033e\u0340\u0007\u0004\u0000\u0000\u033f\u033e\u0001\u0000\u0000\u0000"+
		"\u0340\u0343\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000"+
		"\u0341\u0342\u0001\u0000\u0000\u0000\u0342i\u0001\u0000\u0000\u0000\u0343"+
		"\u0341\u0001\u0000\u0000\u0000\u0344\u0349\u0003l6\u0000\u0345\u0346\u0005"+
		"\u0018\u0000\u0000\u0346\u0348\u0003l6\u0000\u0347\u0345\u0001\u0000\u0000"+
		"\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000"+
		"\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034ak\u0001\u0000\u0000\u0000"+
		"\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u0354\u0005\u0003\u0000\u0000"+
		"\u034d\u034e\u0005\u001a\u0000\u0000\u034e\u0354\u0005\u0003\u0000\u0000"+
		"\u034f\u0350\u0005%\u0000\u0000\u0350\u0354\u0005\u0003\u0000\u0000\u0351"+
		"\u0352\u0005\u0019\u0000\u0000\u0352\u0354\u0005\u0003\u0000\u0000\u0353"+
		"\u034c\u0001\u0000\u0000\u0000\u0353\u034d\u0001\u0000\u0000\u0000\u0353"+
		"\u034f\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354"+
		"m\u0001\u0000\u0000\u0000\u0355\u0356\u00067\uffff\uffff\u0000\u0356\u0358"+
		"\u0005\u0003\u0000\u0000\u0357\u0359\u0005\u001b\u0000\u0000\u0358\u0357"+
		"\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035b"+
		"\u0001\u0000\u0000\u0000\u035a\u035c\u0005\u001c\u0000\u0000\u035b\u035a"+
		"\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u0369"+
		"\u0001\u0000\u0000\u0000\u035d\u0369\u0005\u0004\u0000\u0000\u035e\u0369"+
		"\u0005\u0005\u0000\u0000\u035f\u0369\u0005\u0006\u0000\u0000\u0360\u0369"+
		"\u00034\u001a\u0000\u0361\u0369\u0003\"\u0011\u0000\u0362\u0369\u0003"+
		"\u0016\u000b\u0000\u0363\u0369\u0003R)\u0000\u0364\u0367\u0003V+\u0000"+
		"\u0365\u0367\u0003Z-\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0365"+
		"\u0001\u0000\u0000\u0000\u0367\u0369\u0001\u0000\u0000\u0000\u0368\u0355"+
		"\u0001\u0000\u0000\u0000\u0368\u035d\u0001\u0000\u0000\u0000\u0368\u035e"+
		"\u0001\u0000\u0000\u0000\u0368\u035f\u0001\u0000\u0000\u0000\u0368\u0360"+
		"\u0001\u0000\u0000\u0000\u0368\u0361\u0001\u0000\u0000\u0000\u0368\u0362"+
		"\u0001\u0000\u0000\u0000\u0368\u0363\u0001\u0000\u0000\u0000\u0368\u0366"+
		"\u0001\u0000\u0000\u0000\u0369\u037e\u0001\u0000\u0000\u0000\u036a\u036b"+
		"\n\u0004\u0000\u0000\u036b\u036c\u0003\u0004\u0002\u0000\u036c\u0379\u0003"+
		"n7\u0000\u036d\u036f\u0007\u0005\u0000\u0000\u036e\u036d\u0001\u0000\u0000"+
		"\u0000\u036f\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0373\u0001\u0000\u0000"+
		"\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0373\u0374\u0003n7\u0000\u0374"+
		"\u0375\u0003\u0004\u0002\u0000\u0375\u0376\u0003n7\u0000\u0376\u0378\u0001"+
		"\u0000\u0000\u0000\u0377\u0370\u0001\u0000\u0000\u0000\u0378\u037b\u0001"+
		"\u0000\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001"+
		"\u0000\u0000\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001"+
		"\u0000\u0000\u0000\u037c\u036a\u0001\u0000\u0000\u0000\u037d\u0380\u0001"+
		"\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001"+
		"\u0000\u0000\u0000\u037fo\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000"+
		"\u0000\u0000ts\u0084\u008b\u008f\u0094\u00a3\u00a9\u00b0\u00b9\u00bd\u00c2"+
		"\u00c4\u00c8\u00cc\u00db\u00e1\u00e5\u00f3\u00f7\u0108\u010c\u010f\u0115"+
		"\u0117\u0120\u0125\u012d\u013c\u0143\u0147\u014b\u0152\u0156\u015a\u0163"+
		"\u0166\u0169\u016d\u0171\u0179\u0185\u0189\u018f\u0193\u0197\u019b\u019f"+
		"\u01a5\u01a8\u01ac\u01b4\u01b7\u01ba\u01c6\u01d0\u01d9\u01e0\u01e3\u01ea"+
		"\u01ef\u01f3\u01fa\u01fc\u0206\u020e\u0212\u0214\u021d\u0222\u0226\u022c"+
		"\u0237\u0239\u024d\u0258\u0260\u0267\u026d\u0274\u0276\u027c\u0282\u0295"+
		"\u0299\u029c\u02a0\u02ae\u02b2\u02b9\u02c0\u02c4\u02d2\u02e3\u02e7\u02e9"+
		"\u02f9\u0304\u0309\u030f\u0311\u0315\u031e\u0323\u032a\u032e\u0336\u0341"+
		"\u0349\u0353\u0358\u035b\u0366\u0368\u0370\u0379\u037e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}