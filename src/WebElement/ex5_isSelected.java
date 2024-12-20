package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_isSelected
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@class='_8esa']")).click();
		
		
		boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
		System.out.println(result);
		
		if(result)			//if condition is true then execute if body 
		{
			System.out.println("radio btn is selected");
		}
		else				//otherwise execute else body
		{
			System.out.println("radio btn is de-selected");
		}
	}
}
