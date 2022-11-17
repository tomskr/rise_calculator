package pl.tomskr.rise_calculator.service;

import org.springframework.stereotype.Service;
import pl.tomskr.rise_calculator.model.Rise;

import java.util.ArrayList;
import java.util.List;

@Service
public class RiseService implements IRiseService {

    private static List<Rise> riseList = new ArrayList<>();

    static {
        riseList.add(new Rise((long) 1,"First Rise"));
        riseList.add(new Rise((long) 2,"Second Rise"));
        riseList.add(new Rise((long) 3,"Third Rise"));
        riseList.add(new Rise((long) 4,"Forth Rise"));
    }

    @Override
    public List<Rise> findAll() {
        return riseList;
    }
}
