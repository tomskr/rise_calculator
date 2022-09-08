package pl.tomskr.rise_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.tomskr.rise_calculator.model.Rise;
import pl.tomskr.rise_calculator.service.IRiseService;

import java.util.List;

@Controller
public class StatisticsController {

    private final IRiseService riseService;

    public StatisticsController(IRiseService riseService){
        this.riseService = riseService;
    }

    @RequestMapping("/showRise")
        public String showRise(Model model){

        List<Rise> riseList = riseService.findAll();
        model.addAttribute("rideList",riseList);

        return "riseList";
    }


}
