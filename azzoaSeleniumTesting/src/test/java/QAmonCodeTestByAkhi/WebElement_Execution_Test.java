package QAmonCodeTestByAkhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
	/*	// URL visit
	    driver.get("https://www.nexchar.com/signup");
		
		//sign up 
		driver.findElement(By.id("Name")).sendKeys("alisa");
		driver.findElement(By.id("Email")).sendKeys("alisa@yopmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.get("https://www.nexchar.com/signup");
		
		driver.findElement(By.id("Name")).sendKeys("maxwell");
		driver.findElement(By.id("Email")).sendKeys("maxwell@yopmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(3000);
		*/
		//sign in
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nexchar.com/signin");
		
		
		driver.findElement(By.id("Email")).sendKeys("alisa@yopmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.get("https://www.nexchar.com/signin");
		 
		
		//driver.findElement(By.xpath(""))
		
//		/*driver.findElement(By.id("Email")).sendKeys("maxwell@yopmail.com");
//		d*/river.findElement(By.id("Password")).sendKeys("123456");
		
		
		
		
	}

}
