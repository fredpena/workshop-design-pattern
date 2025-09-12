package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:32
 */
public class Application {

    private Dialog dialog;

    public void initialize() {
        OS os = Config.detectOS();
        System.out.println("[Application] OS detectado: " + os);

        switch (os) {
            case WINDOWS -> dialog = new WindowsDialog();
            case WEB     -> dialog = new WebDialog();
            default      -> throw new IllegalStateException("OS no soportado: " + os);
        }
    }

    public void main() {
        initialize();
        dialog.render();
    }

    public static void main(String[] args) {
        new Application().main();
    }
}
