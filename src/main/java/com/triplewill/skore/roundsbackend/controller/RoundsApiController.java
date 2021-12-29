package com.triplewill.skore.roundsbackend.controller;

import com.triplewill.skore.roundsbackend.domain.entity.Round;
import com.triplewill.skore.roundsbackend.service.RoundsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/api/rounds")
@RequiredArgsConstructor
public class RoundsApiController {

    private final RoundsService roundsService;

    @GetMapping
    public Collection<Round> getRounds(){
        System.out.println("GET /api/rounds");
        return roundsService.getRounds();
    }

    @GetMapping("/{id}")
    public Round getRoundById(@PathVariable UUID id){
        System.out.println("GET /api/rounds/" + id);
        return roundsService.getRoundById(id);
    }

    @PutMapping("/{id}")
    public Round updateRound(@PathVariable UUID id){
        System.out.println("PUT /api/rounds/" + id);
        return roundsService.updateRound(id);
    }

}
