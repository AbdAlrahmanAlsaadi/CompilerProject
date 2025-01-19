package expression;

import java.util.List;

public class InterfaceBodyNode implements ASTNode {
    private List<ASTNode> parameters; // قائمة المعاملات

    public InterfaceBodyNode(List<ASTNode> parameters) {
        this.parameters = parameters;
    }

    // Getter
    public List<ASTNode> getParameters() {
        return parameters;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "InterfaceBody:");
        for (ASTNode parameter : parameters) {
            parameter.prettyPrint(indent + "  ");
        }
    }
}