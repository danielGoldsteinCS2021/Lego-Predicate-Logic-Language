package lego.ast;

import lego.LegoBaseVisitor;
import lego.LegoParser;

public class ASTBuilder extends LegoBaseVisitor<ASTNode> {



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
