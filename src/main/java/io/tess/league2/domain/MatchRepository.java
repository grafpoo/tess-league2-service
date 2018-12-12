package io.tess.league2.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByHomeTeam(String team);
    List<Match> findByAwayTeam(String team);
}
