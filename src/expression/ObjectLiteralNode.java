package expression;

import java.util.List;

public class ObjectLiteralNode implements ASTNode {
    private List<PropertyAssignmentNode> properties;

    public ObjectLiteralNode(List<PropertyAssignmentNode> properties) {
        this.properties = properties;
    }

    // Getter
    public List<PropertyAssignmentNode> getProperties() { return properties; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ObjectLiteral:");
        for (PropertyAssignmentNode property : properties) {
            property.prettyPrint(indent + "  ");
        }
    }
}