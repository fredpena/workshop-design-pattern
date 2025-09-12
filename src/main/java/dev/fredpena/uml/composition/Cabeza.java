package dev.fredpena.uml.composition;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 10:36
 */
public class Cabeza {
    private String colorOjos;

    public Cabeza(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public void pensar() {
        System.out.println("La cabeza piensa con ojos de color " + colorOjos + ".");
    }
}