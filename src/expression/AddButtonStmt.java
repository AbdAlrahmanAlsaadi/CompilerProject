package expression;

public class AddButtonStmt implements ASTNode {
    private String targetPage;

    public AddButtonStmt(String targetPage) {
        this.targetPage = targetPage;
    }

    public String getTargetPage() { return targetPage; }
    public void setTargetPage(String targetPage) { this.targetPage = targetPage; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "AddButtonStmt -> go " + targetPage);
    }
}
