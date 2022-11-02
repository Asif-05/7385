package Batch6836;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
		
	   	driver.get("file:///F:/EduBridge/Selenium/html/iframes.html");
        
	   // List <WebElement>frame=driver.findElements(By.tagName("iframe"));
	   	
	   // int no_of_iframe=frame.size();
	   
	  //  System.out.println("The total no.of iframes are:"+no_of_iframe);
	   
	   WebElement s= driver.findElement(By.id("IF1"));
	   WebElement s1=driver.findElement(By.name("isecond"));
	   
	   boolean b=s.isEnabled();
	   
	  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  // s1.findElement(By.id("uname")).sendKeys("selenium");
	   int len=driver.switchTo().frame("IF1").getPageSource().length();
	   System.out.println(len);
	   
	   
	    
	  
	   
	   
	    
	    
	   
	   
	   
	   
	   	   
	  
		
	    
	}

}
