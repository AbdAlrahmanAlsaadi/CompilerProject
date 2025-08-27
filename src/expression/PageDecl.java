package expression;

import java.util.List;

public class PageDecl implements ASTNode {
    private String name;
    private List<ASTNode> body;

    public PageDecl(String name, List<ASTNode> body) {
        this.name = name;
        this.body = body;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<ASTNode> getBody() { return body; }
    public void setBody(List<ASTNode> body) { this.body = body; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "PageDecl: " + name);
        for (ASTNode part : body) {
            part.print(indent + "  ");
        }
    }
}
