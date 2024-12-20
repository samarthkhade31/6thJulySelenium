package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex5_getAllSelected_From_MultiSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Ssample4ListBox.html");
		
		Thread.sleep(200);
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select s = new Select(SelectCountry);
		s.selectByVisibleText("IND");
		s.selectByVisibleText("USA");
		s.selectByVisibleText("UK");
		
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		
		for(WebElement s1:selectedOptions)
		{
			System.out.println(s1.getText());
		}
		
	}
}
