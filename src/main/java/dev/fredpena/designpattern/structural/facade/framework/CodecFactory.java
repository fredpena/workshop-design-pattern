package dev.fredpena.designpattern.structural.facade.framework;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:07
 */
public class CodecFactory {
    public Codec extract(VideoFile file) {
        String fn = file.getFilename().toLowerCase();
        if (fn.endsWith(".mp4")) return new MPEG4CompressionCodec();
        return new OggCompressionCodec();
    }
}