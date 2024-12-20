package ImpQuestion;
 
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex6_deleteCookie
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
		
		ArrayList<Cookie> al = new ArrayList<>(allcookies);
		
		System.out.println("-------After deleting specific cookie------");
		driver.manage().deleteCookie(al.get(0));
		
		Set<Cookie> allCookies1 = driver.manage().getCookies();
		allCookies1.forEach(i->System.out.println(i));
		
		driver.quit();
	}
}
