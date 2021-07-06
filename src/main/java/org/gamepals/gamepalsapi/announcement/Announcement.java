package org.gamepals.gamepalsapi.announcement;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Announcement {

    @Id
    long id;
    String user;
    String nick;
    String gameName;
    String discordName;
    String additionalInfo;
    boolean isRanked;
    @CreationTimestamp
    LocalDateTime date;

    public Announcement() {
    }

    public Announcement(Long id, String user, String nick, String gameName, String discordName, String additionalInfo, boolean isRanked, LocalDateTime date) {
        this.id = id;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Announcement)) return false;
        Announcement that = (Announcement) o;
        return id == that.id && isRanked == that.isRanked && user.equals(that.user) && nick.equals(that.nick) && gameName.equals(that.gameName) && discordName.equals(that.discordName) && additionalInfo.equals(that.additionalInfo) && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, nick, gameName, discordName, additionalInfo, isRanked, date);
    }
}
