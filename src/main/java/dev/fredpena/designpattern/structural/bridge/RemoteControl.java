package dev.fredpena.designpattern.structural.bridge;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:46
 */
public class RemoteControl {
    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) device.disable();
        else device.enable();
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
