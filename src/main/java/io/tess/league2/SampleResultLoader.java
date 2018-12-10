package io.tess.league2;

import io.tess.league2.domain.Result;
import io.tess.league2.domain.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

import java.util.stream.Stream;

public class SampleResultLoader implements CommandLineRunner {

    private ResultRepository repository;

    @Autowired
    public SampleResultLoader(ResultRepository repository) {
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
        //repository.save(new Result("A","B",1,0));
    }
}
