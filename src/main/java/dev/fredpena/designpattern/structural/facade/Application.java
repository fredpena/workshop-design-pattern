package dev.fredpena.designpattern.structural.facade;

import java.io.File;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:11
 */
public class Application {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        File mp4 = converter.convert("funny-cats-video.ogg", "mp4");
        System.out.println("Archivo generado: " + mp4.getAbsolutePath());
    }
}
