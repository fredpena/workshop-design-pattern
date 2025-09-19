package dev.fredpena.designpattern.structural.adapter;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:00
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0); // llamamos al constructor de RoundPeg con radio dummy
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // radio del círculo inscrito en el cuadrado
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}