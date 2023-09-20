package com.dev.stampWar.model.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TB_IMAGE")
@Data
public class AiImageModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IMAGE_ID")
	private Long id;
	
	@Column(name="IMAGE_PATH")
	private String path;
	
	@Column(name="IMAGE_REFER_ID")
	private Long aiId;
	
		
}
