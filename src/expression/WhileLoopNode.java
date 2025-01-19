package expression;

public class WhileLoopNode implements ASTNode {
    private ASTNode condition; // التعبير الشرطي
    private ASTNode block; // الكتلة

    public WhileLoopNode(ASTNode condition, ASTNode block) {
        this.condition = condition;
        this.block = block;
    }

    // Getters
    public ASTNode getCondition() {
        return condition;
    }

    public ASTNode getBlock() {
        return block;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "WhileLoop:");
        System.out.println(indent + "  Condition:");
        condition.prettyPrint(indent + "    ");
        System.out.println(indent + "  Block:");
        block.prettyPrint(indent + "    ");
    }
}