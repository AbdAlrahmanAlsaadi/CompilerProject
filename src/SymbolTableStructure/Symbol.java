package SymbolTableStructure;

public class Symbol {
    private String name;
    private String type;
    private String scope;
    private Object value;

    public Symbol(String name, String type, String scope, Object value) {
        this.name = name;
        this.type = type;
        this.scope = scope;
        this.value = value;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getValue() {
        return value != null ? value.toString() : "null";
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-15s | %-20s | %-20s |", name, type, scope, value != null ? value : "null");
    }
}
