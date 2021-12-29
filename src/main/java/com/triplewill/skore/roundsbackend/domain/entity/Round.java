package com.triplewill.skore.roundsbackend.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Round {

    private UUID id;
    private Integer score;

    public Round() {
        this.id = UUID.randomUUID();
        this.score = 72;
    }

}
