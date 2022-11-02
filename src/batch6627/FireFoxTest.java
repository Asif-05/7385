package batch6627;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void f() {
	  
      System.out.println("Thread ID for firefox method is:"+Thread.currentThread().getId());
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
      FirefoxDriver driver=new FirefoxDriver();
  
      driver.get("https://www.google.com/");
  }
}
