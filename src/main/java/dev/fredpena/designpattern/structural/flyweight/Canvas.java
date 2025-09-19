package dev.fredpena.designpattern.structural.flyweight;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:30
 */
public class Canvas {
    public void drawBitmap(String label, int x, int y) {
        System.out.printf("Draw[%s] at (%d,%d)%n", label, x, y);
    }
}
