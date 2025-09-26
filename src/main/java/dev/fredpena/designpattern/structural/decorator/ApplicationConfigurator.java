package dev.fredpena.designpattern.structural.decorator;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:38
 */
public class ApplicationConfigurator {
    public static void main(String[] args) {
        boolean enabledEncryption = false;
        boolean enabledCompression = true;

        DataSource source = new FileDataSource("salary.dat");

        if (enabledEncryption) {
            source = new EncryptionDecorator(source);
        }
        if (enabledCompression) {
            source = new CompressionDecorator(source);
        }
        // Pila final (si ambos true): Compression(Encryption(FileDataSource))
        // *Nota*: El orden importa. Puedes probar Encryption(Compression(...)) también.

        SalaryManager logger = new SalaryManager(source);

        String data = """
                id,employee,amount
                1,Ana,1200
                2,Luis,1500
                """;

        logger.save(data);  // escribe cifrado+comprimido (según el orden)
        String loaded = logger.load(); // lee, descomprime y descifra
        System.out.println("Recovered:\n" + loaded);
    }
}
