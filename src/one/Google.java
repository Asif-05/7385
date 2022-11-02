package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
		
	   	driver.get("https://www.google.com/");
	   	
	    Glink l=new Glink(driver);
	    
	   
	    
	    
	 
	   
	   
	   	
		
	}

}
