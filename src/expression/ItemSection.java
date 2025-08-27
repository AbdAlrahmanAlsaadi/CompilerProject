package expression;

public class ItemSection implements ASTNode {
    private String imgField;
    private String titleField;
    private String subtitleField;
    private String onClickPage;

    public ItemSection(String imgField, String titleField, String subtitleField, String onClickPage) {
        this.imgField = imgField;
        this.titleField = titleField;
        this.subtitleField = subtitleField;
        this.onClickPage = onClickPage;
    }

    public String getImgField() { return imgField; }
    public void setImgField(String imgField) { this.imgField = imgField; }

    public String getTitleField() { return titleField; }
    public void setTitleField(String titleField) { this.titleField = titleField; }

    public String getSubtitleField() { return subtitleField; }
    public void setSubtitleField(String subtitleField) { this.subtitleField = subtitleField; }

    public String getOnClickPage() { return onClickPage; }
    public void setOnClickPage(String onClickPage) { this.onClickPage = onClickPage; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ItemSection:");
        if (imgField != null) System.out.println(indent + "  img: " + imgField);
        if (titleField != null) System.out.println(indent + "  title: " + titleField);
        if (subtitleField != null) System.out.println(indent + "  subtitle: " + subtitleField);
        if (onClickPage != null) System.out.println(indent + "  onClick -> " + onClickPage);
    }
}
