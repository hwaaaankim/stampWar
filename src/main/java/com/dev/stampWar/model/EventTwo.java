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
@Table(name="TB_PART_TWO")
@Data
public class EventTwo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TWO_ID")
	private Long id;
	
	@Column(name="TWO_NAME")
	private String name;
	
	@Column(name="TWO_STAMP")
	private String stamp;
	
	@Column(name="TWO_PHONE")
	private String phone;
	
	@Column(name="TWO_ADDRESS")
	private String address;
	
	@Column(name="TWO_DATE")
	private Date today;
	
	@Column(name="TWO_NUMBER")
	private String number;
}
