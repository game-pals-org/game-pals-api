package org.gamepals.gamepalsapi.announcement;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class AnnouncementInMemoryService implements AnnouncementService{

    private static Long index = 11L;

    public static Long getIndex() {
        return index;
    }

    public static void setIndex(Long index) {
        AnnouncementInMemoryService.index = index;
    }

    private static List<Announcement> allAnnouncement = new ArrayList<>(
            Arrays.asList(new Announcement(1L,"ShadowWarrior","ShadowWarrior","LOL","shadow#1234","...", true, LocalDateTime.now()),
                    new Announcement(2L,"ShadowWarrior","ShadowWarrior2000","WOW","shadow#1234","info", false, LocalDateTime.now()),
                    new Announcement(3L,"player1","player1","BFV","player1#0000","info", true, LocalDateTime.now()),
                    new Announcement(4L,"ShadowWarrior","ShadowWarrior","CS:GO","shadow#1234","info", false, LocalDateTime.now()),
                    new Announcement(5L,"player2","player2","DOTA 2","player2#1111","info", false, LocalDateTime.now()),
                    new Announcement(6L,"ShadowWarrior","ShadowWarrior","MINECRAFT","shadow#1234","...", false, LocalDateTime.now()),
                    new Announcement(7L,"ShadowWarrior","ShadowWarrior2000","WOT","shadow#1234","info", true, LocalDateTime.now()),
                    new Announcement(8L,"player1","player1","BFV","player1#0000","info", true, LocalDateTime.now()),
                    new Announcement(9L,"player2","player2","CS:GO","player2#1111","info", false, LocalDateTime.now()),
                    new Announcement(10L,"ShadowWarrior","ShadowWarrior","DOTA 2","shadow#1234","info", false, LocalDateTime.now()))
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
    public Announcement deleteAnnouncementById(Long id) {

        Announcement announcement = null;
       for( Announcement a : allAnnouncement){
           if(a.getId() == id ){
               announcement = a;
               break;
           }
       }
       if(announcement != null){
           allAnnouncement.remove(announcement);
           return announcement;
       }else {
           return null;
        }

    }

    @Override
    public List<Announcement> getAnnouncementsFromUserWithUsername(String username) {
        List<Announcement> announcements = new ArrayList<>();
        for (int i = 0; i < allAnnouncement.size(); i++) {
            if (allAnnouncement.get(i).user.equals(username)) {
                announcements.add(allAnnouncement.get(i));
            }
        }
        return announcements;
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
                .sorted(Comparator.comparing(Announcement::getGameName).reversed())
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
                .filter(announcement -> announcement.getGameName().toUpperCase().startsWith(name.toUpperCase()))
                .collect(Collectors.toList());
    }



    public static void setAllAnnouncement(List<Announcement> allAnnouncement) {
        AnnouncementInMemoryService.allAnnouncement = allAnnouncement;
    }
}
