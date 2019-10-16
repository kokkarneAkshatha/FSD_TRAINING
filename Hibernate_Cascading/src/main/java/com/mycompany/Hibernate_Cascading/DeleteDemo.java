package com.mycompany.Hibernate_Cascading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.Hibernate_Cascading.Model.Instructor;
import com.mycompany.Hibernate_Cascading.Model.Instructor_details;

public class DeleteDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_details.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theId = 2;
			Instructor_details tempInstructor = session.get(Instructor_details.class, theId);

			System.out.println("Found instructor: " + tempInstructor);

			if (tempInstructor != null) {

				System.out.println("Deleting: " + tempInstructor);

				session.delete(tempInstructor);
			}

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
