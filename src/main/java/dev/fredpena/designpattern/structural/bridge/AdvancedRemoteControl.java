package dev.fredpena.designpattern.structural.bridge;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:46
 */
public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}