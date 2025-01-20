package expression;

public class ParameterListNode implements ASTNode {
    private String identifier;
    private ASTNode type;  // نوع العنصر سواء كان arrayLiteral أو type
    private String accessModifier;

    public ParameterListNode(String identifier, ASTNode type, String accessModifier) {
        this.identifier = identifier;
        this.type = type;
        this.accessModifier = accessModifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ASTNode getType() {
        return type;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Parameter:");
        if (accessModifier != null) {
            System.out.println(indent + "  Access Modifier: " + accessModifier);
        }
        System.out.println(indent + "  Identifier: " + identifier);
        type.prettyPrint(indent + "  ");
    }
}
