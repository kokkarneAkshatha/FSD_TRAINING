package com.mycompany.Hibernate_Cascading.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Detail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theId = 2999;
			Instructor_Detail tempInstructorDetail = session.get(Instructor_Detail.class, theId);

			System.out.println("tempInstructorDetail: " + tempInstructorDetail);

			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());

			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			session.close();

			factory.close();
		}
	}

}
