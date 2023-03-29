package pl.tomskr.rise_calculator.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner{

    private final RiseService riseService;

    public Initializer(RiseService riseService) {
        this.riseService = riseService;
    }


    @Override
    public void run(String... args) throws Exception {
//        Stream.of(1,2,3,4)
//                .forEach(riseLevel -> riseService.s);

    }
}
