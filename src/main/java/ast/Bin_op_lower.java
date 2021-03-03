package ast;

public class Bin_op_lower implements ASTNode{
    public enum Kind{
        ADD,
        SUB
    }
    public Bin_op_lower.Kind kind;
    private Bin_op_lower(Bin_op_lower.Kind value) {this.kind = value;}

    public static Bin_op_lower ADD() {return new Bin_op_lower(Bin_op_lower.Kind.ADD);}
    public static Bin_op_lower SUB() {return new Bin_op_lower(Bin_op_lower.Kind.SUB);}
}
