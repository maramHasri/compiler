parser grammar MyGrammarParser;

options { tokenVocab=MyGrammar; }

ngFile: importStatement* componentDefinition classDefinition;

importStatement: IMPORT importItems FROM (STRING | DOUBLE_QUOTE_STRING) SEMI;

importItems
    : LBRACE importAliasList? RBRACE
    | IDENT
    ;

importAliasList
    : importAlias (COMMA importAlias)*
    ;

importAlias
    : IDENT (AS IDENT)?
    ;

componentDefinition
    : COMPONENT LPAREN componentObject RPAREN
    ;

componentObject
    : LBRACE componentProperty (COMMA componentProperty)* RBRACE
    ;

componentProperty
    : SELECTOR COLON STRING
    | TEMPLATE COLON BACKTICK_STRING
    | STYLES COLON LBRACK styleList? RBRACK
    ;

styleList
    : BACKTICK_STRING (COMMA BACKTICK_STRING)*
    ;

classDefinition
    : EXPORT CLASS IDENT LBRACE classBody? RBRACE
    ;

classBody: .*? ; // سنُحسنها لاحقًا إذا أردنا تحليل الخصائص الداخلية
