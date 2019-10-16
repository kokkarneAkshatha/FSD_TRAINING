package com.mycompany.Hibernate_Cascading.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.mycompany.Hibernate_Cascading.many_to_many.Model.Course;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.Instructor;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.InstructorDetail;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.Review;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.Student;


public class DeletePacmanCourseDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int courseId = 3;
			Course tempCourse = session.get(Course.class, courseId);

			System.out.println("Deleting course: " + tempCourse);

			session.delete(tempCourse);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}