package com.mycompany.Hibernate_Cascading.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Detail.class).addAnnotatedClass(Course.class).buildSessionFactory();

	
		Session session = factory.getCurrentSession();

		try {

			Instructor tempInstructor = new Instructor("Susan", "Public", "susan.public@luv2code.com");

			Instructor_Detail tempInstructorDetail = new Instructor_Detail("http://www.youtube.com", "Video Games");

			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			

			session.beginTransaction();

			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}