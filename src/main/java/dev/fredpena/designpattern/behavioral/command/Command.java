package dev.fredpena.designpattern.behavioral.command;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 10:29
 */
public abstract class Command {
    protected final Application app;
    protected final Editor editor;
    protected String backup;

    protected Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    protected void saveBackup() {
        this.backup = editor.getText();
    }

    public void undo() {
        if (backup != null) {
            editor.setText(backup);
        }
    }

    /** @return true si cambió estado y debe ir al historial */
    public abstract boolean execute();
}
