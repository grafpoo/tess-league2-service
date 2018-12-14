package io.tess.league2.controller;

import io.tess.league2.domain.MatchRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@RepositoryRestController
public class SeasonController {

    private MatchRepository repository;

    public SeasonController(MatchRepository repository) { this.repository = repository; }

    @GetMapping("/matches/seasonResults")
    public Map<String, Integer> getSeasonResults(@RequestParam(required = false) String season,
                                                 @RequestParam(required = false) String startSeason,
                                                 @RequestParam(required = false) String stopSeason) {
        // if year, use that (and ignore others)
        // else if startYear, then if endYear use range (or endYear = currentYear)
        // else if endYear, use 1900 as startYear
        // else do all
        if (season != null) {
            Map m = repository.awayWinsByTeam(season);
            m = repository.homeWinsByTeam(season);
        } else {
            Map m = repository.homeWinsByTeamBySeason();
            m = repository.awayWinsByTeamBySeason();
        }
        return new HashMap<>();
    }
}
