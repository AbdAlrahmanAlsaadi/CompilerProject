package expression;

import java.util.List;

public class TypeNode implements ASTNode {
    public enum TypeKind {
        SIMPLE,          // Represents typeItem
        ARRAY,           // Represents typeItem[]
        GENERIC,         // Represents TYPES<typeItem>
        TUPLE            // Represents [typeItem, typeItem, ...]
    }

    private TypeKind kind;
    private TypeItemNode simpleType;           // For SIMPLE and GENERIC
    private String genericType;                // For GENERIC
    private List<TypeItemNode> tupleElements;  // For TUPLE and ARRAY

    // Constructor for SIMPLE type
    public TypeNode(TypeItemNode simpleType) {
        this.kind = TypeKind.SIMPLE;
        this.simpleType = simpleType;
    }

    // Constructor for ARRAY type
    public TypeNode(TypeItemNode simpleType, boolean isArray) {
        this.kind = TypeKind.ARRAY;
        this.simpleType = simpleType;
    }

    // Constructor for GENERIC type
    public TypeNode(String genericType, TypeItemNode simpleType) {
        this.kind = TypeKind.GENERIC;
        this.genericType = genericType;
        this.simpleType = simpleType;
    }

    // Constructor for TUPLE type
    public TypeNode(List<TypeItemNode> tupleElements) {
        this.kind = TypeKind.TUPLE;
        this.tupleElements = tupleElements;
    }

    public TypeKind getKind() {
        return kind;
    }

    public TypeItemNode getSimpleType() {
        return simpleType;
    }

    public String getGenericType() {
        return genericType;
    }

    public List<TypeItemNode> getTupleElements() {
        return tupleElements;
    }

    @Override
    public void prettyPrint(String indent) {
        switch (kind) {
            case SIMPLE:
                System.out.println(indent + "Type: SIMPLE");
                simpleType.prettyPrint(indent + "  ");
                break;
            case ARRAY:
                System.out.println(indent + "Type: ARRAY");
                simpleType.prettyPrint(indent + "  ");
                break;
            case GENERIC:
                System.out.println(indent + "Type: GENERIC");
                System.out.println(indent + "  Generic Type: " + genericType);
                simpleType.prettyPrint(indent + "  ");
                break;
            case TUPLE:
                System.out.println(indent + "Type: TUPLE");
                for (TypeItemNode element : tupleElements) {
                    element.prettyPrint(indent + "  ");
                }
                break;
        }
    }
}
