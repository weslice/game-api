package com.app.gamesapi.repository;

import com.app.gamesapi.entity.GameGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameGenreRepository extends JpaRepository<GameGenre, Long> {
}
