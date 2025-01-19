package expression;

import java.util.List;
import java.util.Map;

public class EnumLiteralNode implements ASTNode {
    private String keyword;
    private String identifier;
    private Map<String, ASTNode> enumValues;

    public EnumLiteralNode(String keyword, String identifier, Map<String, ASTNode> enumValues) {
        this.keyword = keyword;
        this.identifier = identifier;
        this.enumValues = enumValues;
    }

    // Getters
    public String getKeyword() { return keyword; }
    public String getIdentifier() { return identifier; }
    public Map<String, ASTNode> getEnumValues() { return enumValues; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "EnumLiteral:");
        System.out.println(indent + "  Keyword: " + keyword);
        System.out.println(indent + "  Identifier: " + identifier);
        for (Map.Entry<String, ASTNode> entry : enumValues.entrySet()) {
            System.out.println(indent + "  Enum Value: " + entry.getKey());
            entry.getValue().prettyPrint(indent + "    ");
        }
    }
}