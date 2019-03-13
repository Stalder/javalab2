package markdown;

import java.util.List;

public class Paragraph extends MarkdownWrapper {
    protected String openingTag;
    protected String closingTag;
    private List<MarkdownItem> children;

    public Paragraph(List<MarkdownItem> children) {
        this.children = children;
        this.openingTag = "";
        this.closingTag = "";
    }
}