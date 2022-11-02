package batch6627;

import org.testng.Assert;
import org.testng.annotations.Test;

public class R1 {
  @Test
  public void comp() {
	  
	  int a=10;
	  int b=7;
	  
	 Assert.assertTrue(a>b);
	  
	   
  }
  @Test
  public void diff()
  {
	  int c=20;
	  int d=15;
	  
	  Assert.assertFalse(c>d);
  }
  
  @Test()
  public void sample()
  {
	  System.out.println("This is a sample method");
  }
}
