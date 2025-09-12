package dev.fredpena.uml.dependency;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:41
 */
public class Demo {
    public static void main(String[] args) {
        Automovil coche = new Automovil("Toyota Corolla");
        Gasolina premium = new Gasolina("Premium", 95);

        coche.conducir(premium);   // Usa gasolina para funcionar
        coche.conducir(null);      // No puede conducir sin gasolina
    }
}
