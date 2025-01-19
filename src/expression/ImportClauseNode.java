package expression;

import java.util.List;

public class ImportClauseNode implements ASTNode {
    private String identifier; // For single identifier imports
    private List<ImportSpecifierNode> importSpecifiers; // For destructured imports

    public ImportClauseNode(String identifier) {
        this.identifier = identifier;
        this.importSpecifiers = null;
    }

    public ImportClauseNode(List<ImportSpecifierNode> importSpecifiers) {
        this.identifier = null;
        this.importSpecifiers = importSpecifiers;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<ImportSpecifierNode> getImportSpecifiers() {
        return importSpecifiers;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ImportClause:");
        if (identifier != null) {
            System.out.println(indent + "  Identifier: " + identifier);
        } else if (importSpecifiers != null) {
            System.out.println(indent + "  Specifiers:");
            for (ImportSpecifierNode specifier : importSpecifiers) {
                specifier.prettyPrint(indent + "    ");
            }
        }
    }
}
