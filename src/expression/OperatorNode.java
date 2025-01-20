package expression;

public class OperatorNode implements ASTNode {
    private String operator; // Represents the operator (e.g., "+", "-", ">", "<=", etc.)

    public OperatorNode(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Operator: " + operator);
    }
}
