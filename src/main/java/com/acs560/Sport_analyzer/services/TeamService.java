package com.acs560.Sport_analyzer.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs560.Sport_analyzer.repositories.TeamRepository;

import sports.acs560.performance_analyzer.models.Team;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Iterable<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Integer year) {
        return teamRepository.findById(year);
    }

    public List<Team> getTeamByName(String name) {
        return teamRepository.findByName(name);
    }

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }

    public void deleteTeam(Integer year) {
        teamRepository.deleteById(year);
    }
}

