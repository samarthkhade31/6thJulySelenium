package WebElement;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getText
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String text = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti ')]")).getText();
		System.out.println(text);
	}
}
