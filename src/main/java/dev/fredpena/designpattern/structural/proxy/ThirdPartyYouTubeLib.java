package dev.fredpena.designpattern.structural.proxy;

import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:47
 */
public interface ThirdPartyYouTubeLib {
    List<Video> listVideos();

    VideoInfo getVideoInfo(String id);

    byte[] downloadVideo(String id);
}