package expression;

public class ArrowNode implements ASTNode {
    private ASTNode expression; // التعبير الذي يتبع السهم

    public ArrowNode(ASTNode expression) {
        this.expression = expression;
    }

    // Getter
    public ASTNode getExpression() {
        return expression;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Arrow:");
        expression.prettyPrint(indent + "  ");
    }
}