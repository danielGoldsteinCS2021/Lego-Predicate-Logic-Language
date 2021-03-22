grammar Lego;

program: start? EOF;
start: formula | expr ;

formula: expr rel_op expr                   #rel_opFormula
    | unary_conn formula                    #unary_connFormula
    | formula binary_conn formula           #binary_connFormula
    | quantifier var ':' domain '.' formula #quantifierFormula
    | '(' formula ')'                       #bracketedForumla
    ;

expr: expr bin_op expr                      #bin_opExpr
    | expr bin_op_lower expr                #bin_op_lowerExpr
	| number                                #numberExpr
	| var                                   #varExpr
	| '(' expr ')'                          #bracketedExpr
	;

rel_op: GT | GTE | EQ | LT | LTE ;
bin_op: MUL
      | DIV
      | MOD
      ;
bin_op_lower: ADD // This rule is needed to enforce lower precedence on addition and subtraction
            | SUB
            ;

unary_conn: NOT ;
binary_conn: AND | OR | IMPL | EQUIV ;
quantifier: FORALL | EXISTS ;

domain: '[' number '..' number ']' ;
number: INT | SUB+INT;
var: ID ;

MUL : '*' ;			
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
MOD : '%' ;
GT  : '>' ;
GTE : '>=';
EQ  : '=' ;
LT  : '<' ;
LTE : '<=';

NOT : '!' | N O T ;
AND : '&&' | A N D ;
OR  : '||' | O R ;
IMPL: '->' | '=>' | I M P L I E S ;
EQUIV:'<->'| '<=>' | E Q U I V | I F F ;

FORALL: F O R A L L ;
EXISTS: E X I S T S ;

ID  : [a-zA-Z][a-zA-Z0-9]* ;
INT : [0-9]+ ;

NEWLINE: '\r'? '\n' ;
WS: [ \r\t\n]+ -> skip ;

fragment A  :('a' | 'A') ;
fragment B  :('b' | 'B') ;
fragment C  :('c' | 'C') ;
fragment D  :('d' | 'D') ;
fragment E  :('e' | 'E') ;
fragment F  :('f' | 'F') ;
fragment G  :('g' | 'G') ;
fragment H  :('h' | 'H') ;
fragment I  :('i' | 'I') ;
fragment J  :('j' | 'J') ;
fragment K  :('k' | 'K') ;
fragment L  :('l' | 'L') ;
fragment M  :('m' | 'M') ;
fragment N  :('n' | 'N') ;
fragment O  :('o' | 'O') ;
fragment P  :('p' | 'P') ;
fragment Q  :('q' | 'Q') ;
fragment R  :('r' | 'R') ;
fragment S  :('s' | 'S') ;
fragment T  :('t' | 'T') ;
fragment U  :('u' | 'U') ;
fragment V  :('v' | 'V') ;
fragment W  :('w' | 'W') ;
fragment X  :('x' | 'X') ;
fragment Y  :('y' | 'Y') ;
fragment Z  :('z' | 'Z') ;