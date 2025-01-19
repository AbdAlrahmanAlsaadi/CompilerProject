package expression;

import java.util.List;

public class ArgumentListNode implements ASTNode {
    private List<ASTNode> arguments; // List of statements or parameter lists

    public ArgumentListNode(List<ASTNode> arguments) {
        this.arguments = arguments;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Argument List:");
        for (ASTNode argument : arguments) {
            argument.prettyPrint(indent + "  ");
        }
    }
}
