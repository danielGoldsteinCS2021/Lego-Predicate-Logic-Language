/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import lego.LegoLexer;
import lego.LegoParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import lego.EvalVisitor;

public class Main {
    public static void main(String[] args) throws Exception {
        String formula = args[0];
        LegoLexer lexer = new LegoLexer(CharStreams.fromString(formula));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LegoParser parser = new LegoParser(tokens);

        ParseTree tree = parser.program(); // parse

        EvalVisitor eval = new EvalVisitor();
        //eval.visit(tree);
    }
}
