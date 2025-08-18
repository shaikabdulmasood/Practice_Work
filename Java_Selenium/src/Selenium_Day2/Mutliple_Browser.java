package Selenium_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;


public class Mutliple_Browser {

    public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		


        // Set path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // List to store multiple browser instances
        List<WebDriver> drivers = new ArrayList<>();

        // Open multiple browsers
        for (int i = 1; i <= 3; i++) {  // Change 3 to how many browsers you want
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            drivers.add(driver);
            System.out.println("Opened Browser " + i);
        }

        // Just to see all browsers before closing
        Thread.sleep(3000);

        // Close all browsers
        for (WebDriver driver : drivers) {
            driver.quit(); // quit() closes the entire browser session
        }

        System.out.println("All browsers closed.");
    

	}

}
