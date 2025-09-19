package dev.fredpena.designpattern.structural.facade.framework;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:07
 */
public class VideoFile {
    private final String filename;

    public VideoFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
