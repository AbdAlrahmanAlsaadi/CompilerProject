package expression;

import java.util.List;

public class TypeNode implements ASTNode {
    private String baseType; // النوع الأساسي (مثل number, string)
    private boolean isArray; // إذا كان النوع مصفوفة
    private boolean isGeneric; // إذا كان النوع عامًا (مثل Array<number>)
    private List<TypeItemNode> tupleElements; // عناصر القيم الزوجية (لأنواع tuple)

    public TypeNode(String baseType, boolean isArray, boolean isGeneric, List<TypeItemNode> tupleElements) {
        this.baseType = baseType;
        this.isArray = isArray;
        this.isGeneric = isGeneric;
        this.tupleElements = tupleElements;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    public void setGeneric(boolean generic) {
        isGeneric = generic;
    }

    public void setTupleElements(List<TypeItemNode> tupleElements) {
        this.tupleElements = tupleElements;
    }

    // Getters
    public String getBaseType() {
        return baseType;
    }

    public boolean isArray() {
        return isArray;
    }

    public boolean isGeneric() {
        return isGeneric;
    }

    public List<TypeItemNode> getTupleElements() {
        return tupleElements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Type:");
        if (isArray) {
            System.out.println(indent + "  Array of: " + baseType);
        } else if (isGeneric) {
            System.out.println(indent + "  Generic: " + baseType);
        } else if (tupleElements != null) {
            System.out.println(indent + "  Tuple:");
            for (TypeItemNode element : tupleElements) {
                element.prettyPrint(indent + "    ");
            }
        } else {
            System.out.println(indent + "  Base Type: " + baseType);
        }
    }
}