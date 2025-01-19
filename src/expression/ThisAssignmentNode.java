package expression;

public class ThisAssignmentNode implements ASTNode {
    private String target; // الهدف (مثل this.property أو variable)
    private String value; // القيمة التي يتم تعيينها
    private String operator; // العامل المستخدم (مثل =, +=, -=)
    private String methodCall; // استدعاء الدالة (إن وجد)

    public ThisAssignmentNode(String target, String value, String operator, String methodCall) {
        this.target = target;
        this.value = value;
        this.operator = operator;
        this.methodCall = methodCall;
    }

    // Getters
    public String getTarget() {
        return target;
    }

    public String getValue() {
        return value;
    }

    public String getOperator() {
        return operator;
    }

    public String getMethodCall() {
        return methodCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ThisAssignment:");
        System.out.println(indent + "  Target: " + target);
        System.out.println(indent + "  Value: " + value);
        System.out.println(indent + "  Operator: " + operator);
        if (methodCall != null) {
            System.out.println(indent + "  Method Call: " + methodCall);
        }
    }
}