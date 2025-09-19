package dev.fredpena.designpattern.structural.adapter;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 07:59
 */
public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
