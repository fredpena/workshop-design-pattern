package dev.fredpena.designpattern.behavioral.memento;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:24
 */
public class ReplaceTextCommand implements Command {
    private final Application app;
    private final Editor editor;
    private final String newText;
    private Editor.Snapshot backup;

    public ReplaceTextCommand(Application app, Editor editor, String newText) {
        this.app = app;
        this.editor = editor;
        this.newText = newText;
    }

    @Override
    public boolean execute() {
        backup = editor.createSnapshot();
        editor.setText(newText);
        System.out.println("[ReplaceText] " + editor);
        return true;
    }

    @Override
    public void undo() {
        if (backup != null) backup.restore();
        System.out.println("[Undo ReplaceText] " + editor);
    }
}
