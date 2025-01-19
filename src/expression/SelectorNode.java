package expression;

import java.util.ArrayList;
import java.util.List;

public class SelectorNode implements ASTNode {
    private List<SimpleSelectorNode> simpleSelectors;

    public SelectorNode(List<SimpleSelectorNode> simpleSelectors) {
        this.simpleSelectors = simpleSelectors;
    }

    public List<SimpleSelectorNode> getSimpleSelectors() {
        return simpleSelectors;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Selector:");
        for (SimpleSelectorNode selector : simpleSelectors) {
            selector.prettyPrint(indent + "  ");
        }
    }
}
