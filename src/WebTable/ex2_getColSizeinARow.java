package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_getColSizeinARow 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Sample5WebTable.html");
		
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colSize);
		
		//for headers
		int colSize1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(colSize1);
	}

}
