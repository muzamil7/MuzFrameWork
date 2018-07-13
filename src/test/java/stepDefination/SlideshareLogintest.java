package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;


public class SlideshareLogintest {
	
	ConfigFileReader config = new ConfigFileReader();
	
	WebDriver driver;
	
	@Given("^I am on the Google Page$")
	public void i_am_on_the_Google_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    config.getBrowser();
	    
		System.setProperty("webdriver.chrome.driver", config.getchromeDriverPathWindows());
		
		driver = new ChromeDriver();
	    
	   System.out.println( "test >>>>>>>>" +config.getBrowser() );
		
		config.getBrowserWindowSize();
		
		driver.get(config.getApplicationUrl());
		
		config.getImplicitlyWait();*/
	}

	@When("^I enter user name and password$")
	public void i_enter_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("user_login")).sendKeys(config.getUserName());
		
		driver.findElement(By.id("user_password")).sendKeys(config.getPassword());
		
		driver.findElement(By.id("login_from_loginpage")).click();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^I see page logged in$")
	public void i_see_page_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//*[@id="login-form"]/fieldset/div[3]
		
		
		
		
		driver.quit();
	}
}
