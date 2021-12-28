package com.triplewill.skore.roundsbackend.controller;

import com.triplewill.skore.roundsbackend.domain.entity.Round;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoundsApiController {

    @GetMapping("/rounds")
    public Round getHello(){
        return new Round();
    }

}
