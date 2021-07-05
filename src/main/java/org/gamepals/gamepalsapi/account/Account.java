package org.gamepals.gamepalsapi.account;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {
    @Id
    private String username;
    private String encodedPassword;


    public Account() {
    }

    public Account(String username, String encodedPassword, List<Long> announcements) {
        this.username = username;
        this.encodedPassword = encodedPassword;

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

}
