package Batch6836;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
	   	
	   	driver.get("https://demo.guru99.com/test/newtours/");
	   	
	   	
	   	
	   	System.out.println(driver.manage().window().getSize());
	   	
	   	WebElement link=driver.findElement(By.linkText("SIGN-ON"));
	   	
	    org.openqa.selenium.Point l=link.getLocation();
	   	
	   	   	
	   	System.out.println("The location of the element is:"+l);
	   	
	}

}
