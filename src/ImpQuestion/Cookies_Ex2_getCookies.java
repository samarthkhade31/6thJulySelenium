package ImpQuestion;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex2_getCookies 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println(cookies.size());
		
		for(Cookie s1:cookies)
		{
			System.out.println(s1);
		}
		//cookies.forEach(i-> System.out.println(i));
		driver.quit();
	}
}
