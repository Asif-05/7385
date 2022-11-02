package one;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DaaProvider {
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
	 return new Object[][] {{"First-value"}, {"Last-Value"}};
    }
	
	
	
  @Test(dataProvider = "data-provider")
  public void f(String val) {
	  
	  System.out.println("Passed Parameter Is : " + val);
	  
	  
	  
  }
}
	
		