package dev.fredpena.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:21
 */
public class CompoundGraphic implements Graphic {
    private final List<Graphic> children = new ArrayList<>();

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(int dx, int dy) {
        for (Graphic child : children) {
            child.move(dx, dy);
        }
    }

    @Override
    public void draw() {
        // Aquí podrías calcular el bounding box antes/después.
        System.out.println("CompoundGraphic: begin");
        for (Graphic child : children) {
            child.draw();
        }
        System.out.println("CompoundGraphic: end");
    }

    public List<Graphic> getChildren() {
        return children;
    }
}
