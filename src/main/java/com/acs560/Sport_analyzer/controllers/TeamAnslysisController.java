package com.acs560.Sport_analyzer.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acs560.Sport_analyzer.services.TeamAnalysisService;

import lombok.NoArgsConstructor;

@RestController()
@RequestMapping("/api/v1/teamAnalysis")
@NoArgsConstructor
public class TeamAnslysisController {
	
	@Autowired
	private TeamAnalysisService teamAnalysisService;
	
	public TeamAnslysisController(TeamAnalysisService teamAnalysisService) {
		this.teamAnalysisService = teamAnalysisService;
	}

	@GetMapping("/average/wins/{year}")
	public double getAverageWins(@PathVariable int year) {
		return teamAnalysisService.calculateAverageWinsForYear(year);
	}
	
	@GetMapping("/average/wins/{year}/{Range}")
	public double getAverageWins(@PathVariable int year, @PathVariable int Range) {
		return teamAnalysisService.calculateAverageWinsForYearAndRange(year, Range);
	}
	
	@GetMapping("/mean/wins")
	public double getMeanWins() {
		return teamAnalysisService.calculateMeanWins();
	}
	
	@GetMapping("/median/wins")
	public double getMedianWins() {
		return teamAnalysisService.calculateMedianWins();
	}
	
	@GetMapping("/mode/wins")
	public int getModeWins() {
		return teamAnalysisService.calculateModeWins();
	}
	
}
