package expression;

import java.util.List;

public class PropertyDeclarationNode implements ASTNode {
    private List<String> keywords; // قائمة الكلمات المفتاحية
    private String identifier; // المعرف
    private ASTNode type; // النوع
    private ASTNode expression; // التعبير (إن وجد)

    public PropertyDeclarationNode(List<String> keywords, String identifier, ASTNode type, ASTNode expression) {
        this.keywords = keywords;
        this.identifier = identifier;
        this.type = type;
        this.expression = expression;
    }

    // Getters
    public List<String> getKeywords() {
        return keywords;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ASTNode getType() {
        return type;
    }

    public ASTNode getExpression() {
        return expression;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "PropertyDeclaration:");
        if (keywords != null && !keywords.isEmpty()) {
            System.out.println(indent + "  Keywords: " + String.join(", ", keywords));
        }
        System.out.println(indent + "  Identifier: " + identifier);
        System.out.println(indent + "  Type:");
        type.prettyPrint(indent + "    ");
        if (expression != null) {
            System.out.println(indent + "  Expression:");
            expression.prettyPrint(indent + "    ");
        }
    }
}