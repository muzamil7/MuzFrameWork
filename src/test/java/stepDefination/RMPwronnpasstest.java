package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RMPwronnpasstest {

	
	WebDriver driver;
	
	
	@Given("^I am on the RMP(\\d+) Page$")
	public void i_am_on_the_RMP_Page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Browsers/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://sso-dev.notprod.homeoffice.gov.uk/auth/realms/rmp-demo/protocol/openid-connect/auth?client_id=rmp-web&redirect_uri=https%3A%2F%2Fdemo.rmp.homeoffice.gov.uk%2Foauth%2Fcallback&response_type=code&scope=openid+email+profile&state=Lw%3D%3D");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^I enter user name and(\\d+) password start booking$")
	public void i_enter_user_name_and_password_start_booking(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("username")).sendKeys("rmp-demo-1");
		
		driver.findElement(By.id("password")).sendKeys("passwor");
		
		driver.findElement(By.id("kc-login")).click();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@Then("^I see booking created$")
	public void i_see_booking_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.quit();
	    
	}
}
