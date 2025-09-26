package dev.fredpena.designpattern.behavioral.mediator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:36
 */
public class Textbox extends Component {
    private final String placeholder;
    private String text = "";

    public Textbox(Mediator dialog, String placeholder) {
        super(dialog);
        this.placeholder = placeholder;
    }

    public void setText(String t) {
        this.text = t;
        dialog.notify(this, "change");
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Textbox{" + placeholder + "='" + text + "'}";
    }
}
