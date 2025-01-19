package expression;

import java.util.ArrayList;
import java.util.List;

public class ListBodyBodyNode implements ASTNode {
    private List<ParameterListNode> parameterLists;

    public ListBodyBodyNode(List<ParameterListNode> parameterLists) {
        this.parameterLists = parameterLists;
    }

    public List<ParameterListNode> getParameterLists() {
        return parameterLists;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "List Body:");
        for (ParameterListNode parameterList : parameterLists) {
            parameterList.prettyPrint(indent + "  ");
        }
    }
}
