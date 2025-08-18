package Selenium_Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_email {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 Properties props = new Properties();
	     FileInputStream fis = new FileInputStream("config.properites");
	     props.load(fis);

	     String username = props.getProperty("email.username");
	     String password = props.getProperty("email.password");
		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://login.yahoo.com/");
	     Thread.sleep(2000);
		
	     driver.findElement(By.id("login-username")).sendKeys(username);
	     driver.findElement(By.id("login-signin")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("login-passwd")).sendKeys(password);
	     driver.findElement(By.id("login-signin")).click();
	     Thread.sleep(5000);

	     System.out.println("✅ Logged in successfully!");
	     Thread.sleep(5000);

	     driver.close();
        
	}

}
