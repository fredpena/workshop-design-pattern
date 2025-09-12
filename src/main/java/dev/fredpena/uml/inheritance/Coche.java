package dev.fredpena.uml.inheritance;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:22
 */
public class Coche {
    protected String nombre;

    public Coche(String nombre) {
        this.nombre = nombre;
    }

    public void conducir() {
        System.out.println(nombre + " está en la carretera.");
    }

    public String getNombre() {
        return nombre;
    }
}