grammar LabeledExpr;

import CommonLexerRules;

parse: block EOF;

block: stat*;

stat:
	var
	| assignment
	| if_stat
	| while_stat
	| for_stat
	| println;

//int x, int y; n = 9
var: type ID ( COMMA type ID)* SCOL;
// var: type expr SCOL | type expr SCOL ( COMMA type expr SCOL)*; var_List: var ( COMMA var)*;

type:
	STRING		# TypeStr
	| INT		# TypeInt
	| FLOAT		# TypeFloat
	| BOOLEAN	# TypeBool;

// lista: type expr ( COMMA expr)*;

// concat: StringLiteral (PLUS expr)* SCOL;

// id_list: ID ( COMMA ID)*;

expr_list: expr (COMMA expr)*;

assignment: ID ASSIGN expr SCOL;

if_stat:
	IF condition_block (ELSE IF condition_block)* (
		ELSE stat_block
	)?;

condition_block: expr stat_block;

stat_block: OBRACE block CBRACE | stat;

// while_stat: WHILE condition_block; PORQUE N FUNCIONA
while_stat: WHILE OPAR expr CPAR stat_block;

for_stat:
	FOR OPAR ID ASSIGN expr SCOL ID LT expr CPAR stat_block;

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
	| ID								# idAtom
	| StringLiteral						# stringAtom
	| NULL								# nullAtom;