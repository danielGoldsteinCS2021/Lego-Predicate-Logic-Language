import ast.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import lego.LegoLexer;
import lego.LegoParser;
import java.nio.charset.StandardCharsets;

import java.io.File;
import java.io.IOException;

public class LegoTests {

    @Test
    void test1() {
        boolean result = new EvalVisitor().eval(
                (Formula) parse("2>3"));
        Assertions.assertThat(result).isFalse();
    }

    public ASTNode parse(String input) {
        LegoLexer lexer = new LegoLexer(CharStreams.fromString(input));
        TokenStream tokens = new CommonTokenStream(lexer);
        LegoParser p = new LegoParser(tokens);

        ASTBuilder builder = new ASTBuilder();
        LegoParser.StartContext context = p.start();
        Assertions.assertThat(p.getNumberOfSyntaxErrors()).isEqualTo(0);

        if (context.formula() != null)
            return builder.visitFormula(context.formula());
        return builder.visitExpr(context.expr());
    }
}
