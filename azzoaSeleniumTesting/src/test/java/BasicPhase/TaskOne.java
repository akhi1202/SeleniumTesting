package BasicPhase;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TaskOne {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			
			//capture the web URL
			System.out.println("The website is" +driver.getCurrentUrl());
			
			//capture the page title
			System.out.println("The page title of the website is:" +driver.getTitle());
			
			
			//Navigate to another URL
			driver.navigate().to("https://www.nexchar.com/");
			
			Thread.sleep(5000);
			
			//Refresh the page
			driver.navigate().refresh();
				
			
		}

}
