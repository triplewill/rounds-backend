package com.triplewill.skore.roundsbackend.domain.entity;

import java.util.UUID;

public class Round {

    private UUID id;
    private Integer score;

    public Round() {
        this.id = UUID.randomUUID();
        this.score = 72;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
