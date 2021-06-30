package org.gamepals.gamepalsapi.announcement;

import java.time.LocalDateTime;

public class Announcement {

    long id;
    String nick;
    String gameName;
    String discordName;
    String additionalInfo;
    boolean isRanked;
    LocalDateTime date;

    public Announcement() {
    }

    public Announcement(Long id, String nick, String gameName, String discordName, String additionalInfo, boolean isRanked, LocalDateTime date) {
        this.id = id;
        this.nick = nick;
        this.gameName = gameName;
        this.discordName = discordName;
        this.additionalInfo = additionalInfo;
        this.isRanked = isRanked;
        this.date = date;
    }

    public long getId() {
        return id;
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

    public Announcement setId(long id) {
        this.id = id;
        return this;
    }

    public boolean isRanked() {
        return isRanked;
    }

    public void setRanked(boolean ranked) {
        isRanked = ranked;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
