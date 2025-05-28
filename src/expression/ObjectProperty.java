package expression;





public class ObjectProperty {
    private String key;
    private ExpressionNode value;

    public ObjectProperty(String key, ExpressionNode value) {
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

    public void print(String indent) {
        System.out.println(indent + key + ":");
        value.print(indent + "  ");
    }
}
