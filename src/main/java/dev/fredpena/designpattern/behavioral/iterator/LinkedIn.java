package dev.fredpena.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:30
 */
public class LinkedIn implements SocialNetwork {
    private final Map<String, Profile> profiles = new HashMap<>();
    private final Map<String, List<String>> connections = new HashMap<>();

    public LinkedIn(List<Profile> seed, Map<String, List<String>> connections) {
        for (Profile p : seed) profiles.put(p.getId(), p);
        this.connections.putAll(connections);
    }

    List<Profile> api(String profileId, String type) {
        System.out.println("[LinkedInAPI] fetch " + type + " of " + profileId);
        List<String> neighbors = connections.getOrDefault(profileId, List.of());
        List<Profile> result = new ArrayList<>();
        for (String id : neighbors) {
            Profile p = profiles.get(id);
            if (p != null) {
                if (type.equals("friends")) result.add(p);
                else if (type.equals("coworkers")) {
                    Profile me = profiles.get(profileId);
                    if (me != null && me.getCompany().equals(p.getCompany())) {
                        result.add(p);
                    }
                }
            }
        }
        return result;
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new LinkedInIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new LinkedInIterator(this, profileId, "coworkers");
    }
}
