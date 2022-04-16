package com.cricket.CricketProject.sevice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.CricketProject.repository.BookingRepository;
import com.entity.EventModel;
import com.repository.bookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingrepository;

	public List<EventModel> getAllevent() {
		return BookingRepository.findAll();
	}
//	public EventModel createevent(EventModel eventmodel) {
//		EventModel event = new EventModel(eventmodel);
//		event = bookingrepository.save(event);
//		return event;
//	}

	public EventModel addevent(EventModel em) {
		return Bookingrepository.save(em);
	}
}
