package expression;

import java.util.List;

public class ClassDeclarationNode implements ASTNode {
    private List<ASTNode> decorators; // قائمة الديكورات
    private List<String> keywords; // الكلمات المفتاحية
    private String className; // اسم الفئة
    private String inheritance; // الفئة أو الواجهة التي ترث منها الفئة (إن وجدت)
    private ASTNode body; // جسم الفئة

    public ClassDeclarationNode(List<ASTNode> decorators, List<String> keywords, String className, String inheritance, ASTNode body) {
        this.decorators = decorators;
        this.keywords = keywords;
        this.className = className;
        this.inheritance = inheritance;
        this.body = body;
    }

    // Getters
    public List<ASTNode> getDecorators() {
        return decorators;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public String getClassName() {
        return className;
    }

    public String getInheritance() {
        return inheritance;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ClassDeclaration:");
        for (ASTNode decorator : decorators) {
            decorator.prettyPrint(indent + "  ");
        }
        System.out.println(indent + "  Keywords: " + String.join(", ", keywords));
        System.out.println(indent + "  Class Name: " + className);
        if (inheritance != null) {
            System.out.println(indent + "  Inheritance: " + inheritance);
        }
        System.out.println(indent + "  Body:");
        body.prettyPrint(indent + "    ");
    }
}