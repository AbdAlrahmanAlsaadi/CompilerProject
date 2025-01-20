package expression;

public class AccessModifiersNode implements ASTNode {
    private String modifier;

    public AccessModifiersNode(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier() {
        return modifier;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Access Modifier: " + modifier);
    }
}
