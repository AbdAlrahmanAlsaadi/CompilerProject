package expression;




import java.util.List;

public class ObjectLiteral implements expression.ExpressionNode {
    private List<ObjectProperty> properties;

    public ObjectLiteral(List<ObjectProperty> properties) {
        this.properties = properties;
    }

    public List<ObjectProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ObjectProperty> properties) {
        this.properties = properties;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ObjectLiteral:");
        for (ObjectProperty prop : properties) {
            prop.print(indent + "  ");
        }
    }
}
