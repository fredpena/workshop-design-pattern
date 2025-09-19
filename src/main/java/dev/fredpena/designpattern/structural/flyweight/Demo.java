package dev.fredpena.designpattern.structural.flyweight;

import java.util.Random;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:31
 */
public class Demo {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Forest forest = new Forest();
        Random rnd = new Random(42);

        // Plantar 1,000,000 árboles usando ~3 tipos
        String[] names = {"Pino", "Abeto", "Roble"};
        String[] colors = {"VerdeOscuro", "Verde", "Ambar"};
        String[] textures = {"aguja", "hoja", "corteza"};

        int N = 1_000_0; // ajusta para la demo (10k). Sube a 1_000_000 si quieres stress test.
        for (int i = 0; i < N; i++) {
            int x = rnd.nextInt(10_000);
            int y = rnd.nextInt(10_000);
            String name = names[rnd.nextInt(names.length)];
            String color = colors[rnd.nextInt(colors.length)];
            String texture = textures[rnd.nextInt(textures.length)];
            forest.plantTree(x, y, name, color, texture);
        }

        // Dibuja algunos (no imprimas un millón en consola)
        for (int i = 0; i < 10 && i < forest.size(); i++) {
            // simulación: solo dibujar los primeros 10 para ver la salida
        }
        forest.draw(canvas);

        System.out.println("Árboles plantados: " + forest.size());
        System.out.println("Flyweights en pool: " + TreeFactory.poolSize());
    }
}