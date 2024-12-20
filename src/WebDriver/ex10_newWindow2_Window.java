package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10_newWindow2_Window 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=vVqhgfoFaDk");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);		//open new window/tab
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		
	}
	
}
