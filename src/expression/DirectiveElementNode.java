package expression;


import java.util.List;

public class DirectiveElementNode implements ASTNode {
    private String tagOpen;
    private List<DirectiveNode> directives;
    private List<ASTNode> contentOrDirectiveElements;
    private String tagClose;

    public DirectiveElementNode(String tagOpen, List<DirectiveNode> directives, List<ASTNode> contentOrDirectiveElements, String tagClose) {
        this.tagOpen = tagOpen;
        this.directives = directives;
        this.contentOrDirectiveElements = contentOrDirectiveElements;
        this.tagClose = tagClose;
    }

    // Getters
    public String getTagOpen() { return tagOpen; }
    public List<DirectiveNode> getDirectives() { return directives; }
    public List<ASTNode> getContentOrDirectiveElements() { return contentOrDirectiveElements; }
    public String getTagClose() { return tagClose; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "DirectiveElement:");
        System.out.println(indent + "  Tag Open: " + tagOpen);
        for (DirectiveNode directive : directives) {
            directive.prettyPrint(indent + "    ");
        }
        for (ASTNode contentOrDirective : contentOrDirectiveElements) {
            contentOrDirective.prettyPrint(indent + "    ");
        }
        System.out.println(indent + "  Tag Close: " + tagClose);
    }
}