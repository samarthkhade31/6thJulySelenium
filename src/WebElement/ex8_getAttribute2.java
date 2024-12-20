package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_getAttribute2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//enter UN
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		String text = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.err.println(text);
		
	}
}
