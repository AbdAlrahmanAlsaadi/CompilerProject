package expression;

import java.util.ArrayList;
import java.util.List;

public class CssBodyNode implements ASTNode {
    private String property;
    private List<String> values;

    public CssBodyNode(String property, List<String> values) {
        this.property = property;
        this.values = values;
    }

    public String getProperty() {
        return property;
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CSS Property: " + property);
        System.out.println(indent + "Values:");
        for (String value : values) {
            System.out.println(indent + "  - " + value);
        }
    }
}
