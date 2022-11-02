package batch6627;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class First {
	
  @Test(dependsOnMethods="selenium")
  public void start()
  {
	  System.out.println("Starts the execution");
  }
  
	
  @Test(priority=-1)
  public void f() {
	  
	  System.out.print("This is a method");
	  
  }
  
  @AfterTest
  public void selenium()
  {
	  System.out.println("Selenium");
  }
}
