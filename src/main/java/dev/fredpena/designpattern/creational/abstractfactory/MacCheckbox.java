package dev.fredpena.designpattern.creational.abstractfactory;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:57
 */
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("[MacCheckbox] Pintando checkbox estilo macOS");
    }
}