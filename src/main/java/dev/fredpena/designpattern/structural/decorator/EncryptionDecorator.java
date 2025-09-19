package dev.fredpena.designpattern.structural.decorator;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:37
 */

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * "Cifrado" simple para demo: XOR con una clave + Base64.
 * (No usar en producción; reemplazar por una lib criptográfica real).
 */
public class EncryptionDecorator extends DataSourceDecorator {
    private final String key;

    public EncryptionDecorator(DataSource source) {
        this(source, "secret-key");
    }

    public EncryptionDecorator(DataSource source, String key) {
        super(source);
        this.key = key;
    }

    @Override
    public void writeData(String data) {
        String encrypted = base64(xor(data.getBytes(StandardCharsets.UTF_8)));
        super.writeData(encrypted);
    }

    @Override
    public String readData() {
        String raw = super.readData();
        byte[] decoded = fromBase64(raw);
        byte[] plain = xor(decoded);
        return new String(plain, StandardCharsets.UTF_8);
    }

    /* Utilidades */
    private byte[] xor(byte[] input) {
        byte[] k = key.getBytes(StandardCharsets.UTF_8);
        byte[] out = new byte[input.length];
        for (int i = 0; i < input.length; i++) {
            out[i] = (byte) (input[i] ^ k[i % k.length]);
        }
        return out;
    }

    private String base64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    private byte[] fromBase64(String s) {
        return Base64.getDecoder().decode(s);
    }
}