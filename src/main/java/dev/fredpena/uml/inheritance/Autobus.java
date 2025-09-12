package dev.fredpena.uml.inheritance;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:22
 */
public class Autobus extends Coche {
    private int capacidadPasajeros;

    public Autobus(String nombre, int capacidadPasajeros) {
        super(nombre);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void recogerPasajeros() {
        System.out.println(nombre + " recoge hasta " + capacidadPasajeros + " pasajeros.");
    }
}
