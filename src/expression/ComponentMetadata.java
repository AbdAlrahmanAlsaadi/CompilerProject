package expression;


import java.util.List;

public class ComponentMetadata implements ASTNode {
    private List<ComponentProperty> properties;

    public ComponentMetadata(List<ComponentProperty> properties) {
        this.properties = properties;
    }

    public List<ComponentProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ComponentProperty> properties) {
        this.properties = properties;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ComponentMetadata:");
        for (ComponentProperty prop : properties) {
            prop.print(indent + "  ");
        }
    }

}
