package dev.fredpena.uml.aggregation;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 10:03
 */
public class Demo {
    public static void main(String[] args) {
        // Objetos independientes
        Ropa ropaAzul = new Ropa("azul");
        Sombrero sombreroCasco = new Sombrero("casco de seguridad");

        // El mismo equipamiento puede ser usado por distintos conductores
        Conductor juan = new Conductor("Juan", ropaAzul, sombreroCasco);
        Conductor maria = new Conductor("María", ropaAzul, sombreroCasco);

        juan.mostrarEquipamiento();
        maria.mostrarEquipamiento();
    }
}
