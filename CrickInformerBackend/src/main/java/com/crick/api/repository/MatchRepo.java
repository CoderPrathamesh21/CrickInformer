package com.crick.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.api.entity.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{
	
	// want to fetch match based on team haeding
	
	Optional<Match> findByTeamHeading(String teamHeading);

}
