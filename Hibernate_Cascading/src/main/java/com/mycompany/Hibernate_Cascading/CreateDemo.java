package com.mycompany.Hibernate_Cascading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.Hibernate_Cascading.Model.Instructor;
import com.mycompany.Hibernate_Cascading.Model.Instructor_details;

public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(Instructor_details.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			Instructor tempInstructor = 
					new Instructor("Madhu", "Patel", "madhu@luv2code.com");
			
			Instructor_details tempInstructorDetail =
					new Instructor_details(
							"http://www.youtube.com",
							"Guitar");		
			
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			session.beginTransaction();
			
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);

			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}

