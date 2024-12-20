package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_Tagname
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Sample11.html");
		
		//enter FN
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//enter SN
		driver.findElement(By.tagName("input")).sendKeys("xyz");
		
		
	}
}