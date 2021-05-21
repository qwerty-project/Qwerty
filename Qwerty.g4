grammar Qwerty;

/*
 * Parser Rules
 */

program: stmt* ;

stmt : expr
	 | VARNAME
	 ;

expr :
	   COS expr RIGHT_PARANTHESES 					# cosExpression
	 | TAN expr RIGHT_PARANTHESES 					# tanExpression
	 | SIN expr RIGHT_PARANTHESES 					# sinExpression
     | expr operator=FACTORIAL                  	# factorialExpresion
	 | expr operator=POWER expr                 	# powerExpression
	 | expr operator=(MULITPLY|DIVIDE) expr   		# multiplyDivideExpression
	 | expr operator=(ADD|SUBTRACT) expr 			# addSubtractExpression
	 | LEFT_PARANTHESES expr RIGHT_PARANTHESES		# paranthesesExpression
	 | NUMBER										# numberExpression
	 | VARNAME										# varnameExpression
	 ;

/*
 * Lexicon Rules
 */

VARNAME: [a-zA-Z_]+[a-zA-Z_0-9]* ;
NUMBER: ('-')?[0-9]+ ;

MULITPLY: '*' ;
DIVIDE: '/' ;
ADD: '+' ;
SUBTRACT: '-' ;
POWER: '^';
FACTORIAL: '!';
SIN: 'Sin(';
COS: 'Cos(';
TAN: 'Tan(';

LEFT_PARANTHESES: '(' ;
RIGHT_PARANTHESES: ')' ;

ESCAPE_CHARS: [\n\r\t\b\f]+ -> skip ;
SPACES: [ ]+ -> skip ;
