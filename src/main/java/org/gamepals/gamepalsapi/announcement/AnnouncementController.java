package org.gamepals.gamepalsapi.announcement;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/annocument")
public class AnnouncementController {

    AnnouncementService announcementService = new AnnouncementService();

    @GetMapping
    public List<Announcement> getAllAnnouncements(){
        return announcementService.getAllAnnouncements();
    }




}
