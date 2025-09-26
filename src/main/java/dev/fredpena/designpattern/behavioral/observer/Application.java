package dev.fredpena.designpattern.behavioral.observer;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:47
 */
public class Application {
    public void config() {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener(
                "app.log",
                "Someone has opened the file: %s"
        );
        editor.events.subscribe("open", logger);

        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s"
        );
        editor.events.subscribe("save", emailAlerts);

        // DEMO
        editor.openFile("notes.txt");
        editor.saveFile();
        editor.saveFile();

        // Desuscribir si no quieres más alertas
        editor.events.unsubscribe("save", emailAlerts);
        editor.saveFile(); // ya no enviará email
    }

    public static void main(String[] args) {
        new Application().config();
    }
}