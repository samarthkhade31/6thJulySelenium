package WebDriver;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_close 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		//wait for 3 sec
		
		Thread.sleep(3000);				//diffclassName.methodname(time in mili sec);
		
		driver.close();
	}
}
