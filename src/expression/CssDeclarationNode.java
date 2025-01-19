package expression;

import java.util.ArrayList;
import java.util.List;

public class CssDeclarationNode implements ASTNode {
    private SelectorNode selector;
    private String identifier; // Optional IDENTIFIER
    private List<CssBodyNode> cssBodies;

    public CssDeclarationNode(SelectorNode selector, String identifier, List<CssBodyNode> cssBodies) {
        this.selector = selector;
        this.identifier = identifier;
        this.cssBodies = cssBodies;
    }

    public SelectorNode getSelector() {
        return selector;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<CssBodyNode> getCssBodies() {
        return cssBodies;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CSS Declaration:");
        selector.prettyPrint(indent + "  ");
        if (identifier != null) {
            System.out.println(indent + "  Identifier: " + identifier);
        }
        for (CssBodyNode body : cssBodies) {
            body.prettyPrint(indent + "  ");
        }
    }
}
