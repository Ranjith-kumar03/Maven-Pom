package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Hook;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MobileApp_StepDefinition {
	
	private WebDriver driver;
	private WebElement element;
	
	public MobileApp_StepDefinition()
	{
		this.driver=Hook.getdriver();
	}
	
	@Given("open the browser")
	public void open_the_browser() {
	    
		driver.get("https://www.facebook.com/");
		
	    
	}

	@Then("Enter username")
	public void enter_username()  {
		
		driver.findElement(By.name("email")).sendKeys("xxxxxxxxxxxxxxx@gnmail.com");
		
	    
	}

	@Then("Enter password")
	
	public void enter_password()  {
		
		element =driver.findElement(By.name("pass"));
		element.sendKeys("xxxxxxxxxxxxxxx");
	    
	}

	@Then("press the login button")
	public void press_the_login_button()  {
	
		element =driver.findElement(By.id("loginbutton"));
		element.click();
	    
	}

	@Then("Quit the browser")
	public void quit_the_browser() throws InterruptedException  {
		Thread.sleep(20000);
		
	    
	}

}
