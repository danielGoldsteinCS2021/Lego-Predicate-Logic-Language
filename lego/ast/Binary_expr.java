package lego.ast;

public class Binary_expr extends Expr{
    public Bin_op binOp;
    public Expr lhs;
    public Expr rhs;

    public Binary_expr(Bin_op op, Expr lhs, Expr rhs){
        this.binOp = op;
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
