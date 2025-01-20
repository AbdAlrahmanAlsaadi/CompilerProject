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
    | functionDeclaration
    | classDeclaration
    | variableDeclaration
    | listVar
    | cssDec
    | awaitDef

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
typeItem:
        TYPES
   | IDENTIFIER
   | STRING
;
type:
    | typeItem
    | typeItem LSQUARE RSQUARE
    | TYPES LESS typeItem BIGGER           //`Array<number>`
    | LSQUARE typeItem (COMMA typeItem)* RSQUARE    //`[string, number]`
    ;
//Access Modifier
accessMoidifers:
    KEYWORDS
;

//HTML syentex:
//Start HTML syentex
directiveElement:
    TAG_OPEN directive* DIVID? BIGGER (content | directiveElement)* TAG_CLOSE?;
content:
      htmlContent
    | templateBinding
    ;
directive:
    (DIRECTIVE | IDENTIFIER|KEYWORDS) ASSIGN STRING
    | LSQUARE IDENTIFIER RSQUARE ASSIGN STRING
    | OPENB IDENTIFIER CLOSEB ASSIGN STRING
    ;
htmlContent:
    IDENTIFIER (IDENTIFIER)* DOT?;
templateBinding:
    BINDING_START expression BINDING_END;
//End HTML syentex

//Enum start
enumLiteral:
    KEYWORDS IDENTIFIER LBRACE IDENTIFIER (COMMA IDENTIFIER (ASSIGN expression)? )* RBRACE;
enumAccess:
    KEYWORDS IDENTIFIER COLON IDENTIFIER ASSIGN IDENTIFIER DOT IDENTIFIER;
//Enum end

//var decleration start
variableDeclaration:
    decorator* accessMoidifers? KEYWORDS? parameter (ASSIGN (expression | tupleLiteral))? SEMICOLON
    | expression operator expression*  SEMICOLON;
tupleLiteral:
    LSQUARE expression (COMMA expression)* RSQUARE  //`["Alice", 25]`
    ;
//var decleration end

//list var start
listVar: IDENTIFIER ASSIGN listBody ;

listBody: LSQUARE listBodyBody RSQUARE SEMICOLON;

listBodyBody: LBRACE? parameterList (COMMA parameterList)* RBRACE? (COMMA LBRACE? parameterList (COMMA parameterList)* RBRACE?)*  ;
//list end

//array syntax start
arrayLiteral:
    LSQUARE (arrayElement (COMMA arrayElement)*)? COMMA? RSQUARE SEMICOLON?;
arrayElement:
    expression
    | objectLiteral;
objectLiteral:
    LBRACE propertyAssignment (COMMA propertyAssignment)* RBRACE;
propertyAssignment:
    IDENTIFIER COLON expression;
//array syntax end

//function syntax start
functionDeclaration:
    decorator* accessMoidifers? KEYWORDS IDENTIFIER (ASSIGN KEYWORDS)? OPENB parameterFunction? CLOSEB COLON? (type | KEYWORDS)? block SEMICOLON?
    | (IDENTIFIER | KEYWORDS) OPENB (STRING COMMA)? IDENTIFIER? OPENB parameterFunction?  CLOSEB ARROW   block CLOSEB SEMICOLON
    ;
arrowFunction:
    OPENB? parameterFunction? CLOSEB? ARROW block;


awaitDef: KEYWORDS IDENTIFIER (DOT IDENTIFIER)* OPENB block CLOSEB (DOT IDENTIFIER OPENB CLOSEB)? SEMICOLON?;

parameterFunction:
    parameter (COMMA parameter)*;
parameter:
    IDENTIFIER COLON type TAG_OPEN? BIGGER?;
/////////////////////////////////////////////////////////////////////////////samaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
functionCall:
    (IDENTIFIER | KEYWORDS) (DOT IDENTIFIER)* OPENB argumentList? CLOSEB statement?;

block:
    LBRACE (arrayLiteral|statement | functionCall | thisAssignment| arrowFunction|parameterList)* RBRACE;
arrow: ARROW expression;
argumentList:
       statement (COMMA statement)*
    |  parameterList (COMMA parameterList)* COMMA?;

ifStatement:
    KEYWORDS OPENB expression CLOSEB block (KEYWORDS block)?;
/////////
//tm
classDeclaration: decorator* KEYWORDS? KEYWORDS IDENTIFIER ((KEYWORDS|KEYWORDS) IDENTIFIER)? LBRACE classBody RBRACE ;



