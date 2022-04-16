package com.cricket.CricketProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cricket.CricketProject.model.RefereeModel;


//repository that extends CrudRepository  
public interface RefereeRepository extends JpaRepository<RefereeModel, Integer>  
{

	List<RefereeModel> findAll();

	List<RefereeModel> findAll();  
	
}
