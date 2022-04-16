package com.cricket.CricketProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cricket.CricketProject.model.TeamModel;


//repository that extends CrudRepository  
public interface TeamRepository extends JpaRepository<TeamModel, Integer>  
{  
	
}

