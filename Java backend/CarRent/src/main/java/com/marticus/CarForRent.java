package com.marticus;

public class CarForRent {
	public CarRental crn;

	public CarRental getCrn() {
		return crn;
	}

	public void setCrn(CarRental crn) {
		this.crn = crn;
	}

	public void rentCar()
	{
		
		crn.showRent();
		
	}
	

	
}
