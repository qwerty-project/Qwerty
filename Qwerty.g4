grammar Qwerty;

/*
 * Parser Rules
 */

program: stmt* ;

stmt : expr
	 | variable_declaration
	 | function_declaration
	 | function_call COLON
	 ;

variable_declaration : type VARNAME EQ expr COLON;

/* i (a input, b input) : void
{
	stmt
}
*/

function_declaration : VARNAME LEFT_PARANTHESES function_parameters RIGHT_PARANTHESES COLON type function_block ;

function_parameters : type VARNAME COMMA function_parameters
					| type VARNAME
					| /* EMPTY */
					;

function_arguments : expr COMMA function_arguments
				   | expr
				   | /* EMPTY */
				   ;

function_block : LEFT_BRACKET (stmt | return_stmt)* RIGHT_BRACKET ;

function_call : function_name LEFT_PARANTHESES function_arguments RIGHT_PARANTHESES ;

function_name : system_function
              | custom_function
			  ;

system_function : PRINT ;

custom_function : VARNAME ;

return_stmt : RETURN expr COLON ;

type : system_type
	 | custom_type
	 ;

system_type : INT_TYPE
			| FLOAT_TYPE
			| DOUBLE_TYPE
			| CHAR_TYPE
			| STRING_TYPE
			| VOID_TYPE
			;

custom_type : VARNAME ;

expr : COS LEFT_PARANTHESES expr RIGHT_PARANTHESES 	# cosExpression
	 | TAN LEFT_PARANTHESES expr RIGHT_PARANTHESES 	# tanExpression
	 | SIN LEFT_PARANTHESES expr RIGHT_PARANTHESES 	# sinExpression
     | expr operator=FACTORIAL                  	# factorialExpresion
	 | expr operator=POWER expr                 	# powerExpression
	 | expr operator=(MULITPLY|DIVIDE) expr   		# multiplyDivideExpression
	 | expr operator=(ADD|SUBTRACT) expr 			# addSubtractExpression
	 | LEFT_PARANTHESES expr RIGHT_PARANTHESES		# paranthesesExpression
	 | NUMBER										# numberExpression
	 | DECIMAL                                      # decimalExpression
	 | VARNAME										# varnameExpression
	 | function_call                                # functioncallExpression
	 | STRING                                       # stringExpression
	 ;

/*
 * Lexicon Rules
 */

// System functions
PRINT: 'Print';

// System types
INT_TYPE: 'Int';
FLOAT_TYPE: 'Float';
DOUBLE_TYPE: 'Double';
CHAR_TYPE: 'Char';
STRING_TYPE: 'String';
VOID_TYPE: 'Void';

// System math
SIN: 'Sin';
COS: 'Cos';
TAN: 'Tan';

// EQ
EQ: '=' ;
EQ_EQ: '==' ;

// Operators
MULITPLY: '*' ;
DIVIDE: '/' ;
ADD: '+' ;
SUBTRACT: '-' ;
POWER: '^';
FACTORIAL: '!';

RETURN: 'Return';

// Brackets
LEFT_PARANTHESES: '(' ;
RIGHT_PARANTHESES: ')' ;
LEFT_BRACKET: '{' ;
RIGHT_BRACKET: '}' ;
COLON: ':';
COMMA: ',';

// Values
VARNAME: [a-zA-Z_]+[a-zA-Z_0-9]* ;
NUMBER: ('-')?[0-9]+ ;
DECIMAL: ('-')?[0-9]+[.][0-9]+ ;
STRING: ["][a-zA-Z0-9_ ]*["] ;

ESCAPE_CHARS: [\n\r\t\b\f]+ -> skip ;
SPACES: [ ]+ -> skip ;
