package Selenium_Day2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FireFox_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        
	        driver.get("https://www.google.com");
	        
	        driver.manage().window().maximize();
	        
	        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
	        String browserName = caps.getBrowserName();
	        String browserVersion = caps.getBrowserVersion();
	        
	        ChromeOptions
	        
	       /* try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}*/
	        
	        System.out.println("Browser Name: " + browserName);
	        System.out.println("Browser Version: " + browserVersion);
	        System.out.println("Title: " + driver.getTitle());// Printing page title
	        driver.quit();
	        

	}

}
