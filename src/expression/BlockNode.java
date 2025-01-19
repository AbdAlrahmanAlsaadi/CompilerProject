package expression;

import java.util.List;

public class BlockNode implements ASTNode {
    private List<ASTNode> statements; // قائمة العبارات أو الأوامر داخل الكتلة

    public BlockNode(List<ASTNode> statements) {
        this.statements = statements;
    }

    // Getter
    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Block:");
        for (ASTNode statement : statements) {
            statement.prettyPrint(indent + "  ");
        }
    }
}