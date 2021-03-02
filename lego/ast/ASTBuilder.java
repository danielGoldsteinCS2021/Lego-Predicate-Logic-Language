package lego.ast;

import lego.LegoBaseVisitor;
import lego.LegoParser;

public class ASTBuilder extends LegoBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitUnary_connFormula(LegoParser.Unary_connFormulaContext ctx) {
        Unary_conn conn = (Unary_conn) visitUnary_conn(ctx.unary_conn());
        Formula formula = (Formula) visitFormula(ctx.formula());
        return new Unary(conn, formula);
    }

    @Override
    public ASTNode visitBinary_connFormula(LegoParser.Binary_connFormulaContext ctx) {
        Binary_conn conn = (Binary_conn) visitBinary_conn(ctx.binary_conn());
        Formula lhs = (Formula) visitFormula(ctx.formula(0));
        Formula rhs = (Formula) visitFormula(ctx.formula(1));
        return new Binary_formula(conn, lhs, rhs);
    }

    @Override
    public ASTNode visitRel_opFormula(LegoParser.Rel_opFormulaContext ctx) {
        Rel_op op = (Rel_op) visitRel_op(ctx.rel_op());
        Expr lhs = (Expr) visitExpr(ctx.expr(0));
        Expr rhs = (Expr) visitExpr(ctx.expr(1));
        return new Rel(op, lhs, rhs);
    }

    @Override
    public ASTNode visitBracketedForumla(LegoParser.BracketedForumlaContext ctx) {
        return visitFormula(ctx.formula());
    }

    @Override
    public ASTNode visitQuantifierFormula(LegoParser.QuantifierFormulaContext ctx) {
        Quantifier quant = (Quantifier) visitQuantifier(ctx.quantifier());
        Var var = (Var) visitVar(ctx.var());
        Domain domain = (Domain) visitDomain(ctx.domain());
        Formula formula = (Formula) visitFormula(ctx.formula());
        return new Quantified(quant, var, domain, formula);
    }

    @Override
    public ASTNode visitVarExpr(LegoParser.VarExprContext ctx) {
        return visitVar(ctx.var());
    }

    @Override
    public ASTNode visitNumberExpr(LegoParser.NumberExprContext ctx) {
        return visitNumber(ctx.number());
    }

    @Override
    public ASTNode visitBin_opExpr(LegoParser.Bin_opExprContext ctx) {
        Bin_op op = (Bin_op) visitBin_op(ctx.bin_op());
        Expr lhs = (Expr) visitExpr(ctx.expr(0));
        Expr rhs = (Expr) visitExpr(ctx.expr(1));
        return new Binary_expr(op, lhs, rhs);
    }

    @Override
    public ASTNode visitBin_op_lowerExpr(LegoParser.Bin_op_lowerExprContext ctx) {
        Bin_op_lower op = (Bin_op_lower) visitBin_op_lower(ctx.bin_op_lower());
        Expr lhs = (Expr) visitExpr(ctx.expr(0));
        Expr rhs = (Expr) visitExpr(ctx.expr(1));
        return new Binary_expr_lower(op, lhs, rhs);
    }

    @Override
    public ASTNode visitBracketedExpr(LegoParser.BracketedExprContext ctx) {
        return visitExpr(ctx.expr());
    }

    @Override
    public ASTNode visitDomain(LegoParser.DomainContext ctx) {
        Num start = (Num) visitNumber(ctx.number(0));
        Num stop = (Num) visitNumber(ctx.number(1));
        return new Domain(start, stop);
    }

    @Override
    public ASTNode visitNumber(LegoParser.NumberContext ctx) {
        int value;
        try {
            value = Integer.parseInt(ctx.getText());
        } catch(NumberFormatException e){
            throw new IllegalArgumentException();
        }
        return new Num(value);
    }

    @Override
    public ASTNode visitVar(LegoParser.VarContext ctx) {
        return new Var(ctx.getText());
    }

    @Override
    public ASTNode visitRel_op(LegoParser.Rel_opContext ctx) {
        if (ctx.GT() != null)
            return Rel_op.GT();
        if (ctx.GTE() != null)
            return Rel_op.GTE();
        if (ctx.EQ() != null)
            return Rel_op.EQ();
        if (ctx.LT() != null)
            return Rel_op.LT();
        if (ctx.LTE() != null)
            return Rel_op.LTE();
        // should not get here
        throw new IllegalArgumentException();
    }

    @Override
    public ASTNode visitBin_op(LegoParser.Bin_opContext ctx) {
        if (ctx.MUL() != null)
            return Bin_op.MUL();
        if (ctx.DIV() != null)
            return Bin_op.DIV();
        if (ctx.MOD() != null)
            return Bin_op.MOD();
        // should not get here
        throw new IllegalArgumentException();
    }

    @Override
    public ASTNode visitBin_op_lower(LegoParser.Bin_op_lowerContext ctx) {
        if (ctx.ADD() != null)
            return Bin_op_lower.ADD();
        if (ctx.SUB() != null)
            return Bin_op_lower.SUB();
        // should not get here
        throw new IllegalArgumentException();
    }

    @Override
    public ASTNode visitUnary_conn(LegoParser.Unary_connContext ctx) {
        if (ctx.NOT() != null)
            return Unary_conn.NOT();
        // should not get here
        throw new IllegalArgumentException();
    }

    @Override
    public ASTNode visitBinary_conn(LegoParser.Binary_connContext ctx) {
        if (ctx.AND() != null)
            return Binary_conn.AND();
        if (ctx.OR() != null)
            return Binary_conn.OR();
        if (ctx.IMPL() != null)
            return Binary_conn.IMPLIES();
        if (ctx.EQUIV() != null)
            return Binary_conn.EQUIV();
        // should not get here
        throw new IllegalArgumentException();
    }

    @Override
    public ASTNode visitQuantifier(LegoParser.QuantifierContext ctx) {
        if (ctx.FORALL() != null)
            return Quantifier.FORALL();
        if (ctx.EXISTS() != null)
            return Quantifier.EXISTS();
        // should not get here
        throw new IllegalArgumentException();
    }

    // might not need to override

    @Override
    public ASTNode visitStart(LegoParser.StartContext ctx) {
        if (ctx.formula() != null)
            visitFormula(ctx.formula());
        if (ctx.expr() != null)
            visitExpr(ctx.expr());
        // should not get here
        throw new IllegalArgumentException();
    }

    @Override
    public ASTNode visitProgram(LegoParser.ProgramContext ctx) {
        if (ctx.start() != null)
            return visitStart(ctx.start());
        return null;
    }

    //--------------------------

    /*
    * Tree roots
    */
    public ASTNode visitFormula(LegoParser.FormulaContext ctx){
        if (ctx instanceof LegoParser.Rel_opFormulaContext)
            return visitRel_opFormula((LegoParser.Rel_opFormulaContext) ctx);
        if (ctx instanceof LegoParser.Unary_connFormulaContext)
            return visitUnary_connFormula((LegoParser.Unary_connFormulaContext) ctx);
        if (ctx instanceof LegoParser.Binary_connFormulaContext)
            return visitBinary_connFormula((LegoParser.Binary_connFormulaContext) ctx);
        if (ctx instanceof LegoParser.QuantifierFormulaContext)
            return visitQuantifierFormula((LegoParser.QuantifierFormulaContext) ctx);
        if (ctx instanceof LegoParser.BracketedForumlaContext)
            return visitBracketedForumla((LegoParser.BracketedForumlaContext) ctx);
        // should not get here
        throw new IllegalArgumentException();
    }

    public ASTNode visitExpr(LegoParser.ExprContext ctx){
        if (ctx instanceof LegoParser.Bin_opExprContext)
            return visitBin_opExpr((LegoParser.Bin_opExprContext) ctx);
        if (ctx instanceof LegoParser.Bin_op_lowerExprContext)
            return visitBin_op_lowerExpr((LegoParser.Bin_op_lowerExprContext) ctx);
        if (ctx instanceof LegoParser.NumberExprContext)
            return visitNumberExpr((LegoParser.NumberExprContext) ctx);
        if (ctx instanceof LegoParser.VarExprContext)
            return visitVarExpr((LegoParser.VarExprContext) ctx);
        if (ctx instanceof LegoParser.BracketedExprContext)
            return visitBracketedExpr((LegoParser.BracketedExprContext) ctx);
        // should not get here
        throw new IllegalArgumentException();
    }
}
