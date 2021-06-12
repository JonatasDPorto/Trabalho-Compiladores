lexer grammar CommonLexerRules;

CONST: 'const';

ARRAY: 'array';

STRING: 'string';
INT: 'int';
FLOAT: 'float';
BOOLEAN: 'boolean';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

PRINTLN: 'println';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';

ASSIGN: '=';
NOT: '!';

OPAR: '(';
CPAR: ')';
OBRACE: '{';
CBRACE: '}';
OBRACKET: '[';
CBRACKET: ']';

MULT: '*';
DIV: '/';
PLUS: '+';
MINUS: '-';

EQ: '==';
NEQ: '!=';
LTEQ: '<=';
GTEQ: '>=';
LT: '<';
GT: '>';

AND: '&&';
OR: '||';

SCOL: ';';
COMMA: ',';

MOD: '%';

ID: [a-zA-Z_] [a-zA-Z_0-9]*;
IntegerLiteral: [0-9]+;
FloatLiteral: [0-9]+ '.' [0-9]* | '.' [0-9]+;
StringLiteral: '"' (~["\r\n] | '""')* '"';

Comment
 : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip
 ;
Space: [ \t\r\n] -> skip;