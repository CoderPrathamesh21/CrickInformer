package com.crick.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.api.entity.Match;
import com.crick.api.service.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
	
	private MatchService service;
	
	
	public MatchController(MatchService service) {
		this.service = service;
	}


	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches() {
		
		return new ResponseEntity<>(this.service.getLiveMatches(), HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Match>> getAllMatches() {
		
		return new ResponseEntity<>(this.service.getAllMatches(), HttpStatus.OK);
	}

	
	@GetMapping("/pointstable")
	public ResponseEntity<?> getPointsTable() {
		
		return new ResponseEntity<>(this.service.getPointsTable(), HttpStatus.OK);
	}
	
	
}
