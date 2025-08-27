package expression;

public class ListSection implements ASTNode {
    private String storeRef;

    public ListSection(String storeRef) {
        this.storeRef = storeRef;
    }

    public String getStoreRef() { return storeRef; }
    public void setStoreRef(String storeRef) { this.storeRef = storeRef; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ListSection: " + storeRef);
    }
}
