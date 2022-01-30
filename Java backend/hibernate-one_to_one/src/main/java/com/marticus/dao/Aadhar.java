package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AADHAR")
public class Aadhar {

	private long AadharId;
	private String number;
	
	
	
	public Aadhar() {
	}

	public Aadhar(String number) {
		this.number = number;
	}

	@Id
	@GeneratedValue
	@Column(name = "AADHAR_ID")
	public long getAadharId() {
		return this.AadharId;
	}

	public void setAadharId(long aadharId) {
		this.AadharId = aadharId;
	}

	
	@Column(name = "AADHAR_NUMBER", nullable = false, length=250)
	public String getNumber() {
		return  this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
}