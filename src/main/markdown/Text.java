package markdown;

public class Text extends MarkdownItem {
    private String text;

    public Text (String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}