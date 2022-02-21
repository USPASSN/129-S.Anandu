package com.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	private static WebDriver driver;
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anand\\OneDrive\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		//open webpage
		driver.get("http://www.google.com");
		
		//select the textbpx and pass input
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//click on the button
		
		//close browser
		//driver.close();
		
		
	}
	

}
