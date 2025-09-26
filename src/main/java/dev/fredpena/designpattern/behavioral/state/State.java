package dev.fredpena.designpattern.behavioral.state;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:50
 */
public abstract class State {
    protected final AudioPlayer player;

    protected State(AudioPlayer player) { this.player = player; }

    public abstract void clickLock();
    public abstract void clickPlay();
    public abstract void clickNext(boolean doubleClick);
    public abstract void clickPrevious(boolean doubleClick);
}
