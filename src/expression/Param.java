package expression;

public class Param implements ASTNode {
    private String name;
    private String type;

    public Param(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Param: " + name + " : " + type);
    }
}
