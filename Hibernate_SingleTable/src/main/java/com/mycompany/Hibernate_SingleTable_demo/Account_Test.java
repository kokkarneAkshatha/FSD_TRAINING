package com.mycompany.Hibernate_SingleTable_demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Account_Test {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class)
					.addAnnotatedClass(Savings.class)
					.addAnnotatedClass(Current.class).buildSessionFactory();
			Session session = factory.openSession();
			Account ac=new Account("aksha","kokk","1234");
			Savings sa=new Savings("aksha","kokk","1234",1000,"sa");
			Current ca=new Current("aksha","kokk","1234",12);
			
		session.getTransaction().begin();
			session.save(ac);
			session.save(sa);
			session.save(ca);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
