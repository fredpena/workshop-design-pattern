package dev.fredpena.designpattern.creational.abstractfactory;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:57
 */
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("[WinButton] Pintando botón estilo Windows");
    }
}
