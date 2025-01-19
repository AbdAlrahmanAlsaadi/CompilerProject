package expression;

import java.util.List;

public class ClassBodyNode implements ASTNode {
    private List<ASTNode> elements; // قائمة العناصر داخل جسم الفئة

    public ClassBodyNode(List<ASTNode> elements) {
        this.elements = elements;
    }

    // Getter
    public List<ASTNode> getElements() {
        return elements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ClassBody:");
        for (ASTNode element : elements) {
            element.prettyPrint(indent + "  ");
        }
    }
}