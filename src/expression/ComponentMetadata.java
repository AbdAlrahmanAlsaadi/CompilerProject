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

    /**
     * ✅ إرجاع قيمة property حسب الـ key (مثلاً selector, template, styleUrls)
     */
    public String getPropertyValue(String key) {
        if (properties == null) return null;

        for (ComponentProperty prop : properties) {
            if (prop.getKey().equals(key)) {
                if (prop.getValue() == null) return null;

                if (prop.getValue() instanceof StringLiteral) {
                    return ((StringLiteral) prop.getValue()).getValue();
                } else if (prop.getValue() instanceof IdentifierLiteral) {
                    return ((IdentifierLiteral) prop.getValue()).getName();
                } else {
                    return prop.getValue().toString();
                }
            }
        }
        return null; // إذا ما لقى المفتاح
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ComponentMetadata:");
        if (properties != null) {
            for (ComponentProperty prop : properties) {
                prop.print(indent + "  ");
            }
        }
    }
}
