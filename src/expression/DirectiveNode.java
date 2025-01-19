package expression;


public class DirectiveNode implements ASTNode {
    private String directiveType;
    private String identifier;
    private String value;

    public DirectiveNode(String directiveType, String identifier, String value) {
        this.directiveType = directiveType;
        this.identifier = identifier;
        this.value = value;
    }

    // Getters
    public String getDirectiveType() { return directiveType; }
    public String getIdentifier() { return identifier; }
    public String getValue() { return value; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Directive:");
        System.out.println(indent + "  Type: " + directiveType);
        System.out.println(indent + "  Identifier: " + identifier);
        System.out.println(indent + "  Value: " + value);
    }
}