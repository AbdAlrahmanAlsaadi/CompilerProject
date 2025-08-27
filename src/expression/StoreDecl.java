package expression;

public class StoreDecl implements ASTNode {
    private String name;
    private String entityName;
    private boolean isArray;

    public StoreDecl(String name, String entityName, boolean isArray) {
        this.name = name;
        this.entityName = entityName;
        this.isArray = isArray;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEntityName() { return entityName; }
    public void setEntityName(String entityName) { this.entityName = entityName; }

    public boolean isArray() { return isArray; }
    public void setArray(boolean array) { isArray = array; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "StoreDecl: " + name + " : " + entityName + (isArray ? "[]" : ""));
    }
}
