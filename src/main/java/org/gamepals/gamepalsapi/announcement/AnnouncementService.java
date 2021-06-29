package org.gamepals.gamepalsapi.announcement;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AnnouncementService {

    AnnouncementRepository announcementRepository = new AnnouncementRepository();



    public List<Announcement> getAllAnnouncements(){
        return announcementRepository.allAnnouncement;
    }

}
