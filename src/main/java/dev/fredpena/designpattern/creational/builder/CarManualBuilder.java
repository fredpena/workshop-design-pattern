package dev.fredpena.designpattern.creational.builder;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:17
 */
public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
        manual.addSection("Introducción: este manual describe el vehículo y sus características.");
    }

    @Override
    public void setSeats(int count) {
        manual.addSection("Asientos: el vehículo cuenta con " + count + " asientos.");
    }

    @Override
    public void setEngine(Engine engine) {
        manual.addSection("Motor: especificaciones -> " + (engine != null ? engine.specs() : "N/A"));
    }

    @Override
    public void setTripComputer(boolean enabled) {
        manual.addSection("Computadora de viaje: " + (enabled ? "incluida" : "no incluida") + ".");
    }

    @Override
    public void setGPS(boolean enabled) {
        manual.addSection("GPS: " + (enabled ? "incluido" : "no incluido") + ".");
    }

    public Manual getProduct() {
        Manual product = this.manual;
        reset(); // listo para otro manual
        return product;
    }
}