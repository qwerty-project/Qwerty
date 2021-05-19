grammar Qwerty;

program: stmt*;

stmt: VARNAME;

VARNAME: [a-zA-Z_]+[a-zA-Z_0-9]*;
ESCAPE_CHARS: [\n\r\t\b\f]+ -> skip;
SPACES: [ ]+ -> skip;