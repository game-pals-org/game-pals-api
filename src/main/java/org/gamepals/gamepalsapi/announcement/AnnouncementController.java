package org.gamepals.gamepalsapi.announcement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/announcement")
@CrossOrigin
public class AnnouncementController {

    private final AnnouncementService announcementService;

    private AnnouncementController() {
        this.announcementService = new AnnouncementInMemoryService();
    }

    @GetMapping
    public List<Announcement> getAllAnnouncements(){
        return announcementService.getAnnouncements();
    }

    @PostMapping
    public Announcement addAnnouncement(@RequestBody Announcement announcement){
        return announcementService.addAnnouncement(announcement);
    }


}
