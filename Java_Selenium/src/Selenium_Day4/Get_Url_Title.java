package Selenium_Day4;

import java.util.Arrays;

import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class Get_Url_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
        PrintOptions printOptions = new PrintOptions();
        printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
       
        PrintOptions.Orientation currentorientation = printOptions.getOrientation();
        System.out.println(currentorientation);
        
        printOptions.setPageRanges("1-5");
        String[] current_range = printOptions.getPageRanges();        
        System.out.println(Arrays.toString(current_range));
        
        
	}

}
