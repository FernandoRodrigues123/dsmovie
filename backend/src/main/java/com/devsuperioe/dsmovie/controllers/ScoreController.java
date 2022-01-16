package com.devsuperioe.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperioe.dsmovie.dto.MovieDTO;
import com.devsuperioe.dsmovie.dto.ScoreDTO;
import com.devsuperioe.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {	
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO scoredto){
		MovieDTO dto =	service.saveScore(scoredto);
		return dto;
	}

}
