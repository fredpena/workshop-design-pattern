package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:31
 */
public class WebDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HTMLButton();
    }
}
