package dev.fredpena.uml.implementation;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:32
 */
public class Barco implements Vehiculo {
    private String nombre;

    public Barco(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mover() {
        System.out.println("El barco " + nombre + " navega por el mar.");
    }

    @Override
    public void detener() {
        System.out.println("El barco " + nombre + " ha anclado.");
    }
}
