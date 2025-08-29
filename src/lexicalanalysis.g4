lexer grammar lexicalanalysis;

CONST : 'const';
FUNCTION :'function';
RETURN : 'return';
DIV:'div';
VAR: 'let' | 'var';
EXPORT:'export';
EXPORT_DEFAULT:'export default';
STYLE_TAG:'style';
IMAGE_SRC:'src';
IMPORT :'import';
FROM:'from';
TEMPLATE:'template';
CONSTRUCTOR: 'constructor';

INPUT_BINDING:'@Input';
OUTPUT_BINDING:'@Output';
DECORATOR:'@Component';
ANGULAR_MODULE:'@NgModule';
CLICK_EVENT : '(click)';
CLASS_ATTR:'class';
ID_ATTR:'id';
TABINDEX_ATTR:'tabindex';
KEY_ATTR:'key';
REF_ATTR:'#';
CONSOLE :'console.log';

// شلنا 'title' من هنا لأنه بتتعارض مع TITLE
HTML_TAG:'h'[1-5] | 'p' |'li' |'ul'|'html' | 'ol'|'!DOCTYPE';
STYLE_ATTR:'color' |'fontSize'|'width'|'display'|'flexDirection'|'justifyContent'|'flexFlow'|'alignContent'|'overflowY';

NUMBER:[0-9]+;
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;

QUOTE:'"';
EQUALS : '=';
ARROW : '=>';
OPEN_PAREN : '(';
CLOSE_PAREN : ')';
SEMICOLON:';';
OPEN_BRACE : '{';
CLOSE_BRACE : '}';
OPEN_BRACKET:'[';
CLOSE_BRACKET:']';
COMMA:',';
COLON:':';
STRING : '"' (' '..'~')* '"';

TEMPLATE_OPEN : '<';
TEMPLATE_CLOSE : '>';
TEMPLATE_SLASH : '/';

// === NEW KEYWORDS for the project ===
ENTITY      : 'entity';
STORE       : 'store';
ACTIONS     : 'actions';
ROUTE       : 'route';
PAGE        : 'page';
FORM        : 'form';
LIST        : 'list';
ITEM        : 'item';
DETAIL      : 'detail';
PARAM       : 'param';
DISPATCH    : 'dispatch';
GO          : 'go';
THEN        : 'then';
ADD_BUTTON  : 'addButton';
BY          : 'by';
ONCLICK     : 'onClick';

// === Extra keywords for page parts / actions ===
IMG       : 'img';
TITLE     : 'title';
SUBTITLE  : 'subtitle';
EDIT      : 'edit';
DELETE    : 'delete';

// === Simple types used in fields/params ===
URL_T       : 'url';
NUMBER_T    : 'number';
STRING_T    : 'string';
DOLLAR      : '$';

STYLEURLS   : 'styleUrls';
SELECTOR    : 'selector';

ONSUBMIT : 'onSubmit';

WS : [ \t\r\n]+ -> skip;
