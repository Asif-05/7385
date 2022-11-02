package batch6627;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CBT{
	
 WebDriver driver;
 
 @BeforeTest
 @Parameters("browser")
 
 public void setup(String browser)
 {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		 
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
	 }
	
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  
		 
		  driver=new FirefoxDriver();
		  driver.get("https://www.google.com/");
	 }
	
	 else
	 {
		 System.out.println("Try again!!");
	 }
 }





}
