package expression;


import java.util.List;

public class MethodBody implements ASTNode {
    private List<ASTNode> statements;

    public MethodBody(List<ASTNode> statements) {
        this.statements = statements;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    public void setStatements(List<ASTNode> statements) {
        this.statements = statements;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "MethodBody:");
        for (ASTNode stmt : statements) {
            stmt.print(indent + "  ");
        }
    }

}
