package expression;


public class ContentNode implements ASTNode {
    private ASTNode content;

    public ContentNode(ASTNode content) {
        this.content = content;
    }

    // Getter
    public ASTNode getContent() { return content; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Content:");
        content.prettyPrint(indent + "  ");
    }
}