package com.mycompany.hibernate_crud_demo;

/**
 * Hello world!
 *
 */


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_crud_demo.model.Employee2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory factory=
        			new Configuration().configure().
        			addAnnotatedClass(Employee2.class).
        			buildSessionFactory();
        	Session session=
        			factory.getCurrentSession();
        	Employee2 employee=new Employee2();
        	employee.setFirstName("John");
        	employee.setLastName("Doe");
        	employee.setEmail("john@email.com");
        	session.getTransaction().begin();
        	session.persist(employee);
        	session.getTransaction().commit();
        	System.out.println("sucess!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}

