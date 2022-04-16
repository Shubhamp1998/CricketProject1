package com.cricket.CricketProject.sevice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cricket.CricketProject.model.TeamModel;
import com.cricket.CricketProject.repository.TeamRepository;

@Service

public class TeamService {
	@Autowired
	TeamRepository teamRepository;

	// getting all team record by using the method findaAll() of CrudRepository
	public List<TeamModel> getAllTeam() {
		// List<TeamModel> team = new ArrayList<TeamModel>();
		// teamRepository.findAll().forEach(team1 -> team.add(team1));
		// return team;
		return teamRepository.findAll();
	}

	// getting a specific record by using the method findById() of CrudRepository
	public TeamModel getTeamById(int id) {
		return teamRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(TeamModel team) {
		teamRepository.save(team);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		teamRepository.deleteById(id);
	}

	// updating a record
	public void update(TeamModel team, int teamid) {
		teamRepository.save(team);
	}
}