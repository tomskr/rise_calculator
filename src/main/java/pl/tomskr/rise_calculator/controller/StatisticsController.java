package pl.tomskr.rise_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomskr.rise_calculator.model.Rise;
import pl.tomskr.rise_calculator.service.IRiseService;

import java.util.List;

@RestController
public class StatisticsController {

    private final IRiseService riseService;

    public StatisticsController(IRiseService riseService){
        this.riseService = riseService;
    }

    @RequestMapping("/showRise")
    public List<Rise> getAllCourses() {
        return riseService.findAll();
    }


}
