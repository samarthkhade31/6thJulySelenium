package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_SelectOption2_From_MultiSelectableListbox
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Ssample4ListBox.html");
		
		Thread.sleep(3000);
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select s = new Select(SelectCountry);
		
//		s.selectByVisibleText("UK");
//		s.selectByVisibleText("USA");
//		s.selectByVisibleText("AUS");
		
		
		s.selectByVisibleText("IND");
		s.selectByVisibleText("USA");
		s.selectByIndex(5);
		
	}
}
