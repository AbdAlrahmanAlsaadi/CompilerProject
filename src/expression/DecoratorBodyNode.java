package expression;

import java.util.List;

public class DecoratorBodyNode implements ASTNode {
    private List<ASTNode> properties; // قائمة الخصائص

    public DecoratorBodyNode(List<ASTNode> properties) {
        this.properties = properties;
    }

    // Getter
    public List<ASTNode> getProperties() {
        return properties;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "DecoratorBody:");
        for (ASTNode property : properties) {
            property.prettyPrint(indent + "  ");
        }
    }
}