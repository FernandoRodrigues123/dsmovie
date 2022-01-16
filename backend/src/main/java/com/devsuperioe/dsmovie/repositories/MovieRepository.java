package com.devsuperioe.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperioe.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
