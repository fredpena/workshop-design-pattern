package dev.fredpena.designpattern.structural.adapter;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:00
 */
public class SquarePeg {
    private final double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}