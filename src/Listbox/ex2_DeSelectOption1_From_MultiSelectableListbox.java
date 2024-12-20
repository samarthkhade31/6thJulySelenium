package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_DeSelectOption1_From_MultiSelectableListbox
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Ssample4ListBox.html");
		
		Thread.sleep(3000);
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select s = new Select(SelectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(5);
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		
		s.deselectByIndex(0);
		s.deselectByVisibleText("USA");
		s.deselectByValue("6");
		
	}
}
