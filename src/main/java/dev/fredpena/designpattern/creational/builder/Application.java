package dev.fredpena.designpattern.creational.builder;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:18
 */
public class Application {

    public static void main(String[] args) {
        Director director = new Director();

        // Construir un deportivo (Car)
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.getProduct();
        System.out.println(sportsCar);

        // Construir el manual del deportivo (Manual)
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportsManual = manualBuilder.getProduct();
        System.out.println(sportsManual);

        // Construir un SUV y su manual
        director.constructSUV(carBuilder);
        Car suv = carBuilder.getProduct();
        System.out.println(suv);

        director.constructSUV(manualBuilder);
        Manual suvManual = manualBuilder.getProduct();
        System.out.println(suvManual);
    }
}