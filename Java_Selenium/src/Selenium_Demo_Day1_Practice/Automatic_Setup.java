package Selenium_Demo_Day1_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatic_Setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// No need to set driver path manually in Selenium 4.6+
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println("Title: " + driver.getTitle());// Printing page title
        driver.quit();// Close browser

	}

}
