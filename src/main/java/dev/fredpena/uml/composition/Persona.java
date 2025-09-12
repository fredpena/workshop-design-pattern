package dev.fredpena.uml.composition;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 10:36
 */
public class Persona {
    private String nombre;
    private Cabeza cabeza; // Composición: creado y controlado por Persona
    private Cuerpo cuerpo; // Composición: creado y controlado por Persona

    public Persona(String nombre, String colorOjos, int altura) {
        this.nombre = nombre;
        this.cabeza = new Cabeza(colorOjos); // la persona crea sus partes
        this.cuerpo = new Cuerpo(altura);
    }

    public void vivir() {
        System.out.println(nombre + " está viviendo su día:");
        cabeza.pensar();
        cuerpo.moverse();
    }
}