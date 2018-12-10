package io.tess.league2.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ThingRepository extends JpaRepository<Thing, Long> {
}
