package expression;

public class DecoratorNode implements ASTNode {
    private String decoratorType; // نوع الديكوراتور (الكلمة المفتاحية الأولى)
    private String decoratorName; // اسم الديكوراتور (الكلمة المفتاحية الثانية أو المعرف)
    private ASTNode body; // جسم الديكوراتور

    public DecoratorNode(String decoratorType, String decoratorName, ASTNode body) {
        this.decoratorType = decoratorType;
        this.decoratorName = decoratorName;
        this.body = body;
    }

    // Getters
    public String getDecoratorType() {
        return decoratorType;
    }

    public String getDecoratorName() {
        return decoratorName;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Decorator:");
        System.out.println(indent + "  Type: " + decoratorType);
        System.out.println(indent + "  Name: " + decoratorName);
        System.out.println(indent + "  Body:");
        body.prettyPrint(indent + "    ");
    }
}