package Batch6836;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	    driver.get("https://demoqa.com/alerts");
	   /**    
	    
	   // This step will result in an alert on screen
	    driver.findElement(By.id("alertButton")).click();
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
	    
	  **/
	    driver.findElement(By.id("details-button")).click();
	    driver.findElement(By.linkText("Proceed to demoqa.com (unsafe)")).click();
	    WebElement element = driver.findElement(By.id("promtButton"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	    Alert promptAlert  = driver.switchTo().alert();
	    String alertText = promptAlert.getText();
	    System.out.println("Alert text is " + alertText);
	   //Send some text to the alert
	    Thread.sleep(4000);
	    
	   promptAlert.sendKeys("Test User");
	   promptAlert.accept();
	    
	    
	}

}
