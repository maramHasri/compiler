lexer grammar MyGrammar;

// الرموز العامة
IMPORT: 'import';
FROM: 'from';
AS: 'as';
CLASS: 'class';
EXPORT: 'export';
COMPONENT: '@Component';
SELECTOR: 'selector';
TEMPLATE: 'template';
STYLES: 'styles';

// رموز JavaScript/TS
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
COLON: ':';
COMMA: ',';
DOT: '.';
EQUALS: '=';
SEMI: ';';

// سلاسل نصية وقيم
BACKTICK_STRING: '`' .*? '`';
STRING: '\'' .*? '\'';
DOUBLE_QUOTE_STRING: '"' .*? '"';
NUMBER: [0-9]+;

// معرفات (متغيرات، أسماء كائنات، ...)
IDENT: [a-zA-Z_$][a-zA-Z0-9_$]*;

// تعليقات ومسافات
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;
