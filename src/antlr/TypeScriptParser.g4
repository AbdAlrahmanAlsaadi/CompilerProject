parser grammar TypeScriptParser;

options { tokenVocab=TypeScriptLexer; }

// Top-level program rule
program: statement*;


// Statement rules
statement:
     decorator
    | ifStatement
    | expression
    | enumLiteral
    | templateBinding
    | directiveElement
    | importStatement
    | exportStatement
    |functionDeclaration
    | classDeclaration
    | variableDeclaration

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
      TYPES
    | type LSQUARE RSQUARE                  //`number[]`
    | TYPES LESS type BIGGER           //`Array<number>`
    | LSQUARE type (COMMA type)* RSQUARE    //`[string, number]`

    ;

accessMoidifers:
    KEYWORDS
;




directiveElement:
    TAG_OPEN directive*  BIGGER|
    TAG_OPEN directive*  BIGGER (TAG_OPEN directive*  BIGGER )* (htmlContent | templateBinding | directiveElement)* DOT? (TAG_CLOSE)* TAG_CLOSE ;

//directiveElement:
//    TAG_OPEN directive  BIGGER (htmlContent | templateBinding | directiveElement)* TAG_CLOSE;

directive:
    ((DIRECTIVE|IDENTIFIER) ASSIGN STRING) | (LSQUARE OPENB? IDENTIFIER CLOSEB? RSQUARE ASSIGN STRING) | (OPENB LSQUARE? IDENTIFIER RSQUARE? CLOSEB ASSIGN STRING);


htmlContent:
    (IDENTIFIER) (IDENTIFIER)* COLON?;



templateBinding:
    BINDING_START expression (expression)* BINDING_END; // Example: {{ user.name }}

tupleLiteral:
    LSQUARE expression (COMMA expression)* RSQUARE  //`["Alice", 25]`
    ;

enumLiteral:
    KEYWORDS IDENTIFIER LBRACE IDENTIFIER (COMMA IDENTIFIER (ASSIGN expression)? )* RBRACE //(ASSIGN expression)? Enum members can optionally have assigned values
;


enumAccess:
    KEYWORDS IDENTIFIER COLON IDENTIFIER ASSIGN IDENTIFIER DOT IDENTIFIER  // Accessing an enum member, e.g., Status.Active
    ;


variableDeclaration:
      accessMoidifers? (KEYWORDS) IDENTIFIER COLON type (ASSIGN (expression | tupleLiteral))? SEMICOLON
    | accessMoidifers? IDENTIFIER COLON type SEMICOLON
    | accessMoidifers? IDENTIFIER COLON type ASSIGN (expression | tupleLiteral) SEMICOLON
    | KEYWORDS IDENTIFIER COLON ASSIGN expression SEMICOLON
    |  expression operator expression* SEMICOLON

//    | IDENTIFIER COLON STRING
    ;
arrayLiteral:
    LSQUARE (expression (COMMA expression)*)? RSQUARE SEMICOLON?
    |
     LSQUARE objectLiteral (COMMA  objectLiteral)* COMMA? RSQUARE SEMICOLON?
    ;

objectLiteral:
    LBRACE propertyAssignment (COMMA propertyAssignment)* RBRACE
    ;


propertyAssignment:
    IDENTIFIER COLON expression
    ;


functionDeclaration:
        accessMoidifers? KEYWORDS IDENTIFIER OPENB (parameter (COMMA parameter)*)? CLOSEB COLON? (type|KEYWORDS)? block
    |   accessMoidifers? KEYWORDS IDENTIFIER ASSIGN KEYWORDS  OPENB (IDENTIFIER (COMMA IDENTIFIER)*)? CLOSEB COLON (type|KEYWORDS) LBRACE statement* RBRACE SEMICOLON

    ;
returnStatment:
    KEYWORDS expression SEMICOLON

;
parameter:
    IDENTIFIER COLON type;

