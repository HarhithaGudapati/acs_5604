package com.acs560.Sport_analyzer.entities;
import com.acs560.Sport_analyzer.models.Team;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity()
@Table(name = "sports_data")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeamEntity {
    @Id
    private TeamEntityId id;
    
    private int wins;
    private int losses;
    private int points;
 
    public TeamEntityId getId() {
        return id;
    }
    
    public TeamEntity(Team team) {
    	this(new TeamEntityId(team.getYear(), team.getName(), team.getLeague()), team.getWins(), team.getLosses(), team.getPoints());
    } 
    

    
}

