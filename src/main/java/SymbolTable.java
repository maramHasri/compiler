import java.util.*;

public class SymbolTable {
    private Map<String, Symbol> symbols = new HashMap<>();

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public boolean exists(String name) {
        return symbols.containsKey(name);
    }

    public Set<String> getSymbols() {
        return symbols.keySet();
    }
}
