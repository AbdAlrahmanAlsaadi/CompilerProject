package expression;

public class ExportSpecifierNode implements ASTNode {
    private String exportedName; // The name being exported
    private String alias;        // Optional alias

    public ExportSpecifierNode(String exportedName, String alias) {
        this.exportedName = exportedName;
        this.alias = alias;
    }

    public String getExportedName() {
        return exportedName;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ExportSpecifier:");
        System.out.println(indent + "  Exported Name: " + exportedName);
        if (alias != null) {
            System.out.println(indent + "  Alias: " + alias);
        }
    }
}
