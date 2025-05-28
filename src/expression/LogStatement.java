package expression;



public class LogStatement implements ASTNode {
    private String variable;

    public LogStatement(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "LogStatement:");
        System.out.println(indent + "  console.log(" + variable + ")");
    }

}
