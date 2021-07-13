package QAmonCodeTestByAkhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage_Object_Locator {

	
		// TODO Auto-generated method stub
		
		
		// object locator class
		
		private static WebElement locator=null;
		
		// email
		public static WebElement email(WebDriver driver)
		{
			locator=driver.findElement(By.id("Email"));
			return locator;
		}
		
		// password
		public static WebElement password(WebDriver driver)
		{
			locator=driver.findElement(By.id("Password"));
			return locator;
		}
		
		// remember me
		public static WebElement rememberme(WebDriver driver)
		{
			locator=driver.findElement(By.id("IsRemember"));
			return locator;
		}
		
		// sign in 
		public static WebElement signinbutton(WebDriver driver)
		{
			locator=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
			return locator;

	}

}