//tm
classBody: (classCall|funclass|propertyDeclaration|constructorDeclaration|variableDeclaration)* ;
//tm
classCall: KEYWORDS IDENTIFIER OPENB CLOSEB IDENTIFIER ASSIGN KEYWORDS IDENTIFIER TAG_OPEN BIGGER OPENB CLOSEB SEMICOLON ;
//tm
funclass: IDENTIFIER OPENB argumentList? CLOSEB COLON KEYWORDS block;
//tm
propertyDeclaration:
    (KEYWORDS IDENTIFIER)* IDENTIFIER COLON type (ASSIGN expression)? SEMICOLON
    ;
//tm
constructorDeclaration:
    (KEYWORDS|IDENTIFIER) OPENB (parameterList)? (COMMA parameterList)* CLOSEB LBRACE (thisAssignment|statement)* RBRACE
;
//tm
parameterList:
    accessMoidifers? IDENTIFIER COLON (arrayLiteral|type);
thisAssignment:
    KEYWORDS DOT IDENTIFIER ASSIGN IDENTIFIER SEMICOLON|
    (IDENTIFIER|KEYWORDS) operator (IDENTIFIER|KEYWORDS) ASSIGN (IDENTIFIER|KEYWORDS) operator (IDENTIFIER|KEYWORDS) (DOT (IDENTIFIER|KEYWORDS) )* OPENB? CLOSEB? SEMICOLON
;
//ends


//@compoent start
//tm all
decorator: KEYWORDS (KEYWORDS|IDENTIFIER) OPENB decoratorBody CLOSEB ;
decoratorBody: LBRACE decoratorProperty (COMMA decoratorProperty)* COMMA? RBRACE ;
decoratorProperty: IDENTIFIER COLON LSQUARE? (STRING|IDENTIFIER|NUMBER)(COMMA IDENTIFIER)*  RSQUARE?  ;
//@compoent ends

//interface start
//tm all
interfaceDeclaration:
    KEYWORDS KEYWORDS IDENTIFIER LBRACE interfaceBody RBRACE;
interfaceBody:
    parameter SEMICOLON (parameter SEMICOLON)*;
//interface end

//forloops starts
//tm
forloop:
    KEYWORDS OPENB forBrack CLOSEB block
;

forBrack:
(KEYWORDS IDENTIFIER ASSIGN NUMBER SEMICOLON IDENTIFIER (LESS (ASSIGN)?|BIGGER (ASSIGN)?) NUMBER SEMICOLON statement)
;
//for ends

//while
//tm
whileloop:
    KEYWORDS OPENB expression CLOSEB block
;
//while ends

//import start
//tm all
importStatement: KEYWORDS importClause (KEYWORDS STRING)? SEMICOLON ;

importClause: (IDENTIFIER | LBRACE importSpecifier (COMMA importSpecifier)* RBRACE) ;

importSpecifier: IDENTIFIER|KEYWORDS (KEYWORDS (IDENTIFIER|KEYWORDS))? ;
exportStatement: KEYWORDS (KEYWORDS? expression | LBRACE exportSpecifier (COMMA exportSpecifier)* RBRACE) SEMICOLON ;
exportSpecifier: IDENTIFIER (KEYWORDS IDENTIFIER)? ;
//import ends

//css start
//tm
cssDec: selector IDENTIFIER? LBRACE cssBody (SEMICOLON cssBody)* SEMICOLON RBRACE;
//tm
cssBody: IDENTIFIER COLON (NUMBER|IDENTIFIER|HS|STRING)*;
//tm
selector: simpleSelector (COMMA simpleSelector)*;
//tm
simpleSelector
    : IDENTIFIER
    | DOT IDENTIFIER
    | HS IDENTIFIER
    | ':' IDENTIFIER
    ;
//css ends
expressionItem:
     IDENTIFIER OPENB?  CLOSEB?
    |NUMBER
    | STRING
    | BOOLEAN
    | functionCall
    | arrayLiteral
    | enumAccess
    |interfaceDeclaration
    |(forloop|whileloop)
    | arrow
;
// Expression definitions
expression:

    expressionItem
    |expressionItem operator expressionItem ((OR|AND|SHEE)* expressionItem operator expressionItem)*
    | expressionItem (OR|AND|SHEE)* expressionItem (expressionItem (OR|AND|SHEE)* expressionItem)*


    ;