//functionDeclaration:
//    KEYWORD_LET IDENTIFIER ASSIGN KEYWORD_FUNCTION OPENB (IDENTIFIER (COMMA IDENTIFIER)*)? CLOSEB LBRACE statement* RBRACE
//    ;


block:
    LBRACE statement* RBRACE;


ifStatement:
    KEYWORDS OPENB expression CLOSEB block (KEYWORDS block)?;

//classDeclaration:
//    KEYWORD_EXPORT KEYWORD_CLASS IDENTIFIER (KEYWORD_EXTENDS IDENTIFIER)? LBRACE classBody RBRACE;
//
//classBody:
//    (variableDeclaration | functionDeclaration | constructorDeclaration)*;

constructorDeclaration:
    (KEYWORDS|IDENTIFIER) OPENB (parameterList)? (COMMA parameterList)* CLOSEB LBRACE (thisAssignment|statement)* RBRACE
;
parameterList:
    accessMoidifers? IDENTIFIER COLON (type|IDENTIFIER)
;
thisAssignment:
    KEYWORDS DOT IDENTIFIER ASSIGN IDENTIFIER SEMICOLON|
    (IDENTIFIER|KEYWORDS) operator (IDENTIFIER|KEYWORDS) ASSIGN (IDENTIFIER|KEYWORDS) operator (IDENTIFIER|KEYWORDS) (DOT (IDENTIFIER|KEYWORDS) )* OPENB? CLOSEB? SEMICOLON
;

interfaceDeclaration:
    KEYWORDS KEYWORDS IDENTIFIER LBRACE interfaceBody RBRACE;

interfaceBody:
    (IDENTIFIER COLON type SEMICOLON)*;

forloop:
    KEYWORDS OPENB forBrack CLOSEB block
;

forBrack:
(KEYWORDS IDENTIFIER ASSIGN NUMBER SEMICOLON IDENTIFIER (LESS (ASSIGN)?|BIGGER (ASSIGN)?) NUMBER SEMICOLON statement)
;

whileloop:
    KEYWORDS OPENB expression CLOSEB block
;
//modulesImportExport:
//KEYWORD_IMPORT
//;

importStatement: KEYWORDS importClause (KEYWORDS STRING)? SEMICOLON ;
importClause: (IDENTIFIER | LBRACE importSpecifier (COMMA importSpecifier)* RBRACE) ;
importSpecifier: IDENTIFIER|KEYWORDS (KEYWORDS (IDENTIFIER|KEYWORDS))? ;
exportStatement: KEYWORDS (KEYWORDS? expression | LBRACE exportSpecifier (COMMA exportSpecifier)* RBRACE) SEMICOLON ;
exportSpecifier: IDENTIFIER (KEYWORDS IDENTIFIER)? ;

decorator: KEYWORDS (KEYWORDS|IDENTIFIER) OPENB decoratorBody CLOSEB ;
decoratorBody: LBRACE decoratorProperty (COMMA decoratorProperty)* RBRACE ;

decoratorProperty: IDENTIFIER COLON LSQUARE? (STRING|IDENTIFIER|NUMBER)(COMMA IDENTIFIER)* RSQUARE?  ;

classDeclaration: decorator* KEYWORDS? KEYWORDS IDENTIFIER ((KEYWORDS|KEYWORDS) IDENTIFIER)? LBRACE classBody RBRACE ;
classBody: (variableDeclaration | functionDeclaration | constructorDeclaration|expression)* ;

// Expression definitions
expression:
      IDENTIFIER     #anything
    |NUMBER         #numberExpression
    | STRING        #stringExpression
    | BOOLEAN       #booleanExpression
//    |variableDeclaration #variableDeclar
    | arrayLiteral #arrayDec
    | expression operator expression ((OR|AND|SHEE)* expression operator expression)*  #compristion
    | expression (OR|AND|SHEE)* expression (expression (OR|AND|SHEE)* expression)* #cpop
    | enumAccess #enumAc
//    |classDeclaration #class
    |interfaceDeclaration #interface
    |(forloop|whileloop) #for


    ;
