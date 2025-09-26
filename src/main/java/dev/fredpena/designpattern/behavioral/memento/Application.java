package dev.fredpena.designpattern.behavioral.memento;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:25
 */
public class Application {
    private final Editor editor = new Editor();
    private final CommandHistory history = new CommandHistory();

    public void execute(Command cmd) {
        if (cmd.execute()) {
            history.push(cmd);
        }
    }

    public void undo() {
        Command c = history.pop();
        if (c != null) c.undo();
        else System.out.println("[Undo] nothing to undo");
    }

    public Editor getEditor() {
        return editor;
    }

    public static void main(String[] args) {
        Application app = new Application();
        Editor ed = app.getEditor();

        System.out.println("Initial: " + ed);

        app.execute(new ReplaceTextCommand(app, ed, "Hola mundo"));
        app.execute(new MoveCursorCommand(app, ed, 10, 5));
        app.execute(new SetSelectionWidthCommand(app, ed, 7));

        // Deshacer 3 veces
        app.undo();
        app.undo();
        app.undo();
        app.undo(); // pila vacía
    }
}
