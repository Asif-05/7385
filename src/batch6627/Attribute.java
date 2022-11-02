package batch6627;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Attribute {
	

	
  @Test(timeOut=5000)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
	   	
	   	driver.get("https://www.google.com/");
	   	
  }
  
  @BeforeTest
  public void start()
  {
	  System.out.println("Google Homepage");
  }
}
