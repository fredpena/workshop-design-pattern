package dev.fredpena.designpattern.structural.facade;

import dev.fredpena.designpattern.structural.facade.framework.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:09
 */
public class VideoConverter {
    public File convert(String filename, String format) {
        try {
            VideoFile file = new VideoFile(filename);
            Codec source = new CodecFactory().extract(file);
            Codec destination = switch (format.toLowerCase()) {
                case "mp4" -> new MPEG4CompressionCodec();
                case "ogg" -> new OggCompressionCodec();
                default -> throw new IllegalArgumentException("Formato no soportado: " + format);
            };

            byte[] buffer = BitrateReader.read(filename, source);
            byte[] converted = BitrateReader.convert(buffer, destination);
            byte[] finalTrack = new AudioMixer().fix(converted);

            // “Guardar” a disco con extensión correcta
            String outName = stripExt(filename) + "." + destination.name();
            try (FileOutputStream fos = new FileOutputStream(outName)) {
                fos.write(finalTrack);
            }
            return new File(outName);
        } catch (IOException e) {
            throw new RuntimeException("Error en conversión", e);
        }
    }

    private String stripExt(String filename) {
        int idx = filename.lastIndexOf('.');
        return (idx > 0) ? filename.substring(0, idx) : filename;
    }
}