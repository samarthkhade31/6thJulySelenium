package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getRatings_FromFlipkartApp
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//search mobile
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi 13c 5g");
		
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		String Rating = driver.findElement(By.xpath("((//div[@class='_5OesEi'])[1]//span)[4]")).getText();
		System.out.println(Rating);
		
	}

}
