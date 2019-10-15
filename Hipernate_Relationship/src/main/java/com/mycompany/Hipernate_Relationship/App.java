package com.mycompany.Hipernate_Relationship;

/**
 * Hello world!
 *
 */import java.util.List;
 import java.util.Scanner;

 import org.hibernate.Session;
 import org.hibernate.SessionFactory;
 import org.hibernate.cfg.Configuration;

import com.mycompany.Hipernate_Relationship.model.Instructor;
import com.mycompany.Hipernate_Relationship.model.Instructor_details;


public class App 
{
    public static void main( String[] args )
    {
    	try {
        	SessionFactory factory=
        			new Configuration().configure().
        			addAnnotatedClass(Instructor_details.class).addAnnotatedClass(Instructor.class).
        			buildSessionFactory();
        	Session session=
        			factory.getCurrentSession();
        	Instructor_details details=new Instructor_details();
        	details.setYoutube_channel("mychannel");
        	details.setHobby("coding");
        	
        	
        	
        	Instructor main=new Instructor();
        	main.setFirstName("aksha");
        	main.setLastName("kokk");
        	main.setEmail("kokk@gmail");
        	
        	
        	
        	
        	session.getTransaction().begin();
        	session.persist(details);
        	session.persist(main);
        	session.getTransaction().commit();
        	
        	
        	System.out.println("sucess!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
