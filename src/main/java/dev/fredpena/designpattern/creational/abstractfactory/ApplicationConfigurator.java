package dev.fredpena.designpattern.creational.abstractfactory;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:58
 */
public class ApplicationConfigurator {

    public static void main(String[] args) {
        GUIFactory factory = selectFactory();
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }

    /**
     * Selecciona la fábrica según:
     * -Dapp.os=Windows   -> WinFactory
     * -Dapp.os=Mac       -> MacFactory
     * (si no se pasa, intenta inferir por os.name)
     */
    private static GUIFactory selectFactory() {
        String desired = System.getProperty("app.os");
        if (desired != null) {
            if (desired.equalsIgnoreCase("Windows")) return new WinFactory();
            if (desired.equalsIgnoreCase("Mac")) return new MacFactory();
        }
        String jvmOs = System.getProperty("os.name", "").toLowerCase();
        if (jvmOs.contains("win")) return new WinFactory();
        if (jvmOs.contains("mac")) return new MacFactory();
        // Por defecto, usamos Mac (o podrías lanzar excepción)
        return new MacFactory();
    }
}