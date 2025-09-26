package dev.fredpena.designpattern.behavioral.command;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 10:29
 */
public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.setClipboard(editor.getSelection());
        System.out.println("[Copy] clipboard = " + app.getClipboard());
        return false; // no cambia estado del editor
    }
}
