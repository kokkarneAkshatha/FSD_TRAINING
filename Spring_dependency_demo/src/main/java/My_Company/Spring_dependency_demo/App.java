package My_Company.Spring_dependency_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import My_Company.Spring_dependency_demo.beans.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	ClassPathXmlApplicationContext context=null;
    try {
		
		 context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Coach tempCoach=context.getBean("theCoach",BaseballCoach.class);
		 * System.out.println(tempCoach.getDailyWorkout());
		 */

		Coach Mycoach=context.getBean("MyCoach", Coach.class);
		System.out.println("dailay"+Mycoach.getDailyWorkout());
		System.out.println("Fortune"+Mycoach.getDailyFortune());
		
	
	} catch (Exception e) {
		e.printStackTrace();
	}
   
}
}
