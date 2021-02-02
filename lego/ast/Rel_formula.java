package lego.ast;

public class Rel_formula extends Formula{
    public Rel_op rel_op;
    public Expr lhs;
    public Expr rhs;

    public Rel_formula(Rel_op rel_op, Expr lhs, Expr rhs){
        this.rel_op = rel_op;
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
