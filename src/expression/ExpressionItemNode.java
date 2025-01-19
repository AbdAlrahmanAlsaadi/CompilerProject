package expression;

public class ExpressionItemNode implements ASTNode {
    private String type; // Represents the type of the expression item (e.g., IDENTIFIER, NUMBER, STRING, etc.)
    private Object value; // Holds the actual value or node for the expression

    public ExpressionItemNode(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ExpressionItem:");
        System.out.println(indent + "  Type: " + type);
        if (value != null) {
            if (value instanceof ASTNode) {
                ((ASTNode) value).prettyPrint(indent + "  ");
            } else {
                System.out.println(indent + "  Value: " + value);
            }
        }
    }
}
