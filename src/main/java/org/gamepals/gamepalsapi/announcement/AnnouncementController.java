package org.gamepals.gamepalsapi.announcement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
