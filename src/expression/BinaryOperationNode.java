package expression;

public class BinaryOperationNode implements ASTNode {
    private String operator;
    private ASTNode left;
    private ASTNode right;

    public BinaryOperationNode(String operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Binary Operation:");
        System.out.println(indent + "  Operator: " + operator);
        System.out.println(indent + "  Left:");
        left.prettyPrint(indent + "    ");
        System.out.println(indent + "  Right:");
        right.prettyPrint(indent + "    ");
    }
}
