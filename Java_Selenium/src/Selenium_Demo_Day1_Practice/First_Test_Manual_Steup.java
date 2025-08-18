package Selenium_Demo_Day1_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class First_Test_Manual_Steup {

	public static void main(String[] args) {
		
		//**********Manual set chrome driver path***********
		
		//Setting ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //Launch Chrome
        WebDriver driver = new ChromeDriver();
        //Go to Google
        driver.get("https://www.google.com");
        
        ((ChromeDriver) driver).executeScript("window.open('https://www.Selenium');");
        ((ChromeDriver) driver).executeScript("window.open('https://www.www.youtube.com');");
        
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Page Title: " + driver.getTitle());
       
        driver.quit();  //Close everything.

	}

}
