package dev.fredpena.designpattern.behavioral.command;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 10:29
 */
public class Editor {
    private String text = "";

    public String getSelection() {
        // Para la demo: devolvemos todo el contenido.
        return text;
    }

    public void deleteSelection() {
        // Para la demo: borra todo.
        text = "";
    }

    public void replaceSelection(String s) {
        // Para la demo: sustituye todo por s.
        text = s;
    }

    public String getText() {
        return text;
    }

    public void setText(String s) {
        text = s;
    }
}
