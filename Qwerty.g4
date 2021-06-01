grammar Qwerty;

/*
 * Parser Rules
 */

program: stmt* ;

stmt : expr
	 | variable_declaration
	 | function_declaration
	 | function_call COLON
	 | conditional
	 ;

/*
If : expr :
{

}
Elif
{
}
Else
{

}
*/

conditional : if_statement (elif_statement)* (else_statement)?
            | for_statement
			| while_statement
		    ;

if_statement : IF COLON value_expression COLON conditional_block ;

elif_statement : ELIF COLON value_expression COLON conditional_block ;

else_statement : ELSE conditional_block ;

conditional_block : LEFT_BRACKET (stmt | return_stmt)* RIGHT_BRACKET ;

while_statement : WHILE COLON value_expression COLON conditional_block ;

/*
For : i < 10 :
{

}
*/

for_statement : FOR COLON value_expression COLON conditional_block ;

variable_declaration : type VARNAME EQ value_expression COLON;

/* i (a input, b input) : Void
{
	stmt
}
*/

function_declaration : VARNAME LEFT_PARANTHESES function_parameters RIGHT_PARANTHESES COLON type function_block ;

//function_parameters : type VARNAME COMMA function_parameters
//					| type VARNAME
//					| /* EMPTY */
//					;

function_parameters : (function_parameter (COMMA function_parameter)* )? ;

function_parameter : type VARNAME ;

//function_arguments : expr COMMA function_arguments
//				   | expr
//				   | /* EMPTY */
//				   ;


function_arguments : (function_argument (COMMA function_argument)* )? ;

function_argument : value_expression ;

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
			| BOOL_TYPE
			;

custom_type : VARNAME ;

value_expression: expr;

expr : COS LEFT_PARANTHESES expr RIGHT_PARANTHESES 	# cosExpression
	 | TAN LEFT_PARANTHESES expr RIGHT_PARANTHESES 	# tanExpression
	 | SIN LEFT_PARANTHESES expr RIGHT_PARANTHESES 	# sinExpression
     | expr operator=FACTORIAL                  	# factorialExpresion
	 | expr operator=POWER expr                 	# powerExpression
	 | expr operator=(MULITPLY|DIVIDE) expr   		# multiplyDivideExpression
	 | expr operator=(ADD|SUBTRACT) expr 			# addSubtractExpression
	 | LEFT_PARANTHESES expr RIGHT_PARANTHESES		# paranthesesExpression
	 | expr operator=EQ_EQ expr						# equalEqualExpression
	 | expr operator=AND expr						# andExpression
	 | expr operator=OR expr						# orExpression
	 | expr operator=LESS_THAN expr					# lessthanExpression
	 | expr operator=GREATER_THAN expr				# greaterthanExpression
	 | expr operator=LESS_THAN_OR_EQ expr			# lessthanorequalExpression
	 | expr operator=GREATER_THAN_OR_EQ expr		# greaterthanorequalExpression
	 | NUMBER										# numberExpression
	 | DECIMAL                                      # decimalExpression
	 | TRUE                                         # trueExpression
	 | FALSE                                        # falseExpression
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
BOOL_TYPE: 'Bool';

// System math
SIN: 'Sin';
COS: 'Cos';
TAN: 'Tan';

// Conditionals
IF: 'If';
ELIF: 'Elif';
ELSE: 'Else';
FOR: 'For';
WHILE: 'While';

// EQ
EQ: '=' ;
EQ_EQ: '==' ;
AND: 'And';
OR: 'Or';
LESS_THAN: '<';
GREATER_THAN: '>';
LESS_THAN_OR_EQ: '<=';
GREATER_THAN_OR_EQ: '>=';

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
TRUE: 'True';
FALSE: 'False';

ESCAPE_CHARS: [\n\r\t\b\f]+ -> skip ;
SPACES: [ ]+ -> skip ;
