package dev.fredpena.uml.implementation;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:33
 */
public class Demo {
    public static void main(String[] args) {
        Vehiculo auto = new Automovil("Toyota Corolla");
        Vehiculo barco = new Barco("Titanic");

        auto.mover();
        auto.detener();

        barco.mover();
        barco.detener();
    }
}
