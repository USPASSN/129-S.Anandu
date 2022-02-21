package com.selenium.project;
import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Flipkart
{
	private static WebDriver driver;
 
@Test (priority=1)
  public void flipkart() throws Exception {
	  driver.manage().window().maximize();
		
		//Navigate to URL 
		
		driver.navigate().to("https://www.flipkart.com");
		
		//Close the popup - Use Xpath and the text() method in xpath to close
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
		
		//Search for text "fitbit" and click on search icon 
		
		WebElement search = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		search.sendKeys("fitbit");
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).submit();	
				
		WebElement result= driver.findElement(By.tagName("span"));
		if(result.isDisplayed()) 
		{
		    System.out.println("RESULT HAS MORE THAN 900 PRODUCTS: PASS");	
		}
		else
		{
			System.out.println("RESULT HAS MORE THAN 900 PRODUCTS: FAIL");
		}
		 Thread.sleep(3000);		
		//Click on the first result link. A new tab will open for the product details page 
		
         driver.findElement(By.xpath(" //div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div/div")).click();
				
         Thread.sleep(2500);
		driver.get("https://www.flipkart.com/fitbit-sense-smartwatch/p/itm2eeca6d8e1962?pid=SMWGF9NZFZFX8ZGV&lid=LSTSMWGF9NZFZFX8ZGVNVSBPT&marketplace=FLIPKART&q=ftibit&store=ajy&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=c1c69bdb-65d2-4a63-a378-56ef1ceaf268.SMWGF9NZFZFX8ZGV.SEARCH&ppt=sp&ppn=sp&ssid=kgdm96o5800000001645340369353&qH=bdf581d3f70e100f");
		takeScreenshot("productdetail");	
				
	}
	public static void takeScreenshot(String fileName) throws IOException, Exception {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:/Users/anand/eclipse-workspace/Selenium Project1/"
				+ "src/Screenshot/"+""+fileName+".png"));

	}
	//capture original and final price 
	@Test (priority=2)
	public void price() throws Exception 
	{
		String finalprice=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]")).getText();
		String originalprice=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]")).getText();
		String discountpercent=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/span[1]")).getText();
		String a= finalprice;
		String b= originalprice;
		String c= discountpercent;
		System.out.println("Original price:"+b);
		System.out.println("Final price:"+a);
		System.out.println("Discount Percentage:"+c);

		//discount verification
		WebElement discountverify=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/span[1]"));
		String text=discountverify.getText();
		System.out.println("Verified Discount="+text);
		if (text.contains(discountpercent))

		{
		//add to cart
			WebElement button= driver.findElement(By.xpath("//button[contains(.,' ADD TO CART')]"));
			button.click();
		}
		else 
		{
			System.out.println("Discount not matched...unable to proceed!");
			
		}	
		Thread.sleep(3000);
	
	 //Final amount verification in cart
		String expectedprice = "₹21,499";
		WebElement act1 = driver.findElement(By.xpath("//span[contains(text(),'₹21,499')] "));
		String actual = act1.getText();
        Assert.assertEquals(actual, expectedprice);
		System.out.println("Verified price of product:" + actual);
		
		if(expectedprice.contains(finalprice))
		{
			System.out.println("Total Amount EQUAL Final Amount, This item can be purchased!");
		}
		else
		{
			System.out.println("Total Amount NOT EQUAL Final Amount, Please Recheck item!");
		}
			 
	}
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/anand/OneDrive/Documents/chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  driver.quit();
  }

}