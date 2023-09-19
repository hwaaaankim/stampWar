package com.dev.stampWar.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.stampWar.model.EventParticipant;
import com.dev.stampWar.repository.EventParticipantRepository;

@Service
public class EventParticipantService {

	@Autowired
	EventParticipantRepository eventParticipantRepository;
	
	public void eventInsert(EventParticipant eventParticipant) {
		eventParticipant.setToday(new Date());
		eventParticipantRepository.save(eventParticipant);
	}
}
