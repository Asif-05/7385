package Batch6836;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	   	
	   	
	   	driver.get("https://www.google.com/");
	   	
	   	WebElement gm=driver.findElement(By.linkText("Gmail"));
	   	
	   	Actions action=new Actions(driver);
	   	
	   	action.moveToElement(gm).perform();
	   	
	 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   	
	   	Thread.sleep(3000); // it makes the system to wait for 3 seconds(3000 milliseconds)
	   	
	   	WebElement s=driver.findElement(By.linkText("Gmail"));
	   	
	   	action.moveToElement(s).perform();
	   	
	   	
	}

}
