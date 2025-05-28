package expression;

public class ComponentProperty implements ASTNode {
    private String key;
    private ExpressionNode value; // ✅ بدلاً من String

    public ComponentProperty(String key, ExpressionNode value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ExpressionNode getValue() {
        return value;
    }

    public void setValue(ExpressionNode value) {
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + key + ":");
        if (value != null)
            value.print(indent + "  ");
    }


}
