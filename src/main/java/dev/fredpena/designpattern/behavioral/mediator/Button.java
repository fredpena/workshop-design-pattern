package dev.fredpena.designpattern.behavioral.mediator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:36
 */
public class Button extends Component {
    private final String text;

    public Button(Mediator dialog, String text) {
        super(dialog);
        this.text = text;
    }

    public String getText() { return text; }
}
