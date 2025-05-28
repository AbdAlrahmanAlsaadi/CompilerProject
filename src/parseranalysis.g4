parser grammar parseranalysis;

options {
  tokenVocab=lexicalanalysis;
}

// 🧩 يمثل ملف Angular يحتوي على component واحد أو أكثر
componentFile
  : imports* componentDeclaration
  ;

// 📦 استيراد مكتبات Angular (مثل @Input، @Output)
imports
  : IMPORT IDENTIFIER? COMMA? OPEN_BRACE (INPUT_BINDING | OUTPUT_BINDING)? CLOSE_BRACE FROM STRING SEMICOLON
  ;

// 🧱 تعريف الـ Component باستخدام @Component
componentDeclaration
  : DECORATOR OPEN_PAREN componentMetadata CLOSE_PAREN CLASS_ATTR IDENTIFIER OPEN_BRACE classBody CLOSE_BRACE
  ;

// 🧾 محتوى داخل @Component({ ... }) مثل selector, templateUrl
componentMetadata
  : OPEN_BRACE (IDENTIFIER COLON (STRING | IDENTIFIER | arrayLiteral) COMMA?)+ CLOSE_BRACE
  ;

// 🏗️ محتوى الكلاس: خصائص + دوال + معالجات + الكونستركتر
classBody
  : (property | method | componentConstructor | clickHandler | logStatement)*
  ;

// 🔧 تعريف constructor
componentConstructor
  : CONSTRUCTOR OPEN_PAREN
      (IDENTIFIER COLON IDENTIFIER (COMMA IDENTIFIER COLON IDENTIFIER)*)?
    CLOSE_PAREN
    OPEN_BRACE methodBody CLOSE_BRACE
  ;

// 🔡 تعريف متغير داخل الكومبوننت (مثلاً title: string;)
property
  : VAR IDENTIFIER COLON IDENTIFIER SEMICOLON
  ;

// 🧠 تعريف دالة داخل الكومبوننت
method
  : IDENTIFIER OPEN_PAREN (IDENTIFIER COLON IDENTIFIER)? CLOSE_PAREN OPEN_BRACE methodBody CLOSE_BRACE
  ;

// 🔁 جسم الدالة ويحتوي تعليمات متعددة
methodBody
  : (logStatement | htmlTemplate | arrayLiteral | objectLiteral | assignment)*
  ;

// 📝 إسناد قيمة لمتغير (مثل name = "Angular";)
assignment
  : IDENTIFIER EQUALS (STRING | NUMBER | IDENTIFIER) SEMICOLON
  ;

// 🖼️ تمثيل HTML داخل template (مناسب لأنجلر)
htmlTemplate
  : TEMPLATE_OPEN HTML_TAG TEMPLATE_CLOSE (IDENTIFIER | htmlTemplate)* TEMPLATE_OPEN TEMPLATE_SLASH HTML_TAG TEMPLATE_CLOSE
  ;

// ⚡ دالة لمعالجة حدث (مثل click)
clickHandler
  : IDENTIFIER OPEN_PAREN CLOSE_PAREN OPEN_BRACE IDENTIFIER OPEN_PAREN IDENTIFIER? CLOSE_PAREN SEMICOLON CLOSE_BRACE
  ;

// 🧾 console.log داخل الدالة
logStatement
  : CONSOLE OPEN_PAREN IDENTIFIER CLOSE_PAREN SEMICOLON
  ;

// 📚 تمثيل Array
arrayLiteral
  : OPEN_BRACKET (IDENTIFIER COMMA?)* CLOSE_BRACKET
  ;

// 🧱 تمثيل كائن object
objectLiteral
  : OPEN_BRACE (IDENTIFIER COLON (STRING | NUMBER | IDENTIFIER) COMMA?)* CLOSE_BRACE
  ;
