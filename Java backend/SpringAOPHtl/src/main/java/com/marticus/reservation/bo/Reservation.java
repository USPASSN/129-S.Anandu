package com.marticus.reservation.bo;

public interface Reservation {
	
	void addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);

}