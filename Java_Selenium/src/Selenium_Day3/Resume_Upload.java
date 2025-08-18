package Selenium_Day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Upload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			 driver.get("https://www.naukri.com/nlogin/login");
					 
			 driver.findElement(By.id("usernameField")).sendKeys("shaikmasoodahammed12@gmail.com");
			 driver.findElement(By.id("passwordField")).sendKeys(" ");
			 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
			 Thread.sleep(4000);
			 
			 Properties props = new Properties();
			 FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			 props.load(fis);
			  
			 String email = props.getProperty("naukri.email");
			 String password = props.getProperty("naukri.password");
			 String resumePath = props.getProperty("resume.path");
			 String chromeDriverPath = props.getProperty("chromedriver.path");
			 
			 driver.get("https://www.naukri.com/mnjuser/profile");
			 
			 Thread.sleep(3000);
			 
			 File resumeupload = new File("C:\\Users\\afsha\\OneDrive\\Desktop\\shaik masood\\technical jobs\\Ai Ml resume\\ABDUL MASOOD_RESUME.pdf");
			 WebElement uploadInput = driver.findElement(By.id("attachCV"));
			 uploadInput.sendKeys(resumeupload.getAbsolutePath());
			 
			 Thread.sleep(1000);
			 
			 System.out.println("Resume Uploaded Succesfully");
			 
		}
		finally {
			driver.quit();
		}
	}

}
