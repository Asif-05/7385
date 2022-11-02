package Batch6836;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOffset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	 
	   	driver.get("https://demoqa.com/slider/");
	   	
		
	   	driver.findElement(By.id("details-button")).click();
		driver.findElement(By.linkText("Proceed to demoqa.com (unsafe)")).click();
			
		
		
		Actions actions = new Actions(driver);
        
		//Retrieve WebElemnt 'slider' to perform mouse hover 
    	WebElement slider = driver.findElement(By.id("slider"));
    	
    	//Move mouse to x offset 50 i.e. in horizontal direction
    	actions.moveToElement(slider,50,0).perform();
    	slider.click();
		
		
		
		
		
	}

}
