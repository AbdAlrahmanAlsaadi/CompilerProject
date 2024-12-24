parser grammar TypeScriptParser;

options { tokenVocab=TypeScriptLexer; }

// Top-level program rule
program: statement*;


// Statement rules
statement:
//      commentStatment
//    |
     functionDeclaration
    | ifStatement
    | expression
    | enumLiteral
    | templateBinding
    | directiveElement
    | importStatement
    | exportStatement
    |decorator
    | classDeclaration
    ;


operator:
     PLUS
    |MULTI
    |SUB
    |LESS (ASSIGN)?
    |BIGGER (ASSIGN)?
    |ASSIGN
    |DOT
    |UNDERSCORE
 ;

// Type definitions
type:
      TYPE_INT
    | TYPE_STRING
    | TYPE_BOOLEAN
    | TYPE_ARRAY
    | TYPE_ANY
    | TYPE_LIST
    | type LSQUARE RSQUARE                  //`number[]`
    | TYPE_ARRAY LESS type BIGGER           //`Array<number>`
    | LSQUARE type (COMMA type)* RSQUARE    //`[string, number]`

    ;

accessMoidifers:
    KEYWORD_PUBLIC|KEYWORD_PRIVATE|KEYWORD_PROTECTED
;


commentStatment: COMMENT IDENTIFIER ;

directiveElement:
    TAG_OPEN directive*  BIGGER (TAG_OPEN directive*  BIGGER )* (htmlContent | templateBinding | directiveElement)* DOT? (TAG_CLOSE)* TAG_CLOSE ;

//directiveElement:
//    TAG_OPEN directive  BIGGER (htmlContent | templateBinding | directiveElement)* TAG_CLOSE;

directive:
    ((DIRECTIVE|IDENTIFIER) ASSIGN STRING) | (LSQUARE OPENB? IDENTIFIER CLOSEB? RSQUARE ASSIGN STRING) | (OPENB LSQUARE? IDENTIFIER RSQUARE? CLOSEB ASSIGN STRING);


htmlContent:
    IDENTIFIER (IDENTIFIER)*;



templateBinding:
    BINDING_START expression (expression)* BINDING_END; // Example: {{ user.name }}

tupleLiteral:
    LSQUARE expression (COMMA expression)* RSQUARE  //`["Alice", 25]`
    ;

enumLiteral:
    KEYWORD_ENUM IDENTIFIER LBRACE IDENTIFIER (COMMA IDENTIFIER (ASSIGN expression)? )* RBRACE //(ASSIGN expression)? Enum members can optionally have assigned values
;


enumAccess:
    KEYWORD_LET IDENTIFIER COLON IDENTIFIER ASSIGN IDENTIFIER DOT IDENTIFIER  // Accessing an enum member, e.g., Status.Active
    ;


variableDeclaration:
      accessMoidifers? (KEYWORD_LET | KEYWORD_CONST) IDENTIFIER COLON type (ASSIGN (expression | tupleLiteral))? SEMICOLON
    | accessMoidifers? IDENTIFIER COLON type SEMICOLON
    | accessMoidifers? IDENTIFIER COLON type ASSIGN (expression | tupleLiteral) SEMICOLON
//    | IDENTIFIER COLON STRING
    ;
arrayLiteral:
    LSQUARE (expression (COMMA expression)*)? RSQUARE
    ;

functionDeclaration:
        accessMoidifers? KEYWORD_FUNCTION IDENTIFIER OPENB (parameter (COMMA parameter)*)? CLOSEB COLON (type|KEYWORD_VOID) block
    |   accessMoidifers? KEYWORD_LET IDENTIFIER ASSIGN KEYWORD_FUNCTION  OPENB (IDENTIFIER (COMMA IDENTIFIER)*)? CLOSEB COLON (type|KEYWORD_VOID) LBRACE statement* RBRACE SEMICOLON

    ;

parameter:
    IDENTIFIER COLON type;

//functionDeclaration:
//    KEYWORD_LET IDENTIFIER ASSIGN KEYWORD_FUNCTION OPENB (IDENTIFIER (COMMA IDENTIFIER)*)? CLOSEB LBRACE statement* RBRACE
//    ;


block:
    LBRACE statement* RBRACE;


ifStatement:
    KEYWORD_IF OPENB expression CLOSEB block (KEYWORD_ELSE block)?;

//classDeclaration:
//    KEYWORD_EXPORT KEYWORD_CLASS IDENTIFIER (KEYWORD_EXTENDS IDENTIFIER)? LBRACE classBody RBRACE;
//
//classBody:
//    (variableDeclaration | functionDeclaration | constructorDeclaration)*;

constructorDeclaration:
    KEYWORD_CONSTRUCTOR OPENB (parameterList)? (COMMA parameterList)* CLOSEB LBRACE (thisAssignment)* RBRACE
;
parameterList:
    IDENTIFIER COLON type
;
thisAssignment:
    KEYWORD_THIS DOT IDENTIFIER ASSIGN IDENTIFIER SEMICOLON
;

interfaceDeclaration:
    KEYWORD_EXPORT KEYWORD_INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE;

interfaceBody:
    (IDENTIFIER COLON type SEMICOLON)*;

forloop:
    KEYWORD_FOR OPENB forBrack CLOSEB block
;

forBrack:
(KEYWORD_LET IDENTIFIER ASSIGN NUMBER SEMICOLON IDENTIFIER (LESS (ASSIGN)?|BIGGER (ASSIGN)?) NUMBER SEMICOLON statement)
;

whileloop:
    KEYWORD_WHILE OPENB expression CLOSEB block
;
//modulesImportExport:
//KEYWORD_IMPORT
//;

importStatement: KEYWORD_IMPORT importClause (KEYWORD_FROM STRING)? SEMICOLON ;
importClause: (IDENTIFIER | LBRACE importSpecifier (COMMA importSpecifier)* RBRACE) ;
importSpecifier: IDENTIFIER (KEYWORD_AS IDENTIFIER)? ;
exportStatement: KEYWORD_EXPORT (KEYWORD_DEFAULT? expression | LBRACE exportSpecifier (COMMA exportSpecifier)* RBRACE) SEMICOLON ;
exportSpecifier: IDENTIFIER (KEYWORD_AS IDENTIFIER)? ;

decorator: AT (KEYWORD_COMPONENT|KEYWORD_NGMODULE) OPENB decoratorBody CLOSEB ;
decoratorBody: LBRACE decoratorProperty (COMMA decoratorProperty)* RBRACE ;

decoratorProperty: IDENTIFIER COLON LSQUARE? (STRING|IDENTIFIER|NUMBER)(COMMA IDENTIFIER)* RSQUARE?  ;

classDeclaration: decorator* KEYWORD_EXPORT? KEYWORD_CLASS IDENTIFIER ((KEYWORD_EXTENDS|KEYWORD_IMPLEMENTS) IDENTIFIER)? LBRACE classBody RBRACE ;
classBody: (variableDeclaration | functionDeclaration | constructorDeclaration)* ;

// Expression definitions
expression:
      IDENTIFIER     #anything
    | NUMBER         #numberExpression
    | STRING        #stringExpression
    | BOOLEAN       #booleanExpression
    |variableDeclaration #variableDeclar
    |arrayLiteral #arrayDec
    | expression operator expression ((OR|AND|SHEE)* expression operator expression)* #compristion
    | expression (OR|AND|SHEE)* expression (expression (OR|AND|SHEE)* expression)* #cpop
    | enumAccess #enumAc
//    |classDeclaration #class
    |interfaceDeclaration #interface
    |(forloop|whileloop) #for
    |commentStatment #comment

    ;
