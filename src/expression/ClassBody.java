package expression;


import java.util.List;

public class ClassBody implements ASTNode {
    private List<ASTNode> members;

    public ClassBody(List<ASTNode> members) {
        this.members = members;
    }

    public List<ASTNode> getMembers() {
        return members;
    }

    public void setMembers(List<ASTNode> members) {
        this.members = members;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ClassBody:");
        for (ASTNode member : members) {
            member.print(indent + "  ");
        }
    }

}
