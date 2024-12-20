package ImpQuestion;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex3_deleteCookieNamed
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		
		System.out.println("-----Before delete any cookie----");
		Set<Cookie> allcookies = driver.manage().getCookies();
		for(Cookie s1:allcookies)
		{
			System.out.println(s1);
		}
		
		//delete specific cookie
		driver.manage().deleteCookieNamed("currency");
		
		System.out.println("-----After delete specific cookie----");
		Set<Cookie> allcookies1 = driver.manage().getCookies();
		for(Cookie s1:allcookies1)
		{
			System.out.println(s1);
		}
		
		driver.quit();
	}
}
