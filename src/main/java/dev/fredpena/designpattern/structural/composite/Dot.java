package dev.fredpena.designpattern.structural.composite;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:20
 */
public class Dot implements Graphic {
    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Dot at (%d,%d)%n", x, y);
    }
}