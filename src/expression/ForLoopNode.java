package expression;

public class ForLoopNode implements ASTNode {
    private ASTNode forBrack; // الجزء الخاص بـ forBrack
    private ASTNode block; // الكتلة

    public ForLoopNode(ASTNode forBrack, ASTNode block) {
        this.forBrack = forBrack;
        this.block = block;
    }

    // Getters
    public ASTNode getForBrack() {
        return forBrack;
    }

    public ASTNode getBlock() {
        return block;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ForLoop:");
        System.out.println(indent + "  ForBrack:");
        forBrack.prettyPrint(indent + "    ");
        System.out.println(indent + "  Block:");
        block.prettyPrint(indent + "    ");
    }
}