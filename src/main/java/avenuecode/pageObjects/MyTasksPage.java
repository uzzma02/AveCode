package avenuecode.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import avenuecode.AbstractComponents.AbstractComponents;
//import dev.failsafe.internal.util.Assert;
import org.testng.Assert;

public class MyTasksPage extends AbstractComponents{
	
	//local driver for this class
	WebDriver driver;
	
	public MyTasksPage(WebDriver driver) 
	{
		
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//PageFactory Design Pattern
	@FindBy(id="new_task")
	WebElement newTaskTextField;
	
	@FindBy(xpath="//span[@ng-click='addTask()']")
	WebElement addNewTaskButton;
	
	@FindBy(xpath="//a[@editable-text='task.body'][1]")
	WebElement firstTaskInList;
	
	@FindBy(xpath="//input[@type='text'][2]")
	WebElement taskEditField;
	
	
	public void createNewTask(String newtask) 
	{
		
		newTaskTextField.click();
		newTaskTextField.sendKeys(newtask);
		addNewTaskButton.click();
		
	}
	
	public void checkNewTaskLength(String newtask)
	{
		
		newTaskTextField.click();
		newTaskTextField.sendKeys(newtask);
		addNewTaskButton.click();
		int taskLength = newtask.length();
		if (taskLength >= 3 && taskLength <= 250)
		{
			boolean isSuitableLength = true;
			Assert.assertFalse(isSuitableLength);
		}
		else
		{
			boolean isSuitableLength = false;
			Assert.assertFalse(isSuitableLength);
		}	
		
	}
	
}