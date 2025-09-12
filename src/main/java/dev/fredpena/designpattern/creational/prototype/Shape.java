package dev.fredpena.designpattern.creational.prototype;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:31
 */
public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape() {}

    // Constructor de copia
    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    // Métodos de conveniencia (fluentes para la demo)
    public Shape withX(int x)        { this.x = x; return this; }
    public Shape withY(int y)        { this.y = y; return this; }
    public Shape withColor(String c) { this.color = c; return this; }

    // Prototipo: contrato de clonación
    public abstract Shape clone();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
               "{x=" + x +
               ", y=" + y +
               ", color='" + color + '\'' +
               '}';
    }
}
