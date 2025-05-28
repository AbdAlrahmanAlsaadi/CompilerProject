package expression;




public class StringLiteral implements ExpressionNode {
    private String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "StringLiteral: \"" + value + "\"");
    }

}
