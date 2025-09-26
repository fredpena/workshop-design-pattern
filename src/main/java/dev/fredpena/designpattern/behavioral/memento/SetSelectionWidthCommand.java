package dev.fredpena.designpattern.behavioral.memento;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:25
 */
public class SetSelectionWidthCommand implements Command {
    private final Application app;
    private final Editor editor;
    private final int width;
    private Editor.Snapshot backup;

    public SetSelectionWidthCommand(Application app, Editor editor, int width) {
        this.app = app; this.editor = editor; this.width = width;
    }

    @Override
    public boolean execute() {
        backup = editor.createSnapshot();
        editor.setSelectionWidth(width);
        System.out.println("[SetSelectionWidth] " + editor);
        return true;
    }

    @Override
    public void undo() {
        if (backup != null) backup.restore();
        System.out.println("[Undo SetSelectionWidth] " + editor);
    }
}
