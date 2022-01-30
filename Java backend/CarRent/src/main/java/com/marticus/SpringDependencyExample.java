package com.marticus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyExample {

	public static void main(String[] args) {
		
		ApplicationContext appContext= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		CarForRent crnt= (CarForRent)appContext.getBean("crn");
		CarForRent crnt1= (CarForRent)appContext.getBean("crn1");
		crnt.rentCar();
		crnt1.rentCar(); 
	}

}
