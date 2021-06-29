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



    public Announcement() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDiscordName() {
        return discordName;
    }

    public void setDiscordName(String discordName) {
        this.discordName = discordName;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
