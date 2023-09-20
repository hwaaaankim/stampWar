package com.dev.stampWar.model.member;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TB_AI")
@Data
public class AiModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AI_ID")
	private Long id;
	
	@Column(name="AI_ANIMAL")
	private String animal;
	
	@Column(name="AI_ACTION")
	private String animalAction;
	
	@Column(name="AI_POINT")
	private String animalPoint;
	
	@Column(name="AI_ENV")
	private String animalEnviron;
	
	@Column(name="AI_STYLE")
	private String animalStyle;
	
	@Column(name="AI_PROMPT_STYLE")
	private String animalPrompt;
	
	@OneToMany(
			fetch = FetchType.LAZY, 
			cascade = CascadeType.ALL,
			orphanRemoval = true,
			mappedBy = "aiId"
			)
	private List<AiImageModel> images;
		
}
