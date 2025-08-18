package Selenium_Demo_Day1_Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Google_Search {

	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Set the path to ChromeDriver
		try {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.com");

            // Search Selenium
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium");
            searchBox.submit();

            // Wait for search results
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find link with "techademy.com" in the visible URL text
            WebElement techademyOfficial = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@href, 'techademy.com')]/h3")
                )
            );

            techademyOfficial.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }

        // Close browse


	}

}
