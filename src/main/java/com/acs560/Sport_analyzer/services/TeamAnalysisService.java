package com.acs560.Sport_analyzer.services;

import java.util.NoSuchElementException;

public interface TeamAnalysisService {

	double calculateAverageWinsForYear(int year) throws NoSuchElementException;
	
	double calculateAverageWinsForYearAndRange(int year, int Range) throws NoSuchElementException;
	
	double calculateMeanWins() throws NoSuchElementException;
	
	double calculateMedianWins() throws NoSuchElementException;
	
	int calculateModeWins() throws NoSuchElementException;
	
}