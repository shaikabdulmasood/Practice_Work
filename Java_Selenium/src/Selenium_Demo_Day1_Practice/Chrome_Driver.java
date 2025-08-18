package Selenium_Demo_Day1_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 

public class Chrome_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  
            // Set the path to ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\afsha\\\\OneDrive\\\\Desktop\\\\WIPRO\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
                        
            // Create a ChromeDriver instance
            WebDriver driver = new ChromeDriver(options);
            
            

            // Open Google
            driver.get("https://www.google.com");
            
            Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
	        String browserName = caps.getBrowserName();
	        String browserVersion = caps.getBrowserVersion();

            // Print page title
            System.out.println("Browser Name: " + browserName);
	        System.out.println("Browser Version: " + browserVersion);
            System.out.println("Page Title: " + driver.getTitle());

            // Close browser
            driver.quit();
    

	}

}
