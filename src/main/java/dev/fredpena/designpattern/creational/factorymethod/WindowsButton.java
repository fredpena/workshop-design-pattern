package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:30
 */
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("[WindowsButton] Renderizando botón estilo Windows");
    }

    @Override
    public void onClick(Runnable handler) {
        System.out.println("[WindowsButton] Vinculando evento de clic nativo de Windows");
        if (handler != null) handler.run();
    }
}
