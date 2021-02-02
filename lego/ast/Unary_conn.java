package lego.ast;

public class Unary_conn implements ASTNode {
    public enum Kind {
        NOT
    }

    public Kind kind;
    private Unary_conn(Kind value) {this.kind = value;}

    public static Unary_conn NOT() {return new Unary_conn(Kind.NOT);}
}
