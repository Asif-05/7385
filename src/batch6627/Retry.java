package batch6627;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		int retryLimit = 4;
		
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		
		
		return false;
	}

}
