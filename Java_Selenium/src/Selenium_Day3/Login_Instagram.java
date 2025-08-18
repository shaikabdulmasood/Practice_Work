package Selenium_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Login_Instagram {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
	    FileInputStream fis = new FileInputStream("config.properites");
	    props.load(fis);
            
        String username = props.getProperty("insta.username");
        String password = props.getProperty("insta.password");
            
        System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
   	    driver.manage().window().maximize();

   	    
   	    driver.get("https://www.instagram.com/accounts/login/");
   	    Thread.sleep(5000);
   	    
   	    WebElement userField = driver.findElement(By.name("username"));
   	    userField.sendKeys(username);
   	    
   	    WebElement passField = driver.findElement(By.name("password"));
   	    passField.sendKeys(password);
   	    
   	    WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
   	    loginBtn.click();
   	    Thread.sleep(5000);
   	    
   	    WebElement notNowSave = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
   	    notNowSave.click();
   	    Thread.sleep(3000);
   	    
   	    WebElement notNowNotif = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
   	    notNowNotif.click();
   	    Thread.sleep(3000);
   	    
        System.out.println(" Logged in successfully.");  
        
        driver.quit();
	}

}
