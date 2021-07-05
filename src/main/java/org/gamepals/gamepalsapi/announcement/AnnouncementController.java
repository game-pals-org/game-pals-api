package org.gamepals.gamepalsapi.announcement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/announcement")
@CrossOrigin
public class AnnouncementController {

    private final AnnouncementService announcementService;
    private final AnnouncementDbService dbService;
    @Autowired
    private AnnouncementController(AnnouncementService announcementService, AnnouncementDbService dbService) {
        this.announcementService = announcementService;
        this.dbService = dbService;
    }

    @GetMapping
    public List<Announcement> getAllAnnouncements() {
//        return announcementService.getAnnouncements();
        return dbService.getAnnouncements();
    }

    @PostMapping
    public Announcement addAnnouncement(@RequestBody Announcement announcement) {
//        return announcementService.addAnnouncement(announcement);
        return dbService.addAnnouncement(announcement);
    }

    @DeleteMapping("/{id}")
    public Announcement deleteAnnouncement(@PathVariable Long id) {
//        return announcementService.deleteAnnouncementById(id);
        return dbService.deleteAnnouncementById(id);
    }

    @GetMapping("/gamenameasc")
    public List<Announcement> getAnnouncementsByGameNameAsc() {
//        return announcementService.getAnnouncementsByGameNameAsc();
        return dbService.getAnnouncementsByGameNameAsc();
    }

    @GetMapping("/gamenamedesc")
    public List<Announcement> getAnnouncementsByGameNameDesc() {
//        return announcementService.getAnnouncementsByGameNameDesc();
        return dbService.getAnnouncementsByGameNameDesc();
    }

    @GetMapping("/dateasc")
    public List<Announcement> getAnnouncementsByDateAsc() {
//        return announcementService.getAnnouncementsByDateAsc();
        return dbService.getAnnouncementsByDateAsc();
    }

    @GetMapping("/datedesc")
    public List<Announcement> getAnnouncementsBtDateDesc() {
//        return announcementService.getAnnouncementsBtDateDesc();
        return dbService.getAnnouncementsBtDateDesc();
    }

    @GetMapping("/ranked")
    public List<Announcement> getAnnouncementsForRanked() {
//        return announcementService.getAnnouncementsForRanked();
        return dbService.getAnnouncementsForRanked();
    }

    @GetMapping("/casual")
    public List<Announcement> getAnnouncementsForCasual() {
//        return announcementService.getAnnouncementsForCasual();
        return dbService.getAnnouncementsForCasual();
    }

    @GetMapping("/{name}")
    public List<Announcement> getAnnouncementsBySearchedGame(@PathVariable String name) {
//        return announcementService.getAnnouncementsBySearchedGame(name);
         return dbService.getAnnouncementsBySearchedGame(name);
    }

    @GetMapping("/byuser/{username}")
    public List<Announcement> getAnnouncementsFromUserWithUsername(@PathVariable String username) {
//        return announcementService.getAnnouncementsFromUserWithUsername(username);
        return dbService.getAnnouncementsFromUserWithUsername(username);

    }


}
