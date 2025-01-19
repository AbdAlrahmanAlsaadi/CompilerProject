package expression;

import java.util.List;

public class ArrowFunctionNode implements ASTNode {
    private List<ASTNode> parameters;
    private ASTNode block;

    public ArrowFunctionNode(List<ASTNode> parameters, ASTNode block) {
        this.parameters = parameters;
        this.block = block;
    }

    // Getters
    public List<ASTNode> getParameters() { return parameters; }
    public ASTNode getBlock() { return block; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArrowFunction:");
        for (ASTNode parameter : parameters) {
            parameter.prettyPrint(indent + "  ");
        }
        block.prettyPrint(indent + "  ");
    }
}