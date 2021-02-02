package lego.ast;

import java.util.Queue;

public class Quantifier implements ASTNode{
    public enum Kind{
        FORALL,
        EXISTS
    }

    public Kind kind;

    private Quantifier(Kind value) {this.kind = value;}
    public static Quantifier FORALL() {return new Quantifier(Kind.FORALL);}
    public static Quantifier EXISTS() {return new Quantifier(Kind.EXISTS);}
}
