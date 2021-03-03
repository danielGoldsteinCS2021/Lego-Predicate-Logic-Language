import ast.*;

public abstract class BaseEvalVisitor {
    protected abstract Boolean evalFormula(Formula formula, Env env);
    protected abstract Integer evalExpr(Expr expr, Env env);


    // eval overloading
    public boolean eval(Formula formula){
        return evalFormula(formula, new Env());
    }
    public int eval(Expr expr){
        return evalExpr(expr, new Env());
    }
}
