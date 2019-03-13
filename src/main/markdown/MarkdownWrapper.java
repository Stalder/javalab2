package markdown;

import java.util.List;

public class MarkdownWrapper extends MarkdownItem {
    protected String openingTag;
    protected String closingTag;
    private List<MarkdownItem> children;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.openingTag);
        for (MarkdownItem child : children) {
            sb.append(child.toString());
        }
        sb.append(this.closingTag);

        return sb.toString();
    }

}