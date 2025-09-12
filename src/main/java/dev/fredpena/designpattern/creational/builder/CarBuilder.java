package dev.fredpena.designpattern.creational.builder;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:17
 */
public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int count) {
        car.setSeats(count);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean enabled) {
        car.setTripComputer(enabled);
    }

    @Override
    public void setGPS(boolean enabled) {
        car.setGps(enabled);
    }

    public Car getProduct() {
        Car product = this.car;
        reset(); // listo para otro armado
        return product;
    }
}
