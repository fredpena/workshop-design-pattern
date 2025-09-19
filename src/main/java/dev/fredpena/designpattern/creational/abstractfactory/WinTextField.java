package dev.fredpena.designpattern.creational.abstractfactory;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:57
 */
public class WinTextField implements TextField {
    @Override
    public void paint() {
        System.out.println("[WinTextField] Pintando checkbox estilo Windows");
    }
}
