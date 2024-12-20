package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_getFirstSelectedOption2_from_MultiSelectedListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Ssample4ListBox.html");
		
		Thread.sleep(2000);
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select s = new Select(SelectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(4);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
		System.out.println(s.getFirstSelectedOption().getText());
	}
}
