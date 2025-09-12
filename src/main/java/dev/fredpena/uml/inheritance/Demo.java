package dev.fredpena.uml.inheritance;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:23
 */
public class Demo {
    public static void main(String[] args) {
        Autobus bus = new Autobus("Autobús Escolar", 50);
        Taxi taxi = new Taxi("Taxi Amarillo", "TX-1234");
        Automovil coche = new Automovil("Toyota Corolla", "Juan Pérez");

        // Todos heredan conducir()
        bus.conducir();
        taxi.conducir();
        coche.conducir();

        // Métodos específicos de cada subclase
        bus.recogerPasajeros();
        taxi.cobrarPasaje();
        coche.estacionar();
    }
}
