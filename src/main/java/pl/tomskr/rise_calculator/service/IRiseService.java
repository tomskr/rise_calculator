package pl.tomskr.rise_calculator.service;

import pl.tomskr.rise_calculator.model.Rise;

import java.util.List;

public interface IRiseService {
    List<Rise> findAll();
}
