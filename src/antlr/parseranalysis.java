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
		STYLE_TAG=8, IMAGE_SRC=9, IMPORT=10, FROM=11, TEMPLATE=12, CONSTRUCTOR=13, 
		INPUT_BINDING=14, OUTPUT_BINDING=15, DECORATOR=16, ANGULAR_MODULE=17, 
		CLICK_EVENT=18, CLASS_ATTR=19, ID_ATTR=20, TABINDEX_ATTR=21, KEY_ATTR=22, 
		REF_ATTR=23, CONSOLE=24, HTML_TAG=25, STYLE_ATTR=26, NUMBER=27, IDENTIFIER=28, 
		QUOTE=29, EQUALS=30, ARROW=31, OPEN_PAREN=32, CLOSE_PAREN=33, SEMICOLON=34, 
		OPEN_BRACE=35, CLOSE_BRACE=36, OPEN_BRACKET=37, CLOSE_BRACKET=38, COMMA=39, 
		COLON=40, STRING=41, TEMPLATE_OPEN=42, TEMPLATE_CLOSE=43, TEMPLATE_SLASH=44, 
		ENTITY=45, STORE=46, ACTIONS=47, ROUTE=48, PAGE=49, FORM=50, LIST=51, 
		ITEM=52, DETAIL=53, PARAM=54, DISPATCH=55, GO=56, THEN=57, ADD_BUTTON=58, 
		BY=59, ONCLICK=60, IMG=61, TITLE=62, SUBTITLE=63, EDIT=64, DELETE=65, 
		URL_T=66, NUMBER_T=67, STRING_T=68, DOLLAR=69, STYLEURLS=70, SELECTOR=71, 
		ONSUBMIT=72, WS=73;
	public static final int
		RULE_componentFile = 0, RULE_imports = 1, RULE_componentDeclaration = 2, 
		RULE_componentMetadata = 3, RULE_metadataEntry = 4, RULE_classBody = 5, 
		RULE_componentConstructor = 6, RULE_property = 7, RULE_method = 8, RULE_methodBody = 9, 
		RULE_assignment = 10, RULE_htmlTemplate = 11, RULE_clickHandler = 12, 
		RULE_logStatement = 13, RULE_arrayLiteral = 14, RULE_objectLiteral = 15, 
		RULE_entityDecl = 16, RULE_fieldDecl = 17, RULE_storeDecl = 18, RULE_actionsDecl = 19, 
		RULE_actionSig = 20, RULE_paramList = 21, RULE_param = 22, RULE_routeDecl = 23, 
		RULE_pageDecl = 24, RULE_pageBody = 25, RULE_formSection = 26, RULE_listSection = 27, 
		RULE_detailSection = 28, RULE_paramSection = 29, RULE_formArg = 30, RULE_onSubmitStmt = 31, 
		RULE_navStmt = 32, RULE_addButtonStmt = 33, RULE_itemSection = 34, RULE_itemBody = 35, 
		RULE_actionButtonsSection = 36, RULE_actionBtn = 37, RULE_argList = 38, 
		RULE_expr = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"componentFile", "imports", "componentDeclaration", "componentMetadata", 
			"metadataEntry", "classBody", "componentConstructor", "property", "method", 
			"methodBody", "assignment", "htmlTemplate", "clickHandler", "logStatement", 
			"arrayLiteral", "objectLiteral", "entityDecl", "fieldDecl", "storeDecl", 
			"actionsDecl", "actionSig", "paramList", "param", "routeDecl", "pageDecl", 
			"pageBody", "formSection", "listSection", "detailSection", "paramSection", 
			"formArg", "onSubmitStmt", "navStmt", "addButtonStmt", "itemSection", 
			"itemBody", "actionButtonsSection", "actionBtn", "argList", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'function'", "'return'", "'div'", null, "'export'", 
			"'export default'", "'style'", "'src'", "'import'", "'from'", "'template'", 
			"'constructor'", "'@Input'", "'@Output'", "'@Component'", "'@NgModule'", 
			"'(click)'", "'class'", "'id'", "'tabindex'", "'key'", "'#'", "'console.log'", 
			null, null, null, null, "'\"'", "'='", "'=>'", "'('", "')'", "';'", "'{'", 
			"'}'", "'['", "']'", "','", "':'", null, "'<'", "'>'", "'/'", "'entity'", 
			"'store'", "'actions'", "'route'", "'page'", "'form'", "'list'", "'item'", 
			"'detail'", "'param'", "'dispatch'", "'go'", "'then'", "'addButton'", 
			"'by'", "'onClick'", "'img'", "'title'", "'subtitle'", "'edit'", "'delete'", 
			"'url'", "'number'", "'string'", "'$'", "'styleUrls'", "'selector'", 
			"'onSubmit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "FUNCTION", "RETURN", "DIV", "VAR", "EXPORT", "EXPORT_DEFAULT", 
			"STYLE_TAG", "IMAGE_SRC", "IMPORT", "FROM", "TEMPLATE", "CONSTRUCTOR", 
			"INPUT_BINDING", "OUTPUT_BINDING", "DECORATOR", "ANGULAR_MODULE", "CLICK_EVENT", 
			"CLASS_ATTR", "ID_ATTR", "TABINDEX_ATTR", "KEY_ATTR", "REF_ATTR", "CONSOLE", 
			"HTML_TAG", "STYLE_ATTR", "NUMBER", "IDENTIFIER", "QUOTE", "EQUALS", 
			"ARROW", "OPEN_PAREN", "CLOSE_PAREN", "SEMICOLON", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", "COLON", "STRING", "TEMPLATE_OPEN", 
			"TEMPLATE_CLOSE", "TEMPLATE_SLASH", "ENTITY", "STORE", "ACTIONS", "ROUTE", 
			"PAGE", "FORM", "LIST", "ITEM", "DETAIL", "PARAM", "DISPATCH", "GO", 
			"THEN", "ADD_BUTTON", "BY", "ONCLICK", "IMG", "TITLE", "SUBTITLE", "EDIT", 
			"DELETE", "URL_T", "NUMBER_T", "STRING_T", "DOLLAR", "STYLEURLS", "SELECTOR", 
			"ONSUBMIT", "WS"
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
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<ComponentDeclarationContext> componentDeclaration() {
			return getRuleContexts(ComponentDeclarationContext.class);
		}
		public ComponentDeclarationContext componentDeclaration(int i) {
			return getRuleContext(ComponentDeclarationContext.class,i);
		}
		public List<EntityDeclContext> entityDecl() {
			return getRuleContexts(EntityDeclContext.class);
		}
		public EntityDeclContext entityDecl(int i) {
			return getRuleContext(EntityDeclContext.class,i);
		}
		public List<StoreDeclContext> storeDecl() {
			return getRuleContexts(StoreDeclContext.class);
		}
		public StoreDeclContext storeDecl(int i) {
			return getRuleContext(StoreDeclContext.class,i);
		}
		public List<ActionsDeclContext> actionsDecl() {
			return getRuleContexts(ActionsDeclContext.class);
		}
		public ActionsDeclContext actionsDecl(int i) {
			return getRuleContext(ActionsDeclContext.class,i);
		}
		public List<RouteDeclContext> routeDecl() {
			return getRuleContexts(RouteDeclContext.class);
		}
		public RouteDeclContext routeDecl(int i) {
			return getRuleContext(RouteDeclContext.class,i);
		}
		public List<PageDeclContext> pageDecl() {
			return getRuleContexts(PageDeclContext.class);
		}
		public PageDeclContext pageDecl(int i) {
			return getRuleContext(PageDeclContext.class,i);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(80);
				imports();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715534819328L) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECORATOR:
					{
					setState(86);
					componentDeclaration();
					}
					break;
				case ENTITY:
					{
					setState(87);
					entityDecl();
					}
					break;
				case STORE:
					{
					setState(88);
					storeDecl();
					}
					break;
				case ACTIONS:
					{
					setState(89);
					actionsDecl();
					}
					break;
				case ROUTE:
					{
					setState(90);
					routeDecl();
					}
					break;
				case PAGE:
					{
					setState(91);
					pageDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(96);
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
	public static class ImportsContext extends ParserRuleContext {
		public Token importedName;
		public Token IDENTIFIER;
		public List<Token> identList = new ArrayList<Token>();
		public Token INPUT_BINDING;
		public List<Token> decoratorType = new ArrayList<Token>();
		public Token OUTPUT_BINDING;
		public Token _tset94;
		public Token _tset107;
		public Token fromPath;
		public TerminalNode IMPORT() { return getToken(parseranalysis.IMPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(parseranalysis.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(parseranalysis.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> INPUT_BINDING() { return getTokens(parseranalysis.INPUT_BINDING); }
		public TerminalNode INPUT_BINDING(int i) {
			return getToken(parseranalysis.INPUT_BINDING, i);
		}
		public List<TerminalNode> OUTPUT_BINDING() { return getTokens(parseranalysis.OUTPUT_BINDING); }
		public TerminalNode OUTPUT_BINDING(int i) {
			return getToken(parseranalysis.OUTPUT_BINDING, i);
		}
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
			setState(97);
			match(IMPORT);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(98);
				((ImportsContext)_localctx).importedName = match(IDENTIFIER);
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(101);
				match(COMMA);
				}
			}

			setState(104);
			match(OPEN_BRACE);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(105);
				((ImportsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((ImportsContext)_localctx).identList.add(((ImportsContext)_localctx).IDENTIFIER);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(106);
					match(COMMA);
					setState(107);
					((ImportsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((ImportsContext)_localctx).identList.add(((ImportsContext)_localctx).IDENTIFIER);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INPUT_BINDING:
			case OUTPUT_BINDING:
				{
				setState(113);
				((ImportsContext)_localctx)._tset94 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INPUT_BINDING || _la==OUTPUT_BINDING) ) {
					((ImportsContext)_localctx)._tset94 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((ImportsContext)_localctx).decoratorType.add(((ImportsContext)_localctx)._tset94);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					((ImportsContext)_localctx)._tset107 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INPUT_BINDING || _la==OUTPUT_BINDING) ) {
						((ImportsContext)_localctx)._tset107 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ImportsContext)_localctx).decoratorType.add(((ImportsContext)_localctx)._tset107);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLOSE_BRACE:
				break;
			default:
				break;
			}
			setState(123);
			match(CLOSE_BRACE);
			setState(124);
			match(FROM);
			setState(125);
			((ImportsContext)_localctx).fromPath = match(STRING);
			setState(126);
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
		public Token className;
		public TerminalNode DECORATOR() { return getToken(parseranalysis.DECORATOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode CLASS_ATTR() { return getToken(parseranalysis.CLASS_ATTR, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
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
			setState(128);
			match(DECORATOR);
			setState(129);
			match(OPEN_PAREN);
			setState(130);
			componentMetadata();
			setState(131);
			match(CLOSE_PAREN);
			setState(132);
			match(CLASS_ATTR);
			setState(133);
			((ComponentDeclarationContext)_localctx).className = match(IDENTIFIER);
			setState(134);
			match(OPEN_BRACE);
			setState(135);
			classBody();
			setState(136);
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
		public List<MetadataEntryContext> metadataEntry() {
			return getRuleContexts(MetadataEntryContext.class);
		}
		public MetadataEntryContext metadataEntry(int i) {
			return getRuleContext(MetadataEntryContext.class,i);
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
			setState(138);
			match(OPEN_BRACE);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & -4593671619916857327L) != 0)) {
				{
				setState(139);
				metadataEntry();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140);
					match(COMMA);
					setState(141);
					metadataEntry();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149);
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
	public static class MetadataEntryContext extends ParserRuleContext {
		public Token key;
		public Token val;
		public Token ref;
		public ArrayLiteralContext arr;
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode TEMPLATE() { return getToken(parseranalysis.TEMPLATE, 0); }
		public TerminalNode STYLE_TAG() { return getToken(parseranalysis.STYLE_TAG, 0); }
		public TerminalNode TITLE() { return getToken(parseranalysis.TITLE, 0); }
		public TerminalNode STYLEURLS() { return getToken(parseranalysis.STYLEURLS, 0); }
		public TerminalNode SELECTOR() { return getToken(parseranalysis.SELECTOR, 0); }
		public TerminalNode STRING() { return getToken(parseranalysis.STRING, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public MetadataEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataEntry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitMetadataEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataEntryContext metadataEntry() throws RecognitionException {
		MetadataEntryContext _localctx = new MetadataEntryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metadataEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((MetadataEntryContext)_localctx).key = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & -4593671619916857327L) != 0)) ) {
				((MetadataEntryContext)_localctx).key = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(152);
			match(COLON);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(153);
				((MetadataEntryContext)_localctx).val = match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				setState(154);
				((MetadataEntryContext)_localctx).ref = match(IDENTIFIER);
				}
				break;
			case OPEN_BRACKET:
				{
				setState(155);
				((MetadataEntryContext)_localctx).arr = arrayLiteral();
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
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285220896L) != 0)) {
				{
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(158);
					property();
					}
					break;
				case 2:
					{
					setState(159);
					method();
					}
					break;
				case 3:
					{
					setState(160);
					componentConstructor();
					}
					break;
				case 4:
					{
					setState(161);
					clickHandler();
					}
					break;
				case 5:
					{
					setState(162);
					logStatement();
					}
					break;
				}
				}
				setState(167);
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
		public Token param1Name;
		public Token param1Type;
		public Token paramNName;
		public Token paramNType;
		public TerminalNode CONSTRUCTOR() { return getToken(parseranalysis.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(parseranalysis.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parseranalysis.COLON, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER_T() { return getTokens(parseranalysis.NUMBER_T); }
		public TerminalNode NUMBER_T(int i) {
			return getToken(parseranalysis.NUMBER_T, i);
		}
		public List<TerminalNode> STRING_T() { return getTokens(parseranalysis.STRING_T); }
		public TerminalNode STRING_T(int i) {
			return getToken(parseranalysis.STRING_T, i);
		}
		public List<TerminalNode> URL_T() { return getTokens(parseranalysis.URL_T); }
		public TerminalNode URL_T(int i) {
			return getToken(parseranalysis.URL_T, i);
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
		enterRule(_localctx, 12, RULE_componentConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(CONSTRUCTOR);
			setState(169);
			match(OPEN_PAREN);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(170);
				((ComponentConstructorContext)_localctx).param1Name = match(IDENTIFIER);
				setState(171);
				match(COLON);
				setState(172);
				((ComponentConstructorContext)_localctx).param1Type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 1924145348609L) != 0)) ) {
					((ComponentConstructorContext)_localctx).param1Type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(174);
					((ComponentConstructorContext)_localctx).paramNName = match(IDENTIFIER);
					setState(175);
					match(COLON);
					setState(176);
					((ComponentConstructorContext)_localctx).paramNType = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 1924145348609L) != 0)) ) {
						((ComponentConstructorContext)_localctx).paramNType = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(184);
			match(CLOSE_PAREN);
			setState(185);
			match(OPEN_BRACE);
			setState(186);
			methodBody();
			setState(187);
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
		public Token varType;
		public Token name;
		public Token dataType;
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(parseranalysis.VAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode NUMBER_T() { return getToken(parseranalysis.NUMBER_T, 0); }
		public TerminalNode STRING_T() { return getToken(parseranalysis.STRING_T, 0); }
		public TerminalNode URL_T() { return getToken(parseranalysis.URL_T, 0); }
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
		enterRule(_localctx, 14, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((PropertyContext)_localctx).varType = match(VAR);
			setState(190);
			((PropertyContext)_localctx).name = match(IDENTIFIER);
			setState(191);
			match(COLON);
			setState(192);
			((PropertyContext)_localctx).dataType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 1924145348609L) != 0)) ) {
				((PropertyContext)_localctx).dataType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
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
		public Token methodName;
		public Token argName;
		public Token argType;
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
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public TerminalNode NUMBER_T() { return getToken(parseranalysis.NUMBER_T, 0); }
		public TerminalNode STRING_T() { return getToken(parseranalysis.STRING_T, 0); }
		public TerminalNode URL_T() { return getToken(parseranalysis.URL_T, 0); }
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
		enterRule(_localctx, 16, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((MethodContext)_localctx).methodName = match(IDENTIFIER);
			setState(196);
			match(OPEN_PAREN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(197);
				((MethodContext)_localctx).argName = match(IDENTIFIER);
				setState(198);
				match(COLON);
				setState(199);
				((MethodContext)_localctx).argType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 1924145348609L) != 0)) ) {
					((MethodContext)_localctx).argType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(202);
			match(CLOSE_PAREN);
			setState(203);
			match(OPEN_BRACE);
			setState(204);
			methodBody();
			setState(205);
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
		enterRule(_localctx, 18, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4570130415616L) != 0)) {
				{
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSOLE:
					{
					setState(207);
					logStatement();
					}
					break;
				case TEMPLATE_OPEN:
					{
					setState(208);
					htmlTemplate();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(209);
					arrayLiteral();
					}
					break;
				case OPEN_BRACE:
					{
					setState(210);
					objectLiteral();
					}
					break;
				case IDENTIFIER:
					{
					setState(211);
					assignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(216);
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
		public Token assignedVar;
		public Token stringVal;
		public Token numberVal;
		public Token refVal;
		public TerminalNode EQUALS() { return getToken(parseranalysis.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((AssignmentContext)_localctx).assignedVar = match(IDENTIFIER);
			setState(218);
			match(EQUALS);
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(219);
				((AssignmentContext)_localctx).stringVal = match(STRING);
				}
				break;
			case NUMBER:
				{
				setState(220);
				((AssignmentContext)_localctx).numberVal = match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				setState(221);
				((AssignmentContext)_localctx).refVal = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
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
		public Token tag;
		public Token innerContent;
		public List<TerminalNode> TEMPLATE_OPEN() { return getTokens(parseranalysis.TEMPLATE_OPEN); }
		public TerminalNode TEMPLATE_OPEN(int i) {
			return getToken(parseranalysis.TEMPLATE_OPEN, i);
		}
		public List<TerminalNode> TEMPLATE_CLOSE() { return getTokens(parseranalysis.TEMPLATE_CLOSE); }
		public TerminalNode TEMPLATE_CLOSE(int i) {
			return getToken(parseranalysis.TEMPLATE_CLOSE, i);
		}
		public TerminalNode TEMPLATE_SLASH() { return getToken(parseranalysis.TEMPLATE_SLASH, 0); }
		public List<TerminalNode> HTML_TAG() { return getTokens(parseranalysis.HTML_TAG); }
		public TerminalNode HTML_TAG(int i) {
			return getToken(parseranalysis.HTML_TAG, i);
		}
		public List<HtmlTemplateContext> htmlTemplate() {
			return getRuleContexts(HtmlTemplateContext.class);
		}
		public HtmlTemplateContext htmlTemplate(int i) {
			return getRuleContext(HtmlTemplateContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
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
		enterRule(_localctx, 22, RULE_htmlTemplate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(TEMPLATE_OPEN);
			setState(227);
			((HtmlTemplateContext)_localctx).tag = match(HTML_TAG);
			setState(228);
			match(TEMPLATE_CLOSE);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(231);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(229);
						((HtmlTemplateContext)_localctx).innerContent = match(IDENTIFIER);
						}
						break;
					case TEMPLATE_OPEN:
						{
						setState(230);
						htmlTemplate();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(236);
			match(TEMPLATE_OPEN);
			setState(237);
			match(TEMPLATE_SLASH);
			setState(238);
			match(HTML_TAG);
			setState(239);
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
		public Token handlerName;
		public Token calledFunction;
		public ArgListContext args;
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_clickHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((ClickHandlerContext)_localctx).handlerName = match(IDENTIFIER);
			setState(242);
			match(OPEN_PAREN);
			setState(243);
			match(CLOSE_PAREN);
			setState(244);
			match(OPEN_BRACE);
			setState(245);
			((ClickHandlerContext)_localctx).calledFunction = match(IDENTIFIER);
			setState(246);
			match(OPEN_PAREN);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199425908736L) != 0)) {
				{
				setState(247);
				((ClickHandlerContext)_localctx).args = argList();
				}
			}

			setState(250);
			match(CLOSE_PAREN);
			setState(251);
			match(SEMICOLON);
			setState(252);
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
		public Token logVar;
		public TerminalNode CONSOLE() { return getToken(parseranalysis.CONSOLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(parseranalysis.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
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
		enterRule(_localctx, 26, RULE_logStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(CONSOLE);
			setState(255);
			match(OPEN_PAREN);
			setState(256);
			((LogStatementContext)_localctx).logVar = match(IDENTIFIER);
			setState(257);
			match(CLOSE_PAREN);
			setState(258);
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
		public Token element;
		public TerminalNode OPEN_BRACKET() { return getToken(parseranalysis.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(parseranalysis.CLOSE_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(parseranalysis.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(parseranalysis.STRING, i);
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
		enterRule(_localctx, 28, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(OPEN_BRACKET);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==STRING) {
				{
				setState(261);
				((ArrayLiteralContext)_localctx).element = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
					((ArrayLiteralContext)_localctx).element = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(262);
					match(COMMA);
					setState(263);
					((ArrayLiteralContext)_localctx).element = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==STRING) ) {
						((ArrayLiteralContext)_localctx).element = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271);
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
		public Token key;
		public Token stringVal;
		public Token numberVal;
		public Token refVal;
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(parseranalysis.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parseranalysis.COLON, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
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
		enterRule(_localctx, 30, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(OPEN_BRACE);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(274);
				((ObjectLiteralContext)_localctx).key = match(IDENTIFIER);
				setState(275);
				match(COLON);
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(276);
					((ObjectLiteralContext)_localctx).stringVal = match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(277);
					((ObjectLiteralContext)_localctx).numberVal = match(NUMBER);
					}
					break;
				case IDENTIFIER:
					{
					setState(278);
					((ObjectLiteralContext)_localctx).refVal = match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(281);
					match(COMMA);
					setState(282);
					((ObjectLiteralContext)_localctx).key = match(IDENTIFIER);
					setState(283);
					match(COLON);
					setState(287);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(284);
						((ObjectLiteralContext)_localctx).stringVal = match(STRING);
						}
						break;
					case NUMBER:
						{
						setState(285);
						((ObjectLiteralContext)_localctx).numberVal = match(NUMBER);
						}
						break;
					case IDENTIFIER:
						{
						setState(286);
						((ObjectLiteralContext)_localctx).refVal = match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(296);
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
	public static class EntityDeclContext extends ParserRuleContext {
		public Token entityName;
		public FieldDeclContext fieldDecl;
		public List<FieldDeclContext> fields = new ArrayList<FieldDeclContext>();
		public TerminalNode ENTITY() { return getToken(parseranalysis.ENTITY, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public EntityDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitEntityDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDeclContext entityDecl() throws RecognitionException {
		EntityDeclContext _localctx = new EntityDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_entityDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ENTITY);
			setState(299);
			((EntityDeclContext)_localctx).entityName = match(IDENTIFIER);
			setState(300);
			match(OPEN_BRACE);
			setState(302); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(301);
				((EntityDeclContext)_localctx).fieldDecl = fieldDecl();
				((EntityDeclContext)_localctx).fields.add(((EntityDeclContext)_localctx).fieldDecl);
				}
				}
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(306);
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
	public static class FieldDeclContext extends ParserRuleContext {
		public Token fieldName;
		public Token fieldType;
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode NUMBER_T() { return getToken(parseranalysis.NUMBER_T, 0); }
		public TerminalNode STRING_T() { return getToken(parseranalysis.STRING_T, 0); }
		public TerminalNode URL_T() { return getToken(parseranalysis.URL_T, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((FieldDeclContext)_localctx).fieldName = match(IDENTIFIER);
			setState(309);
			match(COLON);
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(310);
				((FieldDeclContext)_localctx).fieldType = match(IDENTIFIER);
				}
				break;
			case NUMBER_T:
				{
				setState(311);
				match(NUMBER_T);
				}
				break;
			case STRING_T:
				{
				setState(312);
				match(STRING_T);
				}
				break;
			case URL_T:
				{
				setState(313);
				match(URL_T);
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
	public static class StoreDeclContext extends ParserRuleContext {
		public Token storeName;
		public Token entityRef;
		public TerminalNode STORE() { return getToken(parseranalysis.STORE, 0); }
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(parseranalysis.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(parseranalysis.CLOSE_BRACKET, 0); }
		public StoreDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitStoreDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreDeclContext storeDecl() throws RecognitionException {
		StoreDeclContext _localctx = new StoreDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_storeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(STORE);
			setState(317);
			((StoreDeclContext)_localctx).storeName = match(IDENTIFIER);
			setState(318);
			match(COLON);
			setState(319);
			((StoreDeclContext)_localctx).entityRef = match(IDENTIFIER);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(320);
				match(OPEN_BRACKET);
				setState(321);
				match(CLOSE_BRACKET);
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
	public static class ActionsDeclContext extends ParserRuleContext {
		public ActionSigContext actionSig;
		public List<ActionSigContext> actions = new ArrayList<ActionSigContext>();
		public TerminalNode ACTIONS() { return getToken(parseranalysis.ACTIONS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<ActionSigContext> actionSig() {
			return getRuleContexts(ActionSigContext.class);
		}
		public ActionSigContext actionSig(int i) {
			return getRuleContext(ActionSigContext.class,i);
		}
		public ActionsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionsDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitActionsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsDeclContext actionsDecl() throws RecognitionException {
		ActionsDeclContext _localctx = new ActionsDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_actionsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ACTIONS);
			setState(325);
			match(OPEN_BRACE);
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				((ActionsDeclContext)_localctx).actionSig = actionSig();
				((ActionsDeclContext)_localctx).actions.add(((ActionsDeclContext)_localctx).actionSig);
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(331);
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
	public static class ActionSigContext extends ParserRuleContext {
		public Token actionName;
		public ParamListContext params;
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ActionSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionSig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitActionSig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionSigContext actionSig() throws RecognitionException {
		ActionSigContext _localctx = new ActionSigContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actionSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((ActionSigContext)_localctx).actionName = match(IDENTIFIER);
			setState(334);
			match(OPEN_PAREN);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(335);
				((ActionSigContext)_localctx).params = paramList();
				}
			}

			setState(338);
			match(CLOSE_PAREN);
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
	public static class ParamListContext extends ParserRuleContext {
		public ParamContext param;
		public List<ParamContext> ps = new ArrayList<ParamContext>();
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((ParamListContext)_localctx).param = param();
			((ParamListContext)_localctx).ps.add(((ParamListContext)_localctx).param);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(342);
				((ParamListContext)_localctx).param = param();
				((ParamListContext)_localctx).ps.add(((ParamListContext)_localctx).param);
				}
				}
				setState(347);
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
	public static class ParamContext extends ParserRuleContext {
		public Token paramName;
		public Token paramType;
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode NUMBER_T() { return getToken(parseranalysis.NUMBER_T, 0); }
		public TerminalNode STRING_T() { return getToken(parseranalysis.STRING_T, 0); }
		public TerminalNode URL_T() { return getToken(parseranalysis.URL_T, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			((ParamContext)_localctx).paramName = match(IDENTIFIER);
			setState(349);
			match(COLON);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(350);
				((ParamContext)_localctx).paramType = match(IDENTIFIER);
				}
				break;
			case NUMBER_T:
				{
				setState(351);
				match(NUMBER_T);
				}
				break;
			case STRING_T:
				{
				setState(352);
				match(STRING_T);
				}
				break;
			case URL_T:
				{
				setState(353);
				match(URL_T);
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
	public static class RouteDeclContext extends ParserRuleContext {
		public Token path;
		public Token pageName;
		public ParamListContext routeParams;
		public TerminalNode ROUTE() { return getToken(parseranalysis.ROUTE, 0); }
		public TerminalNode ARROW() { return getToken(parseranalysis.ARROW, 0); }
		public TerminalNode STRING() { return getToken(parseranalysis.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public RouteDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitRouteDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDeclContext routeDecl() throws RecognitionException {
		RouteDeclContext _localctx = new RouteDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_routeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ROUTE);
			setState(357);
			((RouteDeclContext)_localctx).path = match(STRING);
			setState(358);
			match(ARROW);
			setState(359);
			((RouteDeclContext)_localctx).pageName = match(IDENTIFIER);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(360);
				match(OPEN_PAREN);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(361);
					((RouteDeclContext)_localctx).routeParams = paramList();
					}
				}

				setState(364);
				match(CLOSE_PAREN);
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
	public static class PageDeclContext extends ParserRuleContext {
		public Token pageName;
		public TerminalNode PAGE() { return getToken(parseranalysis.PAGE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public List<PageBodyContext> pageBody() {
			return getRuleContexts(PageBodyContext.class);
		}
		public PageBodyContext pageBody(int i) {
			return getRuleContext(PageBodyContext.class,i);
		}
		public PageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitPageDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageDeclContext pageDecl() throws RecognitionException {
		PageDeclContext _localctx = new PageDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pageDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(PAGE);
			setState(368);
			((PageDeclContext)_localctx).pageName = match(IDENTIFIER);
			setState(369);
			match(OPEN_BRACE);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 33557241L) != 0)) {
				{
				{
				setState(370);
				pageBody();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
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
	public static class PageBodyContext extends ParserRuleContext {
		public FormSectionContext formSection() {
			return getRuleContext(FormSectionContext.class,0);
		}
		public ListSectionContext listSection() {
			return getRuleContext(ListSectionContext.class,0);
		}
		public DetailSectionContext detailSection() {
			return getRuleContext(DetailSectionContext.class,0);
		}
		public ParamSectionContext paramSection() {
			return getRuleContext(ParamSectionContext.class,0);
		}
		public OnSubmitStmtContext onSubmitStmt() {
			return getRuleContext(OnSubmitStmtContext.class,0);
		}
		public NavStmtContext navStmt() {
			return getRuleContext(NavStmtContext.class,0);
		}
		public AddButtonStmtContext addButtonStmt() {
			return getRuleContext(AddButtonStmtContext.class,0);
		}
		public ItemSectionContext itemSection() {
			return getRuleContext(ItemSectionContext.class,0);
		}
		public ActionButtonsSectionContext actionButtonsSection() {
			return getRuleContext(ActionButtonsSectionContext.class,0);
		}
		public PageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitPageBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageBodyContext pageBody() throws RecognitionException {
		PageBodyContext _localctx = new PageBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pageBody);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORM:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				formSection();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				listSection();
				}
				break;
			case DETAIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				detailSection();
				}
				break;
			case PARAM:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				paramSection();
				}
				break;
			case ONSUBMIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				onSubmitStmt();
				}
				break;
			case GO:
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				navStmt();
				}
				break;
			case ADD_BUTTON:
				enterOuterAlt(_localctx, 7);
				{
				setState(384);
				addButtonStmt();
				}
				break;
			case ITEM:
				enterOuterAlt(_localctx, 8);
				{
				setState(385);
				itemSection();
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 9);
				{
				setState(386);
				actionButtonsSection();
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
	public static class FormSectionContext extends ParserRuleContext {
		public Token entityRef;
		public TerminalNode FORM() { return getToken(parseranalysis.FORM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public FormSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitFormSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormSectionContext formSection() throws RecognitionException {
		FormSectionContext _localctx = new FormSectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_formSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(FORM);
			setState(390);
			((FormSectionContext)_localctx).entityRef = match(IDENTIFIER);
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
	public static class ListSectionContext extends ParserRuleContext {
		public Token storeRef;
		public TerminalNode LIST() { return getToken(parseranalysis.LIST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public ListSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitListSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListSectionContext listSection() throws RecognitionException {
		ListSectionContext _localctx = new ListSectionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LIST);
			setState(393);
			((ListSectionContext)_localctx).storeRef = match(IDENTIFIER);
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
	public static class DetailSectionContext extends ParserRuleContext {
		public Token storeRef;
		public Token byParam;
		public TerminalNode DETAIL() { return getToken(parseranalysis.DETAIL, 0); }
		public TerminalNode BY() { return getToken(parseranalysis.BY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public DetailSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detailSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitDetailSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DetailSectionContext detailSection() throws RecognitionException {
		DetailSectionContext _localctx = new DetailSectionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_detailSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(DETAIL);
			setState(396);
			((DetailSectionContext)_localctx).storeRef = match(IDENTIFIER);
			setState(397);
			match(BY);
			setState(398);
			((DetailSectionContext)_localctx).byParam = match(IDENTIFIER);
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
	public static class ParamSectionContext extends ParserRuleContext {
		public Token pName;
		public Token pType;
		public TerminalNode PARAM() { return getToken(parseranalysis.PARAM, 0); }
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public TerminalNode NUMBER_T() { return getToken(parseranalysis.NUMBER_T, 0); }
		public TerminalNode STRING_T() { return getToken(parseranalysis.STRING_T, 0); }
		public TerminalNode URL_T() { return getToken(parseranalysis.URL_T, 0); }
		public ParamSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitParamSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamSectionContext paramSection() throws RecognitionException {
		ParamSectionContext _localctx = new ParamSectionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_paramSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(PARAM);
			setState(401);
			((ParamSectionContext)_localctx).pName = match(IDENTIFIER);
			setState(402);
			match(COLON);
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(403);
				((ParamSectionContext)_localctx).pType = match(IDENTIFIER);
				}
				break;
			case NUMBER_T:
				{
				setState(404);
				match(NUMBER_T);
				}
				break;
			case STRING_T:
				{
				setState(405);
				match(STRING_T);
				}
				break;
			case URL_T:
				{
				setState(406);
				match(URL_T);
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
	public static class FormArgContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(parseranalysis.DOLLAR, 0); }
		public TerminalNode FORM() { return getToken(parseranalysis.FORM, 0); }
		public FormArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formArg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitFormArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormArgContext formArg() throws RecognitionException {
		FormArgContext _localctx = new FormArgContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(DOLLAR);
			setState(410);
			match(FORM);
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
	public static class OnSubmitStmtContext extends ParserRuleContext {
		public Token actionName;
		public Token thenPage;
		public ArgListContext thenArgs;
		public TerminalNode ONSUBMIT() { return getToken(parseranalysis.ONSUBMIT, 0); }
		public TerminalNode DISPATCH() { return getToken(parseranalysis.DISPATCH, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(parseranalysis.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(parseranalysis.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(parseranalysis.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(parseranalysis.CLOSE_PAREN, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(parseranalysis.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(parseranalysis.IDENTIFIER, i);
		}
		public FormArgContext formArg() {
			return getRuleContext(FormArgContext.class,0);
		}
		public TerminalNode THEN() { return getToken(parseranalysis.THEN, 0); }
		public TerminalNode GO() { return getToken(parseranalysis.GO, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public OnSubmitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSubmitStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitOnSubmitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnSubmitStmtContext onSubmitStmt() throws RecognitionException {
		OnSubmitStmtContext _localctx = new OnSubmitStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_onSubmitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(ONSUBMIT);
			setState(413);
			match(DISPATCH);
			setState(414);
			((OnSubmitStmtContext)_localctx).actionName = match(IDENTIFIER);
			setState(415);
			match(OPEN_PAREN);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(416);
				formArg();
				}
			}

			setState(419);
			match(CLOSE_PAREN);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(420);
				match(THEN);
				setState(421);
				match(GO);
				setState(422);
				((OnSubmitStmtContext)_localctx).thenPage = match(IDENTIFIER);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(423);
					match(OPEN_PAREN);
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199425908736L) != 0)) {
						{
						setState(424);
						((OnSubmitStmtContext)_localctx).thenArgs = argList();
						}
					}

					setState(427);
					match(CLOSE_PAREN);
					}
				}

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
	public static class NavStmtContext extends ParserRuleContext {
		public Token targetPage;
		public ArgListContext args;
		public TerminalNode GO() { return getToken(parseranalysis.GO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public NavStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitNavStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavStmtContext navStmt() throws RecognitionException {
		NavStmtContext _localctx = new NavStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_navStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(GO);
			setState(433);
			((NavStmtContext)_localctx).targetPage = match(IDENTIFIER);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(434);
				match(OPEN_PAREN);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199425908736L) != 0)) {
					{
					setState(435);
					((NavStmtContext)_localctx).args = argList();
					}
				}

				setState(438);
				match(CLOSE_PAREN);
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
	public static class AddButtonStmtContext extends ParserRuleContext {
		public Token targetPage;
		public ArgListContext args;
		public TerminalNode ADD_BUTTON() { return getToken(parseranalysis.ADD_BUTTON, 0); }
		public TerminalNode GO() { return getToken(parseranalysis.GO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AddButtonStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addButtonStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitAddButtonStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddButtonStmtContext addButtonStmt() throws RecognitionException {
		AddButtonStmtContext _localctx = new AddButtonStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_addButtonStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ADD_BUTTON);
			setState(442);
			match(GO);
			setState(443);
			((AddButtonStmtContext)_localctx).targetPage = match(IDENTIFIER);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(444);
				match(OPEN_PAREN);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199425908736L) != 0)) {
					{
					setState(445);
					((AddButtonStmtContext)_localctx).args = argList();
					}
				}

				setState(448);
				match(CLOSE_PAREN);
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
	public static class ItemSectionContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(parseranalysis.ITEM, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<ItemBodyContext> itemBody() {
			return getRuleContexts(ItemBodyContext.class);
		}
		public ItemBodyContext itemBody(int i) {
			return getRuleContext(ItemBodyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public ItemSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitItemSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemSectionContext itemSection() throws RecognitionException {
		ItemSectionContext _localctx = new ItemSectionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_itemSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(ITEM);
			setState(452);
			match(OPEN_BRACE);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921504606846976L) != 0)) {
				{
				setState(453);
				itemBody();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(454);
					match(COMMA);
					setState(455);
					itemBody();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(463);
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
	public static class ItemBodyContext extends ParserRuleContext {
		public Token imgField;
		public Token titleField;
		public Token subtitleField;
		public Token clickPage;
		public ArgListContext clickArgs;
		public TerminalNode IMG() { return getToken(parseranalysis.IMG, 0); }
		public TerminalNode COLON() { return getToken(parseranalysis.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode TITLE() { return getToken(parseranalysis.TITLE, 0); }
		public TerminalNode SUBTITLE() { return getToken(parseranalysis.SUBTITLE, 0); }
		public TerminalNode ONCLICK() { return getToken(parseranalysis.ONCLICK, 0); }
		public TerminalNode GO() { return getToken(parseranalysis.GO, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ItemBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitItemBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemBodyContext itemBody() throws RecognitionException {
		ItemBodyContext _localctx = new ItemBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_itemBody);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMG:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(IMG);
				setState(466);
				match(COLON);
				setState(467);
				((ItemBodyContext)_localctx).imgField = match(IDENTIFIER);
				}
				break;
			case TITLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(TITLE);
				setState(469);
				match(COLON);
				setState(470);
				((ItemBodyContext)_localctx).titleField = match(IDENTIFIER);
				}
				break;
			case SUBTITLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(SUBTITLE);
				setState(472);
				match(COLON);
				setState(473);
				((ItemBodyContext)_localctx).subtitleField = match(IDENTIFIER);
				}
				break;
			case ONCLICK:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				match(ONCLICK);
				setState(475);
				match(GO);
				setState(476);
				((ItemBodyContext)_localctx).clickPage = match(IDENTIFIER);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(477);
					match(OPEN_PAREN);
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199425908736L) != 0)) {
						{
						setState(478);
						((ItemBodyContext)_localctx).clickArgs = argList();
						}
					}

					setState(481);
					match(CLOSE_PAREN);
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
	public static class ActionButtonsSectionContext extends ParserRuleContext {
		public TerminalNode ACTIONS() { return getToken(parseranalysis.ACTIONS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(parseranalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(parseranalysis.CLOSE_BRACE, 0); }
		public List<ActionBtnContext> actionBtn() {
			return getRuleContexts(ActionBtnContext.class);
		}
		public ActionBtnContext actionBtn(int i) {
			return getRuleContext(ActionBtnContext.class,i);
		}
		public ActionButtonsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionButtonsSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitActionButtonsSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionButtonsSectionContext actionButtonsSection() throws RecognitionException {
		ActionButtonsSectionContext _localctx = new ActionButtonsSectionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_actionButtonsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(ACTIONS);
			setState(487);
			match(OPEN_BRACE);
			setState(489); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(488);
				actionBtn();
				}
				}
				setState(491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EDIT || _la==DELETE );
			setState(493);
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
	public static class ActionBtnContext extends ParserRuleContext {
		public Token editPage;
		public ArgListContext editArgs;
		public Token deleteAction;
		public ArgListContext delArgs;
		public TerminalNode EDIT() { return getToken(parseranalysis.EDIT, 0); }
		public TerminalNode GO() { return getToken(parseranalysis.GO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(parseranalysis.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(parseranalysis.CLOSE_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(parseranalysis.DELETE, 0); }
		public TerminalNode DISPATCH() { return getToken(parseranalysis.DISPATCH, 0); }
		public ActionBtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBtn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitActionBtn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionBtnContext actionBtn() throws RecognitionException {
		ActionBtnContext _localctx = new ActionBtnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_actionBtn);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(EDIT);
				setState(496);
				match(GO);
				setState(497);
				((ActionBtnContext)_localctx).editPage = match(IDENTIFIER);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(498);
					match(OPEN_PAREN);
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199425908736L) != 0)) {
						{
						setState(499);
						((ActionBtnContext)_localctx).editArgs = argList();
						}
					}

					setState(502);
					match(CLOSE_PAREN);
					}
				}

				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(DELETE);
				setState(506);
				match(DISPATCH);
				setState(507);
				((ActionBtnContext)_localctx).deleteAction = match(IDENTIFIER);
				setState(508);
				match(OPEN_PAREN);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199425908736L) != 0)) {
					{
					setState(509);
					((ActionBtnContext)_localctx).delArgs = argList();
					}
				}

				setState(512);
				match(CLOSE_PAREN);
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
	public static class ArgListContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> es = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parseranalysis.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parseranalysis.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			((ArgListContext)_localctx).expr = expr();
			((ArgListContext)_localctx).es.add(((ArgListContext)_localctx).expr);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(516);
				match(COMMA);
				setState(517);
				((ArgListContext)_localctx).expr = expr();
				((ArgListContext)_localctx).es.add(((ArgListContext)_localctx).expr);
				}
				}
				setState(522);
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
	public static class ExprContext extends ParserRuleContext {
		public Token ref;
		public Token str;
		public Token num;
		public TerminalNode IDENTIFIER() { return getToken(parseranalysis.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(parseranalysis.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(parseranalysis.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parseranalysisVisitor ) return ((parseranalysisVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expr);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				((ExprContext)_localctx).ref = match(IDENTIFIER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				((ExprContext)_localctx).str = match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				((ExprContext)_localctx).num = match(NUMBER);
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

	public static final String _serializedATN =
		"\u0004\u0001I\u0211\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000]\b"+
		"\u0000\n\u0000\f\u0000`\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001d\b"+
		"\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001m\b\u0001\n\u0001\f\u0001p\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001u\b\u0001\n\u0001\f\u0001x\t"+
		"\u0001\u0003\u0001z\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008f\b\u0003\n"+
		"\u0003\f\u0003\u0092\t\u0003\u0003\u0003\u0094\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u009d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00a4\b\u0005\n\u0005\f\u0005\u00a7\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b2\b\u0006\n\u0006\f\u0006\u00b5"+
		"\t\u0006\u0003\u0006\u00b7\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00c9\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00d5\b\t\n\t\f\t\u00d8\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00df\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e8\b\u000b"+
		"\n\u000b\f\u000b\u00eb\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00f9\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0109\b\u000e\n\u000e\f\u000e\u010c\t\u000e\u0003\u000e\u010e"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0118\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0120"+
		"\b\u000f\u0005\u000f\u0122\b\u000f\n\u000f\f\u000f\u0125\t\u000f\u0003"+
		"\u000f\u0127\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u012f\b\u0010\u000b\u0010\f\u0010\u0130"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u013b\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0143\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0148\b\u0013\u000b\u0013"+
		"\f\u0013\u0149\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0151\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0158\b\u0015\n\u0015\f\u0015\u015b\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0163\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u016b\b\u0017\u0001\u0017\u0003\u0017\u016e"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0174"+
		"\b\u0018\n\u0018\f\u0018\u0177\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0184\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0198\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01a2\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01aa\b\u001f"+
		"\u0001\u001f\u0003\u001f\u01ad\b\u001f\u0003\u001f\u01af\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u01b5\b \u0001 \u0003 \u01b8\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u01bf\b!\u0001!\u0003!\u01c2\b!\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01c9\b\"\n\"\f\"\u01cc\t\"\u0003"+
		"\"\u01ce\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01e0"+
		"\b#\u0001#\u0003#\u01e3\b#\u0003#\u01e5\b#\u0001$\u0001$\u0001$\u0004"+
		"$\u01ea\b$\u000b$\f$\u01eb\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u01f5\b%\u0001%\u0003%\u01f8\b%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u01ff\b%\u0001%\u0003%\u0202\b%\u0001&\u0001&\u0001&\u0005&\u0207"+
		"\b&\n&\f&\u020a\t&\u0001\'\u0001\'\u0001\'\u0003\'\u020f\b\'\u0001\'\u0000"+
		"\u0000(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0004\u0001\u0000\u000e"+
		"\u000f\u0005\u0000\b\b\f\f\u001c\u001c>>FG\u0002\u0000\u001c\u001cBD\u0002"+
		"\u0000\u001c\u001c))\u0243\u0000S\u0001\u0000\u0000\u0000\u0002a\u0001"+
		"\u0000\u0000\u0000\u0004\u0080\u0001\u0000\u0000\u0000\u0006\u008a\u0001"+
		"\u0000\u0000\u0000\b\u0097\u0001\u0000\u0000\u0000\n\u00a5\u0001\u0000"+
		"\u0000\u0000\f\u00a8\u0001\u0000\u0000\u0000\u000e\u00bd\u0001\u0000\u0000"+
		"\u0000\u0010\u00c3\u0001\u0000\u0000\u0000\u0012\u00d6\u0001\u0000\u0000"+
		"\u0000\u0014\u00d9\u0001\u0000\u0000\u0000\u0016\u00e2\u0001\u0000\u0000"+
		"\u0000\u0018\u00f1\u0001\u0000\u0000\u0000\u001a\u00fe\u0001\u0000\u0000"+
		"\u0000\u001c\u0104\u0001\u0000\u0000\u0000\u001e\u0111\u0001\u0000\u0000"+
		"\u0000 \u012a\u0001\u0000\u0000\u0000\"\u0134\u0001\u0000\u0000\u0000"+
		"$\u013c\u0001\u0000\u0000\u0000&\u0144\u0001\u0000\u0000\u0000(\u014d"+
		"\u0001\u0000\u0000\u0000*\u0154\u0001\u0000\u0000\u0000,\u015c\u0001\u0000"+
		"\u0000\u0000.\u0164\u0001\u0000\u0000\u00000\u016f\u0001\u0000\u0000\u0000"+
		"2\u0183\u0001\u0000\u0000\u00004\u0185\u0001\u0000\u0000\u00006\u0188"+
		"\u0001\u0000\u0000\u00008\u018b\u0001\u0000\u0000\u0000:\u0190\u0001\u0000"+
		"\u0000\u0000<\u0199\u0001\u0000\u0000\u0000>\u019c\u0001\u0000\u0000\u0000"+
		"@\u01b0\u0001\u0000\u0000\u0000B\u01b9\u0001\u0000\u0000\u0000D\u01c3"+
		"\u0001\u0000\u0000\u0000F\u01e4\u0001\u0000\u0000\u0000H\u01e6\u0001\u0000"+
		"\u0000\u0000J\u0201\u0001\u0000\u0000\u0000L\u0203\u0001\u0000\u0000\u0000"+
		"N\u020e\u0001\u0000\u0000\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000T^\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"V]\u0003\u0004\u0002\u0000W]\u0003 \u0010\u0000X]\u0003$\u0012\u0000Y"+
		"]\u0003&\u0013\u0000Z]\u0003.\u0017\u0000[]\u00030\u0018\u0000\\V\u0001"+
		"\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000"+
		"\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_\u0001\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ac\u0005\n\u0000\u0000bd\u0005\u001c\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0005\'\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hy\u0005#\u0000\u0000in\u0005\u001c\u0000\u0000jk\u0005\'"+
		"\u0000\u0000km\u0005\u001c\u0000\u0000lj\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oz\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qv\u0007\u0000\u0000"+
		"\u0000rs\u0005\'\u0000\u0000su\u0007\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yi\u0001"+
		"\u0000\u0000\u0000yq\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{|\u0005$\u0000\u0000|}\u0005\u000b\u0000\u0000"+
		"}~\u0005)\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f\u0003\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0082\u0005 \u0000"+
		"\u0000\u0082\u0083\u0003\u0006\u0003\u0000\u0083\u0084\u0005!\u0000\u0000"+
		"\u0084\u0085\u0005\u0013\u0000\u0000\u0085\u0086\u0005\u001c\u0000\u0000"+
		"\u0086\u0087\u0005#\u0000\u0000\u0087\u0088\u0003\n\u0005\u0000\u0088"+
		"\u0089\u0005$\u0000\u0000\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u0093"+
		"\u0005#\u0000\u0000\u008b\u0090\u0003\b\u0004\u0000\u008c\u008d\u0005"+
		"\'\u0000\u0000\u008d\u008f\u0003\b\u0004\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u008b\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005$\u0000\u0000\u0096\u0007\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0007\u0001\u0000\u0000\u0098\u009c\u0005(\u0000\u0000"+
		"\u0099\u009d\u0005)\u0000\u0000\u009a\u009d\u0005\u001c\u0000\u0000\u009b"+
		"\u009d\u0003\u001c\u000e\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\t\u0001\u0000\u0000\u0000\u009e\u00a4\u0003\u000e\u0007\u0000\u009f\u00a4"+
		"\u0003\u0010\b\u0000\u00a0\u00a4\u0003\f\u0006\u0000\u00a1\u00a4\u0003"+
		"\u0018\f\u0000\u00a2\u00a4\u0003\u001a\r\u0000\u00a3\u009e\u0001\u0000"+
		"\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u000b\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\r\u0000"+
		"\u0000\u00a9\u00b6\u0005 \u0000\u0000\u00aa\u00ab\u0005\u001c\u0000\u0000"+
		"\u00ab\u00ac\u0005(\u0000\u0000\u00ac\u00b3\u0007\u0002\u0000\u0000\u00ad"+
		"\u00ae\u0005\'\u0000\u0000\u00ae\u00af\u0005\u001c\u0000\u0000\u00af\u00b0"+
		"\u0005(\u0000\u0000\u00b0\u00b2\u0007\u0002\u0000\u0000\u00b1\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005!\u0000\u0000\u00b9\u00ba\u0005#\u0000"+
		"\u0000\u00ba\u00bb\u0003\u0012\t\u0000\u00bb\u00bc\u0005$\u0000\u0000"+
		"\u00bc\r\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0005\u0000\u0000\u00be"+
		"\u00bf\u0005\u001c\u0000\u0000\u00bf\u00c0\u0005(\u0000\u0000\u00c0\u00c1"+
		"\u0007\u0002\u0000\u0000\u00c1\u00c2\u0005\"\u0000\u0000\u00c2\u000f\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005\u001c\u0000\u0000\u00c4\u00c8\u0005"+
		" \u0000\u0000\u00c5\u00c6\u0005\u001c\u0000\u0000\u00c6\u00c7\u0005(\u0000"+
		"\u0000\u00c7\u00c9\u0007\u0002\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005!\u0000\u0000\u00cb\u00cc\u0005#\u0000\u0000\u00cc"+
		"\u00cd\u0003\u0012\t\u0000\u00cd\u00ce\u0005$\u0000\u0000\u00ce\u0011"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d5\u0003\u001a\r\u0000\u00d0\u00d5\u0003"+
		"\u0016\u000b\u0000\u00d1\u00d5\u0003\u001c\u000e\u0000\u00d2\u00d5\u0003"+
		"\u001e\u000f\u0000\u00d3\u00d5\u0003\u0014\n\u0000\u00d4\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u0013\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001c"+
		"\u0000\u0000\u00da\u00de\u0005\u001e\u0000\u0000\u00db\u00df\u0005)\u0000"+
		"\u0000\u00dc\u00df\u0005\u001b\u0000\u0000\u00dd\u00df\u0005\u001c\u0000"+
		"\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005\"\u0000\u0000\u00e1\u0015\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005*\u0000\u0000\u00e3\u00e4\u0005\u0019\u0000\u0000\u00e4"+
		"\u00e9\u0005+\u0000\u0000\u00e5\u00e8\u0005\u001c\u0000\u0000\u00e6\u00e8"+
		"\u0003\u0016\u000b\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005*\u0000\u0000\u00ed\u00ee\u0005,\u0000\u0000\u00ee\u00ef\u0005\u0019"+
		"\u0000\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0\u0017\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005\u001c\u0000\u0000\u00f2\u00f3\u0005 \u0000\u0000"+
		"\u00f3\u00f4\u0005!\u0000\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5\u00f6"+
		"\u0005\u001c\u0000\u0000\u00f6\u00f8\u0005 \u0000\u0000\u00f7\u00f9\u0003"+
		"L&\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005!\u0000\u0000"+
		"\u00fb\u00fc\u0005\"\u0000\u0000\u00fc\u00fd\u0005$\u0000\u0000\u00fd"+
		"\u0019\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0018\u0000\u0000\u00ff"+
		"\u0100\u0005 \u0000\u0000\u0100\u0101\u0005\u001c\u0000\u0000\u0101\u0102"+
		"\u0005!\u0000\u0000\u0102\u0103\u0005\"\u0000\u0000\u0103\u001b\u0001"+
		"\u0000\u0000\u0000\u0104\u010d\u0005%\u0000\u0000\u0105\u010a\u0007\u0003"+
		"\u0000\u0000\u0106\u0107\u0005\'\u0000\u0000\u0107\u0109\u0007\u0003\u0000"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005&\u0000\u0000"+
		"\u0110\u001d\u0001\u0000\u0000\u0000\u0111\u0126\u0005#\u0000\u0000\u0112"+
		"\u0113\u0005\u001c\u0000\u0000\u0113\u0117\u0005(\u0000\u0000\u0114\u0118"+
		"\u0005)\u0000\u0000\u0115\u0118\u0005\u001b\u0000\u0000\u0116\u0118\u0005"+
		"\u001c\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0123\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\'\u0000\u0000\u011a\u011b\u0005\u001c"+
		"\u0000\u0000\u011b\u011f\u0005(\u0000\u0000\u011c\u0120\u0005)\u0000\u0000"+
		"\u011d\u0120\u0005\u001b\u0000\u0000\u011e\u0120\u0005\u001c\u0000\u0000"+
		"\u011f\u011c\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000"+
		"\u0121\u0119\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0112\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005$\u0000\u0000\u0129"+
		"\u001f\u0001\u0000\u0000\u0000\u012a\u012b\u0005-\u0000\u0000\u012b\u012c"+
		"\u0005\u001c\u0000\u0000\u012c\u012e\u0005#\u0000\u0000\u012d\u012f\u0003"+
		"\"\u0011\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0005$\u0000"+
		"\u0000\u0133!\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u001c\u0000\u0000"+
		"\u0135\u013a\u0005(\u0000\u0000\u0136\u013b\u0005\u001c\u0000\u0000\u0137"+
		"\u013b\u0005C\u0000\u0000\u0138\u013b\u0005D\u0000\u0000\u0139\u013b\u0005"+
		"B\u0000\u0000\u013a\u0136\u0001\u0000\u0000\u0000\u013a\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000"+
		"\u0000\u0000\u013b#\u0001\u0000\u0000\u0000\u013c\u013d\u0005.\u0000\u0000"+
		"\u013d\u013e\u0005\u001c\u0000\u0000\u013e\u013f\u0005(\u0000\u0000\u013f"+
		"\u0142\u0005\u001c\u0000\u0000\u0140\u0141\u0005%\u0000\u0000\u0141\u0143"+
		"\u0005&\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143%\u0001\u0000\u0000\u0000\u0144\u0145\u0005/\u0000"+
		"\u0000\u0145\u0147\u0005#\u0000\u0000\u0146\u0148\u0003(\u0014\u0000\u0147"+
		"\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0005$\u0000\u0000\u014c\'"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u001c\u0000\u0000\u014e\u0150"+
		"\u0005 \u0000\u0000\u014f\u0151\u0003*\u0015\u0000\u0150\u014f\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005!\u0000\u0000\u0153)\u0001\u0000\u0000\u0000"+
		"\u0154\u0159\u0003,\u0016\u0000\u0155\u0156\u0005\'\u0000\u0000\u0156"+
		"\u0158\u0003,\u0016\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015b"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a+\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005\u001c\u0000\u0000\u015d\u0162\u0005"+
		"(\u0000\u0000\u015e\u0163\u0005\u001c\u0000\u0000\u015f\u0163\u0005C\u0000"+
		"\u0000\u0160\u0163\u0005D\u0000\u0000\u0161\u0163\u0005B\u0000\u0000\u0162"+
		"\u015e\u0001\u0000\u0000\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163"+
		"-\u0001\u0000\u0000\u0000\u0164\u0165\u00050\u0000\u0000\u0165\u0166\u0005"+
		")\u0000\u0000\u0166\u0167\u0005\u001f\u0000\u0000\u0167\u016d\u0005\u001c"+
		"\u0000\u0000\u0168\u016a\u0005 \u0000\u0000\u0169\u016b\u0003*\u0015\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0005!\u0000\u0000\u016d"+
		"\u0168\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"/\u0001\u0000\u0000\u0000\u016f\u0170\u00051\u0000\u0000\u0170\u0171\u0005"+
		"\u001c\u0000\u0000\u0171\u0175\u0005#\u0000\u0000\u0172\u0174\u00032\u0019"+
		"\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0005$\u0000\u0000\u01791\u0001\u0000\u0000\u0000\u017a"+
		"\u0184\u00034\u001a\u0000\u017b\u0184\u00036\u001b\u0000\u017c\u0184\u0003"+
		"8\u001c\u0000\u017d\u0184\u0003:\u001d\u0000\u017e\u0184\u0003>\u001f"+
		"\u0000\u017f\u0184\u0003@ \u0000\u0180\u0184\u0003B!\u0000\u0181\u0184"+
		"\u0003D\"\u0000\u0182\u0184\u0003H$\u0000\u0183\u017a\u0001\u0000\u0000"+
		"\u0000\u0183\u017b\u0001\u0000\u0000\u0000\u0183\u017c\u0001\u0000\u0000"+
		"\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0183\u017e\u0001\u0000\u0000"+
		"\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0180\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000"+
		"\u0000\u01843\u0001\u0000\u0000\u0000\u0185\u0186\u00052\u0000\u0000\u0186"+
		"\u0187\u0005\u001c\u0000\u0000\u01875\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u00053\u0000\u0000\u0189\u018a\u0005\u001c\u0000\u0000\u018a7\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u00055\u0000\u0000\u018c\u018d\u0005\u001c\u0000"+
		"\u0000\u018d\u018e\u0005;\u0000\u0000\u018e\u018f\u0005\u001c\u0000\u0000"+
		"\u018f9\u0001\u0000\u0000\u0000\u0190\u0191\u00056\u0000\u0000\u0191\u0192"+
		"\u0005\u001c\u0000\u0000\u0192\u0197\u0005(\u0000\u0000\u0193\u0198\u0005"+
		"\u001c\u0000\u0000\u0194\u0198\u0005C\u0000\u0000\u0195\u0198\u0005D\u0000"+
		"\u0000\u0196\u0198\u0005B\u0000\u0000\u0197\u0193\u0001\u0000\u0000\u0000"+
		"\u0197\u0194\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0197\u0196\u0001\u0000\u0000\u0000\u0198;\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005E\u0000\u0000\u019a\u019b\u00052\u0000\u0000\u019b=\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0005H\u0000\u0000\u019d\u019e\u00057\u0000"+
		"\u0000\u019e\u019f\u0005\u001c\u0000\u0000\u019f\u01a1\u0005 \u0000\u0000"+
		"\u01a0\u01a2\u0003<\u001e\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3"+
		"\u01ae\u0005!\u0000\u0000\u01a4\u01a5\u00059\u0000\u0000\u01a5\u01a6\u0005"+
		"8\u0000\u0000\u01a6\u01ac\u0005\u001c\u0000\u0000\u01a7\u01a9\u0005 \u0000"+
		"\u0000\u01a8\u01aa\u0003L&\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ad\u0005!\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01a4"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af?\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u00058\u0000\u0000\u01b1\u01b7\u0005\u001c"+
		"\u0000\u0000\u01b2\u01b4\u0005 \u0000\u0000\u01b3\u01b5\u0003L&\u0000"+
		"\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0005!\u0000\u0000\u01b7"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"A\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005:\u0000\u0000\u01ba\u01bb\u0005"+
		"8\u0000\u0000\u01bb\u01c1\u0005\u001c\u0000\u0000\u01bc\u01be\u0005 \u0000"+
		"\u0000\u01bd\u01bf\u0003L&\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c2\u0005!\u0000\u0000\u01c1\u01bc\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2C\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005"+
		"4\u0000\u0000\u01c4\u01cd\u0005#\u0000\u0000\u01c5\u01ca\u0003F#\u0000"+
		"\u01c6\u01c7\u0005\'\u0000\u0000\u01c7\u01c9\u0003F#\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01c5"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005$\u0000\u0000\u01d0E\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0005=\u0000\u0000\u01d2\u01d3\u0005(\u0000\u0000"+
		"\u01d3\u01e5\u0005\u001c\u0000\u0000\u01d4\u01d5\u0005>\u0000\u0000\u01d5"+
		"\u01d6\u0005(\u0000\u0000\u01d6\u01e5\u0005\u001c\u0000\u0000\u01d7\u01d8"+
		"\u0005?\u0000\u0000\u01d8\u01d9\u0005(\u0000\u0000\u01d9\u01e5\u0005\u001c"+
		"\u0000\u0000\u01da\u01db\u0005<\u0000\u0000\u01db\u01dc\u00058\u0000\u0000"+
		"\u01dc\u01e2\u0005\u001c\u0000\u0000\u01dd\u01df\u0005 \u0000\u0000\u01de"+
		"\u01e0\u0003L&\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0005"+
		"!\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01d1\u0001\u0000"+
		"\u0000\u0000\u01e4\u01d4\u0001\u0000\u0000\u0000\u01e4\u01d7\u0001\u0000"+
		"\u0000\u0000\u01e4\u01da\u0001\u0000\u0000\u0000\u01e5G\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0005/\u0000\u0000\u01e7\u01e9\u0005#\u0000\u0000\u01e8"+
		"\u01ea\u0003J%\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005"+
		"$\u0000\u0000\u01eeI\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005@\u0000"+
		"\u0000\u01f0\u01f1\u00058\u0000\u0000\u01f1\u01f7\u0005\u001c\u0000\u0000"+
		"\u01f2\u01f4\u0005 \u0000\u0000\u01f3\u01f5\u0003L&\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005!\u0000\u0000\u01f7\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u0202\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0005A\u0000\u0000\u01fa\u01fb\u00057\u0000"+
		"\u0000\u01fb\u01fc\u0005\u001c\u0000\u0000\u01fc\u01fe\u0005 \u0000\u0000"+
		"\u01fd\u01ff\u0003L&\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202"+
		"\u0005!\u0000\u0000\u0201\u01ef\u0001\u0000\u0000\u0000\u0201\u01f9\u0001"+
		"\u0000\u0000\u0000\u0202K\u0001\u0000\u0000\u0000\u0203\u0208\u0003N\'"+
		"\u0000\u0204\u0205\u0005\'\u0000\u0000\u0205\u0207\u0003N\'\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208"+
		"\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"M\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020f"+
		"\u0005\u001c\u0000\u0000\u020c\u020f\u0005)\u0000\u0000\u020d\u020f\u0005"+
		"\u001b\u0000\u0000\u020e\u020b\u0001\u0000\u0000\u0000\u020e\u020c\u0001"+
		"\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020fO\u0001\u0000"+
		"\u0000\u0000<S\\^cfnvy\u0090\u0093\u009c\u00a3\u00a5\u00b3\u00b6\u00c8"+
		"\u00d4\u00d6\u00de\u00e7\u00e9\u00f8\u010a\u010d\u0117\u011f\u0123\u0126"+
		"\u0130\u013a\u0142\u0149\u0150\u0159\u0162\u016a\u016d\u0175\u0183\u0197"+
		"\u01a1\u01a9\u01ac\u01ae\u01b4\u01b7\u01be\u01c1\u01ca\u01cd\u01df\u01e2"+
		"\u01e4\u01eb\u01f4\u01f7\u01fe\u0201\u0208\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}