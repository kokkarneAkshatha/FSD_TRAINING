package com.mycompany.Hipernate_Relationship.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Instructor_details")

public class Instructor_details implements Serializable {
	@Id
	@Column(name = "Instruction_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Instructor_id;
	
	private String youtube_channel;
	
	private String hobby;
	
	}
