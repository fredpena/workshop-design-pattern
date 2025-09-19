package dev.fredpena.designpattern.structural.bridge;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 08:46
 */
public class Demo {
    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteControl basicRemote = new RemoteControl(tv);
        basicRemote.togglePower();
        basicRemote.channelUp();
        basicRemote.volumeUp();
        basicRemote.togglePower();

        System.out.println("----");

        Device radio = new Radio();
        AdvancedRemoteControl proRemote = new AdvancedRemoteControl(radio);
        proRemote.togglePower();
        proRemote.volumeUp();
        proRemote.mute();
        proRemote.channelDown();
    }
}
