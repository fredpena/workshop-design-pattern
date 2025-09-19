package dev.fredpena.designpattern.structural.proxy;

import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:48
 */
public class YouTubeManager {
    protected final ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        VideoInfo info = service.getVideoInfo(id);
        System.out.printf("Render Video Page: %s (%s) by %s [%ds]%n",
                info.title(), info.id(), info.author(), info.durationSec());
    }

    public void renderListPanel() {
        List<Video> list = service.listVideos();
        System.out.println("Render List:");
        list.forEach(v -> System.out.println(" - " + v.id() + " : " + v.title()));
    }

    public void reactOnUserInput() {
        renderListPanel();
        renderVideoPage("a1");
        renderVideoPage("a1"); // segunda vez: debe salir por caché
        service.downloadVideo("a1");
        service.downloadVideo("a1"); // caché de descarga
    }
}