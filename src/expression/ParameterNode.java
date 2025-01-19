package expression;

public class ParameterNode implements ASTNode {
    private String identifier;
    private TypeNode type;
    private boolean isGeneric;

    public ParameterNode(String identifier, TypeNode type, boolean isGeneric) {
        this.identifier = identifier;
        this.type = type;
        this.isGeneric = isGeneric;
    }

    public String getIdentifier() {
        return identifier;
    }

    public TypeNode getType() {
        return type;
    }

    public boolean isGeneric() {
        return isGeneric;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Parameter:");
        System.out.println(indent + "  Identifier: " + identifier);
        System.out.println(indent + "  Type: ");
        type.prettyPrint(indent + "    ");
        if (isGeneric) {
            System.out.println(indent + "  Generic: true");
        }
    }
}
