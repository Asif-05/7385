package batch6627;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Para2 {
  @Test
  public void chrome() {
	  
	  System.out.println("Thread ID for chrome method is:"+Thread.currentThread().getId());
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
      ChromeDriver driver=new ChromeDriver();
      
      driver.get("https://www.google.com/");
    		  
  }
  
  @Test
  public void firefox()
  {
	  System.out.println("Thread ID for firefox method is:"+Thread.currentThread().getId());
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
      FirefoxDriver driver=new FirefoxDriver();
  
      driver.get("https://www.google.com/"); 
  
  }
  
  
}
