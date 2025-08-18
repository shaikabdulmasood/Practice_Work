package Selenium_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.PageLoadStrategy;

public class Page_Stragey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\afsha\\OneDrive\\Desktop\\WIPRO\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 //WebDriver driver = new ChromeDriver();
        
         ChromeOptions chromeOptions = new ChromeOptions();
         chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
         WebDriver driver = new ChromeDriver(chromeOptions);
         
     	 Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
     	 
     	 DesiredCapabilities caps1 = DesiredCapabilities.chrome();
     	 caps1.setCapability("platform", "Windows 10");
     	caps1.setCapability("version", "92");
     	 
     	 System.out.println("BrowserName :"+caps.getBrowserName()+",\n Version: "+caps.getBrowserVersion()+"\n  Platform Name: "+ caps.getPlatformName()+" \n Capability :"+ caps.getCapabilityNames());
		 System.out.println("Capbilty_Name :"+ caps.getCapability(null));
		 
		 
		 System.out.println("BrowserName :"+caps.getBrowserName()+",\n Version: "+caps.getBrowserVersion());

     	 //fedcm:accounts, goog:chromeOptions, networkConnectionEnabled, pageLoadStrategy, platformName, proxy, se:cdp, se:cdpVersion, setWindowRect, strictFileInteractability, timeouts, unhandledPromptBehavior, webauthn:extension:credBlob, webauthn:extension:largeBlob, webauthn:extension:minPinLength, webauthn:extension:prf, webauthn:virtualAuthenticators
     	 
         try {
         driver.get("https://www.google.com");
         
       
         }
         catch(Exception e) {
        	 e.printStackTrace();
         }
         finally {
        	 driver.close();
         }
        

	}

	
}
