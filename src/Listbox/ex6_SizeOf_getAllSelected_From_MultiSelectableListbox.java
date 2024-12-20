package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex6_SizeOf_getAllSelected_From_MultiSelectableListbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Ssample4ListBox.html");
		
		Thread.sleep(2000);
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select s = new Select(SelectCountry);
		
		s.selectByVisibleText("IND");
		s.selectByVisibleText("USA");
		s.selectByVisibleText("UK");
		
//		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		System.out.println(allSelectedOptions.size());
		
//		int size = s.getAllSelectedOptions().size();
//		System.out.println(size);
		
		System.out.println(s.getAllSelectedOptions().size());
		
	}
}
