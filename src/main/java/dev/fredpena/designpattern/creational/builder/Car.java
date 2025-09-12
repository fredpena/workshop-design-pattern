package dev.fredpena.designpattern.creational.builder;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:16
 */
public class Car {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }
    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
               "seats=" + seats +
               ", engine=" + (engine != null ? engine.specs() : "none") +
               ", tripComputer=" + tripComputer +
               ", gps=" + gps +
               '}';
    }
}