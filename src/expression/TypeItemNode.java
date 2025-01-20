package expression;

public class TypeItemNode implements ASTNode {
    private String value; // Represents the value of the type item (TYPES, IDENTIFIER, or STRING)
    private TypeItemType type; // Enum to differentiate between TYPES, IDENTIFIER, and STRING

    public TypeItemNode(String value, TypeItemType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public TypeItemType getType() {
        return type;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Type Item: " + type + " = " + value);
    }

    // Enum to categorize the type item
    public enum TypeItemType {
        TYPES,
        IDENTIFIER,
        STRING
    }
}
