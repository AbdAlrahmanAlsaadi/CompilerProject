package expression;

public class TemplateBindingNode implements ASTNode {
    private ASTNode expression;

    public TemplateBindingNode(ASTNode expression) {
        this.expression = expression;
    }

    // Getter
    public ASTNode getExpression() { return expression; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TemplateBinding:");
        expression.prettyPrint(indent + "  ");
    }
}