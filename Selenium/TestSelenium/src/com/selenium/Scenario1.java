package com.selenium;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Scenario1 {
	private static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"E:\\COLLEBRA TESTING\\ZIP&zar\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver .close();
	}

	@Test
	void test() {
		
		
		driver.get("http://qatechhub.com");
	   driver.manage().window().maximize();
	   //print currenurl
	   String pgurl= driver.getCurrentUrl();
	   System.out.println(pgurl);
	    
		//title of the page both expected and actual
		String expectedtitle ="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
	
		
	
		String actualtitle = driver.getTitle();
	     System.out.println( "Actaul titleof the page is :"+actualtitle);
	     System.out.println("Expected title of the page is :"+expectedtitle);
	     
	     
	     if(actualtitle.toLowerCase().contains(expectedtitle.toLowerCase())) {
	    	 System.out.println("TEST PASS"); 
	    	 
	     }else {
	    	 System.out.println("TEST FAIL");
	     }
	 System.out.println("---------------------------------------------------");
		//assert equals
		//Assert.assertEquals(expectedtitle, actualtitle);
		
		//naviagte to the fcebook page 
		driver.navigate().to("https://www.facebook.com");
		
		String crnturl=driver.getCurrentUrl();
		  System.out.println("now current url is:"+crnturl);
		 System.out.println("-----------------------------------------"); 
		  
		 //Navigate back to the QA Tech Hub website.
		 
		  driver.navigate().back();
		  //Print the URL of the current page.
		 String cu= driver.getCurrentUrl();
		  System.out.println("NOw current url is after back to the url  is :"+cu);
		  
		  //Navigate forward.
		  driver.navigate().forward();
		  
		  //reload the page 
		  driver.navigate().refresh();
	}

}