package dev.fredpena.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:29
 */
public class Facebook implements SocialNetwork {
    // Grafo social simulado
    private final Map<String, Profile> profiles = new HashMap<>();
    private final Map<String, List<String>> friendsById = new HashMap<>();

    public Facebook(List<Profile> seed, Map<String, List<String>> friends) {
        for (Profile p : seed) profiles.put(p.getId(), p);
        friendsById.putAll(friends);
    }

    // API interna simulada
    List<Profile> socialGraphRequest(String profileId, String type) {
        System.out.println("[FacebookAPI] fetch " + type + " of " + profileId);
        List<String> neighbors = friendsById.getOrDefault(profileId, List.of());
        List<Profile> result = new ArrayList<>();
        for (String id : neighbors) {
            Profile p = profiles.get(id);
            if (p != null) {
                if (type.equals("friends")) {
                    result.add(p);
                } else if (type.equals("coworkers")) {
                    Profile me = profiles.get(profileId);
                    if (me != null && me.getCompany().equals(p.getCompany())) {
                        result.add(p);
                    }
                }
            }
        }
        return result;
    }

    Profile getById(String id) {
        return profiles.get(id);
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }
}
