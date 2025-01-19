package expression;

public class SimpleSelectorNode implements ASTNode {
    private String type;
    private String identifier;

    public SimpleSelectorNode(String type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Simple Selector:");
        System.out.println(indent + "  Type: " + type);
        System.out.println(indent + "  Identifier: " + identifier);
    }
}
