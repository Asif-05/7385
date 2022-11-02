package batch6627;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry1 {
  
	  
	  
	  @Test(retryAnalyzer = batch6627.Retry.class)
		public void Test1()
		{
			Assert.assertEquals(false, true);
		}

		@Test
		public void Test2()
		{
			Assert.assertEquals(false, true);
		}
  }

