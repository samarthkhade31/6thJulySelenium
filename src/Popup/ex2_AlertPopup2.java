package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_AlertPopup2 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter customer ID
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("101");
		
		//click on submit btn 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//switc to alert popup
		Alert alt = driver.switchTo().alert();
		
		//get text from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		//click on cancel btn from alert popup 
//		alt.dismiss();
		
		//click on OK btn from 1st alert popup
		alt.accept();
		
		//click onn OK btn from 2nd alert popup
		alt.accept();
		
		//enter value in alert popup
//		alt.sendKeys("");
		
		
	}
}
