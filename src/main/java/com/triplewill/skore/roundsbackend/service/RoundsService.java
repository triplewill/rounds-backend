package com.triplewill.skore.roundsbackend.service;

import com.triplewill.skore.roundsbackend.domain.entity.Round;

import java.util.Collection;
import java.util.UUID;

public interface RoundsService {

    Collection<Round> getRounds();

    Round getRoundById(UUID id);

    Round updateRound(UUID id);

}
