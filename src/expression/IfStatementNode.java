package expression;

public class IfStatementNode implements ASTNode {
    private ASTNode condition; // التعبير الشرطي
    private ASTNode ifBlock; // كتلة if
    private ASTNode elseBlock; // كتلة else (إن وجدت)

    public IfStatementNode(ASTNode condition, ASTNode ifBlock, ASTNode elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    // Getters
    public ASTNode getCondition() {
        return condition;
    }

    public ASTNode getIfBlock() {
        return ifBlock;
    }

    public ASTNode getElseBlock() {
        return elseBlock;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "IfStatement:");
        System.out.println(indent + "  Condition:");
        condition.prettyPrint(indent + "    ");
        System.out.println(indent + "  IfBlock:");
        ifBlock.prettyPrint(indent + "    ");
        if (elseBlock != null) {
            System.out.println(indent + "  ElseBlock:");
            elseBlock.prettyPrint(indent + "    ");
        }
    }
}