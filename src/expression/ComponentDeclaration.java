package expression;


public class ComponentDeclaration implements ASTNode {
    private String decorator;
    private ComponentMetadata metadata;
    private String classAttr;
    private String identifier;
    private ClassBody body;

    public ComponentDeclaration(String decorator, ComponentMetadata metadata, String classAttr, String identifier, ClassBody body) {
        this.decorator = decorator;
        this.metadata = metadata;
        this.classAttr = classAttr;
        this.identifier = identifier;
        this.body = body;
    }

    public String getDecorator() {
        return decorator;
    }

    public void setDecorator(String decorator) {
        this.decorator = decorator;
    }

    public ComponentMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ComponentMetadata metadata) {
        this.metadata = metadata;
    }

    public String getClassAttr() {
        return classAttr;
    }

    public void setClassAttr(String classAttr) {
        this.classAttr = classAttr;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ClassBody getBody() {
        return body;
    }

    public void setBody(ClassBody body) {
        this.body = body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ComponentDeclaration:");
        System.out.println(indent + "  Decorator: " + decorator);
        metadata.print(indent + "  ");
        System.out.println(indent + "  ClassAttr: " + classAttr);
        System.out.println(indent + "  Identifier: " + identifier);
        body.print(indent + "  ");
    }

}

