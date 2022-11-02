package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	
	
		
   	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  System.out.println("Test NG Framework");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  //Assert.assertTrue(condition);
	  System.out.println("Welcome");
	  
  }
  
  
  
  
  
}
