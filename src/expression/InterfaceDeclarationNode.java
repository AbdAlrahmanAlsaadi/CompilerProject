package expression;

import java.util.List;

public class InterfaceDeclarationNode implements ASTNode {
    private List<String> keywords; // الكلمات المفتاحية
    private String interfaceName; // اسم الواجهة
    private ASTNode body; // جسم الواجهة

    public InterfaceDeclarationNode(List<String> keywords, String interfaceName, ASTNode body) {
        this.keywords = keywords;
        this.interfaceName = interfaceName;
        this.body = body;
    }

    // Getters
    public List<String> getKeywords() {
        return keywords;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "InterfaceDeclaration:");
        System.out.println(indent + "  Keywords: " + String.join(", ", keywords));
        System.out.println(indent + "  Interface Name: " + interfaceName);
        System.out.println(indent + "  Body:");
        body.prettyPrint(indent + "    ");
    }
}