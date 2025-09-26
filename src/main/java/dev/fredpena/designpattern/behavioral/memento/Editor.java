package dev.fredpena.designpattern.behavioral.memento;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:23
 */
public class Editor {
    private String text = "";
    private int curX = 0;
    private int curY = 0;
    private int selectionWidth = 0;

    public void setText(String text) {
        this.text = text != null ? text : "";
    }

    public void setCursor(int x, int y) {
        this.curX = x;
        this.curY = y;
    }

    public void setSelectionWidth(int width) {
        this.selectionWidth = Math.max(0, width);
    }

    /**
     * Crea un memento con el estado actual.
     */
    public Snapshot createSnapshot() {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }

    @Override
    public String toString() {
        return "Editor{text='" + text + "', cur=(" + curX + "," + curY + "), selW=" + selectionWidth + "}";
    }

    public static final class Snapshot {
        private final Editor editor;
        private final String text;
        private final int curX;
        private final int curY;
        private final int selectionWidth;

        private Snapshot(Editor editor, String text, int curX, int curY, int selectionWidth) {
            this.editor = editor;
            this.text = text;
            this.curX = curX;
            this.curY = curY;
            this.selectionWidth = selectionWidth;
        }

        public void restore() {
            editor.setText(text);
            editor.setCursor(curX, curY);
            editor.setSelectionWidth(selectionWidth);
        }
    }
}
