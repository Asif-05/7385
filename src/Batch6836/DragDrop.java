package Batch6836;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	 
		driver.get("https://demoqa.com/droppable");
	   	driver.findElement(By.id("details-button")).click();
		driver.findElement(By.linkText("Proceed to demoqa.com (unsafe)")).click();
		
		WebElement from = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	
		
		Actions builder=new Actions(driver);
		//Perform drag and drop
		
		builder.dragAndDrop(from,to).perform();
		
		//verify text changed in to 'Drop here' box 
		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	

	}

}
