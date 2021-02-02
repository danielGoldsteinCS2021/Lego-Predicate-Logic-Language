package lego.ast;

public class Bin_op implements ASTNode{
    public enum Kind{
        ADD,
        SUB,
        MUL,
        DIV,
        MOD
    }
    public Kind kind;
    private Bin_op(Kind value) {this.kind = value;}

    public static Bin_op ADD() {return new Bin_op(Kind.ADD);}
    public static Bin_op SUB() {return new Bin_op(Kind.SUB);}
    public static Bin_op MUL() {return new Bin_op(Kind.MUL);}
    public static Bin_op DIV() {return new Bin_op(Kind.DIV);}
    public static Bin_op MOD() {return new Bin_op(Kind.MOD);}
}
