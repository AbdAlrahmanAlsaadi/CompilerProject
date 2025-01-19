package expression;

import java.util.List;

public class HtmlContentNode implements ASTNode {
    private List<String> identifiers;
    private boolean hasDot;

    public HtmlContentNode(List<String> identifiers, boolean hasDot) {
        this.identifiers = identifiers;
        this.hasDot = hasDot;
    }

    // Getters
    public List<String> getIdentifiers() { return identifiers; }
    public boolean hasDot() { return hasDot; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HtmlContent:");
        for (String identifier : identifiers) {
            System.out.println(indent + "  Identifier: " + identifier);
        }
        System.out.println(indent + "  Has Dot: " + hasDot);
    }
}