package expression;

import java.util.List;

public class AwaitDefNode implements ASTNode {
    private String keyword;
    private String identifier;
    private List<String> dotIdentifiers;
    private ASTNode block;
    private String optionalIdentifier;
    private String optionalMethodCall;

    public AwaitDefNode(String keyword, String identifier, List<String> dotIdentifiers, ASTNode block, String optionalIdentifier, String optionalMethodCall) {
        this.keyword = keyword;
        this.identifier = identifier;
        this.dotIdentifiers = dotIdentifiers;
        this.block = block;
        this.optionalIdentifier = optionalIdentifier;
        this.optionalMethodCall = optionalMethodCall;
    }

    // Getters
    public String getKeyword() { return keyword; }
    public String getIdentifier() { return identifier; }
    public List<String> getDotIdentifiers() { return dotIdentifiers; }
    public ASTNode getBlock() { return block; }
    public String getOptionalIdentifier() { return optionalIdentifier; }
    public String getOptionalMethodCall() { return optionalMethodCall; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "AwaitDef:");
        System.out.println(indent + "  Keyword: " + keyword);
        System.out.println(indent + "  Identifier: " + identifier);
        for (String dotId : dotIdentifiers) {
            System.out.println(indent + "  Dot Identifier: " + dotId);
        }
        block.prettyPrint(indent + "  ");
        if (optionalIdentifier != null) {
            System.out.println(indent + "  Optional Identifier: " + optionalIdentifier);
        }
        if (optionalMethodCall != null) {
            System.out.println(indent + "  Optional Method Call: " + optionalMethodCall);
        }
    }
}