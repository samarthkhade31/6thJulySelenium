package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10_newWindow1_Tab
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=vVqhgfoFaDk");
		
		Thread.sleep(2000);
		
	driver.switchTo().newWindow(WindowType.TAB);		//open new window/tab
	
	Thread.sleep(3000);
	
	driver.get("https://www.facebook.com/");
		
	}
}
