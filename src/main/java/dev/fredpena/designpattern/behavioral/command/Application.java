package dev.fredpena.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 10:31
 */
public class Application {
    private String clipboard = "";
    private final List<Editor> editors = new ArrayList<>();
    private Editor activeEditor;
    private final CommandHistory history = new CommandHistory();

    public void addEditor(Editor e) {
        editors.add(e);
        if (activeEditor == null) activeEditor = e;
    }

    public void setActiveEditor(Editor e) {
        this.activeEditor = e;
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String s) {
        this.clipboard = s;
    }

    public void createUI() {
        // Botones/atajos simulados con lambdas:
        Runnable copy = () -> executeCommand(new CopyCommand(this, activeEditor));
        Runnable cut = () -> executeCommand(new CutCommand(this, activeEditor));
        Runnable paste = () -> executeCommand(new PasteCommand(this, activeEditor));
        Runnable undo = () -> executeCommand(new UndoCommand(this, activeEditor));

        // DEMO (equivalente a pulsar botones / atajos):
        System.out.println("== DEMO ==");
        activeEditor.setText("Hello World");
        System.out.println("Text = " + activeEditor.getText());

        copy.run();   // copia "Hello World"
        cut.run();    // borra texto
        paste.run();  // pega "Hello World"
        undo.run();   // deshacer paste → vuelve a vacío
        undo.run();   // deshacer cut   → vuelve a "Hello World"
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command c = history.pop();
        if (c != null) {
            c.undo();
            System.out.println("[Undo] editor = " + activeEditor.getText());
        } else {
            System.out.println("[Undo] nothing to undo");
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        Editor editor = new Editor();
        app.addEditor(editor);
        app.createUI();
    }
}
