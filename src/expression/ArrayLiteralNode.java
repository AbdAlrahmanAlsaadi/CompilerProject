package expression;

import java.util.List;

public class ArrayLiteralNode implements ASTNode {
    private List<ASTNode> elements;

    public ArrayLiteralNode(List<ASTNode> elements) {
        this.elements = elements;
    }

    // Getter
    public List<ASTNode> getElements() { return elements; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArrayLiteral:");
        for (ASTNode element : elements) {
            element.prettyPrint(indent + "  ");
        }
    }
}