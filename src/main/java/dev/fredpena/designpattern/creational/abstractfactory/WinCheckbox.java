package dev.fredpena.designpattern.creational.abstractfactory;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:57
 */
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("[WinCheckbox] Pintando checkbox estilo Windows");
    }
}
