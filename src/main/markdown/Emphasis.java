package markdown;

import java.util.List;

public class Emphasis extends MarkdownWrapper {
    protected String openingTag;
    protected String closingTag;
    private List<MarkdownItem> children;

    public Emphasis(List<MarkdownItem> children) {
        this.children = children;
        this.openingTag = "<em>";
        this.closingTag = "</em>";
    }
}