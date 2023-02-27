package avenuecode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import avenuecode.AbstractComponents.AbstractComponents;

public class HomePage extends AbstractComponents{
	
	//local driver for this class
	WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//PageFactory Design Pattern
	@FindBy(id="my_task")
	WebElement myTaskElement;
	
	
	public MyTasksPage goToMyTasks() 
	{
		
		myTaskElement.click();
		
		//object for the next page
		MyTasksPage mytaskspage = new MyTasksPage(driver);
		return mytaskspage;
		
	}
	
}