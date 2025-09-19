package dev.fredpena.designpattern.structural.proxy;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.random.RandomGenerator;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:47
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    private final RandomGenerator rng = RandomGenerator.getDefault();

    @Override
    public List<Video> listVideos() {
        simulateNetwork("LIST");
        return List.of(
                new Video("a1", "Funny Cats"),
                new Video("b2", "Guitar Solo"),
                new Video("c3", "Travel Vlog")
        );
    }

    @Override
    public VideoInfo getVideoInfo(String id) {
        simulateNetwork("INFO:" + id);
        return new VideoInfo(id, "Title-" + id, "Author-" + id, 60 + id.hashCode() % 300);
    }

    @Override
    public byte[] downloadVideo(String id) {
        simulateNetwork("DOWNLOAD:" + id);
        return ("VIDEO_BYTES_" + id).getBytes(StandardCharsets.UTF_8);
    }

    private void simulateNetwork(String label) {
        try {
            System.out.println("[YouTubeAPI] Request " + label + " ...");
            Thread.sleep(200 + rng.nextInt(400)); // latencia simulada
        } catch (InterruptedException ignored) {
        }
    }
}