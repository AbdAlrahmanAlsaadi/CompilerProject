package expression;



public class ClickHandler implements ASTNode {
    private String name;
    private String callTarget;
    private String argument; // قد يكون null

    public ClickHandler(String name, String callTarget, String argument) {
        this.name = name;
        this.callTarget = callTarget;
        this.argument = argument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCallTarget() {
        return callTarget;
    }

    public void setCallTarget(String callTarget) {
        this.callTarget = callTarget;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ClickHandler:");
        System.out.println(indent + "  name: " + name);
        System.out.println(indent + "  call: " + callTarget + "(" + (argument != null ? argument : "") + ")");
    }

}
