grammar LabeledExpr;

import CommonLexerRules;

parse: block EOF;

block: stat*;

stat:
	const_type 
	|var
	| lista
	| assignment
	| if_stat
	| while_stat
	| for_stat
	| println;

var: type ID ( COMMA ID)* SCOL;

const_type: CONST type ID ASSIGN expr SCOL #ConstType;

type:
	STRING		# TypeStr
	| INT		# TypeInt
	| FLOAT		# TypeFloat
	| BOOLEAN	# TypeBool;

// lista: type expr ( COMMA expr)*;
lista: ARRAY type ID OBRACKET IntegerLiteral CBRACKET SCOL # ListaType;

id_lista: ID OBRACKET IntegerLiteral CBRACKET;

expr_list: expr (COMMA expr)*;

assignment: ID ASSIGN expr SCOL
	| id_lista ASSIGN expr SCOL;

if_stat:
	IF condition_block (ELSE IF condition_block)* (
		ELSE stat_block
	)?;

condition_block: expr stat_block;

stat_block: OBRACE block CBRACE | stat;

while_stat: WHILE OPAR expr CPAR stat_block;

for_stat: FOR OPAR assignment expr CPAR stat_block;

boolean_literal: TRUE | FALSE;

println: PRINTLN expr SCOL;

expr:
	MINUS expr									# unaryMinusExpr
	| NOT expr									# notExpr
	| expr op = (MULT | DIV | MOD) expr			# multiplicationExpr
	| expr op = (PLUS | MINUS) expr				# additiveExpr
	| expr op = (LTEQ | GTEQ | LT | GT) expr	# relationalExpr
	| expr op = (EQ | NEQ) expr					# equalityExpr
	| expr AND expr								# andExpr
	| expr OR expr								# orExpr
	| atom										# atomExpr;

atom:
	OPAR expr CPAR						# parExpr
	| (IntegerLiteral | FloatLiteral)	# numberAtom
	| boolean_literal					# booleanAtom
	| id_lista                          # IDlistaAtom
	| ID								# idAtom
	| StringLiteral						# stringAtom
	| NULL								# nullAtom
	;