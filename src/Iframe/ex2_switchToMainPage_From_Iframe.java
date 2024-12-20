package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_switchToMainPage_From_Iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to iframe
		driver.switchTo().frame("iframeResult");			//String framName
		
		//click on date & time btn from iframe
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
		
		Thread.sleep(2000);
		
		//switch to main page from iframe
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//click on open menu link from main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
				
	}
}
