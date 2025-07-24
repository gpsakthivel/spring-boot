package com.hackerrank.tradingplatform.controller;

import com.hackerrank.tradingplatform.dto.AddMoneyTraderDTO;
import com.hackerrank.tradingplatform.dto.TraderDTO;
import com.hackerrank.tradingplatform.dto.UpdateTraderDTO;
import com.hackerrank.tradingplatform.model.Trader;
import com.hackerrank.tradingplatform.service.TraderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping(value = "/trading/traders")
public class TraderController {
    @Autowired
    private TraderService traderService;

    //register
    @PostMapping("/register")
    public ResponseEntity<Trader> registerTrader(@RequestBody @Valid Trader trader) {
        traderService.registerTrader(trader);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    //get by email
    @GetMapping("?email={email}")
    public ResponseEntity<TraderDTO> getTraderByEmail(@RequestParam("email") String email) {
        TraderDTO trader = new TraderDTO(traderService.getTraderByEmail(email));
        return ResponseEntity.status(HttpStatus.OK).body(trader);
    }

    //get all
    @GetMapping("/all")
    public ResponseEntity<List<TraderDTO>> getAllTraders() {
        List<TraderDTO> allTraderDTOs = traderService.getAllTraders()
                .stream()
                .map(TraderDTO::new)
                .collect(toList());
        if (allTraderDTOs.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(allTraderDTOs);
        }
    }

    //update by email
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Trader> updateTrader(@RequestBody @Valid UpdateTraderDTO trader) {
        Trader traders = traderService.updateTrader(trader);
        if (trader.getEmail()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(traders);
        }
    }

    //add money
    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void addMoney(@RequestBody @Valid AddMoneyTraderDTO trader) {
        traderService.addMoney(trader);
        if (allTraderDTOs.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(allTraderDTOs);
        }
    }
}
