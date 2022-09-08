package pl.tomskr.rise_calculator.service;

import org.springframework.stereotype.Service;
import pl.tomskr.rise_calculator.model.Rise;

import java.util.List;

@Service
public class RiseService implements IRiseService {
    @Override
    public List<Rise> findAll() {
        return null;
    }
}
