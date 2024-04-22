lexer grammar lalex;

PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'leia' | 'escreva' | 'fim_algoritmo';

// Definições do professor 
NUM_INT: ('+'|'-')? ('0'..'9')+;

NUM_REAL: ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+;

// Começa e termina com " e pode ser seguido de qualquer caractere exceto \n
CADEIA: '"' ~('\n'|'"')* '"';

WS: ( ' ' | '\t' | '\r' | '\n' ) -> skip;

IDENT: LETRA (LETRA | DIGITO | '_')*;

fragment
LETRA: ('a'..'z') | ('A'..'Z');

fragment
DIGITO: ('0'..'9');
