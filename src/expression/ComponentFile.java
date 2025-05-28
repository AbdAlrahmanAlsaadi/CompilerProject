package expression;


import java.util.List;

public class ComponentFile implements ASTNode {
    private List<Imports> imports;
    private ComponentDeclaration componentDeclaration;

    public ComponentFile(List<Imports> imports, ComponentDeclaration componentDeclaration) {
        this.imports = imports;
        this.componentDeclaration = componentDeclaration;
    }

    public List<Imports> getImports() {
        return imports;
    }

    public void setImports(List<Imports> imports) {
        this.imports = imports;
    }

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ComponentFile:");
        for (Imports imp : imports) {
            imp.print(indent + "  ");
        }
        componentDeclaration.print(indent + "  ");
//    }
//    @Override
//    public void accept(ASTVisitor visitor) {
//        visitor.visit(this);
//    }
    }
}