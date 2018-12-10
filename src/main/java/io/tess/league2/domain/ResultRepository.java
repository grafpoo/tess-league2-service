package io.tess.league2.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByHomeTeam(String team);
    List<Result> findByAwayTeam(String team);
}
