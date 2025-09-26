package dev.fredpena.designpattern.behavioral.memento;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:24
 */
public class MoveCursorCommand implements Command {
    private final Application app;
    private final Editor editor;
    private final int x, y;
    private Editor.Snapshot backup;

    public MoveCursorCommand(Application app, Editor editor, int x, int y) {
        this.app = app; this.editor = editor; this.x = x; this.y = y;
    }

    @Override
    public boolean execute() {
        backup = editor.createSnapshot();
        editor.setCursor(x, y);
        System.out.println("[MoveCursor] " + editor);
        return true;
    }

    @Override
    public void undo() {
        if (backup != null) backup.restore();
        System.out.println("[Undo MoveCursor] " + editor);
    }
}