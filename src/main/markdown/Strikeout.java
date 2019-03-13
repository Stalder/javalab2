package markdown;

import java.util.List;

public class Strikeout extends MarkdownWrapper {
    protected String openingTag;
    protected String closingTag;
    private List<MarkdownItem> children;

    public Strikeout(List<MarkdownItem> children) {
        this.children = children;
        this.openingTag = "<s>";
        this.closingTag = "</s>";
    }
}