package batch6627;

import org.testng.annotations.Test;

public class Reports {
  
  @Test(priority=4500)
  public void web() {
	  
	  System.out.println("TestNG");
	  
  }
  
  @Test(priority=-4500)
  public void sel()
  {
	  System.out.println("Selenium");
  }

  @Test
  public void auto()
  {
	  System.out.println("Automation");
  }
}
