package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_xpathByContains_UsingAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,'address or')]")).sendKeys("abc");
		
		//enter pwd
		driver.findElement(By.xpath("//input[contains(@class,' _6luy _9npi')]")).sendKeys("xyz");
		
		//click on login btn
		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
	}
}
