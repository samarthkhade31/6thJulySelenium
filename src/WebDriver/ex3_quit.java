package WebDriver;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_quit 
{
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		//wait for 3 sec
		
		Thread.sleep(3000); 					//diffclassName.methodName(time in mili sec);
		driver.quit();
		
	}
}
