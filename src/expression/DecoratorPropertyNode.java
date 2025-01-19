package expression;

import java.util.List;

public class DecoratorPropertyNode implements ASTNode {
    private String identifier; // المعرف
    private List<String> values; // قائمة القيم

    public DecoratorPropertyNode(String identifier, List<String> values) {
        this.identifier = identifier;
        this.values = values;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "DecoratorProperty:");
        System.out.println(indent + "  Identifier: " + identifier);
        System.out.println(indent + "  Values: " + String.join(", ", values));
    }
}