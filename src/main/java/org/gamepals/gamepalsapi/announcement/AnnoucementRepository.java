package org.gamepals.gamepalsapi.announcement;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnoucementRepository extends JpaRepository<Announcement,Long> {
List<Announcement> findByisRanked(boolean isRanked);
List<Announcement> findByGameNameStartingWith(String name);
List<Announcement> findByUser(String user);





}
