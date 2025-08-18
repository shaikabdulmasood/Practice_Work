package Selenium_Day2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Edge_drive_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.edge.driver", "C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\edgedriver_win64\\msedgedriver.exe");
        
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        
        WebDriver driver = new EdgeDriver(options);
        
        driver.get("https://www.google.com");
        
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getBrowserVersion();
        
        //driver.manage().window().maximize();
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
        
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);
        System.out.println("Title: " + driver.getTitle());// Printing page title
        driver.quit();
        
        
	}


}



