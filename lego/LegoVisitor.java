package lego;// Generated from Lego.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LegoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LegoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LegoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LegoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LegoParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_connFormula}
	 * labeled alternative in {@link LegoParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_connFormula(LegoParser.Unary_connFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_connFormula}
	 * labeled alternative in {@link LegoParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_connFormula(LegoParser.Binary_connFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel_opFormula}
	 * labeled alternative in {@link LegoParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_opFormula(LegoParser.Rel_opFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedForumla}
	 * labeled alternative in {@link LegoParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedForumla(LegoParser.BracketedForumlaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifierFormula}
	 * labeled alternative in {@link LegoParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifierFormula(LegoParser.QuantifierFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link LegoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(LegoParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link LegoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(LegoParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opExpr}
	 * labeled alternative in {@link LegoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opExpr(LegoParser.Bin_opExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedExpr}
	 * labeled alternative in {@link LegoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedExpr(LegoParser.BracketedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_op_lowerExpr}
	 * labeled alternative in {@link LegoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_lowerExpr(LegoParser.Bin_op_lowerExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain(LegoParser.DomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LegoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LegoParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(LegoParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(LegoParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#bin_op_lower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_lower(LegoParser.Bin_op_lowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#unary_conn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_conn(LegoParser.Unary_connContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#binary_conn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_conn(LegoParser.Binary_connContext ctx);
	/**
	 * Visit a parse tree produced by {@link LegoParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(LegoParser.QuantifierContext ctx);
}