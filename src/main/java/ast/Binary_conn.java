package ast;

public class Binary_conn implements ASTNode{
    public enum Kind{
        AND,
        OR,
        IMPLIES,
        EQUIV
    }

    public Kind kind;

    private Binary_conn(Kind value) {this.kind = value;}

    public static Binary_conn AND() {return new Binary_conn(Kind.AND);}
    public static Binary_conn OR() {return new Binary_conn(Kind.OR);}
    public static Binary_conn IMPLIES() {return new Binary_conn(Kind.IMPLIES);}
    public static Binary_conn EQUIV() {return new Binary_conn(Kind.EQUIV);}

}
