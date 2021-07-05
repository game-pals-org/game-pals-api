package org.gamepals.gamepalsapi.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class AnnouncementDbService {
    private final AnnoucementRepository repository;

    @Autowired
    public AnnouncementDbService(AnnoucementRepository repository) {
        this.repository = repository;
    }

    public List<Announcement> getAnnouncements() {
        return repository.findAll();
    }

    ;

    public Announcement addAnnouncement(Announcement announcement) {
        repository.findById(announcement.getId())
                .ifPresent(() -> {
                    throw new IllegalArgumentException("Announcement with this ID already exists");
                });
        repository.save(announcement);
        return announcement;
    }

    public Announcement deleteAnnouncementById(Long id) {
        Announcement toDelete = repository.findById(id)
                .orElse(() -> {
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
        return repository.findByUsername(username);
    }


}
