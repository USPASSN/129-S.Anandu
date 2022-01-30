package com.marticus.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ReservationHotelAspect {
	@Before(" execution(* com.marticus.auth.Authenticate.checkin(..))")
	public void checkID()
	{
		System.out.println("Cheacking ID");
	}
	
	@Before("execution(* com.marticus.auth.Authenticate.checkin(..))")
	public void checkVaccCert()
	{
		System.out.println("Vaccine Certificate Verification");
	}
	
	@Before("execution(* com.marticus.auth.Authenticate.checkout(..))")
	public void checkRoomStatus()
	{
		System.out.println("Checking Rooms Status");
	}
	
	@Before("execution(* com.marticus.auth.Authenticate.checkout(..))")
	public void idCheckPostCheckin() 
	{
		System.out.println("ID Check Post Check-In is Ok");
	}
	
	@Around("execution(* com.marticus.auth.Authenticate.checkout(..))")
	public void logAround(ProceedingJoinPoint joinPoint)throws Throwable
	{
		System.out.println("LogAround() is running..!!");
		System.out.println("Around berfore is running..!!");
		joinPoint.proceed();
		System.out.println("LogAround() is running..!!");
		System.out.println("--------------------------------");
	}
}