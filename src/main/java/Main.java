import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage: java Main <source-file>");
            return;
        }

        String input = Files.readString(Paths.get(args[0])); // يقرأ الملف من السطر الأول
        CharStream inputStream = CharStreams.fromString(input);

        MyGrammarLexer lexer = new MyGrammarLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.ngFile(); // أو أي قاعدتك الجذرية

        MySemanticAnalyzer analyzer = new MySemanticAnalyzer();
        analyzer.visit(tree);

        analyzer.printErrors();
        analyzer.printSymbolTable();
    }
}
