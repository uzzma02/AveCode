package avenuecode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import avenuecode.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents{
	
	//Local driver for this class
	WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
			
			super(driver);
			//initialization
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
	}
	
	//PageFactory Design Pattern
	@FindBy(id="user_email")
	WebElement emailElement;
	
	@FindBy(id="user_password")
	WebElement passwordElement;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signIn;
		
		
	//Navigate to the url
	public void goTo() 
	{
		driver.get("https://qa-test.avenuecode.io/users/sign_in");
	}
	
	//Log into the url
	public HomePage loginApplication(String email, String password) 
	{
		
		emailElement.sendKeys(email);
		passwordElement.sendKeys(password);
		signIn.click();
		
		//object for the next page
		HomePage homepage = new HomePage(driver);
		return homepage;
		
	}	

}
