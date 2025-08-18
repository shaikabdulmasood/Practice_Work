package Selenium_Day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        // Click the button that triggers alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        
        // Switch to alert
        Alert alert = driver.switchTo().alert();
        
        // Get alert text
        System.out.println("Alert says: " + alert.getText());
        
        // Accept alert
        alert.accept();
        
        driver.quit();
    }
}
