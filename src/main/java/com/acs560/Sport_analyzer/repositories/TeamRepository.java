package com.acs560.Sport_analyzer.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.acs560.Sport_analyzer.entities.TeamEntity;
import com.acs560.Sport_analyzer.entities.TeamEntityId;

public interface TeamRepository extends CrudRepository<TeamEntity, TeamEntityId> {

	List<TeamEntity> findAllByIdName(String name);
	
	List<TeamEntity> findAllByIdYearAndIdName(int year, String name);

	List<TeamEntity> findAllByIdYear(int year);
	
	List<TeamEntity> findAllByIdYearIn(Set<Integer> years);
	
	List<TeamEntity> findAllByIdNameAndIdYearIn(String name, Set<Integer> years);

}













