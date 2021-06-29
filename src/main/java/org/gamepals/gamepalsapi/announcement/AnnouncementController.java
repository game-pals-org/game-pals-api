package org.gamepals.gamepalsapi.announcement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announcement")
@CrossOrigin
public class AnnouncementController {
    public AnnouncementController(AnnouncementService service) {
        this.service = service;
    }
    @Autowired
    private final AnnouncementService service;


    @GetMapping
    public List<Announcement> getAllAnnouncements(){
        return service.getAllAnnouncements();
    }

    @PostMapping
    public Announcement addAnnouncement(@RequestBody Announcement announcement){
        return service.addAnnouncement(announcement);
    }


}
