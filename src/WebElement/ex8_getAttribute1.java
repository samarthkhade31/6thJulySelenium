package WebElement;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_getAttribute1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
//		String value = driver.findElement(By.xpath("//input[@id='email'")).getAttribute("placeholder");
//		System.out.println(value);
		
		String value1 = driver.findElement(By.xpath("//input[@id='email'")).getAttribute("class");
		
		System.out.println(value1);
	}
}
