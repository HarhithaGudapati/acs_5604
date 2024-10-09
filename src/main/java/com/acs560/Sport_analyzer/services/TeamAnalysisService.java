package com.acs560.Sport_analyzer.services;

import java.util.NoSuchElementException;

public interface TeamAnalysisService {

	double calculateAverageWins(String league) throws NoSuchElementException;
	
	double calculateAverageWins(String league, int year) throws NoSuchElementException;
	
	double calculateMeanWins() throws NoSuchElementException;
	
	double calculateMedianWins() throws NoSuchElementException;
	
	int calculateModeWins() throws NoSuchElementException;
	
}