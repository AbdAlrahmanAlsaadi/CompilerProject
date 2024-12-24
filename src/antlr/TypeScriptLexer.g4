lexer grammar TypeScriptLexer;
//TYPES
// Keywords for variable types
TYPE_INT: 'number';      // TypeScript uses 'number' for integers and floats
TYPE_STRING: 'string';
TYPE_BOOLEAN: 'boolean';
TYPE_ARRAY: 'Array';

TYPE_ANY: 'any';
TYPE_LIST: 'list';



//KEYWORDS
KEYWORD_FUNCTION: 'function';
KEYWORD_VOID:'void';
KEYWORD_LET: 'let';
KEYWORD_CONST: 'const';
KEYWORD_IF: 'if';
KEYWORD_ELSE: 'else';
KEYWORD_RETURN: 'return';
KEYWORD_IMPORT:'import';
//KEYWORD_IMPORTS:'imports';
KEYWORD_EXPORT:'export';
KEYWORD_FROM:'from';
KEYWORD_AS: 'as';
KEYWORD_ENUM:'enum';
KEYWORD_CLASS:'class';
KEYWORD_EXTENDS:'extends';
KEYWORD_INTERFACE:'interface';
KEYWORD_CONSTRUCTOR:'constructor';
KEYWORD_THIS:'this';
KEYWORD_FOR:'for';
KEYWORD_WHILE:'while';
KEYWORD_PRIVATE:'private';
KEYWORD_PUBLIC:'public';
KEYWORD_PROTECTED:'protected';
AT: '@';
KEYWORD_COMPONENT: 'Component';
KEYWORD_NGMODULE:'NgModule';
KEYWORD_IMPLEMENTS:'implements';



//Identifiers
//CUSTOM_TAG: [a-zA-Z][a-zA-Z0-9-]*;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* | [a-zA-Z][a-zA-Z0-9-]*;
//IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_] '-' * '_'* ([a-zA-Z_][a-zA-Z0-9_] '-' * '_'*)*;
NUMBER:[0-9]+ ('.' [0-9]+)?;
STRING: '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';
BOOLEAN: 'true' | 'false';


// تعريف الرموز الخاصة بـ Angular
BINDING_START: '{{';   // بداية التعبير المربوط
BINDING_END: '}}';     // نهاية التعبير المربوط
DIRECTIVE:  '*' (NGFOR|NGIF|IDENTIFIER); // مثل  *ngIf, ... , *ngFor
OF: 'of';
NGFOR:'ngFor';
NGIF:'ngIf';



// علامات HTML المستخدمة في Angular
TAG_OPEN: '<' IDENTIFIER;
TAG_CLOSE: '</'IDENTIFIER'>';
//TAG_SLASH: '/';
//TAG_NAME: [a-zA-Z][a-zA-Z0-9-]*;
//ATTRIBUTE: IDENTIFIER ASSIGN STRING; // Attribute like class="button"




PLUS:'+';
SUB:'-';
UNDERSCORE:'_';
MULTI:'*';
DIVID:'/';
ASSIGN:'=';
LESS:'<';
BIGGER:'>';
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
DOT: '.';
OPENB:'(';
CLOSEB:')';
LBRACE: '{';
RBRACE: '}';
LSQUARE: '[';
RSQUARE: ']';
OR:'||';
AND:'&&';
SHEE:'|';

Double_Comment
    : '/*'  ~[\r\n]*  '*/'-> skip
    ;
Single_Comment
    : '//' ~[\r\n]* -> skip
    ;

// تجاهل المسافات البيضاء
WS: [ \t\r\n]+ -> skip;
