/*package expression;

public class PropertyAssignmentNode implements ASTNode {
    private String identifier;
    private ASTNode expression;

    public PropertyAssignmentNode(String identifier, ASTNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    // Getters
    public String getIdentifier() { return identifier; }
    public ASTNode getExpression() { return expression; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "PropertyAssignment:");
        System.out.println(indent + "  Identifier: " + identifier);
        expression.prettyPrint(indent + "  ");
    }
}*/
package expression;

public class PropertyAssignmentNode implements ASTNode {
    private String identifier;
    private ASTNode expression;

    public PropertyAssignmentNode(String identifier, ASTNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    // Getters
    public String getIdentifier() { return identifier; }
    public ASTNode getExpression() { return expression; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "PropertyAssignment:");
        System.out.println(indent + "  Identifier: " + identifier);
        expression.prettyPrint(indent + "  ");
    }
}