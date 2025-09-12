package dev.fredpena.uml.dependency;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:40
 */
public class Gasolina {
    private String tipo;
    private int octanaje;

    public Gasolina(String tipo, int octanaje) {
        this.tipo = tipo;
        this.octanaje = octanaje;
    }

    public String getTipo() {
        return tipo;
    }

    public int getOctanaje() {
        return octanaje;
    }
}
