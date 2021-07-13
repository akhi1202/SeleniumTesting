package QAmonCodeTestByAkhi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Operation_of_Web_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		
		//capture the web URL
		System.out.println("The website is" +driver.getCurrentUrl());
		
		//capture the page title
		System.out.println("The page title of the website is:" +driver.getTitle());
		
		Thread.sleep(3000);
		
		//go to another url on existing tab
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		// sleep for 5 sec
		Thread.sleep(5000);
		
		//refresh the page
		driver.navigate().refresh();
		
		//open new tab and visit an URL
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.aftercareexplained.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.chhoto.link/");
		
		//Close the existing window.
		driver.close();
		
		Thread.sleep(5000);
		
		//CLose all the window tab.
		driver.quit();

	}

}
