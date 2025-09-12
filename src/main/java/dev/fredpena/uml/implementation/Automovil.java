package dev.fredpena.uml.implementation;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:32
 */
public class Automovil implements Vehiculo {
    private String modelo;

    public Automovil(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println("El automóvil " + modelo + " circula por la carretera.");
    }

    @Override
    public void detener() {
        System.out.println("El automóvil " + modelo + " se ha detenido.");
    }
}
