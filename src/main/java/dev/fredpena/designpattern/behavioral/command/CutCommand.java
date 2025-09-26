package dev.fredpena.designpattern.behavioral.command;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 10:30
 */
public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        editor.deleteSelection();
        System.out.println("[Cut] clipboard = " + app.getClipboard());
        return true; // cambió estado
    }
}
