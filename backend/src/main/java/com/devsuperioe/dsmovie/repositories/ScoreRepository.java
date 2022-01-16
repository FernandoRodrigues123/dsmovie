package com.devsuperioe.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperioe.dsmovie.entities.Score;
import com.devsuperioe.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
