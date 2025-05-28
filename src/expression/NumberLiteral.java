package expression;


public class NumberLiteral implements ExpressionNode {
    private String value;

    public NumberLiteral(String value) {
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
        System.out.println(indent + "NumberLiteral: " + value);
    }

}