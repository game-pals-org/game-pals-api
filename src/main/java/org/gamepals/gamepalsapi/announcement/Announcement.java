package org.gamepals.gamepalsapi.announcement;

public class Announcement {

    long id;
    String nick;
    String gameName;
    String discordName;
    String additionalInfo;

    public Announcement( Long id, String nick, String gameName, String discordName, String additionalInfo) {
        this.id = id;
        this.nick = nick;
        this.gameName = gameName;
        this.discordName = discordName;
        this.additionalInfo = additionalInfo;
    }

    public Announcement setId(long id) {
        this.id = id;
        return this;
    }

}
