package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_getSizeOfAllCheckboxes
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Testing/HTML/Sample6MultipleCheckbox.html");
		
//		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		int size = allCheckboxes.size();
//		System.out.println(size);
		
//		int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
//		System.out.println(size);
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
