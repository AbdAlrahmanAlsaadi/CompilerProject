package expression;

public class LiteralNode implements ASTNode {
    private String value;

    public LiteralNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Literal: " + value);
    }
}
