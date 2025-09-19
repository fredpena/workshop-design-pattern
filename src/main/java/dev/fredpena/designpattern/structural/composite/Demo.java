package dev.fredpena.designpattern.structural.composite;

import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:22
 */
public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.load();

        // Simula selección de elementos (p. ej., todos los actuales):
        CompoundGraphic all = editor.getAll();
        List<Graphic> selected = List.copyOf(all.getChildren());

        // Agrupar seleccionados en un compuesto:
        editor.groupSelected(selected);

        // Mover todo el conjunto:
        all.move(10, 5);
        all.draw();
    }
}