package Batch6836;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	   	
	   	driver.get("https://www.amazon.in/");//one second
	   	String t=driver.getTitle();
	   	WebElement h=driver.findElement(By.linkText("Help"));
	   
	   	WebDriverWait wait=new WebDriverWait(driver,5);
	   	wait.until(ExpectedConditions.elementToBeClickable(h));
	   
	   	
	   	h.click();
	   	
	   	
		
		
	}

}
