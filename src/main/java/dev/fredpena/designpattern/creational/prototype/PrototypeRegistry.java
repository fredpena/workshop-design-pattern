package dev.fredpena.designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 23:32
 */
public class PrototypeRegistry {
    private final Map<String, Shape> prototypes = new HashMap<>();

    public void register(String name, Shape prototype) {
        prototypes.put(name, prototype);
    }

    /**
     * Devuelve un CLON del prototipo registrado (no el objeto original).
     * Si no existe, devuelve null (o lanza excepción, según tu preferencia).
     */
    public Shape create(String name) {
        Shape proto = prototypes.get(name);
        return (proto != null) ? proto.clone() : null;
    }
}