package one;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
		
	   	driver.get("https://blazedemo.com/");
	   	
	    String parent=driver.getWindowHandle();
	   	driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
	   	Set<String> win=driver.getWindowHandles();
        
	   	
	}

}
