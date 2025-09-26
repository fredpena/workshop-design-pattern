package dev.fredpena.designpattern.behavioral.iterator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:31
 */
public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile p = iterator.getNext();
            System.out.printf("Email to %s: %s%n", p.getEmail(), message);
        }
    }
}
