package org.gamepals.gamepalsapi.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnnouncementDbService implements AnnouncementService{
    private final AnnoucementRepository repository;

    @Autowired
    public AnnouncementDbService(AnnoucementRepository repository) {
        this.repository = repository;
    }

    public List<Announcement> getAnnouncements() {
        return repository.findAll();
    }



    public Announcement addAnnouncement(Announcement announcement) {
        Optional<Announcement> maybeDuplicate = repository.findById(announcement.getId());
        if(maybeDuplicate.isPresent()){
            throw new IllegalArgumentException("Annoucment already exists");
        }else{
            repository.save(announcement.setId(AnnouncementInMemoryService.getIndex()));
            AnnouncementInMemoryService.setIndex(AnnouncementInMemoryService.getIndex() + 1 );
        }
        return announcement;
    }

    public Announcement deleteAnnouncementById(Long id) {
        Announcement toDelete = repository.findById(id)
                .orElseThrow(() -> {
                    throw new NoSuchElementException("No announcement with such ID found");
                });
        repository.delete(toDelete);
        return toDelete;
    }

    public List<Announcement> getAnnouncementsByGameNameAsc() {
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Announcement::getGameName))
                .collect(Collectors.toList());
    }


    public List<Announcement> getAnnouncementsByGameNameDesc() {
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Announcement::getGameName).reversed())
                .collect(Collectors.toList());
    }


    public List<Announcement> getAnnouncementsByDateAsc() {
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Announcement::getGameName).reversed())
                .collect(Collectors.toList());
    }


    public List<Announcement> getAnnouncementsBtDateDesc() {
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Announcement::getDate).reversed())
                .collect(Collectors.toList());
    }


    public List<Announcement> getAnnouncementsForRanked() {
        return repository.findByisRanked(true);
    }


    public List<Announcement> getAnnouncementsForCasual() {
        return repository.findByisRanked(false);

    }


    public List<Announcement> getAnnouncementsBySearchedGame(String name) {
        return repository.findByGameNameStartingWith(name);
    }


    public List<Announcement> getAnnouncementsFromUserWithUsername(String username) {
        return repository.findByUser(username);
    }


}
