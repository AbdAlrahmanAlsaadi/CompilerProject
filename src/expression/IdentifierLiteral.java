package expression;

public class IdentifierLiteral {
    private String name;

    public IdentifierLiteral(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(String indent) {
        System.out.println(indent + "Identifier: " + name);
    }
}
