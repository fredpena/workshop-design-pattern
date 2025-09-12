package dev.fredpena.uml.aggregation;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 10:03
 */
public class Conductor {
    private String nombre;
    private Ropa ropa;   // Agregación: puede existir sin el conductor
    private Sombrero sombrero;  // Agregación: puede existir sin el conductor

    public Conductor(String nombre, Ropa ropa, Sombrero sombrero) {
        this.nombre = nombre;
        this.ropa = ropa;
        this.sombrero = sombrero;
    }

    public void mostrarEquipamiento() {
        System.out.println(nombre + " conduce con ropa de color " + ropa.getColor() +
                           " y un sombrero tipo " + sombrero.getTipo());
    }
}