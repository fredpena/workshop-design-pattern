package dev.fredpena.designpattern.creational.abstractfactory;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:57
 */
public class MacTextField implements TextField {
    @Override
    public void paint() {
        System.out.println("[MacTextField] Pintando checkbox estilo macOS");
    }
}