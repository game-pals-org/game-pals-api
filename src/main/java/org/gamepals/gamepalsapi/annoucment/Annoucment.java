package org.gamepals.gamepalsapi.annoucment;

public class Annoucment {
    String nick;
    String gameName;
    String discordName;
    String additionalInfo;

    public Annoucment(String nick, String gameName, String discordName, String additionalInfo) {
        this.nick = nick;
        this.gameName = gameName;
        this.discordName = discordName;
        this.additionalInfo = additionalInfo;
    }

    public Annoucment() {
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
