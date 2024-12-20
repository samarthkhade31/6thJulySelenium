package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10_newWindow3_diffBetween_close_and_quit 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=vVqhgfoFaDk");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.close();				//close only current tab(tab2)
		driver.quit();
		
		
	}
}

