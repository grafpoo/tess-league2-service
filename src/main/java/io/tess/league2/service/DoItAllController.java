package io.tess.league2.service;

import io.tess.league2.domain.Thing;
import io.tess.league2.domain.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/thing")
public class DoItAllController {
    private ThingRepository repo;

    @Autowired
    public DoItAllController(ThingRepository repository) {
        this.repo = repository;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Thing retrieveThing(@PathVariable Long id) {
        return repo.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Thing addThing(@RequestBody Thing thing) {
        // create new Thing
        return repo.save(thing);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Thing replaceThing(@PathVariable Long id, @RequestBody Thing thing) {
        // overwrite any current values
        return repo.save(thing);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Thing updateThing(@PathVariable Long id, @RequestBody Thing thing) {
        // iterate through fields, updating specific fields
        return repo.save(thing);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeThing(@PathVariable Long id) {
        Thing thing = retrieveThing(id);
        repo.delete(thing);
    }

}
