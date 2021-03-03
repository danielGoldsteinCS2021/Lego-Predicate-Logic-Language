package ast;

public class Rel_op implements ASTNode{
    public enum Kind{
        EQ,  // equals
        GTE, // greater than or equals
        GT,  // greater than
        LT,  // less than
        LTE  // less than or equals
    }

    public Kind kind;  // instance variable for type of comparisons

    private Rel_op(Kind value){ this.kind = value; } // not constructor is private

    public static Rel_op EQ() { return new Rel_op(Kind.EQ);}
    public static Rel_op GTE() {return new Rel_op(Kind.GTE);}
    public static Rel_op GT() {return new Rel_op(Kind.GT);}
    public static Rel_op LT() {return new Rel_op(Kind.LT);}
    public static Rel_op LTE() {return new Rel_op(Kind.LTE);}


}
