package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:31
 */
public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
