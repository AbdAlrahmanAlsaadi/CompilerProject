package expression;

public class FormSection implements ASTNode {
    private String entityRef;

    public FormSection(String entityRef) {
        this.entityRef = entityRef;
    }

    public String getEntityRef() { return entityRef; }
    public void setEntityRef(String entityRef) { this.entityRef = entityRef; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "FormSection: " + entityRef);
    }
}
