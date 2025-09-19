package dev.fredpena.designpattern.structural.composite;

import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:21
 */
public class ImageEditor {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        // ... agrega más formas si lo necesitas
    }

    public void groupSelected(List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic c : components) {
            group.add(c);
            all.remove(c);
        }
        all.add(group);
        all.draw();
    }

    public CompoundGraphic getAll() {
        return all;
    }
}