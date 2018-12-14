package io.tess.league2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.tess.league2.domain.Match;
import io.tess.league2.domain.MatchRepository;
import io.tess.league2.domain.MatchResultDeserializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class MatchLoader implements CommandLineRunner {

    @Value("${local.loadfile}")
    private String loadfileResourceName;

    private MatchRepository repository;
    private ApplicationContext appContext;

    @Autowired
    public MatchLoader(MatchRepository repository, ApplicationContext ctx) {
        this.repository = repository;
        this.appContext = ctx;
    }

    @Override
    public void run(String... args) throws Exception {
        Resource resource =
                appContext.getResource(loadfileResourceName);
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Match.Result.class, new MatchResultDeserializer());
        objectMapper.registerModule(module);
        List<Match> list = objectMapper.readValue(resource.getInputStream(), new TypeReference<List<Match>>() { });
//        list.stream().map(m -> repository.save(m));
        for (Match m: list) {
            repository.save(m);
        }
        log.info("Repo size: "+repository.count());
    }
}
