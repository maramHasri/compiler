import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3 + 5 * 2";

        CharStream inputStream = CharStreams.fromString(input);
        MyGrammarLexer lexer = new MyGrammarLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.expr();  // نقطة البداية حسب القاعدة

        System.out.println("Parsed Tree: " + tree.toStringTree(parser));
    }
}