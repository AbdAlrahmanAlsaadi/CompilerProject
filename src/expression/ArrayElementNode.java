package expression;

public class ArrayElementNode implements ASTNode {
    private String elementType; // نوع العنصر (expression أو objectLiteral)
    private ASTNode content; // المحتوى الخاص بالعنصر

    public ArrayElementNode(String elementType, ASTNode content) {
        this.elementType = elementType;
        this.content = content;
    }

    public String getElementType() {
        return elementType;
    }

    public ASTNode getContent() {
        return content;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Array Element:");
        System.out.println(indent + "  Type: " + elementType);
        if (content != null) {
            System.out.println(indent + "  Content:");
            content.prettyPrint(indent + "    ");
        }
    }
}
