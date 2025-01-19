package expression;

public class OperatorNode implements ASTNode {
    private String operator;

    public OperatorNode(String operator) {
        this.operator = operator;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Operator: " + operator);
    }

    public String getOperator() {
        return operator;
    }
}
