package Batch6836;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	   	
	   	
	   	driver.get("https://demo.guru99.com/test/newtours/");
	   	
	   	
	   	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	   	
	   	WebElement link=driver.findElement(By.linkText("SIGN-ON"));
	   	
	   	Actions action=new Actions(driver);
	   	
	   	action.moveToElement(link).perform();
	   	
	   	System.out.println("The mouse hover activity done!!");
	   	
		
	}

}
