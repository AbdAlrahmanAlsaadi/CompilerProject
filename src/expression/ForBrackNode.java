package expression;

public class ForBrackNode implements ASTNode {
    private String initializer; // المُهيئ
    private String condition; // الشرط
    private ASTNode statement; // العبارة

    public ForBrackNode(String initializer, String condition, ASTNode statement) {
        this.initializer = initializer;
        this.condition = condition;
        this.statement = statement;
    }

    // Getters
    public String getInitializer() {
        return initializer;
    }

    public String getCondition() {
        return condition;
    }

    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ForBrack:");
        System.out.println(indent + "  Initializer: " + initializer);
        System.out.println(indent + "  Condition: " + condition);
        System.out.println(indent + "  Statement:");
        statement.prettyPrint(indent + "    ");
    }
}