package com.cricket.CricketProject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.CricketProject.model.TeamModel;
import com.cricket.CricketProject.sevice.TeamService;

@RestController
public class TeamController {
	// autowire the TeamService class
	@Autowired
	TeamService teamService;

	// creating a get mapping that retrieves all the team detail from the database
	@GetMapping("/team")
	private List<TeamModel> getAllTeam() {
		return teamService.getAllTeam();
	}

	// creating a get mapping that retrieves the detail of a specific team
	@GetMapping("/team/{teamid}")
	private TeamModel getTeam(@PathVariable("teamid") int teamid) {
		return teamService.getTeamById(teamid);
	}

	// creating a delete mapping that deletes a specified team
	@DeleteMapping("/team/{teamid}")
	private void deleteTeam(@PathVariable("teamid") int teamid) {
		teamService.delete(teamid);
	}

	// creating post mapping that post the team detail in the database
	@PostMapping("/team")
	private int addTeam(@RequestBody TeamModel team) {
		teamService.saveOrUpdate(team);
		return team.getTeamID();
	}

	// creating put mapping that updates the team detail
	@PutMapping("/team")
	private TeamModel editTeam(@RequestBody TeamModel team) {
		teamService.saveOrUpdate(team);
		return team;
	}
}
