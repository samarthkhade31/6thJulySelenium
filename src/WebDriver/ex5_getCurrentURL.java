package WebDriver;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_getCurrentURL 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=UPXwbss0ypc");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
}
