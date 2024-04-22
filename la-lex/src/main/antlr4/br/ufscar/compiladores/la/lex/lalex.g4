lexer grammar lalex;

// PCs Identificadas ao longo dos testes
PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'leia' | 'escreva' | 'fim_algoritmo' |
 ':' | '(' | ')' | ',' | '/' | 'real' | 'tipo' | 'ou' | 'e' | 'se' | 'entao' | 'senao' | 'fim_se' | 'nao'
| 'funcao' | 'retorne' | 'fim_funcao' | 'enquanto' | 'fim_enquanto' | 'falso' | 'verdadeiro'
| 'para' | 'ate' | 'faca' | 'fim_para' | 'procedimento' | 'fim_procedimento' | 'registro' | 'fim_registro' |
'caso' | 'fim_caso' | 'seja' | 'leia' | 'escreva' | 'logico' | 'var' | 'constante' |
'<=' | '>=' | '=' | '<' | '<>' | '>' | '^' | '&' | '[' | ']' | '+' | '-' | '..' | '*' | '%' | ':' | '.' | '(' | ')' 
| ',' | '/' | '<-' ;                  


// Definições do professor 
NUM_INT: ('+'|'-')? ('0'..'9')+;

NUM_REAL: ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+;

// Começa e termina com " e pode ser seguido de qualquer caractere exceto \n
CADEIA: '"' ~('\n'|'"')* '"';

WB: ' ' -> skip;

QUEBRA_LINHA: '\n' -> skip;

TAB: '\t' -> skip;

IDENT: LETRA (LETRA | DIGITO | '_')*;

/* comentários nessa linguagem são caracterizados por começarem e terminarem 
com {} e ter qualquer caractere dentro exceto \n 
*/
COMENTARIO: '{ ' ~('\n'|'}')* '}' -> skip;

fragment
LETRA: ('a'..'z') | ('A'..'Z');

fragment
DIGITO: ('0'..'9');