package selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class loginstep {
private static WebDriver driver;
//	
//	
//	@Given("I am on login page")
//	public void i_am_on_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver","C:/Users/anand/OneDrive/Documents/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//	      driver.get("https://demo.guru99.com/test/newtours/"); 
//	    
//	}
//
//	@When("I enter username sa {string} and password as {string}")
//	public void i_enter_username_as_and_password_as(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.name("userName")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("admin");
//	}
//
//	@When("I click on submit")
//	public void i_click_on_submit() {
//	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.name("submit")).submit();
//	
//	}
//
//	
//	@Then("I will see the user home page")
//	public void i_will_see_the_user_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//
//
//
//}
	
		 
		@Given("user in Demo auth login page")
		public void user_in_demo_auth_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver","C:/Users/anand/OneDrive/Documents/chromedriver.exe");
			driver = new ChromeDriver();
	
		      driver.navigate().to("https://www.ebay.com"); 
		    
		}

		@When("user enter correct username")
		public void user_enter_correct_username() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement txt1 = driver.findElement(By.name("userName"));
			txt1.sendKeys("admin");
		}

		@And("user enter correct password")
		public void user_enter_correct_password() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement txt1 = driver.findElement(By.name("password"));
			txt1.sendKeys("admin");
		}

		@And("user click on login")
		public void user_click_on_login() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement btnclick = driver.findElement(By.name("submit"));
			btnclick.click();
		}

		@Then("user redirect to homepage")
		public void user_redirect_to_homepage() {
		    // Write code here that turns the phrase above into concrete actions
		   
		}



	}

	
	