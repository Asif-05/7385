package Batch6836;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();  
	 
		driver.get("https://demoqa.com/droppable");
		
		driver.findElement(By.id("details-button")).click();
	   	driver.findElement(By.id("proceed-link")).click();
	   				
		Actions builder = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	 
		
		Point draggable=from.getLocation();
		Point droppable=to.getLocation();
		
		System.out.println("The location of draggble element is:"+draggable);
		
		System.out.println("The location of draggble element is:"+droppable);
		
		//Here, getting x and y offset to drop source object on target object location
		//First, get x and y offset for from object
		int xOffset1 = from.getLocation().getX(); // this gives the x coordinate of element's location
		
		int yOffset1 =  from.getLocation().getY(); // this gives the y coordinate of element's location
		
		System.out.println("xOffset1--->"+xOffset1+" yOffset1--->"+yOffset1);
		
		//Secondly, get x and y offset for to object
		
		int xOffset = to.getLocation().getX();
				
		int yOffset =  to.getLocation().getY();
		
		System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		
		//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
	
		xOffset =(xOffset-xOffset1)+120;
		yOffset=(yOffset-yOffset1)+120;
		

		//Perform dragAndDropBy 
		builder.dragAndDropBy(from, xOffset,yOffset).perform();
		
		
		
		//verify text changed in to 'Drop here' box 
		//Get text value of 'to' element
		String textTo = to.getText(); 

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped at location as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped at location as expected");
		}


	}

}
