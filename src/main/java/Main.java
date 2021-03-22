import ast.*;
import org.antlr.v4.runtime.*;
import lego.*;

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
            System.out.println(result);
        }
        else{
            Expr ast = (Expr) builder.visitExpr(context.expr());
            int result = new EvalVisitor().eval(ast);
            System.out.println(result);
        }
    }
}
