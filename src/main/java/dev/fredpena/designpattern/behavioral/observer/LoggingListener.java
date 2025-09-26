package dev.fredpena.designpattern.behavioral.observer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:47
 */
public class LoggingListener implements EventListener {
    private final Path logPath;
    private final String messageTemplate;

    public LoggingListener(String logFilename, String messageTemplate) {
        this.logPath = Path.of(logFilename);
        this.messageTemplate = messageTemplate;
    }

    @Override
    public void update(String filename) {
        String line = messageTemplate.replace("%s", filename) + System.lineSeparator();
        try (FileWriter fw = new FileWriter(logPath.toFile(), true)) {
            fw.write(line);
            System.out.println("[LOG] " + line.strip());
        } catch (IOException e) {
            throw new RuntimeException("Error writing log", e);
        }
    }
}
