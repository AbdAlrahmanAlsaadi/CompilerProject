package expression;

public class TypeItemNode implements ASTNode {
    private String type;

    public TypeItemNode(String type) {
        this.type = type;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Type Item: " + type);
    }
}
