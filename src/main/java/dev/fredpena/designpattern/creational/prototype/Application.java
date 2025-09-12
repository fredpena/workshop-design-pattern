package dev.fredpena.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:32
 */
public class Application {

    private final List<Shape> shapes = new ArrayList<>();

    public Application() {
        // 1) Crear prototipos "a mano"
        Circle circle = (Circle) new Circle()
                .withX(10).withY(10).withColor("red");
        shapes.add(circle);

        Shape anotherCircle = circle.clone(); // copia exacta
        shapes.add(anotherCircle);

        Rectangle rectangle = (Rectangle) new Rectangle()
                .withWidth(10).withHeight(20).withColor("blue").withX(5).withY(7);
        shapes.add(rectangle);

        // 2) También podemos usar un registro de prototipos
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.register("big-red-circle", circle);
        registry.register("thin-rect", rectangle);

        Shape c1 = registry.create("big-red-circle");
        Shape r1 = registry.create("thin-rect");

        if (c1 != null) shapes.add(c1.withX(100).withY(100)); // ajustar posición
        if (r1 != null) shapes.add(r1);
    }

    public void businessLogic() {
        // Clonado polimórfico: no necesitamos conocer la clase concreta
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape s : shapes) {
            shapesCopy.add(s.clone());
        }

        // Demo: imprimir originales y copias
        System.out.println("=== Originales ===");
        shapes.forEach(System.out::println);

        System.out.println("=== Copias ===");
        shapesCopy.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.businessLogic();
    }
}
