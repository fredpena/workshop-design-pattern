package dev.fredpena.designpattern.structural.proxy;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:48
 */
public class Application {
    public static void main(String[] args) {
        ThirdPartyYouTubeLib real = new ThirdPartyYouTubeClass();
        ThirdPartyYouTubeLib cached = new CachedYouTubeClass(real);

        YouTubeManager manager = new YouTubeManager(cached);
        manager.reactOnUserInput();

        // Si cambia algo en backend/config y quieres invalidar:
        if (cached instanceof CachedYouTubeClass c) c.invalidate();
        manager.reactOnUserInput();
    }
}