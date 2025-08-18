package Selenium_Day2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge_Page_Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeOptions Options = new EdgeOptions();
        Options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver driver = new EdgeDriver(Options);
       
 
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        }
        catch(Exception e) {
       	 e.printStackTrace();
        }
        finally {
       	 WebDriver driver = null;
		 driver.close();
        }


	}

}
