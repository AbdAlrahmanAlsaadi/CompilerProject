package expression;

public class ParameterListNode implements ASTNode {
    private String accessModifier; // معدل الوصول
    private String identifier; // المعرف
    private Object type; // النوع (يمكن أن يكون ASTNode أو String)

    public ParameterListNode(String accessModifier, String identifier, Object type) {
        this.accessModifier = accessModifier;
        this.identifier = identifier;
        this.type = type;
    }

    // Getters
    public String getAccessModifier() {
        return accessModifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Object getType() {
        return type;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ParameterList:");
        if (accessModifier != null) {
            System.out.println(indent + "  Access Modifier: " + accessModifier);
        }
        System.out.println(indent + "  Identifier: " + identifier);
        System.out.println(indent + "  Type:");
        if (type instanceof ASTNode) {
            ((ASTNode) type).prettyPrint(indent + "    ");
        } else {
            System.out.println(indent + "    " + type); // إذا كان النوع String
        }
    }
}