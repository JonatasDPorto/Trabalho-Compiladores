import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calc {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[] { "/home/lucasnbarros/atividade/t.expr" };
        }

        System.out.println("parsing: " + args[0]);

        LabeledExprLexer lexer = new LabeledExprLexer(new ANTLRFileStream(args[0]));
        LabeledExprParser parser = new LabeledExprParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.parse();

        EvalVisitor visitor = new EvalVisitor();

        visitor.visit(tree);
    }
}