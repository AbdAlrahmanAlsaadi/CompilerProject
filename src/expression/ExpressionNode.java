package expression;

import java.util.List;

public class ExpressionNode implements ASTNode {
    private String type; // Type of the expression: "SIMPLE", "COMPLEX_OPERATOR", or "LOGICAL_OPERATOR"
    private ASTNode leftOperand;
    private List<ASTNode> operators; // Operators between operands (for complex expressions)
    private List<ASTNode> rightOperands; // Right operands for the operators

    public ExpressionNode(String type, ASTNode leftOperand, List<ASTNode> operators, List<ASTNode> rightOperands) {
        this.type = type;
        this.leftOperand = leftOperand;
        this.operators = operators;
        this.rightOperands = rightOperands;
    }

    public String getType() {
        return type;
    }

    public ASTNode getLeftOperand() {
        return leftOperand;
    }

    public List<ASTNode> getOperators() {
        return operators;
    }

    public List<ASTNode> getRightOperands() {
        return rightOperands;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Expression (" + type + "):");
        System.out.println(indent + "  Left Operand:");
        leftOperand.prettyPrint(indent + "    ");
        if (operators != null && rightOperands != null) {
            for (int i = 0; i < operators.size(); i++) {
                System.out.println(indent + "  Operator:");
                operators.get(i).prettyPrint(indent + "    ");
                System.out.println(indent + "  Right Operand:");
                rightOperands.get(i).prettyPrint(indent + "    ");
            }
        }
    }
}
