package org.gamepals.gamepalsapi.account;

import java.util.List;

public class Account {
    private String username;
    private String encodedPassword;
    private List<Long> announcements;

    public Account() {
    }

    public Account(String username, String encodedPassword, List<Long> announcements) {
        this.username = username;
        this.encodedPassword = encodedPassword;
        this.announcements = announcements;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncodedPassword() {
        return encodedPassword;
    }

    public void setEncodedPassword(String encodedPassword) {
        this.encodedPassword = encodedPassword;
    }

    public List<Long> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Long> announcements) {
        this.announcements = announcements;
    }
}
