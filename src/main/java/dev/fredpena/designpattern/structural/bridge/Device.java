package dev.fredpena.designpattern.structural.bridge;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:45
 */
public interface Device {
    boolean isEnabled();
    void enable();
    void disable();

    int getVolume();
    void setVolume(int percent);

    int getChannel();
    void setChannel(int channel);
}