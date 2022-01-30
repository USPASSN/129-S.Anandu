package com.marticus.reservation.bo.impl;

import com.marticus.reservation.bo.Reservation;

public class ReservationImpl implements Reservation {

	public void addCustomer() {
		System.out.println(" addCustomer() is running ");
	}

	public String addCustomerReturnValue() {
		System.out.println(" addCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println(" addCustomerThrowException() is running ");
		throw new Exception("Error");
	}

	public void addCustomerAround(String name) {
		System.out.println(" addCustomerAround() is running, args : " + name);
	}
}