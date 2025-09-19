package dev.fredpena.designpattern.structural.facade.framework;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:07
 */
public class MPEG4CompressionCodec implements

        Codec {
    @Override
    public String name() {
        return "mp4";
    }
}