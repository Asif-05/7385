package Batch6836;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	 
		driver.get("https://demoqa.com/buttons");
	   	driver.findElement(By.id("details-button")).click();
		driver.findElement(By.linkText("Proceed to demoqa.com (unsafe)")).click();
		
	   	Actions actions = new Actions(driver); 
		
		//Retrieve WebElement to perform double click WebElement
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn")); 
		
		//Double Click the button 
		//actions.doubleClick(btnElement).perform(); 
		
		actions.doubleClick(btnElement).perform();
		
		System.out.println("Button is double clicked"); 
		
		
		driver.close();	 

	   		   	 
	 // Right-Click	   
	
		/**
	   	driver.get("https://www.google.com/");
	   	
	   	Actions actions = new Actions(driver);
	    WebElement link=driver.findElement(By.linkText("Gmail"));
	    
	    //actions.contextClick(link).perform();
	    
	    actions.contextClick(link).perform();
	  
	    **/
	   
	     
		    
		    
	}

}
