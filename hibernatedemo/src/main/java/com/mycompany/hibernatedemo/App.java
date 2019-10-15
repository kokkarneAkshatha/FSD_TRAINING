package com.mycompany.hibernatedemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernatedemo.model.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	   SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
    			   addAnnotatedClass(Students.class).buildSessionFactory();
    	   Session session=factory.getCurrentSession();
    	   Students student=new Students();
    	   student.setFirstName("John");
    	   student.setLastName("Doe");
    	   student.setEmail("john@luv2code.com");
    	   session.getTransaction().begin();
    	   session.save(student);
    	   session.getTransaction().commit();
    	   System.out.println("sucess");
    	   session.close();
    	   
    	   
    	   
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
}
