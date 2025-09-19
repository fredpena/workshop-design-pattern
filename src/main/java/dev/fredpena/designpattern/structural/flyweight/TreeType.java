package dev.fredpena.designpattern.structural.flyweight;

import java.util.Arrays;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:30
 */
public class TreeType {
    private final String name;
    private final String color;
    private final byte[] texture; // simulación de datos pesados

    public TreeType(String name, String color, byte[] texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Canvas canvas, int x, int y) {
        // En un sistema real, usaría 'texture' para rasterizar.
        String label = name + ":" + color + ":" + Arrays.hashCode(texture);
        canvas.drawBitmap(label, x, y);
    }
}