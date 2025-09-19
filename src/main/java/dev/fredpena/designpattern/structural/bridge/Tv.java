package dev.fredpena.designpattern.structural.bridge;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:45
 */
public class Tv implements Device {
    private boolean on = false;
    private int volume = 30;   // 0..100
    private int channel = 1;   // >= 1

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("[TV] ON");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("[TV] OFF");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = Math.max(0, Math.min(100, percent));
        System.out.println("[TV] Volume = " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int ch) {
        channel = Math.max(1, ch);
        System.out.println("[TV] Channel = " + channel);
    }
}
