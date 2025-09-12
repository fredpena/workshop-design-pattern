package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:31
 */
public abstract class Dialog {

    /** Factory Method */
    protected abstract Button createButton();

    /** Lógica de negocio que usa el producto devuelto por el Factory Method */
    public void render() {
        Button okButton = createButton();
        okButton.onClick(this::closeDialog);
        okButton.render();
    }

    protected void closeDialog() {
        System.out.println("[Dialog] Cerrando diálogo...");
    }
}
