package org.gamepals.gamepalsapi.announcement;


import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class AnnouncementInMemoryService implements AnnouncementService{

    private static Long index = 6L;
    
    private static List<Announcement> allAnnouncement = new ArrayList<>(
            Arrays.asList(new Announcement(1L,"ShadowWarrior","nick1","LOL","discord1","...", true, LocalDateTime.now()),
                    new Announcement(2L,"ShadowWarrior","nick2","WOT","discord2","info", false, LocalDateTime.now()),
                    new Announcement(3L,"pawcio_x2010","nick3","BFV","discord3","info", true, LocalDateTime.now()),
                    new Announcement(4L,"ShadowWarrior","nick4","CSGO","discord4","info", false, LocalDateTime.now()),
                    new Announcement(5L,"pawcio_x2010","nick5","DOTA","discord5","info", false, LocalDateTime.now()))
    );
    
    @Override
    public List<Announcement> getAnnouncements() {
        return allAnnouncement;
    }

    @Override
    public Announcement addAnnouncement(Announcement announcement) {
        allAnnouncement.add(announcement.setId(index));
        index++;
        return announcement;
    }

    @Override
    public Announcement getAnnouncementById(Long id) {
        return allAnnouncement.stream().filter(a -> a.getId() == id).findFirst().get();
    }

    @Override
    public List<Announcement> getAnnouncementsByGameNameAsc() {
        return allAnnouncement.stream()
                .sorted( Comparator.comparing(Announcement::getGameName))
                .collect(Collectors.toList());

    }

    @Override
    public List<Announcement> getAnnouncementsByGameNameDesc() {
        return allAnnouncement.stream()
                .sorted(Comparator.comparing(Announcement::getGameName).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> getAnnouncementsByDateAsc() {
        return allAnnouncement.stream()
                .sorted(Comparator.comparing(Announcement::getDate))
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> getAnnouncementsBtDateDesc() {
        return allAnnouncement.stream()
                .sorted(Comparator.comparing(Announcement::getDate).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> getAnnouncementsForRanked() {
        return allAnnouncement.stream()
                .filter(announcement -> announcement.isRanked)
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> getAnnouncementsForCasual() {
        return allAnnouncement.stream()
                .filter(announcement -> !announcement.isRanked)
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> getAnnouncementsBySearchedGame(String name) {
        return allAnnouncement.stream()
                .filter(announcement -> announcement.getGameName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}
