package expression;

import java.util.List;

public class RouteDecl implements ASTNode {
    private String path;
    private String pageName;
    private List<Param> params;

    public RouteDecl(String path, String pageName, List<Param> params) {
        this.path = path;
        this.pageName = pageName;
        this.params = params;
    }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public String getPageName() { return pageName; }
    public void setPageName(String pageName) { this.pageName = pageName; }

    public List<Param> getParams() { return params; }
    public void setParams(List<Param> params) { this.params = params; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "RouteDecl: " + path + " -> " + pageName);
        if (params != null) {
            for (Param p : params) {
                p.print(indent + "  ");
            }
        }
    }
}
