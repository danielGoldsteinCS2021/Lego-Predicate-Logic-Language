package lego.ast;

public class Rel_formula extends Formula{
    public Rel_op relOp;
    public Expr lhs;
    public Expr rhs;

    public Rel_formula(Rel_op rel_op, Expr lhs, Expr rhs){
        this.relOp = rel_op;
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
