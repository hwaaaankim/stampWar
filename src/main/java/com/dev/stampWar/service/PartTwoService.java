package com.dev.stampWar.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.stampWar.model.EventTwo;
import com.dev.stampWar.repository.PartTwoRepository;

@Service
public class PartTwoService {

	@Autowired
	PartTwoRepository partTwoRepository;
	
	public void eventInsert(EventTwo eventTwo) {
		eventTwo.setToday(new Date());
		partTwoRepository.save(eventTwo);
	}
}
