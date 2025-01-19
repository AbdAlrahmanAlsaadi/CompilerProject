package expression;

public class ImportSpecifierNode implements ASTNode {
    private String mainSpecifier; // Either IDENTIFIER or KEYWORDS
    private String alias; // Optional alias for the import

    public ImportSpecifierNode(String mainSpecifier, String alias) {
        this.mainSpecifier = mainSpecifier;
        this.alias = alias;
    }

    public String getMainSpecifier() {
        return mainSpecifier;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ImportSpecifier:");
        System.out.println(indent + "  Main Specifier: " + mainSpecifier);
        if (alias != null) {
            System.out.println(indent + "  Alias: " + alias);
        }
    }
}
