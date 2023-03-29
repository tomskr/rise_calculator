package pl.tomskr.rise_calculator.service;

import pl.tomskr.rise_calculator.model.Rise;

import java.util.List;
import java.util.Optional;

public interface IRiseService {
    List<Rise> findAll();
    List<Rise> sumAll();

    Optional<Rise> findRiseByLevel(Long riseLevel);
    void deleteByRiseLevel(Long riseLevel);

    Rise save(Rise rise);

}
