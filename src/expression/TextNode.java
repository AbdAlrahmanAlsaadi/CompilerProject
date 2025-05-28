package expression;



public class TextNode implements HtmlChildNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + text);
    }

}
