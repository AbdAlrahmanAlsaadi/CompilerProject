parser grammar parseranalysis;

options {
  tokenVocab = lexicalanalysis;
}

/* =========================================================
   نقطة الدخول
   ========================================================= */
componentFile
  : imports*
    (
      componentDeclaration
    | entityDecl
    | storeDecl
    | actionsDecl
    | routeDecl
    | pageDecl
    )*
  ;

/* ===================== imports ====================== */

// ✅ تعديل حتى يدعم import { CommonModule }
imports
  : IMPORT importedName=IDENTIFIER? COMMA?
    OPEN_BRACE (identList+=IDENTIFIER (COMMA identList+=IDENTIFIER)*
               | decoratorType+=(INPUT_BINDING | OUTPUT_BINDING) (COMMA decoratorType+=(INPUT_BINDING | OUTPUT_BINDING))*)?
    CLOSE_BRACE
    FROM fromPath=STRING SEMICOLON
  ;


/* ===================== components ====================== */

componentDeclaration
  : DECORATOR OPEN_PAREN componentMetadata CLOSE_PAREN
    CLASS_ATTR className=IDENTIFIER OPEN_BRACE classBody CLOSE_BRACE
  ;

// ✅ تحديث حتى يدعم template و styleUrls و selector
componentMetadata
  : OPEN_BRACE (metadataEntry (COMMA metadataEntry)*)? CLOSE_BRACE
  ;

metadataEntry
  : key=(IDENTIFIER | TEMPLATE | STYLE_TAG | TITLE | STYLEURLS | SELECTOR)
    COLON (val=STRING | ref=IDENTIFIER | arr=arrayLiteral)
  ;

classBody
  : (property | method | componentConstructor | clickHandler | logStatement)*
  ;

componentConstructor
  : CONSTRUCTOR OPEN_PAREN
      (param1Name=IDENTIFIER COLON param1Type=(IDENTIFIER | NUMBER_T | STRING_T | URL_T)
        (COMMA paramNName=IDENTIFIER COLON paramNType=(IDENTIFIER | NUMBER_T | STRING_T | URL_T))*)?
    CLOSE_PAREN
    OPEN_BRACE methodBody CLOSE_BRACE
  ;

// ✅ property تدعم كل الأنواع
property
  : varType=VAR name=IDENTIFIER COLON dataType=(IDENTIFIER | NUMBER_T | STRING_T | URL_T) SEMICOLON
  ;

// ✅ method params نفس الشي
method
  : methodName=IDENTIFIER OPEN_PAREN (argName=IDENTIFIER COLON argType=(IDENTIFIER | NUMBER_T | STRING_T | URL_T))? CLOSE_PAREN
    OPEN_BRACE methodBody CLOSE_BRACE
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
  : handlerName=IDENTIFIER OPEN_PAREN CLOSE_PAREN
    OPEN_BRACE
      calledFunction=IDENTIFIER OPEN_PAREN (args=argList)? CLOSE_PAREN SEMICOLON
    CLOSE_BRACE
  ;

logStatement
  : CONSOLE OPEN_PAREN logVar=IDENTIFIER CLOSE_PAREN SEMICOLON
  ;

/* ===================== literals ====================== */

// ✅ arrayLiteral يدعم string
arrayLiteral
  : OPEN_BRACKET (element=(IDENTIFIER | STRING) (COMMA element=(IDENTIFIER | STRING))*)? CLOSE_BRACKET
  ;

objectLiteral
  : OPEN_BRACE (key=IDENTIFIER COLON (stringVal=STRING | numberVal=NUMBER | refVal=IDENTIFIER)
               (COMMA key=IDENTIFIER COLON (stringVal=STRING | numberVal=NUMBER | refVal=IDENTIFIER))*)?
    CLOSE_BRACE
  ;


entityDecl
  : ENTITY entityName=IDENTIFIER OPEN_BRACE fields+=fieldDecl+ CLOSE_BRACE
  ;

fieldDecl
  : fieldName=IDENTIFIER COLON (fieldType=IDENTIFIER | NUMBER_T | STRING_T | URL_T)
  ;

storeDecl
  : STORE storeName=IDENTIFIER COLON entityRef=IDENTIFIER (OPEN_BRACKET CLOSE_BRACKET)?
  ;

actionsDecl
  : ACTIONS OPEN_BRACE actions+=actionSig+ CLOSE_BRACE
  ;

actionSig
  : actionName=IDENTIFIER OPEN_PAREN params=paramList? CLOSE_PAREN
  ;

paramList
  : ps+=param (COMMA ps+=param)*
  ;

param
  : paramName=IDENTIFIER COLON (paramType=IDENTIFIER | NUMBER_T | STRING_T | URL_T)
  ;

routeDecl
  : ROUTE path=STRING ARROW pageName=IDENTIFIER (OPEN_PAREN routeParams=paramList? CLOSE_PAREN)?
  ;

pageDecl
  : PAGE pageName=IDENTIFIER OPEN_BRACE pageBody* CLOSE_BRACE
  ;

pageBody
  : formSection
  | listSection
  | detailSection
  | paramSection
  | onSubmitStmt
  | navStmt
  | addButtonStmt
  | itemSection
  | actionButtonsSection
  ;

formSection
  : FORM entityRef=IDENTIFIER
  ;

listSection
  : LIST storeRef=IDENTIFIER
  ;

detailSection
  : DETAIL storeRef=IDENTIFIER BY byParam=IDENTIFIER
  ;

paramSection
  : PARAM pName=IDENTIFIER COLON (pType=IDENTIFIER | NUMBER_T | STRING_T | URL_T)
  ;


formArg
  : DOLLAR FORM
  ;

onSubmitStmt
  : ONSUBMIT DISPATCH actionName=IDENTIFIER OPEN_PAREN formArg? CLOSE_PAREN
    (THEN GO thenPage=IDENTIFIER (OPEN_PAREN thenArgs=argList? CLOSE_PAREN)?)?
  ;

navStmt
  : GO targetPage=IDENTIFIER (OPEN_PAREN args=argList? CLOSE_PAREN)?
  ;

addButtonStmt
  : ADD_BUTTON GO targetPage=IDENTIFIER (OPEN_PAREN args=argList? CLOSE_PAREN)?
  ;

itemSection
  : ITEM OPEN_BRACE (itemBody (COMMA itemBody)*)? CLOSE_BRACE
  ;

itemBody
  : IMG COLON imgField=IDENTIFIER
  | TITLE COLON titleField=IDENTIFIER
  | SUBTITLE COLON subtitleField=IDENTIFIER
  | ONCLICK GO clickPage=IDENTIFIER (OPEN_PAREN clickArgs=argList? CLOSE_PAREN)?
  ;

actionButtonsSection
  : ACTIONS OPEN_BRACE actionBtn+ CLOSE_BRACE
  ;

actionBtn
  : EDIT GO editPage=IDENTIFIER (OPEN_PAREN editArgs=argList? CLOSE_PAREN)?
  | DELETE DISPATCH deleteAction=IDENTIFIER OPEN_PAREN delArgs=argList? CLOSE_PAREN
  ;



argList
  : es+=expr (COMMA es+=expr)*
  ;

expr
  : ref=IDENTIFIER
  | str=STRING
  | num=NUMBER
  ;
