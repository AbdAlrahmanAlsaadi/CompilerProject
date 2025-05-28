package expression;


import java.util.List;

public class ComponentConstructor implements ASTNode {
    private List<Parameter> parameters;
    private MethodBody body;

    public ComponentConstructor(List<Parameter> parameters, MethodBody body) {
        this.parameters = parameters;
        this.body = body;
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
        System.out.println(indent + "ComponentConstructor:");
        for (Parameter param : parameters) {
            param.print(indent + "  ");
        }
        body.print(indent + "  ");
    }
//
}
