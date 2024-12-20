package WebTable;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getRowSizeInTable 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Sample5WebTable.html");
		
//		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
//		int rowSize = allRows.size();
//		System.out.println(rowSize);
		
		int rowSize1 = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowSize1);
		
	}

}
