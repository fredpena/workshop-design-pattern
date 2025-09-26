package dev.fredpena.designpattern.behavioral.memento;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:24
 */
public interface Command {
    /**
     * Ejecuta la acción. @return true si modificó el estado (se apila en history)
     */
    boolean execute();

    void undo();
}
