package com.mycompany.Hibernate_Cascading.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import com.mycompany.Hibernate_Cascading.many_to_many.Model.Course;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.Instructor;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.InstructorDetail;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.Review;
import com.mycompany.Hibernate_Cascading.many_to_many.Model.Student;


public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			Course tempCourse = new Course("Pacman - How To Score One Million Points");

			System.out.println("\nSaving the course ...");
			session.save(tempCourse);
			System.out.println("Saved the course: " + tempCourse);

			Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
			Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");

			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);

			System.out.println("\nSaving students ...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			System.out.println("Saved students: " + tempCourse.getStudents());

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}