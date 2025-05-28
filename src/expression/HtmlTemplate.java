package expression;




import java.util.List;

public class HtmlTemplate implements HtmlChildNode {
    private String tagName;
    private List<HtmlChildNode> children;

    public HtmlTemplate(String tagName, List<HtmlChildNode> children) {
        this.tagName = tagName;
        this.children = children;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlChildNode> getChildren() {
        return children;
    }

    public void setChildren(List<HtmlChildNode> children) {
        this.children = children;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "<" + tagName + ">");
        for (HtmlChildNode child : children) {
            child.print(indent + "  ");
        }
        System.out.println(indent + "</" + tagName + ">");
    }

}
