package batch6627;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp {
	
	@DataProvider(name="data-provider")
  
    
  public Object[][] dataProvider()
  {
		
	return new Object[][] {{"First-value","Second-value"}};	
		
  }
	
	@Test (dataProvider="data-provider")
	
	public void myTest(String val)
	{
		System.out.println(val);
	}
  
  }

