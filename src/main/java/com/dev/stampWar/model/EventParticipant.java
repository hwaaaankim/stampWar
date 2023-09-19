package com.dev.stampWar.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TB_PARTICIPANT")
@Data
public class EventParticipant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PARTICIPANT_ID")
	private Long id;
	
	@Column(name="PARTICIPANT_NAME")
	private String name;
	
	@Column(name="PARTICIPANT_INSTAGRAM")
	private String instagramId;
	
	@Column(name="PARTICIPANT_PHONE")
	private String phone;
	
	@Column(name="PARTICIPANT_DATE")
	private Date today;
	
	@Column(name="PARTICIPANT_ANSWER")
	private String answer;
}
