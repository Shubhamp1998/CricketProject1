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

import com.cricket.CricketProject.model.RefereeModel;
import com.cricket.CricketProject.sevice.RefereeService;

@RestController
public class RefereeController {
	// autowire the RefereeService class
	@Autowired
	RefereeService refereeService;

	// creating a get mapping that retrieves all the Referee detail from the database
	@GetMapping("/referee")
	private List<RefereeModel> getAllReferee() {
		return refereeService.getAllReferee();
	}

	// creating a get mapping that retrieves the detail of a specific referee
	@GetMapping("/referee/{refereeid}")
	private RefereeModel getReferee(@PathVariable("refereeid") int refereeid) {
		return refereeService.getRefereeById(refereeid);
	}

	// creating a delete mapping that deletes a specified Referee
	@DeleteMapping("/referee/{refereeid}")
	private void deleteReferee(@PathVariable("refereeid") int refereeid) {
		refereeService.delete(refereeid);
	}

	// creating post mapping that post the Referee detail in the database
	@PostMapping("/referee")
	private int addReferee(@RequestBody RefereeModel referee) {
		refereeService.saveOrUpdate(referee);
		return referee.getRefereeID();
	}

	// creating put mapping that updates the Referee detail
	@PutMapping("/referee")
	private RefereeModel editReferee(@RequestBody RefereeModel referee) {
		refereeService.saveOrUpdate(referee);
		return referee;
	}
}

