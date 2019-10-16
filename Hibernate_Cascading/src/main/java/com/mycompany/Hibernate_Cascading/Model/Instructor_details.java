package com.mycompany.Hibernate_Cascading.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="instructor_detail")
public class Instructor_details {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	
	@Column(name="hobby")
	private String hobby;
	
	 @OneToOne(cascade=CascadeType.ALL,mappedBy="instructorDetail")
	private Instructor instructor;
	public Instructor_details() {
		
	}

	public Instructor_details(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}
		
}
