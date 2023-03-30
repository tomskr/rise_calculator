package pl.tomskr.rise_calculator.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.tomskr.rise_calculator.model.Rise;
import pl.tomskr.rise_calculator.service.IRiseService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class StatisticsController {

    //private final Logger log = LoggerFactory.getLogger(StatisticsController.class);
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
    //todo: hooks read wrong walues repair
    @PostMapping("/rise")
    ResponseEntity<Rise> createRise(@Validated @RequestBody Rise rise) throws URISyntaxException {
        Rise result = riseService.save(rise);
        return ResponseEntity.created(new URI("/api/rise/" + result.getRiseLevel()))
                .body(result);
    }


    /*Upgrade value of existing rises*/
    //todo: update save command
    @PutMapping("/rise/{riseLevel}")
    ResponseEntity<Rise> upgradeRise(@Validated @RequestBody Rise rise){
        Rise result = riseService.save(rise);
        return ResponseEntity.ok().body(result);
    }


    /*delete existing rise entry*/
//    @DeleteMapping("/rise/{riseLevel}"){
//        public ResponseEntity<?> deleteRise(@PathVariable Long id){
//            riseService.deleteByRiseLevel(id);
//            return ResponseEntity.ok().build();
//        }
//    }


}
