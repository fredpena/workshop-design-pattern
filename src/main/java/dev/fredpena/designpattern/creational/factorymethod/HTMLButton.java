package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:31
 */
public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Renderizando botón HTML</button>");
    }

    @Override
    public void onClick(Runnable handler) {
        System.out.println("[HTMLButton] Vinculando evento de clic del navegador");
        if (handler != null) handler.run();
    }
}
