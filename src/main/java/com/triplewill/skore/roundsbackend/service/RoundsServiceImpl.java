package com.triplewill.skore.roundsbackend.service;

import com.triplewill.skore.roundsbackend.domain.entity.Round;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

@Service
public class RoundsServiceImpl implements RoundsService{

    @Override
    public Collection<Round> getRounds() {
        return Arrays.asList(new Round(), new Round());
    }

    @Override
    public Round getRoundById(UUID id) {
        return new Round();
    }

    @Override
    public Round updateRound(UUID id) {
        return new Round();
    }

}
