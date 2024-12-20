package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_isMultiple1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Ssample4ListBox.html");
		
		Thread.sleep(2000);
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select s = new Select(SelectCountry); 
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Listbox is Multi-selectable");
		}
		else
		{
			System.out.println("Listbox is Single-selectable");
		}
	}
}
