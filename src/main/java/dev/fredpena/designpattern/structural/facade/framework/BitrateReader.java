package dev.fredpena.designpattern.structural.facade.framework;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:08
 */
public class BitrateReader {
    public static byte[] read(String filename, Codec sourceCodec) {
        // Simula leer bytes + metadatos de codec
        String content = "[READ:" + sourceCodec.name() + "]" + filename;
        return content.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] convert(byte[] buffer, Codec destCodec) {
        // Simula la conversión de bytes entre codecs
        String prefix = "[CONVERT->" + destCodec.name() + "]";
        byte[] header = prefix.getBytes(StandardCharsets.UTF_8);
        byte[] result = Arrays.copyOf(header, header.length + buffer.length);
        System.arraycopy(buffer, 0, result, header.length, buffer.length);
        return result;
    }
}
