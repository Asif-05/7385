package batch6627;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
  @Test
  public void f() {
      System.out.println("Thread ID for chrome method is:"+Thread.currentThread().getId());
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
      ChromeDriver driver=new ChromeDriver();
      
      driver.get("https://www.google.com/");
    		  
  }
}
