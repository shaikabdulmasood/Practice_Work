package Selenium_Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amozon_Login {

    public static void main(String[] args) throws InterruptedException, IOException {
        
    	Properties props = new Properties();
	    FileInputStream fis = new FileInputStream("config.properites");
	    props.load(fis);

	    String number = props.getProperty("amazon.mobilenumber");
	    String password = props.getProperty("email.password");
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("ap_email_login")).sendKeys(number);
	    driver.findElement(By.id("continue")).click();
	    Thread.sleep(1000);
	     
	    driver.findElement(By.id("ap_password")).sendKeys(password);
	    driver.findElement(By.id("signInSubmit")).click();
	    Thread.sleep(1000);
	    
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("headphones");
        products.add("wireless mouse");
        products.add("tab");
        for (String product : products) {
            
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();
            driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
            Thread.sleep(3000);
        }
        System.out.println("Products added to cart successfully!");
        driver.quit();
  }
}