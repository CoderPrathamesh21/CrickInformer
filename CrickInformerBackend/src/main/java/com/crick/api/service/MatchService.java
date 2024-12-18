package com.crick.api.service;

import java.util.List;
import java.util.Map;

import com.crick.api.entity.Match;

public interface MatchService {
	
	// get all matches
	
	List<Match> getAllMatches();
	
	// get live matches
	
	List<Match> getLiveMatches();
	
	// get points table
	
	List<List<String>> getPointsTable();
}
