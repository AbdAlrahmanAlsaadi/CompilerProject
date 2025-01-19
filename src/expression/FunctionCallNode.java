package expression;

import java.util.List;

public class FunctionCallNode implements ASTNode {
    private String caller; // الكائن الذي يتم استدعاء الدالة منه (مثل object في object.method())
    private String method; // اسم الدالة أو الأسلوب
    private List<ASTNode> arguments; // قائمة الوسائط
    private ASTNode statement; // العبارة التالية (إن وجدت)

    public FunctionCallNode(String caller, String method, List<ASTNode> arguments, ASTNode statement) {
        this.caller = caller;
        this.method = method;
        this.arguments = arguments;
        this.statement = statement;
    }

    // Getters
    public String getCaller() {
        return caller;
    }

    public String getMethod() {
        return method;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "FunctionCall:");
        System.out.println(indent + "  Caller: " + caller);
        System.out.println(indent + "  Method: " + method);
        if (arguments != null && !arguments.isEmpty()) {
            System.out.println(indent + "  Arguments:");
            for (ASTNode arg : arguments) {
                arg.prettyPrint(indent + "    ");
            }
        }
        if (statement != null) {
            System.out.println(indent + "  Statement:");
            statement.prettyPrint(indent + "    ");
        }
    }
}