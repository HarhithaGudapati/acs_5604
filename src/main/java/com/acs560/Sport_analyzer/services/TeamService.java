package com.acs560.Sport_analyzer.services;


import java.util.List;
import java.util.Optional;

import com.acs560.Sport_analyzer.models.Team;
public interface TeamService {
	
	/**
	 * Get a team by name and year
	 * @param name - the name
	 * @param year - the year
	 * @return - the Team
	 */
	Optional<Team> getTeam(String name, int year);
	
	/**
	 * Get the list of all teams
	 * @return - the list of teams
	 */
	List<Team> getTeams();
	
	/**
	 * Get the teams filtered by name
	 * @param name - the name
	 * @return - the list of teams filtered by name
	 */
	List<Team> getTeams(String name);
	
	/**
	 * Get the teams filtered by name and year
	 * @param name - the name
	 * @param year - the year
	 * @return
	 */
	List<Team> getTeams(String name, int year);
	
	void addTeam(Team team);
	void deleteTeam(Team team);
	void updateTeam(Team team);

	List<Team> getTeams(int year);
	
	List<Team> getTeams(int year, int range);

	List<Team> getTeams(String name, int year, int range);

	//Object getTeamsByYear(int year);

	//Optional<Team> getTeamByName(String name);

	//Object getTeamsByLeague(String league);

	//Object getTeamsByYearAndLeague(int year, String league);

	//void delete(Team team);

	//void update(Team team);

	//void add(Team team);


	
}

