package dev.fredpena.designpattern.creational.singleton;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 21:49
 */
public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM usuarios");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM pedidos");

        System.out.println(foo == bar); // true → misma instancia
    }
}
