package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;

public class RMPtest {
	
	
	
	WebDriver driver;
	
	ConfigFileReader config = new ConfigFileReader();
	
	@Given("^I am on the RMP Page$")
	public void i_am_on_the_Google_Page() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	    
		//ConfigFileReader config = new ConfigFileReader();
		
		
		 
		 Reporter.addStepLog("Chome browser opend and entered the URL");
		 
	}

	@When("^I enter user name and1 password$")
	public void i_enter_user_name_and_password() throws Throwable {
		
	
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("rmp-demo-1");
		
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.id("kc-login")).click();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 Reporter.addStepLog("entered user name and password");
	}

	@Then("^I see page logged1 in$")
	public void i_see_page_logged_in() throws Throwable {	
		
		driver.quit();
		
		Reporter.addStepLog("driver has been closed");
	}
}
