package expression;

public class EnumAccessNode implements ASTNode {
    private String keyword;
    private String enumIdentifier;
    private String valueIdentifier;

    public EnumAccessNode(String keyword, String enumIdentifier, String valueIdentifier) {
        this.keyword = keyword;
        this.enumIdentifier = enumIdentifier;
        this.valueIdentifier = valueIdentifier;
    }

    // Getters
    public String getKeyword() { return keyword; }
    public String getEnumIdentifier() { return enumIdentifier; }
    public String getValueIdentifier() { return valueIdentifier; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "EnumAccess:");
        System.out.println(indent + "  Keyword: " + keyword);
        System.out.println(indent + "  Enum Identifier: " + enumIdentifier);
        System.out.println(indent + "  Value Identifier: " + valueIdentifier);
    }
}