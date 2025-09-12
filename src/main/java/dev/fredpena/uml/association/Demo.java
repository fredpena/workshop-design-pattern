package dev.fredpena.uml.association;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:08
 */
public class Demo {
    public static void main(String[] args) {
        Conductor juan = new Conductor("Juan Pérez", "LIC1234");

        Coche toyota = new Coche("Toyota", "Corolla");
        Coche honda = new Coche("Honda", "Civic");

        // Asociamos coches al conductor
        juan.agregarCoche(toyota);
        juan.agregarCoche(honda);

        // Mostrar resultados
        toyota.mostrarConductor();
        honda.mostrarConductor();
        juan.mostrarCoches();
    }
}
