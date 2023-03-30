package pl.tomskr.rise_calculator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.tomskr.rise_calculator.model.Rise;
import pl.tomskr.rise_calculator.repositories.RiseRepository;

import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner{

    private static final Logger logger = LoggerFactory.getLogger(Initializer.class);
    private  RiseRepository riseRepository;


    public Initializer(RiseRepository riseRepository) {
        this.riseRepository = riseRepository;
    }


    @Override
    public void run(String... args) throws Exception {
            riseRepository.deleteAll();

            riseRepository.save(new Rise((long) 1,"First Rise" ,(long) 10));
            riseRepository.save(new Rise((long) 2,"Second Rise",(long) 11));
            riseRepository.save(new Rise((long) 3,"Third Rise",(long) 12));
            riseRepository.save(new Rise((long) 4,"Forth Rise",(long) 13));

    }
}
