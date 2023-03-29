package pl.tomskr.rise_calculator.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.tomskr.rise_calculator.model.Rise;
import pl.tomskr.rise_calculator.service.IRiseService;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class StatisticsController {

    private final IRiseService riseService;

    public StatisticsController(IRiseService riseService){
        this.riseService = riseService;
    }

    /* Create sum of attributes for each subsequent rise
        and send it to frontend application
     */
    @RequestMapping("/rises")
    public List<Rise> rises() {
        return riseService.sumAll();
    }

    /*Find specific rise level*/
    @GetMapping("/rise/{level}")
    ResponseEntity<?> getRise(@PathVariable Long level) {

        Optional<Rise> rise= riseService.findRiseByLevel(level);

        return rise.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /*create next rise in sequence*/
//    @PostMapping("/rise")
//    ResponseEntity<Rise> createRise(@Validated @RequestBody Rise rise) throws URISyntaxException {
//        return ;
//    }

}
