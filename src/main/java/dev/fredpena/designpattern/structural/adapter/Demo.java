package dev.fredpena.designpattern.structural.adapter;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:00
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println(hole.fits(rpeg)); // true

        SquarePeg smallSqPeg = new SquarePeg(5);
        SquarePeg largeSqPeg = new SquarePeg(10);

        // hole.fits(smallSqPeg); // no compila: tipos incompatibles

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSqPeg);

        System.out.println(hole.fits(smallAdapter)); // true
        System.out.println(hole.fits(largeAdapter)); // false
    }
}