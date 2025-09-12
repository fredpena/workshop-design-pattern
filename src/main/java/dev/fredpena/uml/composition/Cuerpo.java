package dev.fredpena.uml.composition;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 10:36
 */
public class Cuerpo {
    private int altura; // en centímetros

    public Cuerpo(int altura) {
        this.altura = altura;
    }

    public void moverse() {
        System.out.println("El cuerpo de " + altura + " cm se está moviendo.");
    }
}