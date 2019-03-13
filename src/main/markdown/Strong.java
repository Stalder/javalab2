package markdown;

import java.util.List;

public class Strong extends MarkdownWrapper {
    protected String openingTag;
    protected String closingTag;
    private List<MarkdownItem> children;

    public Strong(List<MarkdownItem> children) {
        this.children = children;
        this.openingTag = "<strong>";
        this.closingTag = "</strong>";
    }
}