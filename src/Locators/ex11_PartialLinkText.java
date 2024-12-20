package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex11_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Sample11.html");
		
		Thread.sleep(2000);
		
		//click on facebook link
		driver.findElement(By.partialLinkText("face")).click();
		
		
	}
}
