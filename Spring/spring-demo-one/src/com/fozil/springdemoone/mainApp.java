package com.fozil.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
	
		//create spring container(application context) -> xml configuration file
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		//retrieve beans from Spring container(application context)
		Coach theCoach = container.getBean("baseballCoach", Coach.class);
		
		
		//use the beans(objects)
		System.out.println(theCoach.getDailyWorkOut());
		
		
		//clean the container
		container.close();
	}

}
