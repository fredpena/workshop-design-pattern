package dev.fredpena.designpattern.behavioral.iterator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:28
 */
public class Profile {
    private final String id;
    private final String email;
    private final String company;

    public Profile(String id, String email, String company) {
        this.id = id;
        this.email = email;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Profile{id='" + id + "', email='" + email + "', company='" + company + "'}";
    }
}