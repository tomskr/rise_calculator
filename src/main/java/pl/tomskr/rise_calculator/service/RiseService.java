package pl.tomskr.rise_calculator.service;

import org.springframework.stereotype.Service;
import pl.tomskr.rise_calculator.model.Rise;
import pl.tomskr.rise_calculator.repositories.RiseRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RiseService implements IRiseService {

    RiseRepository riseRepository;

    public RiseService(RiseRepository riseRepository) {
        this.riseRepository = riseRepository;

    }


    //list all stat increases
    @Override
    public List<Rise> findAll() {
        List<Rise> riseList = new ArrayList<>();
        riseRepository.findAll().forEach(riseList::add);
        return riseList;
    }

    //show all rise stats
//    @Override
//    public List<Rise> sumAll() {
//        sumList.clear();
//        for (int i = 0; i< riseList.size(); i++){
//            System.out.println("index :  " + i);
//            if(i==0) sumList.add(riseList.get(i));
//            if(i!=0){
//                sumList.add(addRises(riseList.get(i),sumList.get(i-1)));
//            }
//        }
//        return sumList;
//    }

//    @Override
//    public Optional<Rise> findRiseByLevel(Long riseLevel) {
//        //return riseRepository.
//        return riseList.stream().filter(
//                sample -> sample.getRiseLevel().equals(riseLevel)
//        ).findFirst();
//    }

//    @Override
//    public void deleteByRiseLevel(Long riseLevel) {
//        riseList.remove(riseLevel);
//    }


//    @Override
//    public Rise save(Rise rise) {
//        if((riseList.get(riseList.size()-1).getRiseLevel() + 1) == rise.getRiseLevel()){
//        riseList.add(rise);
//        }
//        return rise;
//    }


//    private Rise addRises(Rise main, Rise addition){
//        main.setStrengthIncrease(main.getStrengthIncrease() + addition.getStrengthIncrease());
//        return main;
//    }
    //end show all rise stats
}
