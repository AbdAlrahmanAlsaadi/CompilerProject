package expression;

import java.util.List;

public class ListBodyNode implements ASTNode {
    private List<ASTNode> parameterLists;

    public ListBodyNode(List<ASTNode> parameterLists) {
        this.parameterLists = parameterLists;
    }

    // Getter
    public List<ASTNode> getParameterLists() { return parameterLists; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ListBody:");
        for (ASTNode parameterList : parameterLists) {
            parameterList.prettyPrint(indent + "  ");
        }
    }
}