package dev.fredpena.designpattern.behavioral.iterator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:28
 */
public interface ProfileIterator {
    boolean hasMore();

    Profile getNext();
}
