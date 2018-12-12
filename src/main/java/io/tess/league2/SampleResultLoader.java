package io.tess.league2;

import io.tess.league2.domain.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class SampleResultLoader implements CommandLineRunner {

    private MatchRepository repository;

    @Autowired
    public SampleResultLoader(MatchRepository repository) {
        this.repository = repository;
    }

//    @Autowired
//    public SampleResultLoader(ResultRepository repository, @Value("${sample}") String sample) {
//        this.repository = repository;
//    }

    @Override
    public void run(String... args) throws Exception {
//        Stream.of("")
//                .forEach(n -> repository.save(null));
//        repository.findAll().forEach(System.out::println);
        //repository.save(new Match("A","B",1,0));
    }
}
