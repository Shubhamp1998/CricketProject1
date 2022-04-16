package com.cricket.CricketProject.sevice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cricket.CricketProject.model.RefereeModel;
import com.cricket.CricketProject.repository.RefereeRepository;

@Service

public class RefereeService {
	@Autowired
	RefereeRepository refereeRepository;

	// getting all Referee record by using the method findaAll() of CrudRepository
	public List<RefereeModel> getAllReferee() {
		// List<RefereeModel> referee = new ArrayList<RefereeModel>();
		// teamRepository.findAll().forEach(referee1 -> referee.add(referee1));
		// return referee;
		return refereeRepository.findAll();
	}

	// getting a specific record by using the method findById() of CrudRepository
	public RefereeModel getRefereeById(int id) {
		return refereeRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(RefereeModel referee) {
		refereeRepository.save(referee);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		refereeRepository.deleteById(id);
	}

	// updating a record
	public void update(RefereeModel referee, int refereeid) {
		refereeRepository.save(referee);
	}
}