package com.crick.api.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crick_matches")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchId;
	
	private String teamHeading;
	private String matchNumberAndVenue;
	private String battingTeam;
	private String battingTeamScore;
	private String bowlingTeam;
	private String bowlingTeamScore;
	private String liveText;
	private String matchLink;
	private String textComplete;
	
	@Enumerated
	private MatchStatus status;
	
	private Date date = new Date();

	
	public Match() {
		super();
		
	}
	
	// set the match status according to textComplete
	
	public void setMatchStatus() {
		if (textComplete.isBlank()) {
			this.status = MatchStatus.LIVE;
		}
		else {
			this.status = MatchStatus.COMPLETED;
		}
	}

	public Match(int matchId, String teamHeading, String matchNumberAndVenue, String battingTeam,
			String battingTeamScore, String bowlingTeam, String bowlingTeamScore, String liveText, String matchLink,
			String textComplete, MatchStatus status, Date date) {
		super();
		this.matchId = matchId;
		this.teamHeading = teamHeading;
		this.matchNumberAndVenue = matchNumberAndVenue;
		this.battingTeam = battingTeam;
		this.battingTeamScore = battingTeamScore;
		this.bowlingTeam = bowlingTeam;
		this.bowlingTeamScore = bowlingTeamScore;
		this.liveText = liveText;
		this.matchLink = matchLink;
		this.textComplete = textComplete;
		this.status = status;
		this.date = date;
	}



	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	public String getMatchNumberAndVenue() {
		return matchNumberAndVenue;
	}

	public void setMatchNumberAndVenue(String matchNumberAndVenue) {
		this.matchNumberAndVenue = matchNumberAndVenue;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlingTeam() {
		return bowlingTeam;
	}

	public void setBowlingTeam(String bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}

	public String getBowlingTeamScore() {
		return bowlingTeamScore;
	}

	public void setBowlingTeamScore(String bowlingTeamScore) {
		this.bowlingTeamScore = bowlingTeamScore;
	}

	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	public String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}

	public String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
