package dev.fredpena.uml.association;

import java.util.ArrayList;
import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 09:06
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private List<Coche> coches; // Un conductor puede tener varios coches

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.coches = new ArrayList<>();
    }

    // Operación: asignar coche al conductor
    public void agregarCoche(Coche coche) {
        coches.add(coche);
        coche.setConductor(this); // mantenemos la asociación bidireccional
    }

    public void mostrarCoches() {
        System.out.println(nombre + " conduce los siguientes coches:");
        for (Coche coche : coches) {
            System.out.println("- " + coche.getMarca());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
}