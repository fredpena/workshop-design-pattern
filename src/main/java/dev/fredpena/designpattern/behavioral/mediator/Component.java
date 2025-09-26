package dev.fredpena.designpattern.behavioral.mediator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:36
 */
public abstract class Component {
    protected final Mediator dialog;

    protected Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public void click() {
        dialog.notify(this, "click");
    }

    public void keypress() {
        dialog.notify(this, "keypress");
    }
}
