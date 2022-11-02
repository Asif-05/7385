package one;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
		
	   	driver.get("https://blazedemo.com/purchase.php");
	   	
	   //	driver.findElement(By.linkText("Trave")).click();
	   	
	   	String parent=driver.getWindowHandle();
	   	Set<String>child=driver.getWindowHandles();
	   	
	    Iterator<String> it=child.iterator();
	    
	    while(it.hasNext())
	    {
	    	
	    	String childwindow=it.next();
	    	
	    	if(!parent.equals(childwindow))
	    	{
	    		driver.switchTo().window(childwindow);
	    		
	    		System.out.println(driver.switchTo().window(childwindow).getTitle());
	    		
	    		driver.close();
	    	}
	    	
	    	driver.switchTo().window(parent);
	    }
	    
	    
	   	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
		
	}

}
