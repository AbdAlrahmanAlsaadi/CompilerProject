package expression;

import java.util.List;

public class TupleLiteralNode implements ASTNode {
    private List<ASTNode> elements;

    public TupleLiteralNode(List<ASTNode> elements) {
        this.elements = elements;
    }

    // Getter
    public List<ASTNode> getElements() { return elements; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TupleLiteral:");
        for (ASTNode element : elements) {
            element.prettyPrint(indent + "  ");
        }
    }
}