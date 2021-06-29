package org.gamepals.gamepalsapi.announcement;


import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnnouncementService {

    AnnouncementRepository announcementRepository = new AnnouncementRepository();



    public List<Announcement> getAllAnnouncements(){
        return announcementRepository.allAnnouncement;
    }

    public Announcement addAnnouncement( Announcement announcement ){
        announcement.setId(announcementRepository.index );
        announcementRepository.index++;
        announcementRepository.allAnnouncement.add(announcement);
        return announcement;
    }

}
