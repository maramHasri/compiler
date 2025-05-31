import java.util.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MySemanticAnalyzer extends MyGrammarBaseVisitor<Void> {
    private SymbolTable symbolTable = new SymbolTable();
    private List<String> errors = new ArrayList<>();

    @Override
    public Void visitImportStatement(MyGrammarParser.ImportStatementContext ctx) {
        if (ctx.importItems().importAliasList() != null) {
            for (MyGrammarParser.ImportAliasContext alias : ctx.importItems().importAliasList().importAlias()) {
                String name = alias.IDENT(0).getText();
                symbolTable.define(new Symbol(name));
            }
        } else if (ctx.importItems().IDENT() != null) {
            String name = ctx.importItems().IDENT().getText();
            symbolTable.define(new Symbol(name));
        }
        return null;
    }

    @Override
    public Void visitNgModuleDefinition(MyGrammarParser.NgModuleDefinitionContext ctx) {
        for (MyGrammarParser.NgModulePropertyContext prop : ctx.ngModuleObject().ngModuleProperty()) {
            if (prop.getStart().getText().equals("declarations")) {
                for (TerminalNode ident : prop.arrayOfIdents().IDENT()) {
                    String name = ident.getText();
                    if (!symbolTable.exists(name)) {
                        Token token = ident.getSymbol();
                        int line = token.getLine();
                        int column = token.getCharPositionInLine();
                        errors.add("Error at line " + line + ", column " + column + ": Component '" + name + "' is used in declarations but is not defined or imported.");
                    }
                }
            }
        }
        return null;
    }

    public void printErrors() {
        if (errors.isEmpty()) {
            System.out.println("✔️ No semantic errors found.");
        } else {
            System.out.println("❌ Semantic Errors:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }

    public void printSymbolTable() {
        System.out.println("\n📦 Symbol Table:");
        for (String name : symbolTable.getSymbols()) {
            System.out.println("- " + name);
        }
    }
}
