package expression;

/**
 * This class represents an import statement in the AST.
 */
public class ImportStatementNode implements ASTNode {
    private String keyword;
    private ASTNode importClause;
    private String stringLiteral; // Optional string literal (e.g., file path)

    public ImportStatementNode(String keyword, ASTNode importClause, String stringLiteral) {
        this.keyword = keyword;
        this.importClause = importClause;
        this.stringLiteral = stringLiteral;
    }

    public String getKeyword() {
        return keyword;
    }

    public ASTNode getImportClause() {
        return importClause;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Import Statement:");
        System.out.println(indent + "  Keyword: " + keyword);
        if (importClause != null) {
            System.out.println(indent + "  Import Clause:");
            importClause.prettyPrint(indent + "    ");
        }
        if (stringLiteral != null) {
            System.out.println(indent + "  String Literal: " + stringLiteral);
        }
    }
}
