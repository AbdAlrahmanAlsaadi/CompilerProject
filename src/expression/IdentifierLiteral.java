package expression;

public class IdentifierLiteral implements ExpressionNode {
    private String name;

    public IdentifierLiteral(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Identifier: " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
