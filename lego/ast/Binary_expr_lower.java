package lego.ast;

public class Binary_expr_lower extends Expr {
    public Bin_op_lower binOp_lower;
    public Expr lhs;
    public Expr rhs;

    public Binary_expr_lower(Bin_op_lower op, Expr lhs, Expr rhs) {
        this.binOp_lower = op;
        this.lhs = lhs;
        this.rhs = rhs;
    }
}