package expression;


public class Property implements ASTNode {
    private String varType;
    private String name;
    private String dataType;

    public Property(String varType, String name, String dataType) {
        this.varType = varType;
        this.name = name;
        this.dataType = dataType;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    // ✅ لتفادي الخطأ الذي حصل مع getType()
    public String getType() {
        return dataType;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Property:");
        System.out.println(indent + "  varType: " + varType);
        System.out.println(indent + "  name: " + name);
        System.out.println(indent + "  dataType: " + dataType);
    }

}
