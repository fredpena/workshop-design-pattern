package dev.fredpena.designpattern.structural.composite;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:20
 */
public class Circle extends Dot {
    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Circle at (%d,%d) with R=%d%n", x, y, radius);
    }
}
