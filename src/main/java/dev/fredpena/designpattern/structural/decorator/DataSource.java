package dev.fredpena.designpattern.structural.decorator;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 09:35
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
