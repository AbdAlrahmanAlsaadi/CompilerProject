lexer grammar lexicalanalysis;

CONST : 'const';
FUNCTION :'function';
RETURN : 'return';
DIV:'div';
VAR: 'let' | 'var';
EXPORT:'export';
EXPORT_DEFAULT:'export default';
STYLE_TAG:'style';
IMAGE_TAG:'img';
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
REF_ATTR:'#'; // ViewChild or template ref
CONSOLE :'console.log';
HTML_TAG:'h'[1-5] | 'p' |'li' |'ul'|'html' | 'ol'|'!DOCTYPE'|'title';
STYLE_ATTR:'color' |'fontSize'|'width'|'display'|'flexDirection'|'justifyContent'|'flexFlow'|'alignContent'|'overflowY';

NUMBER:[0-9]+;


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

// Angular template-specific
TEMPLATE_OPEN : '<';
TEMPLATE_CLOSE : '>';
TEMPLATE_SLASH : '/';

// Ignored tokens
WS : [ \t\r\n]+ -> skip;
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;