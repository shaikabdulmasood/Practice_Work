package Selenium_Day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Demo {

    public static void main(String[] args) throws IOException, InterruptedException {
    	
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("config.properites");
        props.load(fis);
        String mobileNumber = props.getProperty("login.mobilenumber");

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(2000);

        WebElement mobileInput = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
        mobileInput.sendKeys(mobileNumber);
        driver.findElement(By.xpath("//[@class ='QqFHMw twnTnD _7Pd1Fp']")).click();
        Thread.sleep(20000);

        String[] products = {"laptop", "headphones", "wireless mouse"};

        for (String product : products) {
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(3000);

            WebElement firstProduct = driver.findElement(By.cssSelector("a.IRpwTa"));
            firstProduct.click();

            for (String win : driver.getWindowHandles()) {
                driver.switchTo().window(win);
            }

            try {
                driver.findElement(By.xpath("//button/span[text()='Add to cart']")).click();
                System.out.println(product + " added to cart.");
            } catch (Exception e) {
                System.out.println(product + " could not be added.");
            }

            driver.close();
            for (String win : driver.getWindowHandles()) {
                driver.switchTo().window(win);
            }
        }

        driver.findElement(By.xpath("//span[text()='Cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button/span[text()='Place Order']")).click();

        System.out.println("All products added, proceeding to checkout manually...");

       
        Thread.sleep(10000);
        driver.quit();
    }
}
