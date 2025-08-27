package expression;

public class DetailSection implements ASTNode {
    private String storeRef;
    private String byParam;

    public DetailSection(String storeRef, String byParam) {
        this.storeRef = storeRef;
        this.byParam = byParam;
    }

    public String getStoreRef() { return storeRef; }
    public void setStoreRef(String storeRef) { this.storeRef = storeRef; }

    public String getByParam() { return byParam; }
    public void setByParam(String byParam) { this.byParam = byParam; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "DetailSection: " + storeRef + " by " + byParam);
    }
}
