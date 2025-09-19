package dev.fredpena.designpattern.structural.flyweight;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:30
 */
public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String textureKey) {
        String key = name + "|" + color + "|" + textureKey;
        return treeTypes.computeIfAbsent(key, k -> {
            // Simula cargar/generar la textura pesada a partir de una clave
            byte[] texture = ("TEX:" + textureKey).getBytes(StandardCharsets.UTF_8);
            return new TreeType(name, color, texture);
        });
    }

    // Para inspección/testing
    public static int poolSize() {
        return treeTypes.size();
    }
}