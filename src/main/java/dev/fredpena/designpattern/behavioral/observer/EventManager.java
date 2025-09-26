package dev.fredpena.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 13:46
 */
public class EventManager {
    private final Map<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> list = listeners.get(eventType);
        if (list != null) list.remove(listener);
    }

    public void notify(String eventType, String data) {
        List<EventListener> list = listeners.getOrDefault(eventType, List.of());
        for (EventListener l : list) {
            l.update(data);
        }
    }
}
