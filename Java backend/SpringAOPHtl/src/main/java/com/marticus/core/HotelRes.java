package com.marticus.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marticus.auth.Authenticate;
import com.marticus.reservation.bo.Reservation;


public class HotelRes {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Reservation.xml");

		
		Reservation customer = (Reservation) appContext.getBean("reservation");
		customer.addCustomer();
		
		Authenticate authRevs = (Authenticate) appContext.getBean("auth");
	
		authRevs.checkin();
		authRevs.checkout();
	}
}