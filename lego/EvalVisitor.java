package lego;

import lego.ast.*;

public class EvalVisitor extends BaseEvalVisitor{


    @Override
    protected Boolean evalFormula(Formula f, Env env) {
        if (f instanceof Rel)
            return evalRel(((Rel) f).relOp, ((Rel) f).lhs, ((Rel) f).rhs, env);
        if (f instanceof Unary)
            return evalUnary(((Unary) f).unConn, ((Unary) f).formula, env);
        if (f instanceof Binary_formula)
            return evalBinary_formula(((Binary_formula) f).binary_conn, ((Binary_formula) f).lhs, ((Binary_formula) f).rhs, env);
        if (f instanceof Quantified)
            return evalQuantified(((Quantified) f).quantifier, ((Quantified) f).var, ((Quantified) f).domain, ((Quantified) f).formula , env);
        // should not get here
        return null;
    }

    @Override
    protected Integer evalExpr(Expr expr, Env env) {
        if (expr instanceof Num)
            return ((Num) expr).value;
        if (expr instanceof Var){
            int returnValue = env.search(((Var) expr).name);
            if (returnValue == Integer.MIN_VALUE)
                throw new IllegalArgumentException();
            return returnValue;
        }
        if (expr instanceof Binary_expr)
            return evalBinary_expr(((Binary_expr) expr).binOp, ((Binary_expr) expr).lhs, ((Binary_expr) expr).rhs, env);
        if (expr instanceof Binary_expr_lower)
            return evalBinary_expr_lower(((Binary_expr_lower) expr).binOp_lower, ((Binary_expr_lower) expr).lhs, ((Binary_expr_lower) expr).rhs, env);
        // should not get here
        return null;
    }

    // Formula helper methods
    private Boolean evalRel(Rel_op op, Expr lhs, Expr rhs, Env env) {
        int left = evalExpr(lhs, env);
        int right = evalExpr(rhs, env);
        if (op.kind == Rel_op.Kind.EQ)
            return left == right;
        if (op.kind == Rel_op.Kind.GT)
            return left > right;
        if (op.kind == Rel_op.Kind.GTE)
            return left >= right;
        if (op.kind == Rel_op.Kind.LT)
            return left < right;
        if (op.kind == Rel_op.Kind.LTE)
            return left <= right;
        // should not get here!
        return null;
    }

    private Boolean evalUnary(Unary_conn conn, Formula formula, Env env){
        if (conn.kind == Unary_conn.Kind.NOT)
            return !evalFormula(formula, env);
        // should not get here
        return null;
    }

    private Boolean evalBinary_formula(Binary_conn conn, Formula lhs, Formula rhs, Env env){
        boolean left = evalFormula(lhs, env);
        boolean right = evalFormula(rhs, env);
        if (conn.kind == Binary_conn.Kind.AND)
            return left&&right;
        if (conn.kind == Binary_conn.Kind.OR)
            return left||right;
        if (conn.kind == Binary_conn.Kind.IMPLIES)
            return (!left) || right;
        if (conn.kind == Binary_conn.Kind.EQUIV)
            return ((!left) || right) && ((!right) || left);
        // should not get here
        return null;
    }

    private Boolean evalQuantified(Quantifier q, Var v, Domain d, Formula f, Env e){
        int start = d.start.value;
        int end = d.end.value;
        for (int i = start; i <= end; ++i){
            e.push(v.name, i);
            boolean result = evalFormula(f, e);
            if (result && q.kind == Quantifier.Kind.EXISTS)
                return true;
            if (!result && q.kind == Quantifier.Kind.FORALL)
                return false;
            e.pop();
        }
        return q.kind != Quantifier.Kind.EXISTS; // if exists return false as not found, else true
    }

    // methods for expr
    public Integer evalBinary_expr(Bin_op op, Expr lhs, Expr rhs, Env env){
        int left = evalExpr(lhs, env);
        int right = evalExpr(rhs, env);
        if (op.kind == Bin_op.Kind.MUL)
            return left*right;
        if (op.kind == Bin_op.Kind.DIV){
            if (right != 0)
                return left/right;
            // should be division by zero error
            throw new IllegalArgumentException(); }
        if (op.kind == Bin_op.Kind.MOD){
            if (right != 0)
                return left%right;
            // should be division by zero error
            throw new IllegalArgumentException(); }
        // should not get here
        return null;
    }

    public Integer evalBinary_expr_lower(Bin_op_lower op, Expr lhs, Expr rhs, Env env){
        int left = evalExpr(lhs, env);
        int right = evalExpr(rhs, env);
        if (op.kind == Bin_op_lower.Kind.ADD)
            return left+right;
        if (op.kind == Bin_op_lower.Kind.SUB)
            return left-right;
        // should not get here
        return null;
    }

}