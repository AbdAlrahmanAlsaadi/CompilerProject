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
		TYPE_INT=1, TYPE_STRING=2, TYPE_BOOLEAN=3, TYPE_ARRAY=4, TYPE_ANY=5, TYPE_LIST=6, 
		KEYWORD_FUNCTION=7, KEYWORD_VOID=8, KEYWORD_LET=9, KEYWORD_CONST=10, KEYWORD_IF=11, 
		KEYWORD_ELSE=12, KEYWORD_RETURN=13, KEYWORD_IMPORT=14, KEYWORD_EXPORT=15, 
		KEYWORD_FROM=16, KEYWORD_AS=17, KEYWORD_ENUM=18, KEYWORD_CLASS=19, KEYWORD_EXTENDS=20, 
		KEYWORD_INTERFACE=21, KEYWORD_CONSTRUCTOR=22, KEYWORD_THIS=23, KEYWORD_FOR=24, 
		KEYWORD_WHILE=25, KEYWORD_PRIVATE=26, KEYWORD_PUBLIC=27, KEYWORD_PROTECTED=28, 
		AT=29, KEYWORD_COMPONENT=30, KEYWORD_NGMODULE=31, KEYWORD_IMPLEMENTS=32, 
		IDENTIFIER=33, NUMBER=34, STRING=35, BOOLEAN=36, BINDING_START=37, BINDING_END=38, 
		DIRECTIVE=39, OF=40, NGFOR=41, NGIF=42, TAG_OPEN=43, TAG_CLOSE=44, PLUS=45, 
		SUB=46, UNDERSCORE=47, MULTI=48, DIVID=49, ASSIGN=50, LESS=51, BIGGER=52, 
		SEMICOLON=53, COMMA=54, COLON=55, DOT=56, OPENB=57, CLOSEB=58, LBRACE=59, 
		RBRACE=60, LSQUARE=61, RSQUARE=62, OR=63, AND=64, SHEE=65, Double_Comment=66, 
		Single_Comment=67, WS=68, COMMENT=69, KEYWORD_DEFAULT=70;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_operator = 2, RULE_type = 3, 
		RULE_accessMoidifers = 4, RULE_commentStatment = 5, RULE_directiveElement = 6, 
		RULE_directive = 7, RULE_htmlContent = 8, RULE_templateBinding = 9, RULE_tupleLiteral = 10, 
		RULE_enumLiteral = 11, RULE_enumAccess = 12, RULE_variableDeclaration = 13, 
		RULE_arrayLiteral = 14, RULE_functionDeclaration = 15, RULE_parameter = 16, 
		RULE_block = 17, RULE_ifStatement = 18, RULE_constructorDeclaration = 19, 
		RULE_parameterList = 20, RULE_thisAssignment = 21, RULE_interfaceDeclaration = 22, 
		RULE_interfaceBody = 23, RULE_forloop = 24, RULE_forBrack = 25, RULE_whileloop = 26, 
		RULE_importStatement = 27, RULE_importClause = 28, RULE_importSpecifier = 29, 
		RULE_exportStatement = 30, RULE_exportSpecifier = 31, RULE_decorator = 32, 
		RULE_decoratorBody = 33, RULE_decoratorProperty = 34, RULE_classDeclaration = 35, 
		RULE_classBody = 36, RULE_expression = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "operator", "type", "accessMoidifers", "commentStatment", 
			"directiveElement", "directive", "htmlContent", "templateBinding", "tupleLiteral", 
			"enumLiteral", "enumAccess", "variableDeclaration", "arrayLiteral", "functionDeclaration", 
			"parameter", "block", "ifStatement", "constructorDeclaration", "parameterList", 
			"thisAssignment", "interfaceDeclaration", "interfaceBody", "forloop", 
			"forBrack", "whileloop", "importStatement", "importClause", "importSpecifier", 
			"exportStatement", "exportSpecifier", "decorator", "decoratorBody", "decoratorProperty", 
			"classDeclaration", "classBody", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'number'", "'string'", "'boolean'", "'Array'", "'any'", "'list'", 
			"'function'", "'void'", "'let'", "'const'", "'if'", "'else'", "'return'", 
			"'import'", "'export'", "'from'", "'as'", "'enum'", "'class'", "'extends'", 
			"'interface'", "'constructor'", "'this'", "'for'", "'while'", "'private'", 
			"'public'", "'protected'", "'@'", "'Component'", "'NgModule'", "'implements'", 
			null, null, null, null, "'{{'", "'}}'", null, "'of'", "'ngFor'", "'ngIf'", 
			null, null, "'+'", "'-'", "'_'", "'*'", "'/'", "'='", "'<'", "'>'", "';'", 
			"','", "':'", "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'||'", 
			"'&&'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE_INT", "TYPE_STRING", "TYPE_BOOLEAN", "TYPE_ARRAY", "TYPE_ANY", 
			"TYPE_LIST", "KEYWORD_FUNCTION", "KEYWORD_VOID", "KEYWORD_LET", "KEYWORD_CONST", 
			"KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_RETURN", "KEYWORD_IMPORT", "KEYWORD_EXPORT", 
			"KEYWORD_FROM", "KEYWORD_AS", "KEYWORD_ENUM", "KEYWORD_CLASS", "KEYWORD_EXTENDS", 
			"KEYWORD_INTERFACE", "KEYWORD_CONSTRUCTOR", "KEYWORD_THIS", "KEYWORD_FOR", 
			"KEYWORD_WHILE", "KEYWORD_PRIVATE", "KEYWORD_PUBLIC", "KEYWORD_PROTECTED", 
			"AT", "KEYWORD_COMPONENT", "KEYWORD_NGMODULE", "KEYWORD_IMPLEMENTS", 
			"IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", "BINDING_START", "BINDING_END", 
			"DIRECTIVE", "OF", "NGFOR", "NGIF", "TAG_OPEN", "TAG_CLOSE", "PLUS", 
			"SUB", "UNDERSCORE", "MULTI", "DIVID", "ASSIGN", "LESS", "BIGGER", "SEMICOLON", 
			"COMMA", "COLON", "DOT", "OPENB", "CLOSEB", "LBRACE", "RBRACE", "LSQUARE", 
			"RSQUARE", "OR", "AND", "SHEE", "Double_Comment", "Single_Comment", "WS", 
			"COMMENT", "KEYWORD_DEFAULT"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 4629700487744985501L) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				enumLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				templateBinding();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				directiveElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				importStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				decorator();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(PLUS);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(MULTI);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(SUB);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(LESS);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(98);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(BIGGER);
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
			case ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(ASSIGN);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
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
		public TerminalNode TYPE_INT() { return getToken(TypeScriptParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(TypeScriptParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(TypeScriptParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_ARRAY() { return getToken(TypeScriptParser.TYPE_ARRAY, 0); }
		public TerminalNode TYPE_ANY() { return getToken(TypeScriptParser.TYPE_ANY, 0); }
		public TerminalNode TYPE_LIST() { return getToken(TypeScriptParser.TYPE_LIST, 0); }
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(111);
				match(TYPE_INT);
				}
				break;
			case 2:
				{
				setState(112);
				match(TYPE_STRING);
				}
				break;
			case 3:
				{
				setState(113);
				match(TYPE_BOOLEAN);
				}
				break;
			case 4:
				{
				setState(114);
				match(TYPE_ARRAY);
				}
				break;
			case 5:
				{
				setState(115);
				match(TYPE_ANY);
				}
				break;
			case 6:
				{
				setState(116);
				match(TYPE_LIST);
				}
				break;
			case 7:
				{
				setState(117);
				match(TYPE_ARRAY);
				setState(118);
				match(LESS);
				setState(119);
				type(0);
				setState(120);
				match(BIGGER);
				}
				break;
			case 8:
				{
				setState(122);
				match(LSQUARE);
				setState(123);
				type(0);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(124);
					match(COMMA);
					setState(125);
					type(0);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(RSQUARE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
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
					setState(135);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(136);
					match(LSQUARE);
					setState(137);
					match(RSQUARE);
					}
					} 
				}
				setState(142);
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
		public TerminalNode KEYWORD_PUBLIC() { return getToken(TypeScriptParser.KEYWORD_PUBLIC, 0); }
		public TerminalNode KEYWORD_PRIVATE() { return getToken(TypeScriptParser.KEYWORD_PRIVATE, 0); }
		public TerminalNode KEYWORD_PROTECTED() { return getToken(TypeScriptParser.KEYWORD_PROTECTED, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
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
	public static class CommentStatmentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(TypeScriptParser.COMMENT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScriptParser.IDENTIFIER, 0); }
		public CommentStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterCommentStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitCommentStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitCommentStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentStatmentContext commentStatment() throws RecognitionException {
		CommentStatmentContext _localctx = new CommentStatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commentStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(COMMENT);
			setState(146);
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
	public static class DirectiveElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(TypeScriptParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(TypeScriptParser.TAG_OPEN, i);
		}
		public List<TerminalNode> BIGGER() { return getTokens(TypeScriptParser.BIGGER); }
		public TerminalNode BIGGER(int i) {
			return getToken(TypeScriptParser.BIGGER, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(TypeScriptParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(TypeScriptParser.TAG_CLOSE, i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
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
			setState(148);
			match(TAG_OPEN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2449958755635298304L) != 0)) {
				{
				{
				setState(149);
				directive();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(BIGGER);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(TAG_OPEN);
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2449958755635298304L) != 0)) {
						{
						{
						setState(157);
						directive();
						}
						}
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(163);
					match(BIGGER);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8942121910272L) != 0)) {
				{
				setState(172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(169);
					htmlContent();
					}
					break;
				case BINDING_START:
					{
					setState(170);
					templateBinding();
					}
					break;
				case TAG_OPEN:
					{
					setState(171);
					directiveElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(177);
				match(DOT);
				}
			}

			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(TAG_CLOSE);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(186);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==DIRECTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				match(ASSIGN);
				setState(190);
				match(STRING);
				}
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(191);
				match(LSQUARE);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENB) {
					{
					setState(192);
					match(OPENB);
					}
				}

				setState(195);
				match(IDENTIFIER);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSEB) {
					{
					setState(196);
					match(CLOSEB);
					}
				}

				setState(199);
				match(RSQUARE);
				setState(200);
				match(ASSIGN);
				setState(201);
				match(STRING);
				}
				}
				break;
			case OPENB:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(202);
				match(OPENB);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(203);
					match(LSQUARE);
					}
				}

				setState(206);
				match(IDENTIFIER);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RSQUARE) {
					{
					setState(207);
					match(RSQUARE);
					}
				}

				setState(210);
				match(CLOSEB);
				setState(211);
				match(ASSIGN);
				setState(212);
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
			setState(215);
			match(IDENTIFIER);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(IDENTIFIER);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTemplateBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBindingContext templateBinding() throws RecognitionException {
		TemplateBindingContext _localctx = new TemplateBindingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_templateBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(BINDING_START);
			setState(223);
			expression(0);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 1157425104486891587L) != 0)) {
				{
				{
				setState(224);
				expression(0);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTupleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleLiteralContext tupleLiteral() throws RecognitionException {
		TupleLiteralContext _localctx = new TupleLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tupleLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LSQUARE);
			setState(233);
			expression(0);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(234);
				match(COMMA);
				setState(235);
				expression(0);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
		public TerminalNode KEYWORD_ENUM() { return getToken(TypeScriptParser.KEYWORD_ENUM, 0); }
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
			setState(243);
			match(KEYWORD_ENUM);
			setState(244);
			match(IDENTIFIER);
			setState(245);
			match(LBRACE);
			setState(246);
			match(IDENTIFIER);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				match(IDENTIFIER);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(249);
					match(ASSIGN);
					setState(250);
					expression(0);
					}
				}

				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
		public TerminalNode KEYWORD_LET() { return getToken(TypeScriptParser.KEYWORD_LET, 0); }
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
			setState(260);
			match(KEYWORD_LET);
			setState(261);
			match(IDENTIFIER);
			setState(262);
			match(COLON);
			setState(263);
			match(IDENTIFIER);
			setState(264);
			match(ASSIGN);
			setState(265);
			match(IDENTIFIER);
			setState(266);
			match(DOT);
			setState(267);
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
		public TerminalNode KEYWORD_LET() { return getToken(TypeScriptParser.KEYWORD_LET, 0); }
		public TerminalNode KEYWORD_CONST() { return getToken(TypeScriptParser.KEYWORD_CONST, 0); }
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
					{
					setState(269);
					accessMoidifers();
					}
				}

				setState(272);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_LET || _la==KEYWORD_CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				match(IDENTIFIER);
				setState(274);
				match(COLON);
				setState(275);
				type(0);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(276);
					match(ASSIGN);
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(277);
						expression(0);
						}
						break;
					case 2:
						{
						setState(278);
						tupleLiteral();
						}
						break;
					}
					}
				}

				setState(283);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
					{
					setState(285);
					accessMoidifers();
					}
				}

				setState(288);
				match(IDENTIFIER);
				setState(289);
				match(COLON);
				setState(290);
				type(0);
				setState(291);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
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
				match(ASSIGN);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(300);
					expression(0);
					}
					break;
				case 2:
					{
					setState(301);
					tupleLiteral();
					}
					break;
				}
				setState(304);
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
		enterRule(_localctx, 28, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(LSQUARE);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 1157425104486891587L) != 0)) {
				{
				setState(309);
				expression(0);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(310);
					match(COMMA);
					setState(311);
					expression(0);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(319);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FUNCTION() { return getToken(TypeScriptParser.KEYWORD_FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode COLON() { return getToken(TypeScriptParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode KEYWORD_VOID() { return getToken(TypeScriptParser.KEYWORD_VOID, 0); }
		public AccessMoidifersContext accessMoidifers() {
			return getRuleContext(AccessMoidifersContext.class,0);
		}
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
		public TerminalNode KEYWORD_LET() { return getToken(TypeScriptParser.KEYWORD_LET, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
					{
					setState(321);
					accessMoidifers();
					}
				}

				setState(324);
				match(KEYWORD_FUNCTION);
				setState(325);
				match(IDENTIFIER);
				setState(326);
				match(OPENB);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(327);
					parameter();
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(328);
						match(COMMA);
						setState(329);
						parameter();
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(337);
				match(CLOSEB);
				setState(338);
				match(COLON);
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE_INT:
				case TYPE_STRING:
				case TYPE_BOOLEAN:
				case TYPE_ARRAY:
				case TYPE_ANY:
				case TYPE_LIST:
				case LSQUARE:
					{
					setState(339);
					type(0);
					}
					break;
				case KEYWORD_VOID:
					{
					setState(340);
					match(KEYWORD_VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(343);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
					{
					setState(344);
					accessMoidifers();
					}
				}

				setState(347);
				match(KEYWORD_LET);
				setState(348);
				match(IDENTIFIER);
				setState(349);
				match(ASSIGN);
				setState(350);
				match(KEYWORD_FUNCTION);
				setState(351);
				match(OPENB);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(352);
					match(IDENTIFIER);
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(353);
						match(COMMA);
						setState(354);
						match(IDENTIFIER);
						}
						}
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(362);
				match(CLOSEB);
				setState(363);
				match(COLON);
				setState(366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE_INT:
				case TYPE_STRING:
				case TYPE_BOOLEAN:
				case TYPE_ARRAY:
				case TYPE_ANY:
				case TYPE_LIST:
				case LSQUARE:
					{
					setState(364);
					type(0);
					}
					break;
				case KEYWORD_VOID:
					{
					setState(365);
					match(KEYWORD_VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(368);
				match(LBRACE);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 4629700487744985501L) != 0)) {
					{
					{
					setState(369);
					statement();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				match(RBRACE);
				setState(376);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(IDENTIFIER);
			setState(380);
			match(COLON);
			setState(381);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LBRACE);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 4629700487744985501L) != 0)) {
				{
				{
				setState(384);
				statement();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
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
		public TerminalNode KEYWORD_IF() { return getToken(TypeScriptParser.KEYWORD_IF, 0); }
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
		public TerminalNode KEYWORD_ELSE() { return getToken(TypeScriptParser.KEYWORD_ELSE, 0); }
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
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(KEYWORD_IF);
			setState(393);
			match(OPENB);
			setState(394);
			expression(0);
			setState(395);
			match(CLOSEB);
			setState(396);
			block();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE) {
				{
				setState(397);
				match(KEYWORD_ELSE);
				setState(398);
				block();
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_CONSTRUCTOR() { return getToken(TypeScriptParser.KEYWORD_CONSTRUCTOR, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScriptParser.RBRACE, 0); }
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
		enterRule(_localctx, 38, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(KEYWORD_CONSTRUCTOR);
			setState(402);
			match(OPENB);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(403);
				parameterList();
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(406);
				match(COMMA);
				setState(407);
				parameterList();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(CLOSEB);
			setState(414);
			match(LBRACE);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_THIS) {
				{
				{
				setState(415);
				thisAssignment();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
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
		enterRule(_localctx, 40, RULE_parameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(IDENTIFIER);
			setState(424);
			match(COLON);
			setState(425);
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
	public static class ThisAssignmentContext extends ParserRuleContext {
		public TerminalNode KEYWORD_THIS() { return getToken(TypeScriptParser.KEYWORD_THIS, 0); }
		public TerminalNode DOT() { return getToken(TypeScriptParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(TypeScriptParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 42, RULE_thisAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(KEYWORD_THIS);
			setState(428);
			match(DOT);
			setState(429);
			match(IDENTIFIER);
			setState(430);
			match(ASSIGN);
			setState(431);
			match(IDENTIFIER);
			setState(432);
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_EXPORT() { return getToken(TypeScriptParser.KEYWORD_EXPORT, 0); }
		public TerminalNode KEYWORD_INTERFACE() { return getToken(TypeScriptParser.KEYWORD_INTERFACE, 0); }
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
		enterRule(_localctx, 44, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(KEYWORD_EXPORT);
			setState(435);
			match(KEYWORD_INTERFACE);
			setState(436);
			match(IDENTIFIER);
			setState(437);
			match(LBRACE);
			setState(438);
			interfaceBody();
			setState(439);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(441);
				match(IDENTIFIER);
				setState(442);
				match(COLON);
				setState(443);
				type(0);
				setState(444);
				match(SEMICOLON);
				}
				}
				setState(450);
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
		public TerminalNode KEYWORD_FOR() { return getToken(TypeScriptParser.KEYWORD_FOR, 0); }
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
		enterRule(_localctx, 48, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(KEYWORD_FOR);
			setState(452);
			match(OPENB);
			setState(453);
			forBrack();
			setState(454);
			match(CLOSEB);
			setState(455);
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
		public TerminalNode KEYWORD_LET() { return getToken(TypeScriptParser.KEYWORD_LET, 0); }
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
		enterRule(_localctx, 50, RULE_forBrack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(457);
			match(KEYWORD_LET);
			setState(458);
			match(IDENTIFIER);
			setState(459);
			match(ASSIGN);
			setState(460);
			match(NUMBER);
			setState(461);
			match(SEMICOLON);
			setState(462);
			match(IDENTIFIER);
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				{
				setState(463);
				match(LESS);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(464);
					match(ASSIGN);
					}
				}

				}
				break;
			case BIGGER:
				{
				setState(467);
				match(BIGGER);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(468);
					match(ASSIGN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(473);
			match(NUMBER);
			setState(474);
			match(SEMICOLON);
			setState(475);
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
		public TerminalNode KEYWORD_WHILE() { return getToken(TypeScriptParser.KEYWORD_WHILE, 0); }
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
		enterRule(_localctx, 52, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(KEYWORD_WHILE);
			setState(478);
			match(OPENB);
			setState(479);
			expression(0);
			setState(480);
			match(CLOSEB);
			setState(481);
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
		public TerminalNode KEYWORD_IMPORT() { return getToken(TypeScriptParser.KEYWORD_IMPORT, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScriptParser.SEMICOLON, 0); }
		public TerminalNode KEYWORD_FROM() { return getToken(TypeScriptParser.KEYWORD_FROM, 0); }
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
		enterRule(_localctx, 54, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(KEYWORD_IMPORT);
			setState(484);
			importClause();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_FROM) {
				{
				setState(485);
				match(KEYWORD_FROM);
				setState(486);
				match(STRING);
				}
			}

			setState(489);
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
		enterRule(_localctx, 56, RULE_importClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(491);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				{
				setState(492);
				match(LBRACE);
				setState(493);
				importSpecifier();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(494);
					match(COMMA);
					setState(495);
					importSpecifier();
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(501);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScriptParser.IDENTIFIER, i);
		}
		public TerminalNode KEYWORD_AS() { return getToken(TypeScriptParser.KEYWORD_AS, 0); }
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
		enterRule(_localctx, 58, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(IDENTIFIER);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_AS) {
				{
				setState(506);
				match(KEYWORD_AS);
				setState(507);
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
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_EXPORT() { return getToken(TypeScriptParser.KEYWORD_EXPORT, 0); }
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
		public TerminalNode KEYWORD_DEFAULT() { return getToken(TypeScriptParser.KEYWORD_DEFAULT, 0); }
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
		enterRule(_localctx, 60, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(KEYWORD_EXPORT);
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_LET:
			case KEYWORD_CONST:
			case KEYWORD_EXPORT:
			case KEYWORD_FOR:
			case KEYWORD_WHILE:
			case KEYWORD_PRIVATE:
			case KEYWORD_PUBLIC:
			case KEYWORD_PROTECTED:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case LSQUARE:
			case COMMENT:
			case KEYWORD_DEFAULT:
				{
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_DEFAULT) {
					{
					setState(511);
					match(KEYWORD_DEFAULT);
					}
				}

				setState(514);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(515);
				match(LBRACE);
				setState(516);
				exportSpecifier();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(517);
					match(COMMA);
					setState(518);
					exportSpecifier();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(524);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(528);
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
		public TerminalNode KEYWORD_AS() { return getToken(TypeScriptParser.KEYWORD_AS, 0); }
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
		enterRule(_localctx, 62, RULE_exportSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(IDENTIFIER);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_AS) {
				{
				setState(531);
				match(KEYWORD_AS);
				setState(532);
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
		public TerminalNode AT() { return getToken(TypeScriptParser.AT, 0); }
		public TerminalNode OPENB() { return getToken(TypeScriptParser.OPENB, 0); }
		public DecoratorBodyContext decoratorBody() {
			return getRuleContext(DecoratorBodyContext.class,0);
		}
		public TerminalNode CLOSEB() { return getToken(TypeScriptParser.CLOSEB, 0); }
		public TerminalNode KEYWORD_COMPONENT() { return getToken(TypeScriptParser.KEYWORD_COMPONENT, 0); }
		public TerminalNode KEYWORD_NGMODULE() { return getToken(TypeScriptParser.KEYWORD_NGMODULE, 0); }
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
		enterRule(_localctx, 64, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(AT);
			setState(536);
			_la = _input.LA(1);
			if ( !(_la==KEYWORD_COMPONENT || _la==KEYWORD_NGMODULE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(537);
			match(OPENB);
			setState(538);
			decoratorBody();
			setState(539);
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
		enterRule(_localctx, 66, RULE_decoratorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(LBRACE);
			setState(542);
			decoratorProperty();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(543);
				match(COMMA);
				setState(544);
				decoratorProperty();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
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
		enterRule(_localctx, 68, RULE_decoratorProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(IDENTIFIER);
			setState(553);
			match(COLON);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(554);
				match(LSQUARE);
				}
			}

			setState(557);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(558);
					match(COMMA);
					setState(559);
					match(IDENTIFIER);
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RSQUARE) {
				{
				setState(565);
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
		public TerminalNode KEYWORD_CLASS() { return getToken(TypeScriptParser.KEYWORD_CLASS, 0); }
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
		public TerminalNode KEYWORD_EXPORT() { return getToken(TypeScriptParser.KEYWORD_EXPORT, 0); }
		public TerminalNode KEYWORD_EXTENDS() { return getToken(TypeScriptParser.KEYWORD_EXTENDS, 0); }
		public TerminalNode KEYWORD_IMPLEMENTS() { return getToken(TypeScriptParser.KEYWORD_IMPLEMENTS, 0); }
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
		enterRule(_localctx, 70, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(568);
				decorator();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_EXPORT) {
				{
				setState(574);
				match(KEYWORD_EXPORT);
				}
			}

			setState(577);
			match(KEYWORD_CLASS);
			setState(578);
			match(IDENTIFIER);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_EXTENDS || _la==KEYWORD_IMPLEMENTS) {
				{
				setState(579);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_EXTENDS || _la==KEYWORD_IMPLEMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(580);
				match(IDENTIFIER);
				}
			}

			setState(583);
			match(LBRACE);
			setState(584);
			classBody();
			setState(585);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9063892608L) != 0)) {
				{
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(587);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(588);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(589);
					constructorDeclaration();
					}
					break;
				}
				}
				setState(594);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitCpop(this);
			else return visitor.visitChildren(this);
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
	public static class CommentContext extends ExpressionContext {
		public CommentStatmentContext commentStatment() {
			return getRuleContext(CommentStatmentContext.class,0);
		}
		public CommentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitVariableDeclar(this);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				_localctx = new AnythingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(596);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(597);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(598);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(599);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				_localctx = new VariableDeclarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(600);
				variableDeclaration();
				}
				break;
			case 6:
				{
				_localctx = new ArrayDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(601);
				arrayLiteral();
				}
				break;
			case 7:
				{
				_localctx = new EnumAcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(602);
				enumAccess();
				}
				break;
			case 8:
				{
				_localctx = new InterfaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(603);
				interfaceDeclaration();
				}
				break;
			case 9:
				{
				_localctx = new ForContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(606);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_FOR:
					{
					setState(604);
					forloop();
					}
					break;
				case KEYWORD_WHILE:
					{
					setState(605);
					whileloop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				_localctx = new CommentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(608);
				commentStatment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(651);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new CompristionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(612);
						operator();
						setState(613);
						expression(0);
						setState(626);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(617);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) {
									{
									{
									setState(614);
									_la = _input.LA(1);
									if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									}
									}
									setState(619);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(620);
								expression(0);
								setState(621);
								operator();
								setState(622);
								expression(0);
								}
								} 
							}
							setState(628);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
						}
						}
						break;
					case 2:
						{
						_localctx = new CpopContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(629);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(633);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) {
							{
							{
							setState(630);
							_la = _input.LA(1);
							if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(635);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(636);
						expression(0);
						setState(648);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(637);
								expression(0);
								setState(641);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) {
									{
									{
									setState(638);
									_la = _input.LA(1);
									if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									}
									}
									setState(643);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(644);
								expression(0);
								}
								} 
							}
							setState(650);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		case 37:
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
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001F\u0291\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001]\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"h\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002m\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u007f\b\u0003\n"+
		"\u0003\f\u0003\u0082\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0086"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008b\b\u0003"+
		"\n\u0003\f\u0003\u008e\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u0097\b\u0006\n"+
		"\u0006\f\u0006\u009a\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u009f\b\u0006\n\u0006\f\u0006\u00a2\t\u0006\u0001\u0006\u0005\u0006"+
		"\u00a5\b\u0006\n\u0006\f\u0006\u00a8\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00ad\b\u0006\n\u0006\f\u0006\u00b0\t\u0006\u0001\u0006"+
		"\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0005\u0006\u00b6\b\u0006\n\u0006"+
		"\f\u0006\u00b9\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c2\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00c6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00cd\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00d1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00d6\b\u0007\u0001\b\u0001\b\u0005\b\u00da\b\b\n\b\f\b\u00dd\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00e2\b\t\n\t\f\t\u00e5\t\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ed\b\n\n\n\f\n\u00f0\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fc\b\u000b\u0005\u000b"+
		"\u00fe\b\u000b\n\u000b\f\u000b\u0101\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0003\r\u010f\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0118\b\r\u0003\r\u011a\b\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u011f\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0127"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u012f\b\r"+
		"\u0001\r\u0001\r\u0003\r\u0133\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0139\b\u000e\n\u000e\f\u000e\u013c\t\u000e\u0003"+
		"\u000e\u013e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u0143"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u014b\b\u000f\n\u000f\f\u000f\u014e\t\u000f\u0003\u000f"+
		"\u0150\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0156\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u015a\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0164\b\u000f\n\u000f\f\u000f\u0167\t\u000f"+
		"\u0003\u000f\u0169\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u016f\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0173\b"+
		"\u000f\n\u000f\f\u000f\u0176\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u017a\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0182\b\u0011\n\u0011\f\u0011\u0185\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0190\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0195\b\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0199\b\u0013\n\u0013\f\u0013\u019c\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01a1\b\u0013\n\u0013\f\u0013\u01a4\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01bf\b\u0017\n\u0017\f\u0017\u01c2\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01d2\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01d6\b\u0019\u0003\u0019\u01d8\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01e8\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01f1\b\u001c\n\u001c\f\u001c"+
		"\u01f4\t\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01f8\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01fd\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0201\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u0208\b\u001e\n\u001e\f\u001e\u020b\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u020f\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0216\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0222\b!\n!\f!\u0225\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u022c\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u0231\b\"\n\"\f\"\u0234\t"+
		"\"\u0001\"\u0003\"\u0237\b\"\u0001#\u0005#\u023a\b#\n#\f#\u023d\t#\u0001"+
		"#\u0003#\u0240\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u0246\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u024f\b$\n$\f$\u0252\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u025f\b%\u0001%\u0003%\u0262\b%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u0268\b%\n%\f%\u026b\t%\u0001%\u0001%\u0001%\u0001%\u0005%\u0271\b%"+
		"\n%\f%\u0274\t%\u0001%\u0001%\u0005%\u0278\b%\n%\f%\u027b\t%\u0001%\u0001"+
		"%\u0001%\u0005%\u0280\b%\n%\f%\u0283\t%\u0001%\u0001%\u0005%\u0287\b%"+
		"\n%\f%\u028a\t%\u0005%\u028c\b%\n%\f%\u028f\t%\u0001%\u0000\u0002\u0006"+
		"J&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0007\u0001\u0000\u001a\u001c"+
		"\u0002\u0000!!\'\'\u0001\u0000\t\n\u0001\u0000\u001e\u001f\u0001\u0000"+
		"!#\u0002\u0000\u0014\u0014  \u0001\u0000?A\u02d9\u0000O\u0001\u0000\u0000"+
		"\u0000\u0002\\\u0001\u0000\u0000\u0000\u0004l\u0001\u0000\u0000\u0000"+
		"\u0006\u0085\u0001\u0000\u0000\u0000\b\u008f\u0001\u0000\u0000\u0000\n"+
		"\u0091\u0001\u0000\u0000\u0000\f\u0094\u0001\u0000\u0000\u0000\u000e\u00d5"+
		"\u0001\u0000\u0000\u0000\u0010\u00d7\u0001\u0000\u0000\u0000\u0012\u00de"+
		"\u0001\u0000\u0000\u0000\u0014\u00e8\u0001\u0000\u0000\u0000\u0016\u00f3"+
		"\u0001\u0000\u0000\u0000\u0018\u0104\u0001\u0000\u0000\u0000\u001a\u0132"+
		"\u0001\u0000\u0000\u0000\u001c\u0134\u0001\u0000\u0000\u0000\u001e\u0179"+
		"\u0001\u0000\u0000\u0000 \u017b\u0001\u0000\u0000\u0000\"\u017f\u0001"+
		"\u0000\u0000\u0000$\u0188\u0001\u0000\u0000\u0000&\u0191\u0001\u0000\u0000"+
		"\u0000(\u01a7\u0001\u0000\u0000\u0000*\u01ab\u0001\u0000\u0000\u0000,"+
		"\u01b2\u0001\u0000\u0000\u0000.\u01c0\u0001\u0000\u0000\u00000\u01c3\u0001"+
		"\u0000\u0000\u00002\u01c9\u0001\u0000\u0000\u00004\u01dd\u0001\u0000\u0000"+
		"\u00006\u01e3\u0001\u0000\u0000\u00008\u01f7\u0001\u0000\u0000\u0000:"+
		"\u01f9\u0001\u0000\u0000\u0000<\u01fe\u0001\u0000\u0000\u0000>\u0212\u0001"+
		"\u0000\u0000\u0000@\u0217\u0001\u0000\u0000\u0000B\u021d\u0001\u0000\u0000"+
		"\u0000D\u0228\u0001\u0000\u0000\u0000F\u023b\u0001\u0000\u0000\u0000H"+
		"\u0250\u0001\u0000\u0000\u0000J\u0261\u0001\u0000\u0000\u0000LN\u0003"+
		"\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0001\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000R]\u0003\u001e\u000f\u0000S]\u0003"+
		"$\u0012\u0000T]\u0003J%\u0000U]\u0003\u0016\u000b\u0000V]\u0003\u0012"+
		"\t\u0000W]\u0003\f\u0006\u0000X]\u00036\u001b\u0000Y]\u0003<\u001e\u0000"+
		"Z]\u0003@ \u0000[]\u0003F#\u0000\\R\u0001\u0000\u0000\u0000\\S\u0001\u0000"+
		"\u0000\u0000\\T\u0001\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000\\V"+
		"\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000"+
		"\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001"+
		"\u0000\u0000\u0000]\u0003\u0001\u0000\u0000\u0000^m\u0005-\u0000\u0000"+
		"_m\u00050\u0000\u0000`m\u0005.\u0000\u0000ac\u00053\u0000\u0000bd\u0005"+
		"2\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dm\u0001"+
		"\u0000\u0000\u0000eg\u00054\u0000\u0000fh\u00052\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hm\u0001\u0000\u0000\u0000im\u0005"+
		"2\u0000\u0000jm\u00058\u0000\u0000km\u0005/\u0000\u0000l^\u0001\u0000"+
		"\u0000\u0000l_\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000la\u0001"+
		"\u0000\u0000\u0000le\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u0005\u0001\u0000"+
		"\u0000\u0000no\u0006\u0003\uffff\uffff\u0000o\u0086\u0005\u0001\u0000"+
		"\u0000p\u0086\u0005\u0002\u0000\u0000q\u0086\u0005\u0003\u0000\u0000r"+
		"\u0086\u0005\u0004\u0000\u0000s\u0086\u0005\u0005\u0000\u0000t\u0086\u0005"+
		"\u0006\u0000\u0000uv\u0005\u0004\u0000\u0000vw\u00053\u0000\u0000wx\u0003"+
		"\u0006\u0003\u0000xy\u00054\u0000\u0000y\u0086\u0001\u0000\u0000\u0000"+
		"z{\u0005=\u0000\u0000{\u0080\u0003\u0006\u0003\u0000|}\u00056\u0000\u0000"+
		"}\u007f\u0003\u0006\u0003\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005>\u0000\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085n\u0001\u0000\u0000\u0000\u0085p\u0001\u0000\u0000\u0000"+
		"\u0085q\u0001\u0000\u0000\u0000\u0085r\u0001\u0000\u0000\u0000\u0085s"+
		"\u0001\u0000\u0000\u0000\u0085t\u0001\u0000\u0000\u0000\u0085u\u0001\u0000"+
		"\u0000\u0000\u0085z\u0001\u0000\u0000\u0000\u0086\u008c\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\n\u0003\u0000\u0000\u0088\u0089\u0005=\u0000\u0000"+
		"\u0089\u008b\u0005>\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u0007\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0007\u0000\u0000\u0000\u0090"+
		"\t\u0001\u0000\u0000\u0000\u0091\u0092\u0005E\u0000\u0000\u0092\u0093"+
		"\u0005!\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0098\u0005"+
		"+\u0000\u0000\u0095\u0097\u0003\u000e\u0007\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u00a6\u00054\u0000"+
		"\u0000\u009c\u00a0\u0005+\u0000\u0000\u009d\u009f\u0003\u000e\u0007\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u00054\u0000\u0000\u00a4\u009c\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00ae\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ad\u0003\u0010\b\u0000\u00aa\u00ad"+
		"\u0003\u0012\t\u0000\u00ab\u00ad\u0003\f\u0006\u0000\u00ac\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005"+
		"8\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b7\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005,\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005,\u0000\u0000\u00bb\r\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0007\u0001\u0000\u0000\u00bd\u00be\u00052\u0000\u0000\u00be"+
		"\u00d6\u0005#\u0000\u0000\u00bf\u00c1\u0005=\u0000\u0000\u00c0\u00c2\u0005"+
		"9\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005!\u0000"+
		"\u0000\u00c4\u00c6\u0005:\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005>\u0000\u0000\u00c8\u00c9\u00052\u0000\u0000\u00c9\u00d6"+
		"\u0005#\u0000\u0000\u00ca\u00cc\u00059\u0000\u0000\u00cb\u00cd\u0005="+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0005!\u0000"+
		"\u0000\u00cf\u00d1\u0005>\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005:\u0000\u0000\u00d3\u00d4\u00052\u0000\u0000\u00d4\u00d6"+
		"\u0005#\u0000\u0000\u00d5\u00bc\u0001\u0000\u0000\u0000\u00d5\u00bf\u0001"+
		"\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d6\u000f\u0001"+
		"\u0000\u0000\u0000\u00d7\u00db\u0005!\u0000\u0000\u00d8\u00da\u0005!\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u0011\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005%\u0000\u0000\u00df\u00e3\u0003J%\u0000\u00e0"+
		"\u00e2\u0003J%\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005&\u0000\u0000\u00e7\u0013\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005=\u0000\u0000\u00e9\u00ee\u0003J%\u0000"+
		"\u00ea\u00eb\u00056\u0000\u0000\u00eb\u00ed\u0003J%\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005>\u0000\u0000\u00f2\u0015\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"\u0012\u0000\u0000\u00f4\u00f5\u0005!\u0000\u0000\u00f5\u00f6\u0005;\u0000"+
		"\u0000\u00f6\u00ff\u0005!\u0000\u0000\u00f7\u00f8\u00056\u0000\u0000\u00f8"+
		"\u00fb\u0005!\u0000\u0000\u00f9\u00fa\u00052\u0000\u0000\u00fa\u00fc\u0003"+
		"J%\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005<\u0000\u0000"+
		"\u0103\u0017\u0001\u0000\u0000\u0000\u0104\u0105\u0005\t\u0000\u0000\u0105"+
		"\u0106\u0005!\u0000\u0000\u0106\u0107\u00057\u0000\u0000\u0107\u0108\u0005"+
		"!\u0000\u0000\u0108\u0109\u00052\u0000\u0000\u0109\u010a\u0005!\u0000"+
		"\u0000\u010a\u010b\u00058\u0000\u0000\u010b\u010c\u0005!\u0000\u0000\u010c"+
		"\u0019\u0001\u0000\u0000\u0000\u010d\u010f\u0003\b\u0004\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0007\u0002\u0000\u0000\u0111\u0112"+
		"\u0005!\u0000\u0000\u0112\u0113\u00057\u0000\u0000\u0113\u0119\u0003\u0006"+
		"\u0003\u0000\u0114\u0117\u00052\u0000\u0000\u0115\u0118\u0003J%\u0000"+
		"\u0116\u0118\u0003\u0014\n\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"+
		"\u0114\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u00055\u0000\u0000\u011c\u0133"+
		"\u0001\u0000\u0000\u0000\u011d\u011f\u0003\b\u0004\u0000\u011e\u011d\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005!\u0000\u0000\u0121\u0122\u00057\u0000"+
		"\u0000\u0122\u0123\u0003\u0006\u0003\u0000\u0123\u0124\u00055\u0000\u0000"+
		"\u0124\u0133\u0001\u0000\u0000\u0000\u0125\u0127\u0003\b\u0004\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005!\u0000\u0000\u0129\u012a"+
		"\u00057\u0000\u0000\u012a\u012b\u0003\u0006\u0003\u0000\u012b\u012e\u0005"+
		"2\u0000\u0000\u012c\u012f\u0003J%\u0000\u012d\u012f\u0003\u0014\n\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u00055\u0000\u0000\u0131"+
		"\u0133\u0001\u0000\u0000\u0000\u0132\u010e\u0001\u0000\u0000\u0000\u0132"+
		"\u011e\u0001\u0000\u0000\u0000\u0132\u0126\u0001\u0000\u0000\u0000\u0133"+
		"\u001b\u0001\u0000\u0000\u0000\u0134\u013d\u0005=\u0000\u0000\u0135\u013a"+
		"\u0003J%\u0000\u0136\u0137\u00056\u0000\u0000\u0137\u0139\u0003J%\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013d\u0135\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0005>\u0000\u0000\u0140"+
		"\u001d\u0001\u0000\u0000\u0000\u0141\u0143\u0003\b\u0004\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u0007\u0000\u0000\u0145\u0146"+
		"\u0005!\u0000\u0000\u0146\u014f\u00059\u0000\u0000\u0147\u014c\u0003 "+
		"\u0010\u0000\u0148\u0149\u00056\u0000\u0000\u0149\u014b\u0003 \u0010\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014f\u0147\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005:\u0000\u0000\u0152"+
		"\u0155\u00057\u0000\u0000\u0153\u0156\u0003\u0006\u0003\u0000\u0154\u0156"+
		"\u0005\b\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u017a\u0003"+
		"\"\u0011\u0000\u0158\u015a\u0003\b\u0004\u0000\u0159\u0158\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0005\t\u0000\u0000\u015c\u015d\u0005!\u0000"+
		"\u0000\u015d\u015e\u00052\u0000\u0000\u015e\u015f\u0005\u0007\u0000\u0000"+
		"\u015f\u0168\u00059\u0000\u0000\u0160\u0165\u0005!\u0000\u0000\u0161\u0162"+
		"\u00056\u0000\u0000\u0162\u0164\u0005!\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000"+
		"\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0160\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005:\u0000\u0000\u016b\u016e\u00057\u0000\u0000"+
		"\u016c\u016f\u0003\u0006\u0003\u0000\u016d\u016f\u0005\b\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u0174\u0005;\u0000\u0000\u0171\u0173"+
		"\u0003\u0002\u0001\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005<\u0000\u0000\u0178\u017a\u0005"+
		"5\u0000\u0000\u0179\u0142\u0001\u0000\u0000\u0000\u0179\u0159\u0001\u0000"+
		"\u0000\u0000\u017a\u001f\u0001\u0000\u0000\u0000\u017b\u017c\u0005!\u0000"+
		"\u0000\u017c\u017d\u00057\u0000\u0000\u017d\u017e\u0003\u0006\u0003\u0000"+
		"\u017e!\u0001\u0000\u0000\u0000\u017f\u0183\u0005;\u0000\u0000\u0180\u0182"+
		"\u0003\u0002\u0001\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0005<\u0000\u0000\u0187#\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005\u000b\u0000\u0000\u0189\u018a\u00059\u0000"+
		"\u0000\u018a\u018b\u0003J%\u0000\u018b\u018c\u0005:\u0000\u0000\u018c"+
		"\u018f\u0003\"\u0011\u0000\u018d\u018e\u0005\f\u0000\u0000\u018e\u0190"+
		"\u0003\"\u0011\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190%\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0016"+
		"\u0000\u0000\u0192\u0194\u00059\u0000\u0000\u0193\u0195\u0003(\u0014\u0000"+
		"\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u019a\u0001\u0000\u0000\u0000\u0196\u0197\u00056\u0000\u0000\u0197"+
		"\u0199\u0003(\u0014\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019c"+
		"\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0005:\u0000\u0000\u019e\u01a2\u0005"+
		";\u0000\u0000\u019f\u01a1\u0003*\u0015\u0000\u01a0\u019f\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005<\u0000\u0000"+
		"\u01a6\'\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005!\u0000\u0000\u01a8"+
		"\u01a9\u00057\u0000\u0000\u01a9\u01aa\u0003\u0006\u0003\u0000\u01aa)\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0005\u0017\u0000\u0000\u01ac\u01ad\u0005"+
		"8\u0000\u0000\u01ad\u01ae\u0005!\u0000\u0000\u01ae\u01af\u00052\u0000"+
		"\u0000\u01af\u01b0\u0005!\u0000\u0000\u01b0\u01b1\u00055\u0000\u0000\u01b1"+
		"+\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u000f\u0000\u0000\u01b3\u01b4"+
		"\u0005\u0015\u0000\u0000\u01b4\u01b5\u0005!\u0000\u0000\u01b5\u01b6\u0005"+
		";\u0000\u0000\u01b6\u01b7\u0003.\u0017\u0000\u01b7\u01b8\u0005<\u0000"+
		"\u0000\u01b8-\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005!\u0000\u0000\u01ba"+
		"\u01bb\u00057\u0000\u0000\u01bb\u01bc\u0003\u0006\u0003\u0000\u01bc\u01bd"+
		"\u00055\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1/\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u0018"+
		"\u0000\u0000\u01c4\u01c5\u00059\u0000\u0000\u01c5\u01c6\u00032\u0019\u0000"+
		"\u01c6\u01c7\u0005:\u0000\u0000\u01c7\u01c8\u0003\"\u0011\u0000\u01c8"+
		"1\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\t\u0000\u0000\u01ca\u01cb"+
		"\u0005!\u0000\u0000\u01cb\u01cc\u00052\u0000\u0000\u01cc\u01cd\u0005\""+
		"\u0000\u0000\u01cd\u01ce\u00055\u0000\u0000\u01ce\u01d7\u0005!\u0000\u0000"+
		"\u01cf\u01d1\u00053\u0000\u0000\u01d0\u01d2\u00052\u0000\u0000\u01d1\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d5\u00054\u0000\u0000\u01d4\u01d6\u0005"+
		"2\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d3\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0005\"\u0000\u0000\u01da\u01db\u00055\u0000"+
		"\u0000\u01db\u01dc\u0003\u0002\u0001\u0000\u01dc3\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0005\u0019\u0000\u0000\u01de\u01df\u00059\u0000\u0000\u01df"+
		"\u01e0\u0003J%\u0000\u01e0\u01e1\u0005:\u0000\u0000\u01e1\u01e2\u0003"+
		"\"\u0011\u0000\u01e25\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u000e"+
		"\u0000\u0000\u01e4\u01e7\u00038\u001c\u0000\u01e5\u01e6\u0005\u0010\u0000"+
		"\u0000\u01e6\u01e8\u0005#\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u00055\u0000\u0000\u01ea7\u0001\u0000\u0000\u0000\u01eb\u01f8"+
		"\u0005!\u0000\u0000\u01ec\u01ed\u0005;\u0000\u0000\u01ed\u01f2\u0003:"+
		"\u001d\u0000\u01ee\u01ef\u00056\u0000\u0000\u01ef\u01f1\u0003:\u001d\u0000"+
		"\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0005<\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7"+
		"\u01eb\u0001\u0000\u0000\u0000\u01f7\u01ec\u0001\u0000\u0000\u0000\u01f8"+
		"9\u0001\u0000\u0000\u0000\u01f9\u01fc\u0005!\u0000\u0000\u01fa\u01fb\u0005"+
		"\u0011\u0000\u0000\u01fb\u01fd\u0005!\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd;\u0001\u0000\u0000"+
		"\u0000\u01fe\u020e\u0005\u000f\u0000\u0000\u01ff\u0201\u0005F\u0000\u0000"+
		"\u0200\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u020f\u0003J%\u0000\u0203\u0204"+
		"\u0005;\u0000\u0000\u0204\u0209\u0003>\u001f\u0000\u0205\u0206\u00056"+
		"\u0000\u0000\u0206\u0208\u0003>\u001f\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0005<\u0000\u0000"+
		"\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0200\u0001\u0000\u0000\u0000"+
		"\u020e\u0203\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u00055\u0000\u0000\u0211=\u0001\u0000\u0000\u0000\u0212\u0215"+
		"\u0005!\u0000\u0000\u0213\u0214\u0005\u0011\u0000\u0000\u0214\u0216\u0005"+
		"!\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216?\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u001d\u0000"+
		"\u0000\u0218\u0219\u0007\u0003\u0000\u0000\u0219\u021a\u00059\u0000\u0000"+
		"\u021a\u021b\u0003B!\u0000\u021b\u021c\u0005:\u0000\u0000\u021cA\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0005;\u0000\u0000\u021e\u0223\u0003D\""+
		"\u0000\u021f\u0220\u00056\u0000\u0000\u0220\u0222\u0003D\"\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223"+
		"\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224"+
		"\u0226\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005<\u0000\u0000\u0227C\u0001\u0000\u0000\u0000\u0228\u0229\u0005"+
		"!\u0000\u0000\u0229\u022b\u00057\u0000\u0000\u022a\u022c\u0005=\u0000"+
		"\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u0232\u0007\u0004\u0000"+
		"\u0000\u022e\u022f\u00056\u0000\u0000\u022f\u0231\u0005!\u0000\u0000\u0230"+
		"\u022e\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232"+
		"\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233"+
		"\u0236\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235"+
		"\u0237\u0005>\u0000\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u0001\u0000\u0000\u0000\u0237E\u0001\u0000\u0000\u0000\u0238\u023a\u0003"+
		"@ \u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0005\u000f\u0000\u0000\u023f\u023e\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0005\u0013\u0000\u0000\u0242\u0245\u0005!\u0000\u0000"+
		"\u0243\u0244\u0007\u0005\u0000\u0000\u0244\u0246\u0005!\u0000\u0000\u0245"+
		"\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0005;\u0000\u0000\u0248\u0249"+
		"\u0003H$\u0000\u0249\u024a\u0005<\u0000\u0000\u024aG\u0001\u0000\u0000"+
		"\u0000\u024b\u024f\u0003\u001a\r\u0000\u024c\u024f\u0003\u001e\u000f\u0000"+
		"\u024d\u024f\u0003&\u0013\u0000\u024e\u024b\u0001\u0000\u0000\u0000\u024e"+
		"\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024f"+
		"\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0001\u0000\u0000\u0000\u0251I\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0253\u0254\u0006%\uffff\uffff\u0000\u0254\u0262"+
		"\u0005!\u0000\u0000\u0255\u0262\u0005\"\u0000\u0000\u0256\u0262\u0005"+
		"#\u0000\u0000\u0257\u0262\u0005$\u0000\u0000\u0258\u0262\u0003\u001a\r"+
		"\u0000\u0259\u0262\u0003\u001c\u000e\u0000\u025a\u0262\u0003\u0018\f\u0000"+
		"\u025b\u0262\u0003,\u0016\u0000\u025c\u025f\u00030\u0018\u0000\u025d\u025f"+
		"\u00034\u001a\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025d\u0001"+
		"\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u0262\u0003"+
		"\n\u0005\u0000\u0261\u0253\u0001\u0000\u0000\u0000\u0261\u0255\u0001\u0000"+
		"\u0000\u0000\u0261\u0256\u0001\u0000\u0000\u0000\u0261\u0257\u0001\u0000"+
		"\u0000\u0000\u0261\u0258\u0001\u0000\u0000\u0000\u0261\u0259\u0001\u0000"+
		"\u0000\u0000\u0261\u025a\u0001\u0000\u0000\u0000\u0261\u025b\u0001\u0000"+
		"\u0000\u0000\u0261\u025e\u0001\u0000\u0000\u0000\u0261\u0260\u0001\u0000"+
		"\u0000\u0000\u0262\u028d\u0001\u0000\u0000\u0000\u0263\u0264\n\u0006\u0000"+
		"\u0000\u0264\u0265\u0003\u0004\u0002\u0000\u0265\u0272\u0003J%\u0000\u0266"+
		"\u0268\u0007\u0006\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0268"+
		"\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b"+
		"\u0269\u0001\u0000\u0000\u0000\u026c\u026d\u0003J%\u0000\u026d\u026e\u0003"+
		"\u0004\u0002\u0000\u026e\u026f\u0003J%\u0000\u026f\u0271\u0001\u0000\u0000"+
		"\u0000\u0270\u0269\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000\u0000"+
		"\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000"+
		"\u0000\u0273\u028c\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000"+
		"\u0000\u0275\u0279\n\u0005\u0000\u0000\u0276\u0278\u0007\u0006\u0000\u0000"+
		"\u0277\u0276\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000"+
		"\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"+
		"\u027a\u027c\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000"+
		"\u027c\u0288\u0003J%\u0000\u027d\u0281\u0003J%\u0000\u027e\u0280\u0007"+
		"\u0006\u0000\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u0280\u0283\u0001"+
		"\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0282\u0001"+
		"\u0000\u0000\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u0281\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0003J%\u0000\u0285\u0287\u0001\u0000\u0000"+
		"\u0000\u0286\u027d\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000"+
		"\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000"+
		"\u0000\u028b\u0263\u0001\u0000\u0000\u0000\u028b\u0275\u0001\u0000\u0000"+
		"\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028eK\u0001\u0000\u0000\u0000"+
		"\u028f\u028d\u0001\u0000\u0000\u0000OO\\cgl\u0080\u0085\u008c\u0098\u00a0"+
		"\u00a6\u00ac\u00ae\u00b2\u00b7\u00c1\u00c5\u00cc\u00d0\u00d5\u00db\u00e3"+
		"\u00ee\u00fb\u00ff\u010e\u0117\u0119\u011e\u0126\u012e\u0132\u013a\u013d"+
		"\u0142\u014c\u014f\u0155\u0159\u0165\u0168\u016e\u0174\u0179\u0183\u018f"+
		"\u0194\u019a\u01a2\u01c0\u01d1\u01d5\u01d7\u01e7\u01f2\u01f7\u01fc\u0200"+
		"\u0209\u020e\u0215\u0223\u022b\u0232\u0236\u023b\u023f\u0245\u024e\u0250"+
		"\u025e\u0261\u0269\u0272\u0279\u0281\u0288\u028b\u028d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}