package dev.fredpena.designpattern.structural.facade.framework;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:06
 */
public class OggCompressionCodec implements Codec {
    @Override
    public String name() {
        return "ogg";
    }
}
