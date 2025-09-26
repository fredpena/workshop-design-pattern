package dev.fredpena.designpattern.creational.builder;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:17
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.create();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.create();
        builder.setSeats(7);
        builder.setEngine(() -> "V6 3.5L 290 HP");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
