package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:30
 */
public interface Button {
    void render();
    void onClick(Runnable handler);
}
