package com.acs560.Sport_analyzer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sports.acs560.performance_analyzer.models.Team;
import sports.acs560.performance_analyzer.services.TeamService;

import java.util.Optional;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public Iterable<Team> getAllTeams() {
        return teamService.getTeams();
    }

    @GetMapping("/{year}")
    public Optional<Team> getTeamById(@PathVariable Integer year) {
        return teamService.getTeamById(year);
    }

    @GetMapping("/name/{name}")
    public Iterable<Team> getTeamByName(@PathVariable String name) {
        return teamService.getTeamByName(name);
    }

    @PostMapping
    public Team addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @PutMapping("/{year}")
    public Team updateTeam(@RequestBody Team team, @PathVariable Integer year) {
        team.setYear(year); // Ensure the ID (year) is set for the update
        return teamService.updateTeam(team);
    }

    @DeleteMapping("/{year}")
    public void deleteTeam(@PathVariable Integer year) {
        teamService.deleteTeam(year);
    }
}
