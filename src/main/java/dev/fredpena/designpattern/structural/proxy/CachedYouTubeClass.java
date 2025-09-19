package dev.fredpena.designpattern.structural.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:47
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private final ThirdPartyYouTubeLib service;

    private List<Video> listCache;
    private final Map<String, VideoInfo> videoCache = new HashMap<>();
    private final Map<String, byte[]> downloads = new HashMap<>();
    private boolean needReset = false;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void invalidate() {
        needReset = true;
    }

    @Override
    public List<Video> listVideos() {
        if (listCache == null || needReset) {
            listCache = service.listVideos();
        }
        needReset = false;
        System.out.println("[Cache] listVideos -> " + (listCache != null ? "HIT" : "MISS"));
        return listCache;
    }

    @Override
    public VideoInfo getVideoInfo(String id) {
        if (needReset || !videoCache.containsKey(id)) {
            videoCache.put(id, service.getVideoInfo(id));
        }
        needReset = false;
        System.out.println("[Cache] getVideoInfo(" + id + ") -> HIT=" + videoCache.containsKey(id));
        return videoCache.get(id);
    }

    @Override
    public byte[] downloadVideo(String id) {
        if (needReset || !downloads.containsKey(id)) {
            downloads.put(id, service.downloadVideo(id));
        }
        needReset = false;
        System.out.println("[Cache] downloadVideo(" + id + ") -> HIT=" + downloads.containsKey(id));
        return downloads.get(id);
    }
}