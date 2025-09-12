package dev.fredpena.uml.inheritance;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:23
 */
public class Automovil extends Coche {
    private String propietario;

    public Automovil(String nombre, String propietario) {
        super(nombre);
        this.propietario = propietario;
    }

    public void estacionar() {
        System.out.println(nombre + " pertenece a " + propietario + " y está estacionado.");
    }
}
