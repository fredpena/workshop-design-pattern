package dev.fredpena.designpattern.creational.singleton;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 21:49
 */
public class Database {
    private static Database instance;

    // Constructor privado
    private Database() {
        System.out.println("Conexión a la base de datos inicializada.");
    }

    // Método de acceso estático (Singleton)
    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    // Método de negocio
    public void query(String sql) {
        System.out.println("Ejecutando consulta: " + sql);
    }
}
