package com.dev.stampWar.service.exhibition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.stampWar.repository.exhibition.ExhibitionImageRepository;

@Service
public class ExhibitionImageService {

	@Autowired
	ExhibitionImageRepository exhibitionImageRepository;
}
