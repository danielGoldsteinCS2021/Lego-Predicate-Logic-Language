package lego;

import lego.ast.Env;
import lego.ast.Expr;
import lego.ast.Formula;

public abstract class BaseEvalVisitor {
    protected abstract Boolean evalFormula(Formula formula, Env env);
    protected abstract Integer evalExp(Expr expr, Env env);


    // eval overloading
    public boolean eval(Formula formula){
        return evalFormula(formula, new Env());
    }
    public int eval(Expr expr){
        return evalExp(expr, new Env());
    }
}
