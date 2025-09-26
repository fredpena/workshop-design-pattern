package dev.fredpena.designpattern.behavioral.iterator;

import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:30
 */
public class FacebookIterator implements ProfileIterator {
    private final Facebook facebook;
    private final String profileId;
    private final String type;
    private int currentPosition = 0;
    private List<Profile> cache = null;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.size();
    }

    @Override
    public Profile getNext() {
        if (!hasMore()) return null;
        return cache.get(currentPosition++);
    }
}