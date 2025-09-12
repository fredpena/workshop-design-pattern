package dev.fredpena.designpattern.creational.factorymethod;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:32
 */
public final class Config {
    private Config() {}

    /**
     * Detección simple:
     * - Propiedad del sistema "app.os" con valores "Windows" o "Web" tiene prioridad.
     * - Si no se pasa, intenta inferir desde os.name de la JVM.
     */
    public static OS detectOS() {
        String target = System.getProperty("app.os"); // ej: -Dapp.os=Windows
        if (target != null) {
            if (target.equalsIgnoreCase("Windows")) return OS.WINDOWS;
            if (target.equalsIgnoreCase("Web"))     return OS.WEB;
        }
        String jvmOs = System.getProperty("os.name", "").toLowerCase();
        if (jvmOs.contains("win")) return OS.WINDOWS;
        return OS.WEB; // por defecto, tratamos como Web
    }
}
