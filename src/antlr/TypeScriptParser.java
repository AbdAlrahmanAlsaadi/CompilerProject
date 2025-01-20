// Generated from C:/Users/USER/IdeaProjects/angularproject/src/TypeScriptParser.g4 by ANTLR 4.13.2
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
		PERCIENT=36, HS=37, ARROW=38, Double_Comment=39, Single_Comment=40, WS=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_operator = 2, RULE_typeItem = 3, 
		RULE_type = 4, RULE_accessMoidifers = 5, RULE_directiveElement = 6, RULE_content = 7, 
		RULE_directive = 8, RULE_htmlContent = 9, RULE_templateBinding = 10, RULE_enumLiteral = 11, 
		RULE_enumAccess = 12, RULE_variableDeclaration = 13, RULE_tupleLiteral = 14, 
		RULE_listVar = 15, RULE_listBody = 16, RULE_listBodyBody = 17, RULE_arrayLiteral = 18, 
		RULE_arrayElement = 19, RULE_objectLiteral = 20, RULE_propertyAssignment = 21, 
		RULE_functionDeclaration = 22, RULE_arrowFunction = 23, RULE_awaitDef = 24, 
		RULE_parameterFunction = 25, RULE_parameter = 26, RULE_functionCall = 27, 
		RULE_block = 28, RULE_arrow = 29, RULE_argumentList = 30, RULE_ifStatement = 31, 
		RULE_classDeclaration = 32, RULE_classBody = 33, RULE_classCall = 34, 
		RULE_funclass = 35, RULE_propertyDeclaration = 36, RULE_constructorDeclaration = 37, 
		RULE_parameterList = 38, RULE_thisAssignment = 39, RULE_decorator = 40, 
		RULE_decoratorBody = 41, RULE_decoratorProperty = 42, RULE_interfaceDeclaration = 43, 
		RULE_interfaceBody = 44, RULE_forloop = 45, RULE_forBrack = 46, RULE_whileloop = 47, 
		RULE_importStatement = 48, RULE_importClause = 49, RULE_importSpecifier = 50, 
		RULE_exportStatement = 51, RULE_exportSpecifier = 52, RULE_cssDec = 53, 
		RULE_cssBody = 54, RULE_selector = 55, RULE_simpleSelector = 56, RULE_expressionItem = 57, 
		RULE_expression = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "operator", "typeItem", "type", "accessMoidifers", 
			"directiveElement", "content", "directive", "htmlContent", "templateBinding", 
			"enumLiteral", "enumAccess", "variableDeclaration", "tupleLiteral", "listVar", 
			"listBody", "listBodyBody", "arrayLiteral", "arrayElement", "objectLiteral", 
			"propertyAssignment", "functionDeclaration", "arrowFunction", "awaitDef", 
			"parameterFunction", "parameter", "functionCall", "block", "arrow", "argumentList", 
			"ifStatement", "classDeclaration", "classBody", "classCall", "funclass", 
			"propertyDeclaration", "constructorDeclaration", "parameterList", "thisAssignment", 
			"decorator", "decoratorBody", "decoratorProperty", "interfaceDeclaration", 
			"interfaceBody", "forloop", "forBrack", "whileloop", "importStatement", 
			"importClause", "importSpecifier", "exportStatement", "exportSpecifier", 
			"cssDec", "cssBody", "selector", "simpleSelector", "expressionItem", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'{{'", "'}}'", null, "'of'", 
			"'ngFor'", "'ngIf'", null, null, "'+'", "'-'", "'_'", "'*'", "'/'", "'='", 
			"'<'", "'>'", "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'||'", "'&&'", "'|'", "'%'", "'#'", "'=>'"
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
			"HS", "ARROW", "Double_Comment", "Single_Comment", "WS"
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414565015804L) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				decorator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				enumLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				templateBinding();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				directiveElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				importStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				functionDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				classDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				variableDeclaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				listVar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(136);
				cssDec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(137);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(PLUS);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(MULTI);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(SUB);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(LESS);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(144);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(BIGGER);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(148);
					match(ASSIGN);
					}
				}

				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(ASSIGN);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
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
	public static class TypeItemContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(TypeScriptParser.TYPES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TypeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTypeItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTypeItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTypeItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeItemContext typeItem() throws RecognitionException {
		TypeItemContext _localctx = new TypeItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public List<TypeItemContext> typeItem() {
			return getRuleContexts(TypeItemContext.class);
		}
		public TypeItemContext typeItem(int i) {
			return getRuleContext(TypeItemContext.class,i);
		}
		public TerminalNode LSQUARE() { return getToken(TypeScriptParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TypeScriptParser.RSQUARE, 0); }
		public TerminalNode TYPES() { return getToken(TypeScriptParser.TYPES, 0); }
		public TerminalNode LESS() { return getToken(TypeScriptParser.LESS, 0); }
		public TerminalNode BIGGER() { return getToken(TypeScriptParser.BIGGER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				typeItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				typeItem();
				setState(161);
				match(LSQUARE);
				setState(162);
				match(RSQUARE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(TYPES);
				setState(165);
				match(LESS);
				setState(166);
				typeItem();
				setState(167);
				match(BIGGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(LSQUARE);
				setState(170);
				typeItem();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					typeItem();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
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
		enterRule(_localctx, 10, RULE_accessMoidifers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
		enterRule(_localctx, 12, RULE_directiveElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(TAG_OPEN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2281701900L) != 0)) {
				{
				{
				setState(185);
				directive();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIVID) {
				{
				setState(191);
				match(DIVID);
				}
			}

			setState(194);
			match(BIGGER);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(197);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
					case BINDING_START:
						{
						setState(195);
						content();
						}
						break;
					case TAG_OPEN:
						{
						setState(196);
						directiveElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(202);
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
		enterRule(_localctx, 14, RULE_content);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				htmlContent();
				}
				break;
			case BINDING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
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
		enterRule(_localctx, 16, RULE_directive);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
			case IDENTIFIER:
			case DIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				match(ASSIGN);
				setState(211);
				match(STRING);
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(LSQUARE);
				setState(213);
				match(IDENTIFIER);
				setState(214);
				match(RSQUARE);
				setState(215);
				match(ASSIGN);
				setState(216);
				match(STRING);
				}
				break;
			case OPENB:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(OPENB);
				setState(218);
				match(IDENTIFIER);
				setState(219);
				match(CLOSEB);
				setState(220);
				match(ASSIGN);
				setState(221);
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
		enterRule(_localctx, 18, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IDENTIFIER);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(IDENTIFIER);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(231);
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
		enterRule(_localctx, 20, RULE_templateBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(BINDING_START);
			setState(235);
			expression();
			setState(236);
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
		enterRule(_localctx, 22, RULE_enumLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(KEYWORDS);
			setState(239);
			match(IDENTIFIER);
			setState(240);
			match(LBRACE);
			setState(241);
			match(IDENTIFIER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				match(IDENTIFIER);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(244);
					match(ASSIGN);
					setState(245);
					expression();
					}
				}

				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
		enterRule(_localctx, 24, RULE_enumAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(KEYWORDS);
			setState(256);
			match(IDENTIFIER);
			setState(257);
			match(COLON);
			setState(258);
			match(IDENTIFIER);
			setState(259);
			match(ASSIGN);
			setState(260);
			match(IDENTIFIER);
			setState(261);
			match(DOT);
			setState(262);
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
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			int _alt;
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						decorator();
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(270);
					accessMoidifers();
					}
					break;
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORDS) {
					{
					setState(273);
					match(KEYWORDS);
					}
				}

				setState(276);
				parameter();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(277);
					match(ASSIGN);
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(278);
						expression();
						}
						break;
					case 2:
						{
						setState(279);
						tupleLiteral();
						}
						break;
					}
					}
				}

				setState(284);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				expression();
				setState(287);
				operator();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277025390716L) != 0)) {
					{
					{
					setState(288);
					expression();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(294);
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
		enterRule(_localctx, 28, RULE_tupleLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LSQUARE);
			setState(299);
			expression();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300);
				match(COMMA);
				setState(301);
				expression();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
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
		enterRule(_localctx, 30, RULE_listVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDENTIFIER);
			setState(310);
			match(ASSIGN);
			setState(311);
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
		enterRule(_localctx, 32, RULE_listBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(LSQUARE);
			setState(314);
			listBodyBody();
			setState(315);
			match(RSQUARE);
			setState(316);
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
		enterRule(_localctx, 34, RULE_listBodyBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(318);
				match(LBRACE);
				}
			}

			setState(321);
			parameterList();
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					match(COMMA);
					setState(323);
					parameterList();
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACE) {
				{
				setState(329);
				match(RBRACE);
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(332);
				match(COMMA);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(333);
					match(LBRACE);
					}
				}

				setState(336);
				parameterList();
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(COMMA);
						setState(338);
						parameterList();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RBRACE) {
					{
					setState(344);
					match(RBRACE);
					}
				}

				}
				}
				setState(351);
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
		enterRule(_localctx, 36, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LSQUARE);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277562261628L) != 0)) {
				{
				setState(353);
				arrayElement();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(354);
						match(COMMA);
						setState(355);
						arrayElement();
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(363);
				match(COMMA);
				}
			}

			setState(366);
			match(RSQUARE);
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(367);
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
		enterRule(_localctx, 38, RULE_arrayElement);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case LSQUARE:
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
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
		enterRule(_localctx, 40, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LBRACE);
			setState(375);
			propertyAssignment();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(376);
				match(COMMA);
				setState(377);
				propertyAssignment();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
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
		enterRule(_localctx, 42, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(IDENTIFIER);
			setState(386);
			match(COLON);
			setState(387);
			expression();
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
		enterRule(_localctx, 44, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389);
						decorator();
						}
						} 
					}
					setState(394);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(395);
					accessMoidifers();
					}
					break;
				}
				setState(398);
				match(KEYWORDS);
				setState(399);
				match(IDENTIFIER);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(400);
					match(ASSIGN);
					setState(401);
					match(KEYWORDS);
					}
				}

				setState(404);
				match(OPENB);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(405);
					parameterFunction();
					}
				}

				setState(408);
				match(CLOSEB);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(409);
					match(COLON);
					}
				}

				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(412);
					type();
					}
					break;
				case 2:
					{
					setState(413);
					match(KEYWORDS);
					}
					break;
				}
				setState(416);
				block();
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(417);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(421);
				match(OPENB);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(422);
					match(STRING);
					setState(423);
					match(COMMA);
					}
				}

				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(426);
					match(IDENTIFIER);
					}
				}

				setState(429);
				match(OPENB);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(430);
					parameterFunction();
					}
				}

				setState(433);
				match(CLOSEB);
				setState(434);
				match(ARROW);
				setState(435);
				block();
				setState(436);
				match(CLOSEB);
				setState(437);
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
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public ParameterFunctionContext parameterFunction() {
			return getRuleContext(ParameterFunctionContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
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
		enterRule(_localctx, 46, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENB) {
				{
				setState(441);
				match(OPENB);
				}
			}

			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(444);
				parameterFunction();
				}
			}

			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSEB) {
				{
				setState(447);
				match(CLOSEB);
				}
			}

			setState(450);
			match(ARROW);
			setState(451);
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
		public TerminalNode KEYWORDS() { return getToken(TypeScriptParser.KEYWORDS, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(TypeScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScriptParser.DOT, i);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 48, RULE_awaitDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(KEYWORDS);
			setState(454);
			match(IDENTIFIER);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(455);
				match(DOT);
				setState(456);
				match(IDENTIFIER);
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			match(OPENB);
			setState(463);
			block();
			setState(464);
			match(CLOSEB);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(465);
				match(DOT);
				setState(466);
				match(IDENTIFIER);
				setState(467);
				match(OPENB);
				setState(468);
				match(CLOSEB);
				}
				break;
			}
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(471);
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
		enterRule(_localctx, 50, RULE_parameterFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			parameter();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(475);
				match(COMMA);
				setState(476);
				parameter();
				}
				}
				setState(481);
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
		enterRule(_localctx, 52, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(IDENTIFIER);
			setState(483);
			match(COLON);
			setState(484);
			type();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_OPEN) {
				{
				setState(485);
				match(TAG_OPEN);
				}
			}

			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIGGER) {
				{
				setState(488);
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
		enterRule(_localctx, 54, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(492);
				match(DOT);
				setState(493);
				match(IDENTIFIER);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(OPENB);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414565015804L) != 0)) {
				{
				setState(500);
				argumentList();
				}
			}

			setState(503);
			match(CLOSEB);
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(504);
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
		public List<ArrayLiteralContext> arrayLiteral() {
			return getRuleContexts(ArrayLiteralContext.class);
		}
		public ArrayLiteralContext arrayLiteral(int i) {
			return getRuleContext(ArrayLiteralContext.class,i);
		}
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
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
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
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(LBRACE);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414967668988L) != 0)) {
				{
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(508);
					arrayLiteral();
					}
					break;
				case 2:
					{
					setState(509);
					statement();
					}
					break;
				case 3:
					{
					setState(510);
					functionCall();
					}
					break;
				case 4:
					{
					setState(511);
					thisAssignment();
					}
					break;
				case 5:
					{
					setState(512);
					arrowFunction();
					}
					break;
				case 6:
					{
					setState(513);
					parameterList();
					}
					break;
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class ArrowContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ARROW);
			setState(522);
			expression();
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 60, RULE_argumentList);
		int _la;
		try {
			int _alt;
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				statement();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(525);
					match(COMMA);
					setState(526);
					statement();
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				parameterList();
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						match(COMMA);
						setState(534);
						parameterList();
						}
						} 
					}
					setState(539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(540);
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
		enterRule(_localctx, 62, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(KEYWORDS);
			setState(546);
			match(OPENB);
			setState(547);
			expression();
			setState(548);
			match(CLOSEB);
			setState(549);
			block();
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(550);
				match(KEYWORDS);
				setState(551);
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
		enterRule(_localctx, 64, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(554);
					decorator();
					}
					} 
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(560);
				match(KEYWORDS);
				}
				break;
			}
			setState(563);
			match(KEYWORDS);
			setState(564);
			match(IDENTIFIER);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(565);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(566);
				match(IDENTIFIER);
				}
			}

			setState(569);
			match(LBRACE);
			setState(570);
			classBody();
			setState(571);
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
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
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
		enterRule(_localctx, 66, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(573);
					classCall();
					}
					break;
				case 2:
					{
					setState(574);
					funclass();
					}
					break;
				case 3:
					{
					setState(575);
					propertyDeclaration();
					}
					break;
				case 4:
					{
					setState(576);
					constructorDeclaration();
					}
					break;
				case 5:
					{
					setState(577);
					variableDeclaration();
					}
					break;
				}
				}
				setState(580); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 277025390716L) != 0) );
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
		enterRule(_localctx, 68, RULE_classCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(KEYWORDS);
			setState(583);
			match(IDENTIFIER);
			setState(584);
			match(OPENB);
			setState(585);
			match(CLOSEB);
			setState(586);
			match(IDENTIFIER);
			setState(587);
			match(ASSIGN);
			setState(588);
			match(KEYWORDS);
			setState(589);
			match(IDENTIFIER);
			setState(590);
			match(TAG_OPEN);
			setState(591);
			match(BIGGER);
			setState(592);
			match(OPENB);
			setState(593);
			match(CLOSEB);
			setState(594);
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
		enterRule(_localctx, 70, RULE_funclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(IDENTIFIER);
			setState(597);
			match(OPENB);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414565015804L) != 0)) {
				{
				setState(598);
				argumentList();
				}
			}

			setState(601);
			match(CLOSEB);
			setState(602);
			match(COLON);
			setState(603);
			match(KEYWORDS);
			setState(604);
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
		enterRule(_localctx, 72, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORDS) {
				{
				{
				setState(606);
				match(KEYWORDS);
				setState(607);
				match(IDENTIFIER);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(IDENTIFIER);
			setState(614);
			match(COLON);
			setState(615);
			type();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(616);
				match(ASSIGN);
				setState(617);
				expression();
				}
			}

			setState(620);
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
		enterRule(_localctx, 74, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(623);
			match(OPENB);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS || _la==IDENTIFIER) {
				{
				setState(624);
				parameterList();
				}
			}

			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(627);
				match(COMMA);
				setState(628);
				parameterList();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			match(CLOSEB);
			setState(635);
			match(LBRACE);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414565015804L) != 0)) {
				{
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(636);
					thisAssignment();
					}
					break;
				case 2:
					{
					setState(637);
					statement();
					}
					break;
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
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
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(645);
				accessMoidifers();
				}
			}

			setState(648);
			match(IDENTIFIER);
			setState(649);
			match(COLON);
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(650);
				arrayLiteral();
				}
				break;
			case 2:
				{
				setState(651);
				type();
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
		enterRule(_localctx, 78, RULE_thisAssignment);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(KEYWORDS);
				setState(655);
				match(DOT);
				setState(656);
				match(IDENTIFIER);
				setState(657);
				match(ASSIGN);
				setState(658);
				match(IDENTIFIER);
				setState(659);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
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
				operator();
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(663);
				match(ASSIGN);
				setState(664);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(665);
				operator();
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(667);
					match(DOT);
					setState(668);
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
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENB) {
					{
					setState(674);
					match(OPENB);
					}
				}

				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSEB) {
					{
					setState(677);
					match(CLOSEB);
					}
				}

				setState(680);
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
		enterRule(_localctx, 80, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(KEYWORDS);
			setState(685);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(686);
			match(OPENB);
			setState(687);
			decoratorBody();
			setState(688);
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
		enterRule(_localctx, 82, RULE_decoratorBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(LBRACE);
			setState(691);
			decoratorProperty();
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(692);
					match(COMMA);
					setState(693);
					decoratorProperty();
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(699);
				match(COMMA);
				}
			}

			setState(702);
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
		enterRule(_localctx, 84, RULE_decoratorProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(IDENTIFIER);
			setState(705);
			match(COLON);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(706);
				match(LSQUARE);
				}
			}

			setState(709);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(710);
					match(COMMA);
					setState(711);
					match(IDENTIFIER);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RSQUARE) {
				{
				setState(717);
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
		enterRule(_localctx, 86, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(KEYWORDS);
			setState(721);
			match(KEYWORDS);
			setState(722);
			match(IDENTIFIER);
			setState(723);
			match(LBRACE);
			setState(724);
			interfaceBody();
			setState(725);
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
		enterRule(_localctx, 88, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			parameter();
			setState(728);
			match(SEMICOLON);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(729);
				parameter();
				setState(730);
				match(SEMICOLON);
				}
				}
				setState(736);
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
		enterRule(_localctx, 90, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(KEYWORDS);
			setState(738);
			match(OPENB);
			setState(739);
			forBrack();
			setState(740);
			match(CLOSEB);
			setState(741);
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
		enterRule(_localctx, 92, RULE_forBrack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(743);
			match(KEYWORDS);
			setState(744);
			match(IDENTIFIER);
			setState(745);
			match(ASSIGN);
			setState(746);
			match(NUMBER);
			setState(747);
			match(SEMICOLON);
			setState(748);
			match(IDENTIFIER);
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				{
				setState(749);
				match(LESS);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(750);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				{
				setState(753);
				match(BIGGER);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(754);
					match(ASSIGN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(759);
			match(NUMBER);
			setState(760);
			match(SEMICOLON);
			setState(761);
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
		enterRule(_localctx, 94, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(KEYWORDS);
			setState(764);
			match(OPENB);
			setState(765);
			expression();
			setState(766);
			match(CLOSEB);
			setState(767);
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
		enterRule(_localctx, 96, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(KEYWORDS);
			setState(770);
			importClause();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(771);
				match(KEYWORDS);
				setState(772);
				match(STRING);
				}
			}

			setState(775);
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
		enterRule(_localctx, 98, RULE_importClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(777);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				{
				setState(778);
				match(LBRACE);
				setState(779);
				importSpecifier();
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(780);
					match(COMMA);
					setState(781);
					importSpecifier();
					}
					}
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(787);
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
		enterRule(_localctx, 100, RULE_importSpecifier);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(IDENTIFIER);
				}
				break;
			case KEYWORDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(KEYWORDS);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORDS) {
					{
					setState(793);
					match(KEYWORDS);
					setState(794);
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
		enterRule(_localctx, 102, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(KEYWORDS);
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case LSQUARE:
			case ARROW:
				{
				setState(801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(800);
					match(KEYWORDS);
					}
					break;
				}
				setState(803);
				expression();
				}
				break;
			case LBRACE:
				{
				setState(804);
				match(LBRACE);
				setState(805);
				exportSpecifier();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(806);
					match(COMMA);
					setState(807);
					exportSpecifier();
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(817);
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
		enterRule(_localctx, 104, RULE_exportSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(IDENTIFIER);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(820);
				match(KEYWORDS);
				setState(821);
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
		enterRule(_localctx, 106, RULE_cssDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			selector();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(825);
				match(IDENTIFIER);
				}
			}

			setState(828);
			match(LBRACE);
			setState(829);
			cssBody();
			setState(834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(830);
					match(SEMICOLON);
					setState(831);
					cssBody();
					}
					} 
				}
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(837);
			match(SEMICOLON);
			setState(838);
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
		enterRule(_localctx, 108, RULE_cssBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(IDENTIFIER);
			setState(841);
			match(COLON);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953528L) != 0)) {
				{
				{
				setState(842);
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
				setState(847);
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
		enterRule(_localctx, 110, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			simpleSelector();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(849);
				match(COMMA);
				setState(850);
				simpleSelector();
				}
				}
				setState(855);
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
		enterRule(_localctx, 112, RULE_simpleSelector);
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				match(IDENTIFIER);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				match(DOT);
				setState(858);
				match(IDENTIFIER);
				}
				break;
			case HS:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				match(HS);
				setState(860);
				match(IDENTIFIER);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				match(COLON);
				setState(862);
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
	public static class ExpressionItemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode NUMBER() { return getToken(TypeScriptParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypeScriptParser.BOOLEAN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public EnumAccessContext enumAccess() {
			return getRuleContext(EnumAccessContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ArrowContext arrow() {
			return getRuleContext(ArrowContext.class,0);
		}
		public ExpressionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterExpressionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitExpressionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitExpressionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionItemContext expressionItem() throws RecognitionException {
		ExpressionItemContext _localctx = new ExpressionItemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expressionItem);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(IDENTIFIER);
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(866);
					match(OPENB);
					}
					break;
				}
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(869);
					match(CLOSEB);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(875);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(876);
				arrayLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(877);
				enumAccess();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(878);
				interfaceDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(879);
					forloop();
					}
					break;
				case 2:
					{
					setState(880);
					whileloop();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(883);
				arrow();
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionItemContext> expressionItem() {
			return getRuleContexts(ExpressionItemContext.class);
		}
		public ExpressionItemContext expressionItem(int i) {
			return getRuleContext(ExpressionItemContext.class,i);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				expressionItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				expressionItem();
				setState(888);
				operator();
				setState(889);
				expressionItem();
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(893);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
							{
							{
							setState(890);
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
							setState(895);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(896);
						expressionItem();
						setState(897);
						operator();
						setState(898);
						expressionItem();
						}
						} 
					}
					setState(904);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(905);
				expressionItem();
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
					{
					{
					setState(906);
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
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(912);
				expressionItem();
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(913);
						expressionItem();
						setState(917);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
							{
							{
							setState(914);
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
							setState(919);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(920);
						expressionItem();
						}
						} 
					}
					setState(926);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001)\u03a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0005\u0000"+
		"x\b\u0000\n\u0000\f\u0000{\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u008b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0092\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0096\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009b\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ae"+
		"\b\u0004\n\u0004\f\u0004\u00b1\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b5\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00bb\b\u0006\n\u0006\f\u0006\u00be\t\u0006\u0001\u0006\u0003\u0006\u00c1"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c6\b\u0006"+
		"\n\u0006\f\u0006\u00c9\t\u0006\u0001\u0006\u0003\u0006\u00cc\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00d0\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00df\b\b\u0001\t\u0001\t\u0005\t\u00e3\b\t\n\t\f\t\u00e6\t"+
		"\t\u0001\t\u0003\t\u00e9\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00f7\b\u000b\u0005\u000b\u00f9\b\u000b\n\u000b"+
		"\f\u000b\u00fc\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0005\r\u010a"+
		"\b\r\n\r\f\r\u010d\t\r\u0001\r\u0003\r\u0110\b\r\u0001\r\u0003\r\u0113"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0119\b\r\u0003\r\u011b\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0122\b\r\n\r\f\r\u0125"+
		"\t\r\u0001\r\u0001\r\u0003\r\u0129\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u012f\b\u000e\n\u000e\f\u000e\u0132\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003"+
		"\u0011\u0140\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0145"+
		"\b\u0011\n\u0011\f\u0011\u0148\t\u0011\u0001\u0011\u0003\u0011\u014b\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014f\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0154\b\u0011\n\u0011\f\u0011\u0157\t\u0011"+
		"\u0001\u0011\u0003\u0011\u015a\b\u0011\u0005\u0011\u015c\b\u0011\n\u0011"+
		"\f\u0011\u015f\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0165\b\u0012\n\u0012\f\u0012\u0168\t\u0012\u0003\u0012\u016a"+
		"\b\u0012\u0001\u0012\u0003\u0012\u016d\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0171\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0175\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u017b"+
		"\b\u0014\n\u0014\f\u0014\u017e\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0005\u0016\u0187\b\u0016"+
		"\n\u0016\f\u0016\u018a\t\u0016\u0001\u0016\u0003\u0016\u018d\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0193\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0197\b\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u019b\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019f\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01a3\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01a9\b\u0016\u0001\u0016\u0003\u0016"+
		"\u01ac\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b0\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01b8\b\u0016\u0001\u0017\u0003\u0017\u01bb\b\u0017\u0001\u0017"+
		"\u0003\u0017\u01be\b\u0017\u0001\u0017\u0003\u0017\u01c1\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u01ca\b\u0018\n\u0018\f\u0018\u01cd\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01d6\b\u0018\u0001\u0018\u0003\u0018\u01d9\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01de\b\u0019\n\u0019\f\u0019"+
		"\u01e1\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01e7\b\u001a\u0001\u001a\u0003\u001a\u01ea\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u01ef\b\u001b\n\u001b\f\u001b\u01f2\t\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01f6\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01fa\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0203\b\u001c\n\u001c"+
		"\f\u001c\u0206\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0210\b\u001e"+
		"\n\u001e\f\u001e\u0213\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0218\b\u001e\n\u001e\f\u001e\u021b\t\u001e\u0001\u001e\u0003\u001e"+
		"\u021e\b\u001e\u0003\u001e\u0220\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0229"+
		"\b\u001f\u0001 \u0005 \u022c\b \n \f \u022f\t \u0001 \u0003 \u0232\b "+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u0238\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0004!\u0243\b!\u000b!\f!\u0244\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u0258\b"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0005$\u0261\b$\n$"+
		"\f$\u0264\t$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u026b\b$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0003%\u0272\b%\u0001%\u0001%\u0005%\u0276"+
		"\b%\n%\f%\u0279\t%\u0001%\u0001%\u0001%\u0001%\u0005%\u027f\b%\n%\f%\u0282"+
		"\t%\u0001%\u0001%\u0001&\u0003&\u0287\b&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u028d\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u029e"+
		"\b\'\n\'\f\'\u02a1\t\'\u0001\'\u0003\'\u02a4\b\'\u0001\'\u0003\'\u02a7"+
		"\b\'\u0001\'\u0001\'\u0003\'\u02ab\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u02b7\b)\n)\f)\u02ba\t)\u0001"+
		")\u0003)\u02bd\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0003*\u02c4\b*\u0001"+
		"*\u0001*\u0001*\u0005*\u02c9\b*\n*\f*\u02cc\t*\u0001*\u0003*\u02cf\b*"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u02dd\b,\n,\f,\u02e0\t,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u02f0\b.\u0001.\u0001.\u0003.\u02f4\b.\u0003.\u02f6\b.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00030\u0306\b0\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00051\u030f\b1\n1\f1\u0312\t1\u00011\u00011\u00031\u0316"+
		"\b1\u00012\u00012\u00012\u00012\u00032\u031c\b2\u00032\u031e\b2\u0001"+
		"3\u00013\u00033\u0322\b3\u00013\u00013\u00013\u00013\u00013\u00053\u0329"+
		"\b3\n3\f3\u032c\t3\u00013\u00013\u00033\u0330\b3\u00013\u00013\u00014"+
		"\u00014\u00014\u00034\u0337\b4\u00015\u00015\u00035\u033b\b5\u00015\u0001"+
		"5\u00015\u00015\u00055\u0341\b5\n5\f5\u0344\t5\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00056\u034c\b6\n6\f6\u034f\t6\u00017\u00017\u00017\u0005"+
		"7\u0354\b7\n7\f7\u0357\t7\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u0360\b8\u00019\u00019\u00039\u0364\b9\u00019\u00039\u0367\b"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u0372\b9\u00019\u00039\u0375\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0005"+
		":\u037c\b:\n:\f:\u037f\t:\u0001:\u0001:\u0001:\u0001:\u0005:\u0385\b:"+
		"\n:\f:\u0388\t:\u0001:\u0001:\u0005:\u038c\b:\n:\f:\u038f\t:\u0001:\u0001"+
		":\u0001:\u0005:\u0394\b:\n:\f:\u0397\t:\u0001:\u0001:\u0005:\u039b\b:"+
		"\n:\f:\u039e\t:\u0003:\u03a0\b:\u0001:\u0000\u0000;\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0007\u0003\u0000\u0001"+
		"\u0001\u0003\u0003\u0005\u0005\u0002\u0000\u0002\u0003\t\t\u0001\u0000"+
		"\u0002\u0003\u0001\u0000\u0002\u0002\u0001\u0000\u0003\u0005\u0002\u0000"+
		"\u0003\u0005%%\u0001\u0000!#\u0407\u0000y\u0001\u0000\u0000\u0000\u0002"+
		"\u008a\u0001\u0000\u0000\u0000\u0004\u009a\u0001\u0000\u0000\u0000\u0006"+
		"\u009c\u0001\u0000\u0000\u0000\b\u00b4\u0001\u0000\u0000\u0000\n\u00b6"+
		"\u0001\u0000\u0000\u0000\f\u00b8\u0001\u0000\u0000\u0000\u000e\u00cf\u0001"+
		"\u0000\u0000\u0000\u0010\u00de\u0001\u0000\u0000\u0000\u0012\u00e0\u0001"+
		"\u0000\u0000\u0000\u0014\u00ea\u0001\u0000\u0000\u0000\u0016\u00ee\u0001"+
		"\u0000\u0000\u0000\u0018\u00ff\u0001\u0000\u0000\u0000\u001a\u0128\u0001"+
		"\u0000\u0000\u0000\u001c\u012a\u0001\u0000\u0000\u0000\u001e\u0135\u0001"+
		"\u0000\u0000\u0000 \u0139\u0001\u0000\u0000\u0000\"\u013f\u0001\u0000"+
		"\u0000\u0000$\u0160\u0001\u0000\u0000\u0000&\u0174\u0001\u0000\u0000\u0000"+
		"(\u0176\u0001\u0000\u0000\u0000*\u0181\u0001\u0000\u0000\u0000,\u01b7"+
		"\u0001\u0000\u0000\u0000.\u01ba\u0001\u0000\u0000\u00000\u01c5\u0001\u0000"+
		"\u0000\u00002\u01da\u0001\u0000\u0000\u00004\u01e2\u0001\u0000\u0000\u0000"+
		"6\u01eb\u0001\u0000\u0000\u00008\u01fb\u0001\u0000\u0000\u0000:\u0209"+
		"\u0001\u0000\u0000\u0000<\u021f\u0001\u0000\u0000\u0000>\u0221\u0001\u0000"+
		"\u0000\u0000@\u022d\u0001\u0000\u0000\u0000B\u0242\u0001\u0000\u0000\u0000"+
		"D\u0246\u0001\u0000\u0000\u0000F\u0254\u0001\u0000\u0000\u0000H\u0262"+
		"\u0001\u0000\u0000\u0000J\u026e\u0001\u0000\u0000\u0000L\u0286\u0001\u0000"+
		"\u0000\u0000N\u02aa\u0001\u0000\u0000\u0000P\u02ac\u0001\u0000\u0000\u0000"+
		"R\u02b2\u0001\u0000\u0000\u0000T\u02c0\u0001\u0000\u0000\u0000V\u02d0"+
		"\u0001\u0000\u0000\u0000X\u02d7\u0001\u0000\u0000\u0000Z\u02e1\u0001\u0000"+
		"\u0000\u0000\\\u02e7\u0001\u0000\u0000\u0000^\u02fb\u0001\u0000\u0000"+
		"\u0000`\u0301\u0001\u0000\u0000\u0000b\u0315\u0001\u0000\u0000\u0000d"+
		"\u031d\u0001\u0000\u0000\u0000f\u031f\u0001\u0000\u0000\u0000h\u0333\u0001"+
		"\u0000\u0000\u0000j\u0338\u0001\u0000\u0000\u0000l\u0348\u0001\u0000\u0000"+
		"\u0000n\u0350\u0001\u0000\u0000\u0000p\u035f\u0001\u0000\u0000\u0000r"+
		"\u0374\u0001\u0000\u0000\u0000t\u039f\u0001\u0000\u0000\u0000vx\u0003"+
		"\u0002\u0001\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0001\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|\u008b\u0003P(\u0000}\u008b\u0003"+
		">\u001f\u0000~\u008b\u0003t:\u0000\u007f\u008b\u0003\u0016\u000b\u0000"+
		"\u0080\u008b\u0003\u0014\n\u0000\u0081\u008b\u0003\f\u0006\u0000\u0082"+
		"\u008b\u0003`0\u0000\u0083\u008b\u0003f3\u0000\u0084\u008b\u0003,\u0016"+
		"\u0000\u0085\u008b\u0003@ \u0000\u0086\u008b\u0003\u001a\r\u0000\u0087"+
		"\u008b\u0003\u001e\u000f\u0000\u0088\u008b\u0003j5\u0000\u0089\u008b\u0003"+
		"0\u0018\u0000\u008a|\u0001\u0000\u0000\u0000\u008a}\u0001\u0000\u0000"+
		"\u0000\u008a~\u0001\u0000\u0000\u0000\u008a\u007f\u0001\u0000\u0000\u0000"+
		"\u008a\u0080\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000"+
		"\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000"+
		"\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000"+
		"\u008a\u0086\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u0003\u0001\u0000\u0000\u0000\u008c\u009b\u0005\u000f\u0000\u0000"+
		"\u008d\u009b\u0005\u0012\u0000\u0000\u008e\u009b\u0005\u0010\u0000\u0000"+
		"\u008f\u0091\u0005\u0015\u0000\u0000\u0090\u0092\u0005\u0014\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u009b\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u0016\u0000\u0000"+
		"\u0094\u0096\u0005\u0014\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009b\u0001\u0000\u0000\u0000"+
		"\u0097\u009b\u0005\u0014\u0000\u0000\u0098\u009b\u0005\u001a\u0000\u0000"+
		"\u0099\u009b\u0005\u0011\u0000\u0000\u009a\u008c\u0001\u0000\u0000\u0000"+
		"\u009a\u008d\u0001\u0000\u0000\u0000\u009a\u008e\u0001\u0000\u0000\u0000"+
		"\u009a\u008f\u0001\u0000\u0000\u0000\u009a\u0093\u0001\u0000\u0000\u0000"+
		"\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0005\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0007\u0000\u0000\u0000\u009d\u0007\u0001\u0000\u0000\u0000"+
		"\u009e\u00b5\u0001\u0000\u0000\u0000\u009f\u00b5\u0003\u0006\u0003\u0000"+
		"\u00a0\u00a1\u0003\u0006\u0003\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000"+
		"\u00a2\u00a3\u0005 \u0000\u0000\u00a3\u00b5\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0001\u0000\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6"+
		"\u00a7\u0003\u0006\u0003\u0000\u00a7\u00a8\u0005\u0016\u0000\u0000\u00a8"+
		"\u00b5\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u001f\u0000\u0000\u00aa"+
		"\u00af\u0003\u0006\u0003\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac"+
		"\u00ae\u0003\u0006\u0003\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005 \u0000\u0000\u00b3\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b4\u009e\u0001\u0000\u0000\u0000\u00b4\u009f"+
		"\u0001\u0000\u0000\u0000\u00b4\u00a0\u0001\u0000\u0000\u0000\u00b4\u00a4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00a9\u0001\u0000\u0000\u0000\u00b5\t\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u000b\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bc\u0005\r\u0000\u0000\u00b9\u00bb\u0003\u0010"+
		"\b\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c1\u0005\u0013\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c7\u0005\u0016\u0000\u0000\u00c3\u00c6\u0003\u000e\u0007"+
		"\u0000\u00c4\u00c6\u0003\f\u0006\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cc\u0005\u000e\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\r\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d0\u0003\u0012\t\u0000\u00ce\u00d0\u0003\u0014\n\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u000f"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007\u0001\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0014\u0000\u0000\u00d3\u00df\u0005\u0005\u0000\u0000\u00d4\u00d5"+
		"\u0005\u001f\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7"+
		"\u0005 \u0000\u0000\u00d7\u00d8\u0005\u0014\u0000\u0000\u00d8\u00df\u0005"+
		"\u0005\u0000\u0000\u00d9\u00da\u0005\u001b\u0000\u0000\u00da\u00db\u0005"+
		"\u0003\u0000\u0000\u00db\u00dc\u0005\u001c\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0014\u0000\u0000\u00dd\u00df\u0005\u0005\u0000\u0000\u00de\u00d1\u0001"+
		"\u0000\u0000\u0000\u00de\u00d4\u0001\u0000\u0000\u0000\u00de\u00d9\u0001"+
		"\u0000\u0000\u0000\u00df\u0011\u0001\u0000\u0000\u0000\u00e0\u00e4\u0005"+
		"\u0003\u0000\u0000\u00e1\u00e3\u0005\u0003\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005"+
		"\u001a\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u0013\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0007\u0000\u0000\u00eb\u00ec\u0003t:\u0000\u00ec\u00ed\u0005\b\u0000"+
		"\u0000\u00ed\u0015\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0002\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0\u00f1\u0005\u001d\u0000"+
		"\u0000\u00f1\u00fa\u0005\u0003\u0000\u0000\u00f2\u00f3\u0005\u0018\u0000"+
		"\u0000\u00f3\u00f6\u0005\u0003\u0000\u0000\u00f4\u00f5\u0005\u0014\u0000"+
		"\u0000\u00f5\u00f7\u0003t:\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\u001e\u0000\u0000\u00fe\u0017\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0005\u0002\u0000\u0000\u0100\u0101\u0005\u0003\u0000\u0000\u0101"+
		"\u0102\u0005\u0019\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000\u0103"+
		"\u0104\u0005\u0014\u0000\u0000\u0104\u0105\u0005\u0003\u0000\u0000\u0105"+
		"\u0106\u0005\u001a\u0000\u0000\u0106\u0107\u0005\u0003\u0000\u0000\u0107"+
		"\u0019\u0001\u0000\u0000\u0000\u0108\u010a\u0003P(\u0000\u0109\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010f\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0003"+
		"\n\u0005\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u0113\u0005\u0002"+
		"\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u011a\u00034\u001a"+
		"\u0000\u0115\u0118\u0005\u0014\u0000\u0000\u0116\u0119\u0003t:\u0000\u0117"+
		"\u0119\u0003\u001c\u000e\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a"+
		"\u0115\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0017\u0000\u0000\u011d"+
		"\u0129\u0001\u0000\u0000\u0000\u011e\u011f\u0003t:\u0000\u011f\u0123\u0003"+
		"\u0004\u0002\u0000\u0120\u0122\u0003t:\u0000\u0121\u0120\u0001\u0000\u0000"+
		"\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0017\u0000"+
		"\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u010b\u0001\u0000\u0000"+
		"\u0000\u0128\u011e\u0001\u0000\u0000\u0000\u0129\u001b\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u001f\u0000\u0000\u012b\u0130\u0003t:\u0000\u012c"+
		"\u012d\u0005\u0018\u0000\u0000\u012d\u012f\u0003t:\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		" \u0000\u0000\u0134\u001d\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0003"+
		"\u0000\u0000\u0136\u0137\u0005\u0014\u0000\u0000\u0137\u0138\u0003 \u0010"+
		"\u0000\u0138\u001f\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u001f\u0000"+
		"\u0000\u013a\u013b\u0003\"\u0011\u0000\u013b\u013c\u0005 \u0000\u0000"+
		"\u013c\u013d\u0005\u0017\u0000\u0000\u013d!\u0001\u0000\u0000\u0000\u013e"+
		"\u0140\u0005\u001d\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"\u0146\u0003L&\u0000\u0142\u0143\u0005\u0018\u0000\u0000\u0143\u0145\u0003"+
		"L&\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u014b\u0005\u001e\u0000\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u015d\u0001\u0000\u0000"+
		"\u0000\u014c\u014e\u0005\u0018\u0000\u0000\u014d\u014f\u0005\u001d\u0000"+
		"\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0155\u0003L&\u0000\u0151"+
		"\u0152\u0005\u0018\u0000\u0000\u0152\u0154\u0003L&\u0000\u0153\u0151\u0001"+
		"\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0159\u0001"+
		"\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0005"+
		"\u001e\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001"+
		"\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u014c\u0001"+
		"\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e#\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0169\u0005\u001f"+
		"\u0000\u0000\u0161\u0166\u0003&\u0013\u0000\u0162\u0163\u0005\u0018\u0000"+
		"\u0000\u0163\u0165\u0003&\u0013\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u0161\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000"+
		"\u016b\u016d\u0005\u0018\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e\u0170\u0005 \u0000\u0000\u016f\u0171\u0005\u0017\u0000\u0000\u0170"+
		"\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"%\u0001\u0000\u0000\u0000\u0172\u0175\u0003t:\u0000\u0173\u0175\u0003"+
		"(\u0014\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\'\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u001d\u0000"+
		"\u0000\u0177\u017c\u0003*\u0015\u0000\u0178\u0179\u0005\u0018\u0000\u0000"+
		"\u0179\u017b\u0003*\u0015\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b"+
		"\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u001e\u0000\u0000\u0180"+
		")\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0003\u0000\u0000\u0182\u0183"+
		"\u0005\u0019\u0000\u0000\u0183\u0184\u0003t:\u0000\u0184+\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0003P(\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018d\u0003\n\u0005\u0000\u018c"+
		"\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0002\u0000\u0000\u018f"+
		"\u0192\u0005\u0003\u0000\u0000\u0190\u0191\u0005\u0014\u0000\u0000\u0191"+
		"\u0193\u0005\u0002\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0196\u0005\u001b\u0000\u0000\u0195\u0197\u00032\u0019\u0000\u0196\u0195"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u019a\u0005\u001c\u0000\u0000\u0199\u019b"+
		"\u0005\u0019\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019f"+
		"\u0003\b\u0004\u0000\u019d\u019f\u0005\u0002\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003"+
		"8\u001c\u0000\u01a1\u01a3\u0005\u0017\u0000\u0000\u01a2\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01b8\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0007\u0002\u0000\u0000\u01a5\u01a8\u0005\u001b"+
		"\u0000\u0000\u01a6\u01a7\u0005\u0005\u0000\u0000\u01a7\u01a9\u0005\u0018"+
		"\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01ac\u0005\u0003"+
		"\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0005\u001b"+
		"\u0000\u0000\u01ae\u01b0\u00032\u0019\u0000\u01af\u01ae\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005\u001c\u0000\u0000\u01b2\u01b3\u0005&\u0000\u0000"+
		"\u01b3\u01b4\u00038\u001c\u0000\u01b4\u01b5\u0005\u001c\u0000\u0000\u01b5"+
		"\u01b6\u0005\u0017\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7"+
		"\u0188\u0001\u0000\u0000\u0000\u01b7\u01a4\u0001\u0000\u0000\u0000\u01b8"+
		"-\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005\u001b\u0000\u0000\u01ba\u01b9"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bc\u01be\u00032\u0019\u0000\u01bd\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c1\u0005\u001c\u0000\u0000\u01c0\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0005&\u0000\u0000\u01c3\u01c4\u00038\u001c"+
		"\u0000\u01c4/\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u0002\u0000\u0000"+
		"\u01c6\u01cb\u0005\u0003\u0000\u0000\u01c7\u01c8\u0005\u001a\u0000\u0000"+
		"\u01c8\u01ca\u0005\u0003\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u001b\u0000\u0000"+
		"\u01cf\u01d0\u00038\u001c\u0000\u01d0\u01d5\u0005\u001c\u0000\u0000\u01d1"+
		"\u01d2\u0005\u001a\u0000\u0000\u01d2\u01d3\u0005\u0003\u0000\u0000\u01d3"+
		"\u01d4\u0005\u001b\u0000\u0000\u01d4\u01d6\u0005\u001c\u0000\u0000\u01d5"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d9\u0005\u0017\u0000\u0000\u01d8"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"1\u0001\u0000\u0000\u0000\u01da\u01df\u00034\u001a\u0000\u01db\u01dc\u0005"+
		"\u0018\u0000\u0000\u01dc\u01de\u00034\u001a\u0000\u01dd\u01db\u0001\u0000"+
		"\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e03\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u0003\u0000"+
		"\u0000\u01e3\u01e4\u0005\u0019\u0000\u0000\u01e4\u01e6\u0003\b\u0004\u0000"+
		"\u01e5\u01e7\u0005\r\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8"+
		"\u01ea\u0005\u0016\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ea5\u0001\u0000\u0000\u0000\u01eb\u01f0"+
		"\u0007\u0002\u0000\u0000\u01ec\u01ed\u0005\u001a\u0000\u0000\u01ed\u01ef"+
		"\u0005\u0003\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005\u001b\u0000\u0000\u01f4\u01f6"+
		"\u0003<\u001e\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0005"+
		"\u001c\u0000\u0000\u01f8\u01fa\u0003\u0002\u0001\u0000\u01f9\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa7\u0001\u0000"+
		"\u0000\u0000\u01fb\u0204\u0005\u001d\u0000\u0000\u01fc\u0203\u0003$\u0012"+
		"\u0000\u01fd\u0203\u0003\u0002\u0001\u0000\u01fe\u0203\u00036\u001b\u0000"+
		"\u01ff\u0203\u0003N\'\u0000\u0200\u0203\u0003.\u0017\u0000\u0201\u0203"+
		"\u0003L&\u0000\u0202\u01fc\u0001\u0000\u0000\u0000\u0202\u01fd\u0001\u0000"+
		"\u0000\u0000\u0202\u01fe\u0001\u0000\u0000\u0000\u0202\u01ff\u0001\u0000"+
		"\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000"+
		"\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u0005\u001e"+
		"\u0000\u0000\u02089\u0001\u0000\u0000\u0000\u0209\u020a\u0005&\u0000\u0000"+
		"\u020a\u020b\u0003t:\u0000\u020b;\u0001\u0000\u0000\u0000\u020c\u0211"+
		"\u0003\u0002\u0001\u0000\u020d\u020e\u0005\u0018\u0000\u0000\u020e\u0210"+
		"\u0003\u0002\u0001\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0213"+
		"\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212"+
		"\u0001\u0000\u0000\u0000\u0212\u0220\u0001\u0000\u0000\u0000\u0213\u0211"+
		"\u0001\u0000\u0000\u0000\u0214\u0219\u0003L&\u0000\u0215\u0216\u0005\u0018"+
		"\u0000\u0000\u0216\u0218\u0003L&\u0000\u0217\u0215\u0001\u0000\u0000\u0000"+
		"\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000"+
		"\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021e\u0005\u0018\u0000\u0000"+
		"\u021d\u021c\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000"+
		"\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u020c\u0001\u0000\u0000\u0000"+
		"\u021f\u0214\u0001\u0000\u0000\u0000\u0220=\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0005\u0002\u0000\u0000\u0222\u0223\u0005\u001b\u0000\u0000\u0223"+
		"\u0224\u0003t:\u0000\u0224\u0225\u0005\u001c\u0000\u0000\u0225\u0228\u0003"+
		"8\u001c\u0000\u0226\u0227\u0005\u0002\u0000\u0000\u0227\u0229\u00038\u001c"+
		"\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000"+
		"\u0000\u0229?\u0001\u0000\u0000\u0000\u022a\u022c\u0003P(\u0000\u022b"+
		"\u022a\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000\u022d"+
		"\u022b\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e"+
		"\u0231\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230"+
		"\u0232\u0005\u0002\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233"+
		"\u0234\u0005\u0002\u0000\u0000\u0234\u0237\u0005\u0003\u0000\u0000\u0235"+
		"\u0236\u0007\u0003\u0000\u0000\u0236\u0238\u0005\u0003\u0000\u0000\u0237"+
		"\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238"+
		"\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0005\u001d\u0000\u0000\u023a"+
		"\u023b\u0003B!\u0000\u023b\u023c\u0005\u001e\u0000\u0000\u023cA\u0001"+
		"\u0000\u0000\u0000\u023d\u0243\u0003D\"\u0000\u023e\u0243\u0003F#\u0000"+
		"\u023f\u0243\u0003H$\u0000\u0240\u0243\u0003J%\u0000\u0241\u0243\u0003"+
		"\u001a\r\u0000\u0242\u023d\u0001\u0000\u0000\u0000\u0242\u023e\u0001\u0000"+
		"\u0000\u0000\u0242\u023f\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000"+
		"\u0000\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000"+
		"\u0000\u0000\u0245C\u0001\u0000\u0000\u0000\u0246\u0247\u0005\u0002\u0000"+
		"\u0000\u0247\u0248\u0005\u0003\u0000\u0000\u0248\u0249\u0005\u001b\u0000"+
		"\u0000\u0249\u024a\u0005\u001c\u0000\u0000\u024a\u024b\u0005\u0003\u0000"+
		"\u0000\u024b\u024c\u0005\u0014\u0000\u0000\u024c\u024d\u0005\u0002\u0000"+
		"\u0000\u024d\u024e\u0005\u0003\u0000\u0000\u024e\u024f\u0005\r\u0000\u0000"+
		"\u024f\u0250\u0005\u0016\u0000\u0000\u0250\u0251\u0005\u001b\u0000\u0000"+
		"\u0251\u0252\u0005\u001c\u0000\u0000\u0252\u0253\u0005\u0017\u0000\u0000"+
		"\u0253E\u0001\u0000\u0000\u0000\u0254\u0255\u0005\u0003\u0000\u0000\u0255"+
		"\u0257\u0005\u001b\u0000\u0000\u0256\u0258\u0003<\u001e\u0000\u0257\u0256"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0005\u001c\u0000\u0000\u025a\u025b"+
		"\u0005\u0019\u0000\u0000\u025b\u025c\u0005\u0002\u0000\u0000\u025c\u025d"+
		"\u00038\u001c\u0000\u025dG\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u0002"+
		"\u0000\u0000\u025f\u0261\u0005\u0003\u0000\u0000\u0260\u025e\u0001\u0000"+
		"\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000"+
		"\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u0003"+
		"\u0000\u0000\u0266\u0267\u0005\u0019\u0000\u0000\u0267\u026a\u0003\b\u0004"+
		"\u0000\u0268\u0269\u0005\u0014\u0000\u0000\u0269\u026b\u0003t:\u0000\u026a"+
		"\u0268\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0005\u0017\u0000\u0000\u026d"+
		"I\u0001\u0000\u0000\u0000\u026e\u026f\u0007\u0002\u0000\u0000\u026f\u0271"+
		"\u0005\u001b\u0000\u0000\u0270\u0272\u0003L&\u0000\u0271\u0270\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0277\u0001\u0000"+
		"\u0000\u0000\u0273\u0274\u0005\u0018\u0000\u0000\u0274\u0276\u0003L&\u0000"+
		"\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000"+
		"\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000"+
		"\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0005\u001c\u0000\u0000\u027b\u0280\u0005\u001d\u0000\u0000"+
		"\u027c\u027f\u0003N\'\u0000\u027d\u027f\u0003\u0002\u0001\u0000\u027e"+
		"\u027c\u0001\u0000\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f"+
		"\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0001\u0000\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282"+
		"\u0280\u0001\u0000\u0000\u0000\u0283\u0284\u0005\u001e\u0000\u0000\u0284"+
		"K\u0001\u0000\u0000\u0000\u0285\u0287\u0003\n\u0005\u0000\u0286\u0285"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288\u0289\u0005\u0003\u0000\u0000\u0289\u028c"+
		"\u0005\u0019\u0000\u0000\u028a\u028d\u0003$\u0012\u0000\u028b\u028d\u0003"+
		"\b\u0004\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028b\u0001\u0000"+
		"\u0000\u0000\u028dM\u0001\u0000\u0000\u0000\u028e\u028f\u0005\u0002\u0000"+
		"\u0000\u028f\u0290\u0005\u001a\u0000\u0000\u0290\u0291\u0005\u0003\u0000"+
		"\u0000\u0291\u0292\u0005\u0014\u0000\u0000\u0292\u0293\u0005\u0003\u0000"+
		"\u0000\u0293\u02ab\u0005\u0017\u0000\u0000\u0294\u0295\u0007\u0002\u0000"+
		"\u0000\u0295\u0296\u0003\u0004\u0002\u0000\u0296\u0297\u0007\u0002\u0000"+
		"\u0000\u0297\u0298\u0005\u0014\u0000\u0000\u0298\u0299\u0007\u0002\u0000"+
		"\u0000\u0299\u029a\u0003\u0004\u0002\u0000\u029a\u029f\u0007\u0002\u0000"+
		"\u0000\u029b\u029c\u0005\u001a\u0000\u0000\u029c\u029e\u0007\u0002\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000"+
		"\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a4\u0005\u001b\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a7\u0005\u001c\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u0005\u0017\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000"+
		"\u0000\u02aa\u028e\u0001\u0000\u0000\u0000\u02aa\u0294\u0001\u0000\u0000"+
		"\u0000\u02abO\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005\u0002\u0000\u0000"+
		"\u02ad\u02ae\u0007\u0002\u0000\u0000\u02ae\u02af\u0005\u001b\u0000\u0000"+
		"\u02af\u02b0\u0003R)\u0000\u02b0\u02b1\u0005\u001c\u0000\u0000\u02b1Q"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u001d\u0000\u0000\u02b3\u02b8"+
		"\u0003T*\u0000\u02b4\u02b5\u0005\u0018\u0000\u0000\u02b5\u02b7\u0003T"+
		"*\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bd\u0005\u0018\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000"+
		"\u0000\u02be\u02bf\u0005\u001e\u0000\u0000\u02bfS\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0005\u0003\u0000\u0000\u02c1\u02c3\u0005\u0019\u0000\u0000"+
		"\u02c2\u02c4\u0005\u001f\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c5\u02ca\u0007\u0004\u0000\u0000\u02c6\u02c7\u0005\u0018\u0000\u0000"+
		"\u02c7\u02c9\u0005\u0003\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000"+
		"\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02cf\u0005 \u0000\u0000\u02ce"+
		"\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf"+
		"U\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005\u0002\u0000\u0000\u02d1\u02d2"+
		"\u0005\u0002\u0000\u0000\u02d2\u02d3\u0005\u0003\u0000\u0000\u02d3\u02d4"+
		"\u0005\u001d\u0000\u0000\u02d4\u02d5\u0003X,\u0000\u02d5\u02d6\u0005\u001e"+
		"\u0000\u0000\u02d6W\u0001\u0000\u0000\u0000\u02d7\u02d8\u00034\u001a\u0000"+
		"\u02d8\u02de\u0005\u0017\u0000\u0000\u02d9\u02da\u00034\u001a\u0000\u02da"+
		"\u02db\u0005\u0017\u0000\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc"+
		"\u02d9\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000\u0000\u0000\u02de"+
		"\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df"+
		"Y\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e1\u02e2"+
		"\u0005\u0002\u0000\u0000\u02e2\u02e3\u0005\u001b\u0000\u0000\u02e3\u02e4"+
		"\u0003\\.\u0000\u02e4\u02e5\u0005\u001c\u0000\u0000\u02e5\u02e6\u0003"+
		"8\u001c\u0000\u02e6[\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005\u0002\u0000"+
		"\u0000\u02e8\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\u0014\u0000"+
		"\u0000\u02ea\u02eb\u0005\u0004\u0000\u0000\u02eb\u02ec\u0005\u0017\u0000"+
		"\u0000\u02ec\u02f5\u0005\u0003\u0000\u0000\u02ed\u02ef\u0005\u0015\u0000"+
		"\u0000\u02ee\u02f0\u0005\u0014\u0000\u0000\u02ef\u02ee\u0001\u0000\u0000"+
		"\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f3\u0005\u0016\u0000\u0000\u02f2\u02f4\u0005\u0014\u0000"+
		"\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f6\u0001\u0000\u0000\u0000\u02f5\u02ed\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f1\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0005\u0004\u0000\u0000\u02f8\u02f9\u0005\u0017\u0000"+
		"\u0000\u02f9\u02fa\u0003\u0002\u0001\u0000\u02fa]\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0005\u0002\u0000\u0000\u02fc\u02fd\u0005\u001b\u0000\u0000"+
		"\u02fd\u02fe\u0003t:\u0000\u02fe\u02ff\u0005\u001c\u0000\u0000\u02ff\u0300"+
		"\u00038\u001c\u0000\u0300_\u0001\u0000\u0000\u0000\u0301\u0302\u0005\u0002"+
		"\u0000\u0000\u0302\u0305\u0003b1\u0000\u0303\u0304\u0005\u0002\u0000\u0000"+
		"\u0304\u0306\u0005\u0005\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000"+
		"\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0005\u0017\u0000\u0000\u0308a\u0001\u0000\u0000\u0000\u0309"+
		"\u0316\u0005\u0003\u0000\u0000\u030a\u030b\u0005\u001d\u0000\u0000\u030b"+
		"\u0310\u0003d2\u0000\u030c\u030d\u0005\u0018\u0000\u0000\u030d\u030f\u0003"+
		"d2\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000"+
		"\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000"+
		"\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0005\u001e\u0000\u0000\u0314\u0316\u0001\u0000\u0000"+
		"\u0000\u0315\u0309\u0001\u0000\u0000\u0000\u0315\u030a\u0001\u0000\u0000"+
		"\u0000\u0316c\u0001\u0000\u0000\u0000\u0317\u031e\u0005\u0003\u0000\u0000"+
		"\u0318\u031b\u0005\u0002\u0000\u0000\u0319\u031a\u0005\u0002\u0000\u0000"+
		"\u031a\u031c\u0007\u0002\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031e\u0001\u0000\u0000\u0000"+
		"\u031d\u0317\u0001\u0000\u0000\u0000\u031d\u0318\u0001\u0000\u0000\u0000"+
		"\u031ee\u0001\u0000\u0000\u0000\u031f\u032f\u0005\u0002\u0000\u0000\u0320"+
		"\u0322\u0005\u0002\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"\u0330\u0003t:\u0000\u0324\u0325\u0005\u001d\u0000\u0000\u0325\u032a\u0003"+
		"h4\u0000\u0326\u0327\u0005\u0018\u0000\u0000\u0327\u0329\u0003h4\u0000"+
		"\u0328\u0326\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000"+
		"\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000"+
		"\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0005\u001e\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000"+
		"\u032f\u0321\u0001\u0000\u0000\u0000\u032f\u0324\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0332\u0005\u0017\u0000\u0000"+
		"\u0332g\u0001\u0000\u0000\u0000\u0333\u0336\u0005\u0003\u0000\u0000\u0334"+
		"\u0335\u0005\u0002\u0000\u0000\u0335\u0337\u0005\u0003\u0000\u0000\u0336"+
		"\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337"+
		"i\u0001\u0000\u0000\u0000\u0338\u033a\u0003n7\u0000\u0339\u033b\u0005"+
		"\u0003\u0000\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033a\u033b\u0001"+
		"\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u0005"+
		"\u001d\u0000\u0000\u033d\u0342\u0003l6\u0000\u033e\u033f\u0005\u0017\u0000"+
		"\u0000\u033f\u0341\u0003l6\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0341"+
		"\u0344\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0342"+
		"\u0343\u0001\u0000\u0000\u0000\u0343\u0345\u0001\u0000\u0000\u0000\u0344"+
		"\u0342\u0001\u0000\u0000\u0000\u0345\u0346\u0005\u0017\u0000\u0000\u0346"+
		"\u0347\u0005\u001e\u0000\u0000\u0347k\u0001\u0000\u0000\u0000\u0348\u0349"+
		"\u0005\u0003\u0000\u0000\u0349\u034d\u0005\u0019\u0000\u0000\u034a\u034c"+
		"\u0007\u0005\u0000\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034c\u034f"+
		"\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e"+
		"\u0001\u0000\u0000\u0000\u034em\u0001\u0000\u0000\u0000\u034f\u034d\u0001"+
		"\u0000\u0000\u0000\u0350\u0355\u0003p8\u0000\u0351\u0352\u0005\u0018\u0000"+
		"\u0000\u0352\u0354\u0003p8\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354"+
		"\u0357\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355"+
		"\u0356\u0001\u0000\u0000\u0000\u0356o\u0001\u0000\u0000\u0000\u0357\u0355"+
		"\u0001\u0000\u0000\u0000\u0358\u0360\u0005\u0003\u0000\u0000\u0359\u035a"+
		"\u0005\u001a\u0000\u0000\u035a\u0360\u0005\u0003\u0000\u0000\u035b\u035c"+
		"\u0005%\u0000\u0000\u035c\u0360\u0005\u0003\u0000\u0000\u035d\u035e\u0005"+
		"\u0019\u0000\u0000\u035e\u0360\u0005\u0003\u0000\u0000\u035f\u0358\u0001"+
		"\u0000\u0000\u0000\u035f\u0359\u0001\u0000\u0000\u0000\u035f\u035b\u0001"+
		"\u0000\u0000\u0000\u035f\u035d\u0001\u0000\u0000\u0000\u0360q\u0001\u0000"+
		"\u0000\u0000\u0361\u0363\u0005\u0003\u0000\u0000\u0362\u0364\u0005\u001b"+
		"\u0000\u0000\u0363\u0362\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000"+
		"\u0000\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365\u0367\u0005\u001c"+
		"\u0000\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000"+
		"\u0000\u0000\u0367\u0375\u0001\u0000\u0000\u0000\u0368\u0375\u0005\u0004"+
		"\u0000\u0000\u0369\u0375\u0005\u0005\u0000\u0000\u036a\u0375\u0005\u0006"+
		"\u0000\u0000\u036b\u0375\u00036\u001b\u0000\u036c\u0375\u0003$\u0012\u0000"+
		"\u036d\u0375\u0003\u0018\f\u0000\u036e\u0375\u0003V+\u0000\u036f\u0372"+
		"\u0003Z-\u0000\u0370\u0372\u0003^/\u0000\u0371\u036f\u0001\u0000\u0000"+
		"\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0372\u0375\u0001\u0000\u0000"+
		"\u0000\u0373\u0375\u0003:\u001d\u0000\u0374\u0361\u0001\u0000\u0000\u0000"+
		"\u0374\u0368\u0001\u0000\u0000\u0000\u0374\u0369\u0001\u0000\u0000\u0000"+
		"\u0374\u036a\u0001\u0000\u0000\u0000\u0374\u036b\u0001\u0000\u0000\u0000"+
		"\u0374\u036c\u0001\u0000\u0000\u0000\u0374\u036d\u0001\u0000\u0000\u0000"+
		"\u0374\u036e\u0001\u0000\u0000\u0000\u0374\u0371\u0001\u0000\u0000\u0000"+
		"\u0374\u0373\u0001\u0000\u0000\u0000\u0375s\u0001\u0000\u0000\u0000\u0376"+
		"\u03a0\u0003r9\u0000\u0377\u0378\u0003r9\u0000\u0378\u0379\u0003\u0004"+
		"\u0002\u0000\u0379\u0386\u0003r9\u0000\u037a\u037c\u0007\u0006\u0000\u0000"+
		"\u037b\u037a\u0001\u0000\u0000\u0000\u037c\u037f\u0001\u0000\u0000\u0000"+
		"\u037d\u037b\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000"+
		"\u037e\u0380\u0001\u0000\u0000\u0000\u037f\u037d\u0001\u0000\u0000\u0000"+
		"\u0380\u0381\u0003r9\u0000\u0381\u0382\u0003\u0004\u0002\u0000\u0382\u0383"+
		"\u0003r9\u0000\u0383\u0385\u0001\u0000\u0000\u0000\u0384\u037d\u0001\u0000"+
		"\u0000\u0000\u0385\u0388\u0001\u0000\u0000\u0000\u0386\u0384\u0001\u0000"+
		"\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u03a0\u0001\u0000"+
		"\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0389\u038d\u0003r9\u0000"+
		"\u038a\u038c\u0007\u0006\u0000\u0000\u038b\u038a\u0001\u0000\u0000\u0000"+
		"\u038c\u038f\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000"+
		"\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u0390\u0001\u0000\u0000\u0000"+
		"\u038f\u038d\u0001\u0000\u0000\u0000\u0390\u039c\u0003r9\u0000\u0391\u0395"+
		"\u0003r9\u0000\u0392\u0394\u0007\u0006\u0000\u0000\u0393\u0392\u0001\u0000"+
		"\u0000\u0000\u0394\u0397\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000"+
		"\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0398\u0001\u0000"+
		"\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000\u0398\u0399\u0003r9\u0000"+
		"\u0399\u039b\u0001\u0000\u0000\u0000\u039a\u0391\u0001\u0000\u0000\u0000"+
		"\u039b\u039e\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000"+
		"\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u03a0\u0001\u0000\u0000\u0000"+
		"\u039e\u039c\u0001\u0000\u0000\u0000\u039f\u0376\u0001\u0000\u0000\u0000"+
		"\u039f\u0377\u0001\u0000\u0000\u0000\u039f\u0389\u0001\u0000\u0000\u0000"+
		"\u03a0u\u0001\u0000\u0000\u0000xy\u008a\u0091\u0095\u009a\u00af\u00b4"+
		"\u00bc\u00c0\u00c5\u00c7\u00cb\u00cf\u00de\u00e4\u00e8\u00f6\u00fa\u010b"+
		"\u010f\u0112\u0118\u011a\u0123\u0128\u0130\u013f\u0146\u014a\u014e\u0155"+
		"\u0159\u015d\u0166\u0169\u016c\u0170\u0174\u017c\u0188\u018c\u0192\u0196"+
		"\u019a\u019e\u01a2\u01a8\u01ab\u01af\u01b7\u01ba\u01bd\u01c0\u01cb\u01d5"+
		"\u01d8\u01df\u01e6\u01e9\u01f0\u01f5\u01f9\u0202\u0204\u0211\u0219\u021d"+
		"\u021f\u0228\u022d\u0231\u0237\u0242\u0244\u0257\u0262\u026a\u0271\u0277"+
		"\u027e\u0280\u0286\u028c\u029f\u02a3\u02a6\u02aa\u02b8\u02bc\u02c3\u02ca"+
		"\u02ce\u02de\u02ef\u02f3\u02f5\u0305\u0310\u0315\u031b\u031d\u0321\u032a"+
		"\u032f\u0336\u033a\u0342\u034d\u0355\u035f\u0363\u0366\u0371\u0374\u037d"+
		"\u0386\u038d\u0395\u039c\u039f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}