package expression;


import java.util.List;

public class Imports implements ASTNode {
    private String importedIdentifier;
    private List<String> bindings;
    private String fromPath;

    public Imports(String importedIdentifier, List<String> bindings, String fromPath) {
        this.importedIdentifier = importedIdentifier;
        this.bindings = bindings;
        this.fromPath = fromPath;
    }

    public String getImportedIdentifier() {
        return importedIdentifier;
    }

    public void setImportedIdentifier(String importedIdentifier) {
        this.importedIdentifier = importedIdentifier;
    }

    public List<String> getBindings() {
        return bindings;
    }

    public void setBindings(List<String> bindings) {
        this.bindings = bindings;
    }

    public String getFromPath() {
        return fromPath;
    }

    public void setFromPath(String fromPath) {
        this.fromPath = fromPath;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Imports:");
        System.out.println(indent + "  Identifier: " + importedIdentifier);
        System.out.println(indent + "  Bindings: " + bindings);
        System.out.println(indent + "  From: " + fromPath);

    }
}