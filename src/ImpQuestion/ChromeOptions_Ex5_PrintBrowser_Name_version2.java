package ImpQuestion;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ChromeOptions_Ex5_PrintBrowser_Name_version2
{
	public static void main(String[] args)
	{
		ChromeOptions CO = new ChromeOptions();
				
		ChromeDriver driver = new ChromeDriver(CO);
		driver.get("https://www.facebook.com/");
		
		System.out.println(CO.getBrowserName());
		System.out.println(CO.getBrowserVersion());
		
		driver.quit();
	}
}
