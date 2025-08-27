package expression;

import java.util.List;

public class ActionSig implements ASTNode {
    private String name;
    private List<Param> params;

    public ActionSig(String name, List<Param> params) {
        this.name = name;
        this.params = params;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Param> getParams() { return params; }
    public void setParams(List<Param> params) { this.params = params; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ActionSig: " + name);
        if (params != null) {
            for (Param p : params) {
                p.print(indent + "  ");
            }
        }
    }
}
