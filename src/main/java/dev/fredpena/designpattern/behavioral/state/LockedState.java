package dev.fredpena.designpattern.behavioral.state;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:50
 */
public class LockedState extends State {
    public LockedState(AudioPlayer player) { super(player); }

    @Override
    public void clickLock() {
        if (player.isPlaying()) player.changeState(new PlayingState(player));
        else player.changeState(new ReadyState(player));
        System.out.println("[Locked] -> unlock");
    }

    @Override public void clickPlay() { System.out.println("[Locked] Play ignored"); }
    @Override public void clickNext(boolean dc) { System.out.println("[Locked] Next ignored"); }
    @Override public void clickPrevious(boolean dc) { System.out.println("[Locked] Prev ignored"); }
}
