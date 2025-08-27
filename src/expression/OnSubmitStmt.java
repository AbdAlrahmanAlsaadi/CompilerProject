package expression;

public class OnSubmitStmt implements ASTNode {
    private String actionName;
    private boolean useFormObject;
    private String thenPage;

    public OnSubmitStmt(String actionName, boolean useFormObject, String thenPage) {
        this.actionName = actionName;
        this.useFormObject = useFormObject;
        this.thenPage = thenPage;
    }

    public String getActionName() { return actionName; }
    public void setActionName(String actionName) { this.actionName = actionName; }

    public boolean isUseFormObject() { return useFormObject; }
    public void setUseFormObject(boolean useFormObject) { this.useFormObject = useFormObject; }

    public String getThenPage() { return thenPage; }
    public void setThenPage(String thenPage) { this.thenPage = thenPage; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "OnSubmitStmt: dispatch " + actionName + (useFormObject ? "($form)" : ""));
        if (thenPage != null) {
            System.out.println(indent + "  then go " + thenPage);
        }
    }
}
