package expression;

public class AccessModifierNode implements ASTNode {
    private String modifier; // محدد الوصول (مثل public, private)

    public AccessModifierNode(String modifier) {
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
