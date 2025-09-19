package dev.fredpena.designpattern.structural.facade.framework;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:08
 */
public class AudioMixer {
    public byte[] fix(byte[] track) {
        // Simula “arreglar”/normalizar audio
        String prefix = "[AUDIO-FIX]";
        byte[] head = prefix.getBytes(StandardCharsets.UTF_8);
        byte[] out = Arrays.copyOf(head, head.length + track.length);
        System.arraycopy(track, 0, out, head.length, track.length);
        return out;
    }
}