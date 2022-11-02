package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		   	WebDriver driver=new ChromeDriver();
		}
		catch(IllegalStateException e)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		   	WebDriver driver=new ChromeDriver();
		   	
		   	driver.get("https://blazedemo.com/purchase.php");
		   	Thread.sleep(3000);
		   	System.out.println("The excpetion name is:"+e.getMessage());
		
		
		throw(e);
					   	
	}
finally
{
	System.out.println("Exception Handling has been done!!!");
	System.out.println("Finally part is the default one");
}
}
}