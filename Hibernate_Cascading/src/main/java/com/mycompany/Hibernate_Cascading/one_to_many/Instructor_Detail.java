package com.mycompany.Hibernate_Cascading.one_to_many;

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
public class Instructor_Detail {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	
	@Column(name="hobby")
	private String hobby;

	@OneToOne(mappedBy="instructorDetail", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	private Instructor instructor;

	
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}


	public Instructor_Detail() {
		super();
	}


	public Instructor_Detail(String youtubeChannel, String hobby) {
		super();
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
		
}






