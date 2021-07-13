package WebElementPhase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.applet.Main;

public class WebElementTesting {
	
	
public static void main(String[] args)
		{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://nexchar.com/signin");
	
	//WebElement emailbox=driver.findElement(By.id("Email"));
	//emailbox.sendKeys("tiago");
	//emailbox.clear();
	
	driver.findElement(By.id("Email")).sendKeys("tiago");
	driver.findElement(By.id("Password")).sendKeys("12345");
	
	driver.findElement(By.xpath("//a[@id='show-password']")).click();
	

    }
}
