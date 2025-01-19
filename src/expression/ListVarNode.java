package expression;

public class ListVarNode implements ASTNode {
    private String identifier;
    private ASTNode listBody;

    public ListVarNode(String identifier, ASTNode listBody) {
        this.identifier = identifier;
        this.listBody = listBody;
    }

    // Getters
    public String getIdentifier() { return identifier; }
    public ASTNode getListBody() { return listBody; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ListVar:");
        System.out.println(indent + "  Identifier: " + identifier);
        listBody.prettyPrint(indent + "  ");
    }
}