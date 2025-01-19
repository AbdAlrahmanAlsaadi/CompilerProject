package expression;

public class LeafNode implements ASTNode {
    private String value;

    public LeafNode(String value) {
        this.value = value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Leaf: " + value);
    }
}
