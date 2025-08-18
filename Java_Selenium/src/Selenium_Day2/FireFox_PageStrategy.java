package Selenium_Day2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFox_PageStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		 //WebDriver driver = new ChromeDriver();
       
        FirefoxOptions Options = new FirefoxOptions();
        Options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new FirefoxDriver(Options);
        //try {
        driver.get("https://www.google.com");
        //}
        //finally {
       	 driver.close();
        //}

	}

}
