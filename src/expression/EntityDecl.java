package expression;

import java.util.List;

public class EntityDecl implements ASTNode {
    private String name;
    private List<FieldDecl> fields;

    public EntityDecl(String name, List<FieldDecl> fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<FieldDecl> getFields() { return fields; }
    public void setFields(List<FieldDecl> fields) { this.fields = fields; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "EntityDecl: " + name);
        for (FieldDecl f : fields) {
            f.print(indent + "  ");
        }
    }
}
