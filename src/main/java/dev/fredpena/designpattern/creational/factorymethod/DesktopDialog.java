package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 12/09/2025  - 17:17
 */
public class DesktopDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new DesktopButton();
    }
}
