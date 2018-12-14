package io.tess.league2.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RepositoryRestResource
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByHomeTeam(String team);
    List<Match> findByAwayTeam(String team);

    @Query("SELECT m.homeTeam, count(m.fullTimeResult) from Match m where m.season = ?1 and m.fullTimeResult = 'H' group by m.homeTeam")
    Map homeWinsByTeam(String season);
    @Query("SELECT m.homeTeam, m.season, count(m.fullTimeResult) from Match m where m.fullTimeResult = 'H' group by m.homeTeam, m.season")
    Map homeWinsByTeamBySeason();

    @Query("SELECT m.awayTeam, count(m.fullTimeResult) from Match m where m.season = ?1 and m.fullTimeResult = 'H' group by m.awayTeam")
    Map awayWinsByTeam(String season);
    @Query("SELECT m.awayTeam, m.season, count(m.fullTimeResult) from Match m where m.fullTimeResult = 'H' group by m.awayTeam, m.season")
    Map awayWinsByTeamBySeason();
}
