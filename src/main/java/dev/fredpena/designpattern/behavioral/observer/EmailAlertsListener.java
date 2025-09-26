package dev.fredpena.designpattern.behavioral.observer;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:47
 */
public class EmailAlertsListener implements EventListener {
    private final String email;
    private final String messageTemplate;

    public EmailAlertsListener(String email, String messageTemplate) {
        this.email = email;
        this.messageTemplate = messageTemplate;
    }

    @Override
    public void update(String filename) {
        String body = messageTemplate.replace("%s", filename);
        // Simulación de envío de email:
        System.out.printf("[EMAIL] to %s: %s%n", email, body);
    }
}
