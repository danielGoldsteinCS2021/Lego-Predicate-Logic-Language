import lego.LegoLexer;
import lego.LegoParser;
import lego.ast.ASTBuilder;
import lego.ast.Expr;
import lego.ast.Formula;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import lego.EvalVisitor;
// FIX BEDMAS ISSUE, CURRENTLY NOT DOING BEDMAS
public class Main {
    public static void main(String[] args) throws Exception {
        String formula = args[0];
        LegoLexer lexer = new LegoLexer(CharStreams.fromString(formula));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LegoParser parser = new LegoParser(tokens);
        ASTBuilder builder = new ASTBuilder();

        LegoParser.StartContext context = parser.start();
        if (context.formula() != null) {
            Formula ast = (Formula) builder.visitFormula(context.formula());
            boolean result = new EvalVisitor().eval(ast);
            System.out.println("RESULT IS :   "+result);
        }
        else{
            Expr ast = (Expr) builder.visitExpr(context.expr());
            int result = new EvalVisitor().eval(ast);
            System.out.println("RESULT IS :   "+result);
        }

        //eval.visit(tree);
    }
}
