package dev.fredpena.uml.dependency;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:40
 */
public class Automovil {
    private String modelo;

    public Automovil(String modelo) {
        this.modelo = modelo;
    }

    // Dependencia: este método usa Gasolina como parámetro
    public void conducir(Gasolina gasolina) {
        if (gasolina == null) {
            System.out.println("El automóvil " + modelo + " no puede conducir sin gasolina.");
        } else {
            System.out.println("El automóvil " + modelo + " está conduciendo con gasolina "
                               + gasolina.getTipo() + " de " + gasolina.getOctanaje() + " octanos.");
        }
    }
}
