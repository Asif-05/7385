package batch6627;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample2 {
  @Test
  public void f() {
	  
	  System.out.println("Test Method of TestNG2 started");
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("BeforeSuite method of TestNG2 started");	
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("AfterSuite method of TestNG2 started");
  }

}
