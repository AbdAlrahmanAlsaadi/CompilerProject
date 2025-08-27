package expression;

public class NavStmt implements ASTNode {
    private String page;

    public NavStmt(String page) {
        this.page = page;
    }

    public String getPage() { return page; }
    public void setPage(String page) { this.page = page; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "NavStmt: go " + page);
    }
}
