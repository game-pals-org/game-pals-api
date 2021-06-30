package org.gamepals.gamepalsapi.announcement;

import java.util.List;

public interface AnnouncementService {

    List<Announcement> getAnnouncements();
    Announcement addAnnouncement(Announcement announcement);

}
