package dev.fredpena.designpattern.structural.flyweight;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:31
 */
public class Tree {
    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Canvas canvas) {
        type.draw(canvas, x, y);
    }
}