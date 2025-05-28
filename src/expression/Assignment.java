package expression;

import expression.ASTNode;
import expression.ExpressionNode;

public class Assignment implements ASTNode {
    private String variable;
    private ExpressionNode value;

    public Assignment(String variable, ExpressionNode value) {
        this.variable = variable;
        this.value = value;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public ExpressionNode getValue() {
        return value;
    }

    public void setValue(ExpressionNode value) {
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Assignment:");
        System.out.println(indent + "  " + variable + " = ");
        value.print(indent + "    ");
    }

}
