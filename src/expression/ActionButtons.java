package expression;

public class ActionButtons implements ASTNode {
    private String editPage;
    private String deleteAction;

    public ActionButtons(String editPage, String deleteAction) {
        this.editPage = editPage;
        this.deleteAction = deleteAction;
    }

    public String getEditPage() { return editPage; }
    public void setEditPage(String editPage) { this.editPage = editPage; }

    public String getDeleteAction() { return deleteAction; }
    public void setDeleteAction(String deleteAction) { this.deleteAction = deleteAction; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ActionButtons:");
        if (editPage != null) System.out.println(indent + "  edit -> " + editPage);
        if (deleteAction != null) System.out.println(indent + "  delete -> " + deleteAction);
    }
}
