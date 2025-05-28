package SymbolTableStructure;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable2 {

    private Map<String, Symbol> symbolTable;

    public SymbolTable2() {
        this.symbolTable = new HashMap<>();
    }

    public void addVariable(String variableName, String type, String scope, Object value) {
        String key = variableName + "::" + scope;
        Symbol symbol = new Symbol(variableName, type, scope, value);
        symbolTable.put(key, symbol);
    }


    public void updateVariable(String variableName, Object newValue) {
        if (symbolTable.containsKey(variableName)) {
            Symbol symbol = symbolTable.get(variableName);
            symbol.setValue(newValue);
        } else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
        }
    }

    public Object getValue(String variableName) {
        if (symbolTable.containsKey(variableName)) {
            return symbolTable.get(variableName).getValue();
        } else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
            return null;
        }
    }

    public boolean contains(String name, String scope) {
        String key = name + "::" + scope;
        return symbolTable.containsKey(key);
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Symbol Table:\n");
        stringBuilder.append("*".repeat(160)).append("\n");

        int idWidth = 10;
        int nameWidth = 20;
        int typeWidth = 15;
        int scopeWidth = 20;
        int valueWidth = 80;

        stringBuilder.append(String.format("| %-10s | %-20s | %-15s | %-20s | %-80s |\n", "ID", "Variable Name", "Type", "Scope", "Value"));
        stringBuilder.append("*".repeat(160)).append("\n");

        int id = 1;
        for (Symbol symbol : symbolTable.values()) {
            String value = symbol.getValue() != null ? symbol.getValue() : "null";
            String formattedValue = formatValue(value, valueWidth);
            stringBuilder.append(String.format("| %-10d | %-20s | %-15s | %-20s | %-80s |\n", id++, symbol.getName(), symbol.getType(), symbol.getScope(), formattedValue));
        }

        stringBuilder.append("*".repeat(160)).append("\n");
        return stringBuilder.toString();
    }

    private String formatValue(String value, int maxLength) {
        StringBuilder formattedValue = new StringBuilder();

        while (value.length() > maxLength) {
            formattedValue.append(value, 0, maxLength).append("\n");
            value = value.substring(maxLength);
        }

        formattedValue.append(value);

        return formattedValue.toString();
    }
}
