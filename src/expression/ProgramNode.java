package expression;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode implements ASTNode {
    private List<ASTNode> statements;

    public ProgramNode(List<ASTNode> statements) {
        this.statements = statements;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Program:");
        for (ASTNode statement : statements) {
            statement.prettyPrint(indent + "  ");
        }
    }
}
