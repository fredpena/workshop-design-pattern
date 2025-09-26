package dev.fredpena.designpattern.behavioral.mediator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:35
 */
public interface Mediator {
    void notify(Component sender, String event);
}
