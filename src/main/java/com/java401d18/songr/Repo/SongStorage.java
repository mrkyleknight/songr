package com.java401d18.songr.Repo;

import com.java401d18.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongStorage extends JpaRepository<Song, Long> {

}

