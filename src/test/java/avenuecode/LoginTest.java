//package avenuecode;
//
//import org.testng.annotations.Test;
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import avenuecode.TestComponents.BaseTest;
//import avenuecode.pageObjects.HomePage;
//import avenuecode.pageObjects.LandingPage;
//
//public class LoginTest extends BaseTest{
//	
//	@Test
//	public void logIntoWebapp() throws IOException
//	{
//		
//		//Passing the webdriver object into the LandingPage class
//		LandingPage landingPage = new LandingPage(driver);
//		landingPage.goTo();
//		HomePage homepage = landingPage.loginApplication("uzzma02@gmail.com", "assessmentqa");
//		homepage.goToMyTasks();
//		
//		
//		driver.close();
//	}
//	
//	
//	
//
//}
