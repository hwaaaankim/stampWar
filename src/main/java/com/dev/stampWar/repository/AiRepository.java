package com.dev.stampWar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.stampWar.model.member.AiModel;

@Repository
public interface AiRepository extends JpaRepository<AiModel, Long>{

	List<AiModel> findAllByAnimal(
			String animal
			);
	
	Optional<AiModel> findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(
			String animal,
			String animalAction,
			String animalPoint,
			String animalEnviron,
			String animalStyle,
			String animalPrompt
			);
	
}
