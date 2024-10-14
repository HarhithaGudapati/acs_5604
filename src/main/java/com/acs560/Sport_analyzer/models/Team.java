package com.acs560.Sport_analyzer.models;

import java.util.Objects;
import com.acs560.Sport_analyzer.entities.TeamEntity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Team {

	private int year;
	private String name;
	private String league;
	private int wins;
	private int losses;
	private int points;
	
	@Override
	public int hashCode() {
		return Objects.hash(year, name, league);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return year == other.year && Objects.equals(name, other.name) &&
				Objects.equals(league, other.league);
	}

	public Team(String name, int year, String league) {
		this.name = name;
		this.year = year;
		this.league = league;
	}
	
	public Team(TeamEntity te) {
		this(te.getId().getLeagueyear(),
				te.getId().getTeam(),
				te.getLeague(),
				te.getWins(),
				te.getLosses(),
				te.getPoints());
	}
	
}
