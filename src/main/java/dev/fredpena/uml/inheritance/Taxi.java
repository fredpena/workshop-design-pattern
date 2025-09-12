package dev.fredpena.uml.inheritance;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:22
 */
public class Taxi extends Coche {
    private String numeroLicencia;

    public Taxi(String nombre, String numeroLicencia) {
        super(nombre);
        this.numeroLicencia = numeroLicencia;
    }

    public void cobrarPasaje() {
        System.out.println(nombre + " cobra el pasaje con licencia " + numeroLicencia);
    }
}
