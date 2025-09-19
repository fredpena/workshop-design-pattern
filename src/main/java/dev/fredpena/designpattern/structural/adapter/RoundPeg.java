package dev.fredpena.designpattern.structural.adapter;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 07:59
 */
public class RoundPeg {
    private final double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}