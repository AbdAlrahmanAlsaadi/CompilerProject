package expression;


import java.util.List;

public class Method implements ASTNode {
    private String name;
    private List<Parameter> parameters;
    private MethodBody body;

    public Method(String name, List<Parameter> parameters, MethodBody body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public MethodBody getBody() {
        return body;
    }

    public void setBody(MethodBody body) {
        this.body = body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Method:");
        System.out.println(indent + "  name: " + name);
        for (Parameter param : parameters) {
            param.print(indent + "    ");
        }
        body.print(indent + "  ");
    }
//    @Override
//    public void accept(ASTVisitor visitor) {
//        visitor.visit(this);
//    }
}
