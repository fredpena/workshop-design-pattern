package dev.fredpena.designpattern.creational.prototype;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:31
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {}

    // Constructor de copia
    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    public Rectangle withWidth(int w)  { this.width = w; return this; }
    public Rectangle withHeight(int h) { this.height = h; return this; }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return super.toString()
                       .replace("}", "") +
               ", width=" + width +
               ", height=" + height +
               '}';
    }
}
