package dev.fredpena.designpattern.behavioral.iterator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:29
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);
}
