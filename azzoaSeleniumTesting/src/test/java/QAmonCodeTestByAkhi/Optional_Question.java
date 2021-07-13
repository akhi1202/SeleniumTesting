package QAmonCodeTestByAkhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optional_Question {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	
	
		driver.findElement(By.id("email_create")).sendKeys("maxwell@yopmail.com");
		
		driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();
		
		//sign up
		
		//title
		//driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By. xpath("//input[@id='id_gender1']")). click();
		WebElement chkbox = driver. findElement(By. xpath("//input[@id='id_gender1']"));
		System. out. println(chkbox. isSelected());
		
		
		//personal information
		driver.findElement(By.id("customer_firstname")).sendKeys("maxwell");
		driver.findElement(By.id("customer_lastname")).sendKeys("amell");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
		//date of birth
		
		
		//sign up for news letter
	    driver.findElement(By.id("newsletter")).click();
	    
	    //receive special offer
	    driver.findElement(By.id("optin")).click();
	    
	    //address
	    driver.findElement(By.id("firstname")).sendKeys("maxwell");
		driver.findElement(By.id("lastname")).sendKeys("amell");
		
		//company
		driver.findElement(By.id("company")).sendKeys("Itech");
		driver.findElement(By.id("address1")).sendKeys("KDA Avenue");
		driver.findElement(By.id("address2")).sendKeys("16 KDA avenue");
		driver.findElement(By.id("city")).sendKeys("Khulna");
		
		//state 

		// select method use
				Select dropdownbox=new Select(driver.findElement(By.id("id_state")));
				
				
				dropdownbox.selectByVisibleText("South Dakota");
				
				//Thread.sleep(2000);
		
		//zip code
		driver.findElement(By.id("postcode")).sendKeys("9100");
		
		//country
		
		
		//additional info
		driver.findElement(By.id("other")).sendKeys("additional info");
		
		//home phone, mobile phone
		driver.findElement(By.id("phone")).sendKeys("174856");
		driver.findElement(By.id("phone_mobile")).sendKeys("0171689776");
		
		//future reference
		driver.findElement(By.id("alias")).sendKeys("Referecne");
		
		}
		
		
		
		
	
	
	}

