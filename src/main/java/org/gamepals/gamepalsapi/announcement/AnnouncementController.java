package org.gamepals.gamepalsapi.announcement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/announcement")
@CrossOrigin
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @Autowired
    private AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping
    public List<Announcement> getAllAnnouncements(){
        return announcementService.getAnnouncements();
    }

    @PostMapping
    public Announcement addAnnouncement(@RequestBody Announcement announcement){
        return announcementService.addAnnouncement(announcement);
    }

    @GetMapping("/gamenameasc")
    public List<Announcement> getAnnouncementsByGameNameAsc(){
        return announcementService.getAnnouncementsByGameNameAsc();
    }
    @GetMapping("/gamenamedesc")
    public List<Announcement> getAnnouncementsByGameNameDesc(){
        return announcementService.getAnnouncementsByGameNameDesc();
    }
    @GetMapping("/dateasc")
    public List<Announcement> getAnnouncementsByDateAsc(){
        return announcementService.getAnnouncementsByDateAsc();
    }
    @GetMapping("/datedesc")
    public List<Announcement> getAnnouncementsBtDateDesc(){
        return announcementService.getAnnouncementsBtDateDesc();
    }
    @GetMapping("/ranked")
    public List<Announcement> getAnnouncementsForRanked(){
        return announcementService.getAnnouncementsForRanked();
    }
    @GetMapping("/casual")
    public List<Announcement> getAnnouncementsForCasual(){
        return announcementService.getAnnouncementsForCasual();
    }
    @GetMapping("/{name}")
    public List<Announcement> getAnnouncementsBySearchedGame(@PathVariable String name){
        return announcementService.getAnnouncementsBySearchedGame(name);
    }
    @GetMapping("/byuser/{username}")
    public List<Announcement> getAnnouncementsFromUserWithUsername(@PathVariable String username){
        return announcementService.getAnnouncementsFromUserWithUsername(username);
    }



}
