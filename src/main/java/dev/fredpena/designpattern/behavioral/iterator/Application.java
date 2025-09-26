package dev.fredpena.designpattern.behavioral.iterator;

import java.util.List;
import java.util.Map;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:31
 */
public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public void config(String which) {
        List<Profile> seed = List.of(
                new Profile("u1", "ana@ex.com", "Acme"),
                new Profile("u2", "luis@ex.com", "Acme"),
                new Profile("u3", "marta@ex.com", "Beta"),
                new Profile("u4", "paco@ex.com", "Acme")
        );
        Map<String, List<String>> edges = Map.of(
                "u1", List.of("u2", "u3"),
                "u2", List.of("u1", "u4"),
                "u3", List.of("u1"),
                "u4", List.of("u2")
        );

        if ("facebook".equalsIgnoreCase(which)) {
            this.network = new Facebook(seed, edges);
        } else {
            this.network = new LinkedIn(seed, edges);
        }
        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile me) {
        ProfileIterator it = network.createFriendsIterator(me.getId());
        spammer.send(it, "Very important message to friends");
    }

    public void sendSpamToCoworkers(Profile me) {
        ProfileIterator it = network.createCoworkersIterator(me.getId());
        spammer.send(it, "Very important message to coworkers");
    }

    public static void main(String[] args) {
        Application app = new Application();

        app.config("facebook");
        Profile me = new Profile("u1", "ana@ex.com", "Acme");
        app.sendSpamToFriends(me);
        app.sendSpamToCoworkers(me);

        System.out.println("-----");

        app.config("linkedin");
        app.sendSpamToFriends(me);
        app.sendSpamToCoworkers(me);
    }
}