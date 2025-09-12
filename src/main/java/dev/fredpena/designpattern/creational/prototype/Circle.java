package dev.fredpena.designpattern.creational.prototype;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:31
 */
public class Circle extends Shape {
    private int radius;

    public Circle() {}

    // Constructor de copia
    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    public Circle withRadius(int r) { this.radius = r; return this; }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return super.toString()
                       .replace("}", "") +
               ", radius=" + radius +
               '}';
    }
}
