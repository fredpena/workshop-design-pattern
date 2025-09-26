package dev.fredpena.designpattern.behavioral.command;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 10:30
 */
public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.getClipboard());
        System.out.println("[Paste] editor = " + editor.getText());
        return true; // cambió estado
    }
}
