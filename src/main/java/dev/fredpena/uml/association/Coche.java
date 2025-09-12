package dev.fredpena.uml.association;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:07
 */
public class Coche {
    private String marca;
    private String modelo;
    private Conductor conductor; // Asociación con Conductor

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }


    public String getMarca() {
        return marca;
    }

    public void mostrarConductor() {
        if (conductor != null) {
            System.out.println("El coche " + marca + " " + modelo +
                               " es conducido por " + conductor.getNombre());
        } else {
            System.out.println("El coche " + marca + " " + modelo + " no tiene conductor asignado.");
        }
    }
}