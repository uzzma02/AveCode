package avenuecode;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import avenuecode.TestComponents.BaseTest;
import avenuecode.pageObjects.HomePage;
import avenuecode.pageObjects.MyTasksPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTasksTest extends BaseTest{

	@Test
	public void createNewTask() throws IOException
	{
		// TODO Auto-generated method stub	
		HomePage homePage = landingPage.loginApplication("uzzma02@gmail.com", "assessmentqa");
		homePage.goToMyTasks();
		MyTasksPage mytasksPage = new MyTasksPage(driver);
		mytasksPage.createNewTask("Task40");
	}

	@Test
	public void checkTaskLength() throws IOException
	{
		// TODO Auto-generated method stub
		HomePage homePage = landingPage.loginApplication("uzzma02@gmail.com", "assessmentqa");
		homePage.goToMyTasks();
		MyTasksPage mytasksPage = new MyTasksPage(driver);
		mytasksPage.checkNewTaskLength("ab");
		
	}
}
