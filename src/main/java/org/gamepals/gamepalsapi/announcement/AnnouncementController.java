package org.gamepals.gamepalsapi.announcement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/announcement")
@CrossOrigin
public class AnnouncementController {

    private final AnnouncementService service;
    @Autowired

    private AnnouncementController(@Qualifier("announcementInMemoryService")  AnnouncementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Announcement> getAllAnnouncements() {

        return service.getAnnouncements();
    }

    @PostMapping
    public Announcement addAnnouncement(@RequestBody Announcement announcement) {

        return service.addAnnouncement(announcement);
    }

    @DeleteMapping("/{id}")
    public Announcement deleteAnnouncement(@PathVariable Long id) {
        return service.deleteAnnouncementById(id);

    }

    @GetMapping("/gamenameasc")
    public List<Announcement> getAnnouncementsByGameNameAsc() {
        return service.getAnnouncementsByGameNameAsc();

    }

    @GetMapping("/gamenamedesc")
    public List<Announcement> getAnnouncementsByGameNameDesc() {
        return service.getAnnouncementsByGameNameDesc();
    }

    @GetMapping("/dateasc")
    public List<Announcement> getAnnouncementsByDateAsc() {
        return service.getAnnouncementsByDateAsc();
    }

    @GetMapping("/datedesc")
    public List<Announcement> getAnnouncementsBtDateDesc() {
        return service.getAnnouncementsBtDateDesc();

    }

    @GetMapping("/ranked")
    public List<Announcement> getAnnouncementsForRanked() {
        return service.getAnnouncementsForRanked();

    }

    @GetMapping("/casual")
    public List<Announcement> getAnnouncementsForCasual() {
        return service.getAnnouncementsForCasual();
    }

    @GetMapping("/{name}")
    public List<Announcement> getAnnouncementsBySearchedGame(@PathVariable String name) {
        return service.getAnnouncementsBySearchedGame(name);
    }

    @GetMapping("/byuser/{username}")
    public List<Announcement> getAnnouncementsFromUserWithUsername(@PathVariable String username) {
        return service.getAnnouncementsFromUserWithUsername(username);

    }


}
