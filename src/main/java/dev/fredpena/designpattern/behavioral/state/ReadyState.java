package dev.fredpena.designpattern.behavioral.state;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:50
 */
public class ReadyState extends State {
    public ReadyState(AudioPlayer player) { super(player); }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
        System.out.println("[Ready] -> lock");
    }

    @Override
    public void clickPlay() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
        System.out.println("[Ready] Play -> Playing");
    }

    @Override public void clickNext(boolean dc) { player.nextSong(); }
    @Override public void clickPrevious(boolean dc) { player.previousSong(); }
}
