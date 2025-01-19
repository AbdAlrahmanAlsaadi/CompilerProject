package expression;

public class StatementNode implements ASTNode {
    private String statementType; // نوع الجملة (Statement type)
    private ASTNode content; // المحتوى الخاص بالجملة

    public StatementNode(String statementType, ASTNode content) {
        this.statementType = statementType;
        this.content = content;
    }

    public String getStatementType() {
        return statementType;
    }

    public ASTNode getContent() {
        return content;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Statement:");
        System.out.println(indent + "  Type: " + statementType);
        if (content != null) {
            System.out.println(indent + "  Content:");
            content.prettyPrint(indent + "    ");
        }
    }
}
