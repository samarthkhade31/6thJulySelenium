package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_Select_DeSelect_MultipleCheckboxes 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Testing/HTML/Sample6MultipleCheckbox.html");
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//click each checkbox after 1sec
		for(WebElement s1:allCheckboxes)
		{
			s1.click();
			Thread.sleep(1000);
		}
		
		for(int i=allCheckboxes.size()-1; i>=0; i--)
		{
			allCheckboxes.get(i).click();
			Thread.sleep(1000);
		}
		
		
	}
}
