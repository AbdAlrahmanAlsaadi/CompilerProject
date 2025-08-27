package expression;

import java.util.List;

public class ActionsDecl implements ASTNode {
    private List<ActionSig> actions;

    public ActionsDecl(List<ActionSig> actions) {
        this.actions = actions;
    }

    public List<ActionSig> getActions() { return actions; }
    public void setActions(List<ActionSig> actions) { this.actions = actions; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ActionsDecl:");
        for (ActionSig a : actions) {
            a.print(indent + "  ");
        }
    }
}
