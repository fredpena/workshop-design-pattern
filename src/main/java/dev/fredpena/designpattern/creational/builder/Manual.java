package dev.fredpena.designpattern.creational.builder;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:16
 */
public class Manual {
    private final StringBuilder content = new StringBuilder();

    public void addSection(String text) {
        content.append(text).append("\n");
    }

    @Override
    public String toString() {
        return "=== Manual del Vehículo ===\n" + content.toString();
    }
}
