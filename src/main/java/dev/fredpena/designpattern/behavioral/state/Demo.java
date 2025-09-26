package dev.fredpena.designpattern.behavioral.state;

import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:51
 */
public class Demo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer(List.of("Song A", "Song B", "Song C"));

        // Ready → Play
        player.clickPlay();                // start + Playing
        player.clickNext(false);           // seek +5s
        player.clickNext(true);            // salto de pista
        player.clickPrevious(true);        // pista anterior
        player.clickPrevious(false);       // rewind 5s

        // Lock mientras reproduce
        player.clickLock();                // -> Locked (ignora)
        player.clickPlay();                // ignored
        player.clickLock();                // unlock -> vuelve a Playing

        // Pausa
        player.clickPlay();                // stop -> Ready

        // Desde Ready
        player.clickNext(true);            // cambia de pista (no reproduce)
        player.clickLock();                // -> Locked
        player.clickLock();                // unlock -> Ready (no playing)
    }
}
