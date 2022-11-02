package batch6627;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample1 {
  @Test
  public void test() {
	  
	  System.out.println("Test Method started");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite started");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite started");
  }

}
