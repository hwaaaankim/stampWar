package com.dev.stampWar.service.exhibition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.stampWar.repository.exhibition.ExhibitionRepository;

@Service
public class ExhibitionService {

	@Autowired
	ExhibitionRepository exhibitionRepository;
}
