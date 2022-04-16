package com.cricket.CricketProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.EventModel;

@Repository
public interface BookingRepository extends JpaRepository<EventModel, Long> {

	
}
