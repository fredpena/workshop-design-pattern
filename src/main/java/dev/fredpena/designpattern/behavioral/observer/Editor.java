package dev.fredpena.designpattern.behavioral.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:46
 */
public class Editor {
    public final EventManager events = new EventManager();
    private File file;

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        if (file == null) throw new IllegalStateException("No file opened");
        // Demo: escribe algo en el archivo.
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("\n# autosave");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        events.notify("save", file.getName());
    }
}