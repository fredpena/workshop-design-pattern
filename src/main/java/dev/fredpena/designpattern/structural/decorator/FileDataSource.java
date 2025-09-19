package dev.fredpena.designpattern.structural.decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:35
 */
public class FileDataSource implements DataSource {
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try (OutputStream os = new FileOutputStream(filename)) {
            os.write(data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException("Error writing file: " + filename, e);
        }
    }

    @Override
    public String readData() {
        try (InputStream is = new FileInputStream(filename)) {
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + filename, e);
        }
    }
}