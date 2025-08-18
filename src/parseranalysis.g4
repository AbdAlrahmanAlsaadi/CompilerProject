parser grammar parseranalysis;

options {
  tokenVocab = lexicalanalysis;
}


componentFile
  : imports* componentDeclaration
  ;


imports
  : IMPORT importedName=IDENTIFIER? COMMA? OPEN_BRACE decoratorType=(INPUT_BINDING | OUTPUT_BINDING)? CLOSE_BRACE FROM fromPath=STRING SEMICOLON
  ;


componentDeclaration
  : DECORATOR OPEN_PAREN componentMetadata CLOSE_PAREN CLASS_ATTR className=IDENTIFIER OPEN_BRACE classBody CLOSE_BRACE
  ;


componentMetadata
  : OPEN_BRACE (metaKey=IDENTIFIER COLON (metaValue=STRING | ref=IDENTIFIER | arr=arrayLiteral) COMMA?)+ CLOSE_BRACE
  ;


classBody
  : (property | method | componentConstructor | clickHandler | logStatement)*
  ;


componentConstructor
  : CONSTRUCTOR OPEN_PAREN
      (param1Name=IDENTIFIER COLON param1Type=IDENTIFIER (COMMA paramNName=IDENTIFIER COLON paramNType=IDENTIFIER)*)?
    CLOSE_PAREN
    OPEN_BRACE methodBody CLOSE_BRACE
  ;

property
  : varType=VAR name=IDENTIFIER COLON dataType=IDENTIFIER SEMICOLON
  ;



method
  : methodName=IDENTIFIER OPEN_PAREN (argName=IDENTIFIER COLON argType=IDENTIFIER)? CLOSE_PAREN OPEN_BRACE methodBody CLOSE_BRACE
  ;


methodBody
  : (logStatement | htmlTemplate | arrayLiteral | objectLiteral | assignment)*
  ;


assignment
  : assignedVar=IDENTIFIER EQUALS (stringVal=STRING | numberVal=NUMBER | refVal=IDENTIFIER) SEMICOLON
  ;


htmlTemplate
  : TEMPLATE_OPEN tag=HTML_TAG TEMPLATE_CLOSE (innerContent=IDENTIFIER | htmlTemplate)* TEMPLATE_OPEN TEMPLATE_SLASH HTML_TAG TEMPLATE_CLOSE
  ;


clickHandler
  : handlerName=IDENTIFIER OPEN_PAREN CLOSE_PAREN OPEN_BRACE calledFunction=IDENTIFIER OPEN_PAREN param=IDENTIFIER? CLOSE_PAREN SEMICOLON CLOSE_BRACE
  ;


logStatement
  : CONSOLE OPEN_PAREN logVar=IDENTIFIER CLOSE_PAREN SEMICOLON
  ;


arrayLiteral
  : OPEN_BRACKET (element=IDENTIFIER COMMA?)* CLOSE_BRACKET
  ;


objectLiteral
  : OPEN_BRACE (key=IDENTIFIER COLON (stringVal=STRING | numberVal=NUMBER | refVal=IDENTIFIER) COMMA?)* CLOSE_BRACE
  ;