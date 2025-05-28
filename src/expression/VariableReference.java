package expression;


public class VariableReference implements ExpressionNode {
    private String name;

    public VariableReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "VariableReference: " + name);
    }

}
