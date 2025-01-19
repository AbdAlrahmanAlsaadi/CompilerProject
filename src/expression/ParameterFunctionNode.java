package expression;

import java.util.List;

public class ParameterFunctionNode implements ASTNode {
    private List<ASTNode> parameters;

    public ParameterFunctionNode(List<ASTNode> parameters) {
        this.parameters = parameters;
    }

    // Getter
    public List<ASTNode> getParameters() { return parameters; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ParameterFunction:");
        for (ASTNode parameter : parameters) {
            parameter.prettyPrint(indent + "  ");
        }
    }
}