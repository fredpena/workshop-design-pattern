package dev.fredpena.designpattern.structural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:36
 */
public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Comprimir -> Base64 -> delegar
        String compressed = base64(deflate(data));
        super.writeData(compressed);
    }

    @Override
    public String readData() {
        // Delegar -> Base64 decode -> descomprimir
        String raw = super.readData();
        return inflate(fromBase64(raw));
    }

    /* Utilidades */
    private byte[] deflate(String text) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             DeflaterOutputStream dos = new DeflaterOutputStream(bos)) {
            dos.write(text.getBytes(StandardCharsets.UTF_8));
            dos.finish();
            return bos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Compression error", e);
        }
    }

    private String inflate(byte[] bytes) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
             InflaterInputStream iis = new InflaterInputStream(bis)) {
            return new String(iis.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Decompression error", e);
        }
    }

    private String base64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    private byte[] fromBase64(String s) {
        return Base64.getDecoder().decode(s);
    }
}
