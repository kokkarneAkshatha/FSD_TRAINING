package com.mycompany.Hibernate_table_per_subclas;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mycompany.Hibernate_table_per_subclas.*;

public class Account_Test {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class)
					.addAnnotatedClass(Savings.class)
					.addAnnotatedClass(Current.class).buildSessionFactory();
			Session session = factory.openSession();
			Account ac=new Account("aksha","kokk","1234");
			Savings sa=new Savings("akshatha","kokkarne","1234",1000,"sa");
			Current ca=new Current("Saksha","Bkokk","12343489",12);
			
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
