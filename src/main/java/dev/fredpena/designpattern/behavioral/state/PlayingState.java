package dev.fredpena.designpattern.behavioral.state;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:51
 */
public class PlayingState extends State {
    public PlayingState(AudioPlayer player) { super(player); }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
        System.out.println("[Playing] -> lock");
    }

    @Override
    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
        System.out.println("[Playing] Pause -> Ready");
    }

    @Override
    public void clickNext(boolean doubleClick) {
        if (doubleClick) {
            player.nextSong();
        } else {
            player.fastForward(5);
        }
    }

    @Override
    public void clickPrevious(boolean doubleClick) {
        if (doubleClick) {
            player.previousSong();
        } else {
            player.rewind(5);
        }
    }
}
