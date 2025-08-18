package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//core commands
/*
driver.get("url") → Open website.

driver.findElement(By.id("id")) → Locate element.

sendKeys("text") → Type text.

click() → Click element.

getText() → Get element text.

getTitle() / getCurrentUrl() → Page info.

driver.quit() → Close browser.
*/

public class First_Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set path to ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
        // Launch browser
		WebDriver driver = new ChromeDriver();
		// Maximize the page 
		driver.manage().window().maximize();
		// Open Google
		driver.get("https://www.google.com");
		
		System.out.println("Google is open ");
		
		System.out.println("Browser Name: " + driver.getTitle()); //getting the title of browser
		
		System.out.println("Browser url: "+driver.getCurrentUrl()); //getting the url of browser
		
		//Finding elements and giving input
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		
		//Searching for the input
		element.sendKeys("Amazon");
		element.submit();
		Thread.sleep(100);
		driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
		Thread.sleep(10000);



		
		
		//close the driver
		//driver.close();
	}

}
