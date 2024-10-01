package com.acs560.Sport_analyzer.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sports.acs560.performance_analyzer.models.Team;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

    List<Team> findByName(String name);

    List<Team> findByYear(int year);

    List<Team> findByLeague(String league);

    List<Team> findByWins(int wins);

    List<Team> findByLosses(int losses);

    List<Team> findByPoints(int points);
}







