package ImpQuestion;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex1_deleteAllCookies 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		
		System.out.println(driver.manage().getCookies().size());
		
		driver.manage().deleteAllCookies();			//to delete all cookies
		
		System.out.println(driver.manage().getCookies().size());   		//to get cookies size
		
		driver.quit();	
	}
}
