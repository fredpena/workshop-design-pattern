package dev.fredpena.designpattern.creational.builder;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:17
 */

public interface Builder {
    void create();

    void setSeats(int count);

    void setEngine(Engine engine);

    void setTripComputer(boolean enabled);

    void setGPS(boolean enabled);
}
