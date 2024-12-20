package WebDriver;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getTitle2
{
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=UPXwbss0ypc");
		
		String actTitle = driver.getTitle();
		String expTitle = "The Buckingham Murders Review | Kareen Kapoor | Ranveer Brar | Hansal Mehta | RJ Raunak";
		
		if (actTitle.equals(expTitle))
		{
			System.out.println("pass: nevigate to correct webpage");
		}
		else
		{
			System.out.println("fail: nevigate to wrong webpage");
		}
	}
}
