package batch6627;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Ddt {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver(2).exe");
	   	WebDriver driver=new ChromeDriver();
	   	
	   	driver.get("file:///D:/msc_reg.html");
	   	
	   	String filepath="D:\\fdata2.xls";
	   	FileInputStream file=new FileInputStream(filepath);
	   	
	   	Workbook workbook=Workbook.getWorkbook(file);
	   	
	   	Sheet sheet=workbook.getSheet(0);
	   	
	   	int rowcount=sheet.getRows();
	   	
	   	for(int i=1;i<=rowcount;i++)
	   	{
	   		String firstName=sheet.getCell(0, i).getContents();
	   		String lastName=sheet.getCell(1, i).getContents();
	   		
	   		driver.findElement(By.name("first_name")).clear();
	   		
	   		driver.findElement(By.name("first_name")).sendKeys(firstName);
	   		
	   		driver.findElement(By.name("last_name")).clear();
	   		driver.findElement(By.name("last_name")).sendKeys(lastName);
	   		
	   		driver.findElement(By.name("submit")).click();
	   		
	   		System.out.println("Iteration "+i+" Completed Successfully!!");
	   		
	   		String actual_title=driver.getTitle();
	   	   		   	
	   		if(actual_title.equalsIgnoreCase("Registeration form"))
	   		{
	   			
	   			System.out.println("Test case is correct");
	   		}
	   		else
	   		{
	   			System.out.println("Test Case is incorrect");
	   		}
	   		Thread.sleep(4000);
	   		
	   		//driver.close();
	   	//	workbook.close();
	   		
	   				
	   		
	   		   		
	   			}
	   	
	}

}
