package dev.fredpena.designpattern.behavioral.state;

import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:51
 */
public class AudioPlayer {
    private State state;
    private boolean playing = false;
    private int volume = 50;
    private final List<String> playlist;
    private int currentIdx = 0;

    public AudioPlayer(List<String> playlist) {
        this.playlist = playlist;
        this.state = new ReadyState(this);
    }

    /* Delegación de UI */
    public void clickLock() { state.clickLock(); }
    public void clickPlay() { state.clickPlay(); }
    public void clickNext(boolean doubleClick) { state.clickNext(doubleClick); }
    public void clickPrevious(boolean doubleClick) { state.clickPrevious(doubleClick); }

    /* API para estados */
    public void changeState(State s) { this.state = s; }
    public boolean isPlaying() { return playing; }

    public void startPlayback() {
        if (playlist.isEmpty()) { System.out.println("[Player] No tracks"); return; }
        playing = true;
        System.out.println("[Player] ▶ " + trackInfo());
    }

    public void stopPlayback() {
        playing = false;
        System.out.println("[Player] ⏸ " + trackInfo());
    }

    public void nextSong() {
        if (playlist.isEmpty()) return;
        currentIdx = (currentIdx + 1) % playlist.size();
        System.out.println("[Player] ⏭  " + trackInfo());
        if (playing) startPlayback();
    }

    public void previousSong() {
        if (playlist.isEmpty()) return;
        currentIdx = (currentIdx - 1 + playlist.size()) % playlist.size();
        System.out.println("[Player] ⏮  " + trackInfo());
        if (playing) startPlayback();
    }

    public void fastForward(int sec) {
        if (!playing) { System.out.println("[Player] FF ignored (not playing)"); return; }
        System.out.println("[Player] »» +"+sec+"s on " + trackInfo());
    }

    public void rewind(int sec) {
        if (!playing) { System.out.println("[Player] RW ignored (not playing)"); return; }
        System.out.println("[Player] «« -"+sec+"s on " + trackInfo());
    }

    private String trackInfo() {
        return "[" + (currentIdx+1) + "/" + playlist.size() + "] " +
               (playlist.isEmpty() ? "-" : playlist.get(currentIdx));
    }
}