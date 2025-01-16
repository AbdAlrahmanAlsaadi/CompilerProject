lexer grammar TypeScriptLexer;
//TYPES
TYPES:
      'number'
    | 'string'
    | 'boolean'
    | 'Array'
    | 'any'
    | 'list'
    ;

//KEYWORDS
KEYWORDS:
      'function'
    | 'void'
    | 'let'
    | 'const'
    | 'if'
    | 'else'
    | 'return'
    | 'import'
    | 'export'
    | 'from'
    | 'as'
    | 'enum'
    | 'class'
    | 'extends'
    | 'interface'
    | 'constructor'
    | 'this'
    | 'for'
    | 'while'
    | 'private'
    | 'public'
    | 'protected'
    | 'Component'
    | 'NgModule'
    | 'implements'
    | '@'
    | 'new'
    | 'await'
    ;


IDENTIFIER: ([a-zA-Z_][a-zA-Z0-9_]* | [a-zA-Z][a-zA-Z0-9-]*)  ;
NUMBER:[0-9]+ ('.' [0-9]+)? ('%' | 'px' | 'em' | 'rem' | 'vh' | 'vw')?;
//ARABIC:(~["\r\n])* ;
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
PERCIENT: '%';
HS:'#';
ARROW: '=>';


Double_Comment
    : '/*'  ~[\r\n]*  '*/'-> skip
    ;
Single_Comment
    : '//' ~[\r\n]* -> skip
    ;

// تجاهل المسافات البيضاء
WS: [ \t\r\n]+ -> skip;
