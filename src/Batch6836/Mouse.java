package Batch6836;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	   	
	   	driver.get("https://demoqa.com/menu/");
	   	
	   	driver.findElement(By.id("details-button")).click();
	    driver.findElement(By.linkText("Proceed to demoqa.com (unsafe)")).click();
	    
	    
	}

}
