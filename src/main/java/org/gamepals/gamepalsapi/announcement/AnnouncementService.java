package org.gamepals.gamepalsapi.announcement;

import java.util.List;

public interface AnnouncementService {

    List<Announcement> getAnnouncements();
    Announcement addAnnouncement(Announcement announcement);
    Announcement getAnnouncementById(Long id);
    List<Announcement> getAnnouncementsByGameNameAsc();
    List<Announcement> getAnnouncementsByGameNameDesc();
    List<Announcement> getAnnouncementsByDateAsc();
    List<Announcement> getAnnouncementsBtDateDesc();
    List<Announcement> getAnnouncementsForRanked();
    List<Announcement> getAnnouncementsForCasual();
    List<Announcement> getAnnouncementsBySearchedGame(String name);
}
