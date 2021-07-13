package QAmonCodeTestByAkhi;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import QAmonCodeTestByAkhi.SignInPage_Object_Locator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPage_POM_TestNG {
	



//Use the @BeforeTest, @Test, @AfterTest annotation
		// create class variable
		WebDriver driver=null;
		
		// Before test function
		
			@BeforeTest
			public void setUpTest()
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		
			//Test function
			
			@Test
			public void testStep1() throws InterruptedException
			{
				driver.get("https://www.acquireangel.com/signin");
				
				// mail 
				SignInPage_Object_Locator.email(driver).sendKeys("hamidsaymon9@gmail.com");
				
				// password 
				SignInPage_Object_Locator.password(driver).sendKeys("Abc12345");
				
				// remember me 
				SignInPage_Object_Locator.rememberme(driver).click();
				
				// sign in
				SignInPage_Object_Locator.signinbutton(driver).click();
				
				Thread.sleep(3000);
			}
			
			
		// close function
			@AfterTest
			public void tearDown()
		{
			driver.close();
		}
}

	


