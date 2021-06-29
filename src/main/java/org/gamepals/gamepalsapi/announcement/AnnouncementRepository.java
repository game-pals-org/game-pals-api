package org.gamepals.gamepalsapi.announcement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnouncementRepository {
    List<Announcement> allAnnouncement = new ArrayList<>(
            Arrays.asList(new Announcement(1L,"nick1","LOL","discord1","..."),
                    new Announcement(2L,"nick2","WOT","discord2","info"),
                    new Announcement(3L,"nick3","BFV","discord3","info"),
                    new Announcement(4L,"nick4","CSGO","discord4","info"),
                    new Announcement(5L,"nick5","DOTA","discord5","info"))
    );


}
