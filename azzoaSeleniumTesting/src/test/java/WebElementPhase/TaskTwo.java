package WebElementPhase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/ ");
		
		driver.findElement(By.cssSelector("#btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.cssSelector("#btn-login")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}
	}


