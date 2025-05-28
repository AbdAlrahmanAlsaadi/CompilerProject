package expression;


import java.util.List;


public class ArrayLiteral implements expression.ExpressionNode {
    private List<String> items;

    public ArrayLiteral(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ArrayLiteral:");
        for (String item : items) {
            System.out.println(indent + "  - " + item);
        }
    }



}
